package teamskiy.eventtracker.pojos;

import lombok.Data;

import java.util.Date;

@Data
public class Event {
    private String name;
    private Date date;
    private String sourceUrl;

    public Event (String name, Date date, String sourceUrl) {
        this.name = name;
        this.date = date;
        this.sourceUrl = sourceUrl;
    }
}
