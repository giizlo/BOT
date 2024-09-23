package platforms;

import logic.*;

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
        System.out.println("Добро пожаловать в суперпупердуперэхо-бот!");

        while(true) {
            Request request = inputReader.read();
            requestHanger.handle(request, outputWriter);
        }
    }
}
