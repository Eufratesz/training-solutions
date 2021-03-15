package stringbuilder;

public enum Title {

    MR("Mr."), MS("Ms."), DR("Dr."), PROF("Prof.");

    private String titleInString;

    Title(String titleInString) {
        this.titleInString = titleInString;
    }

    public String getTitleInString() {
        return titleInString;
    }
}
