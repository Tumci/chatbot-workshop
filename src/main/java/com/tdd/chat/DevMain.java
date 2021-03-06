package com.tdd.chat;

import com.tdd.chat.bot.ChatBot;

import java.util.Scanner;

public class DevMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChatBot chatBot = new ChatBot();
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            int i = line.indexOf(": ");
            if (i > 0) {
                String name = line.substring(0, i);
                String msg = line.substring(i + 2);
                String botMessage = chatBot.replyUserMessage(name, msg);
                if (!botMessage.equals("")) {
                    System.out.printf("%s: %s%n", chatBot.getBotName(), botMessage);
                }
            } else {
                System.out.println("Input ignored. Correct format is:");
                System.out.println("username: message");
            }
        }
    }
}
