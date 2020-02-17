package utility;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Printer {

    private static void getDateTime() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println(formattedDate);
    }


    public static void printWelcomeMessage() {
        String logo =   "        _..._                                        \n" +
                "    .-'_..._''.                                     \n" +
                "  .' .'      '.\\                                    \n" +
                " / .'                         _.._                  \n" +
                ". '                         .' .._|                 \n" +
                "| |                 __      | '                     \n" +
                "| |              .:--.'.  __| |__     _             \n" +
                ". '             / |   \\ ||__   __|  .' |            \n" +
                " \\ '.          .`\" __ | |   | |    .   | /          \n" +
                "  '. `._____.-'/ .'.''| |   | |  .'.'| |//          \n" +
                "    `-.______ / / /   | |_  | |.'.'.-'  /           \n" +
                "             `  \\ \\._,\\ '/  | |.'   \\_.'            \n" +
                "                 `--'  `\"   |_|           \n";

        System.out.println("\n" + logo + "\nCalendar Application for Students\n");
        System.out.println("type \"help\" for list of commands");
        System.out.println("____________________________________________________________\n\nCurrent time: ");
        getDateTime();
        System.out.println("____________________________________________________________");
    }

    public static void printHelp() {
        System.out.println("Commands: ");
        System.out.println("\t- new: add a new event \n\t\tusage: new");
        System.out.println("\t- list: lists all the events \n\t\tusage: new");
        System.out.println("\t- remove: removes an event \n\t\tusage: remove");
        System.out.println("\t- exit: terminates the program \n\t\tusage: new");
        System.out.println("");
    }

    public static void printFarewellMessage() {
        System.out.println("Don't let work pile up... see ya!");
    }
}
