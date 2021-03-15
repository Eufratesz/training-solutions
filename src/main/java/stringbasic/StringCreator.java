package stringbasic;

public class StringCreator {

    public String createStringForHeap(){
        return new String("word");
    }

    public String createStringForPool(){
        return "word";
    }

}
