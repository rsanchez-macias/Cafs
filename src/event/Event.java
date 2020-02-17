package event;

import java.util.IllegalFormatException;

public class Event {

    private String title;
    private String description;
    private String date;

    private boolean isDone;

    public Event (String title, String date, String description) {
        setTitle(title);
        setDescription(description);
        setDate(date);
    }

    public void setDescription(String description) {
        if (description.length() == 0) {
            this.description = "(No Description)";
        } else {
            this.description = description;
        }
    }

    public void setTitle (String title) {
        if (title.length() == 0) {
            this.title = "(No Title)";
        } else {
            this.title = title;
        }
    }

    public void setDate (String date) {

        try {

            String[] dateInfo = date.split("/");

            int day = Integer.parseInt(dateInfo[0]);
            int month = Integer.parseInt(dateInfo[1]);
            int year = Integer.parseInt(dateInfo[2]);

            if (!(day >= 1 && day <= 30)) {
                throw new NumberFormatException();
            }

            if (!(month >= 1 && month <= 12)) {
                throw new NumberFormatException();
            }

            this.date = date;

        } catch (NumberFormatException e) {
            this.date = "(No Date)";
        } catch (IndexOutOfBoundsException e) {
            this.date = "(No Date)";
        }
    }


    @Override
    public String toString () {
        String formattedEvent = String.format("Title: %s | Date: %s | Description: %s", title, date, description);
        return formattedEvent;
    }

}
