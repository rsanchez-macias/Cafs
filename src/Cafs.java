import cli.InputHandler;
import utility.Printer;

public class Cafs {

    private static InputHandler inputHandler;


    public static void init () {
        inputHandler = new InputHandler();
    }

    public static void main (String[] args) {

        Printer.printWelcomeMessage();

        init();

        while (true) {
            inputHandler.getUserInput();
            inputHandler.processInput();
        }

    }

}
