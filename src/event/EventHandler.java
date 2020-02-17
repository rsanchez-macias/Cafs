package event;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EventHandler {

    private ArrayList<Event> events;
    private Scanner input = new Scanner(System.in);

    private final String BULLET = "\u2023";

    public EventHandler () {
        events = new ArrayList<>();
    }

    public void listEvents () {

        if (events.isEmpty()) {
            System.out.println("\tNo tasks at the moment!");

        } else {

            for (int i = 0; i < events.size(); i++) {
                System.out.println("\t" + (i + 1) + ". " + events.get(i));
            }
        }

    }

    public void addEvent () {
        String title = getTitle();
        String date = getDate();
        String description = getDescription();

        events.add(new Event(title, date, description));
    }

    private String getTitle () {
        System.out.printf("\t%s Title: ", BULLET);
        String title = input.nextLine().trim();

        return title;
    }

    private String getDate () {
        System.out.printf("\t%s Date: ", BULLET);
        String date = input.nextLine().trim();

        return date;
    }

    private String getDescription () {
        System.out.printf("\t%s Description: ", BULLET);
        String description = input.nextLine().trim();

        return description;
    }

    public void deleteEvent () {
        int toDelete = getEventIndex();

        events.remove(toDelete);
    }

    private int getEventIndex () {

        String instruction = "Event number: ";

        while (true) {

            try {
                System.out.printf("\t%s %s", BULLET, instruction);

                int toDelete = input.nextInt();
                input.nextLine();

                if (toDelete >= 1 && toDelete <= events.size()) {
                    return toDelete - 1;
                } else {
                    throw new InputMismatchException();
                }

            } catch (InputMismatchException e) {
                instruction = "Please enter a valid number: ";
                continue;
            }
        }
    }


    public void editEvent() {

        int toEdit = getEventIndex();

        System.out.println("\n\tLeave blank if no change needed:");

        System.out.print("\t\tNew title: ");
        String newTitle = input.nextLine().trim();

        System.out.print("\t\tNew date: ");
        String newDate = input.nextLine().trim();

        System.out.print("\t\tNew description: ");
        String newDescription = input.nextLine().trim();

        editEvent(toEdit, newTitle, newDate, newDescription);

    }

    private void editEvent(int eventIndex, String title, String date, String descripton) {

        if (!title.isEmpty()) {
            events.get(eventIndex).setTitle(title);
        }

        if (!date.isEmpty()) {
            events.get(eventIndex).setDate(date);
        }

        if (!descripton.isEmpty()) {
            events.get(eventIndex).setDescription(descripton);
        }
    }

}
