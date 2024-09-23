import logic.*;
import platforms.*;


public class Main {
    public static void main(String[] args) {
        InputReader inputReader = new RealizationInputReader();
        RequestHanger requestHanger = new RealizationRequestHanger();
        OutputWriter outputWriter = new RealizationOutputWriter();

        Bot bot = new ConsoleBot(inputReader, requestHanger, outputWriter);
        bot.startBot();
    }
}