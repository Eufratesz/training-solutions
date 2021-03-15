package stringconcat.stringconcat;

public class Name {

    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public Name(String familyName, String middleName, String givenName) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }

    public String concatNameWesternStyle() {
        return title + " " + givenName + " " + middleName + " " + familyName;
    }

    public String concatNameHungarianStyle() {
        String fullName;

        fullName = title.getTitleInString();
        fullName = fullName.concat(" ");
        fullName = fullName.concat(familyName);
        fullName = fullName.concat(familyName);
        fullName = fullName.concat(" ");
        fullName = fullName.concat(middleName);
        fullName = fullName.concat(" ");
        fullName = fullName.concat(givenName);

        return fullName;
    }

    public boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }
}

