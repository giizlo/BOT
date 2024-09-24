package ru.admin.bot.platforms.console;

import ru.admin.bot.logic.OutputWriter;
import ru.admin.bot.logic.Request;
import ru.admin.bot.logic.RequestHanger;
import ru.admin.bot.logic.Response;
import ru.admin.bot.platforms.Bot;

public class ConsoleBot implements Bot {
    private final InputReader inputReader;
    private final OutputWriter outputWriter;
    private final RequestHanger requestHanger;

    public ConsoleBot(InputReader inputReader, RequestHanger requestHanger, OutputWriter outputWriter) {
        this.inputReader = inputReader;
        this.outputWriter = outputWriter;
        this.requestHanger = requestHanger;
    }

    @Override
    public void startBot() {
        outputWriter.write(new Response("Добро пожаловать в суперпупердуперэхо-бот!"));

        while(true) {
            Request request = inputReader.read();
            requestHanger.handle(request, outputWriter);
        }
    }
}
