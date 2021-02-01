package collectionsmap;

import java.time.LocalDate;


public class Entry {

    private LocalDate entryDate;
    private String ip;
    private String login;


    public Entry(LocalDate entryDate, String ip, String login) {
        this.entryDate = entryDate;
        this.ip = ip;
        this.login = login;
    }

    public String getIp() {
        return ip;
    }

    public String getLogin() {
        return login;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }
}
