package platforms;

import logic.Request;
import java.util.Scanner;

public class RealizationInputReader implements InputReader {
    private Scanner scanner;

    public RealizationInputReader(){
        this.scanner = new Scanner(System.in);
    }

    public Request read(){
        System.out.print("Введите сообщание: ");
        String userMessage = scanner.nextLine();
        return new Request(userMessage);
    }
}
