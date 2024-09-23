package logic;

public class RealizationOutputWriter implements OutputWriter {

    @Override
    public void write(Response response) {
        System.out.println("Бот:" + response.getMessage());
    }
}
