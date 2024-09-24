package ru.admin.bot.platforms.console;

import ru.admin.bot.logic.Request;
import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    private Scanner scanner;

    public ConsoleInputReader(){
        this.scanner = new Scanner(System.in);
    }

    public Request read(){
        System.out.print("Введите сообщание: ");
        String userMessage = scanner.nextLine();
        return new Request(userMessage);
    }
}
