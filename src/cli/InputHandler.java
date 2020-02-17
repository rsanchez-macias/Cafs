package cli;

import event.EventHandler;
import utility.Printer;

import java.util.EventListener;
import java.util.Scanner;

public class InputHandler {

    private Scanner input;
    private final String WAITHOLDER = "> ";

    private String userInput;
    private EventHandler eventHandler;


    private final String CMD_ADD = "new";
    private final String CMD_REMOVE = "remove";
    private final String CMD_EXIT = "exit";
    private final String CMD_LIST = "list";
    private final String CMD_EDIT = "edit";
    private final String CMD_HELP = "help";


    public InputHandler () {
        input = new Scanner(System.in);
        eventHandler = new EventHandler();
    }

    public void getUserInput () {
        System.out.print(System.lineSeparator() + WAITHOLDER);

        userInput = input.nextLine().trim();

        System.out.println();
    }


    public void processInput () {

        switch (userInput) {
        case CMD_EXIT:
            exit();
            break;
        case CMD_HELP:
            Printer.printHelp();
            break;
        case CMD_ADD:
            eventHandler.addEvent();
            break;
        case CMD_REMOVE:
            eventHandler.deleteEvent();
            break;
        case CMD_LIST:
            eventHandler.listEvents();
            break;
        case CMD_EDIT:
            eventHandler.editEvent();
            break;
        default:
            System.out.printf("Sorry, but %s is not a valid command\n", userInput);
        }
    }

    private void exit () {
        Printer.printFarewellMessage();
        System.exit(0);
    }

}
