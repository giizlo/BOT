package ru.admin.bot;

import ru.admin.bot.platforms.Bot;
import ru.admin.bot.platforms.console.*;
import ru.admin.bot.logic.*;

public class Main {
    public static void main(String[] args) {
        InputReader inputReader = new ConsoleInputReader();
        RequestHanger requestHanger = new EchoRequestHanger();
        OutputWriter outputWriter = new ConsoleOutputWriter();

        Bot bot = new ConsoleBot(inputReader, requestHanger, outputWriter);
        bot.startBot();
    }
}