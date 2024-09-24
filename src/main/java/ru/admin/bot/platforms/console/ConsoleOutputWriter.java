package ru.admin.bot.platforms.console;

import ru.admin.bot.logic.*;

public class ConsoleOutputWriter implements OutputWriter {

    @Override
    public void write(Response response) {
        System.out.println("Бот:" + response.getMessage());
    }
}
