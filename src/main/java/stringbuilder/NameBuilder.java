package stringbuilder;

public class NameBuilder {



    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title){
        if(isEmpty(familyName) || isEmpty(givenName)){
            throw new IllegalArgumentException("Family name and firstname must be given");
        }
        StringBuilder fullName = new StringBuilder("");

        if(title != null){
            fullName.append(title.getTitleInString()).append(" ").append(givenName);
        }else{
            fullName.append(givenName);
        }
        fullName.append(" ");
        if(! isEmpty(middleName)){
            fullName.append(middleName).append(" ");
        }
        fullName.append(familyName);

        return fullName.toString();

    }

    public String insertTitle(String name, Title title, String where){
        StringBuilder sb = new StringBuilder(name);
        int index = sb.indexOf(where);
        sb.insert(index +1, (title.getTitleInString() + " "));

        return sb.toString();
    }

    public String deleteNamePart(String name, String delete){
        StringBuilder sb = new StringBuilder(name);
        int index = sb.indexOf(delete);
        sb.delete(index, index+delete.length());
        return sb.toString();
    }


    private boolean isEmpty(String str){
        return str == null || "".equals(str.trim());

    }



}
