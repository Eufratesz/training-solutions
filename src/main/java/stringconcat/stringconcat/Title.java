package stringconcat.stringconcat;

public enum Title {
    MR("Mr."), MRS("Mrs."), DR("Dr.");

    private String titleInString;

    Title(String titleInString) {
        this.titleInString = titleInString;
    }

    public String getTitleInString() {
        return titleInString;
    }
}
