package teamskiy.eventtracker.parsers;

import teamskiy.eventtracker.pojos.Event;

import java.util.List;

public abstract class WebpageParser {
    private String webpageUrl;

    public String getWebpageContent() {
        return ""; //THERE WILL BE AN IMPLEMENTATION SOON
    }

    public abstract List<Event> parseEventFromWebpage();
}
