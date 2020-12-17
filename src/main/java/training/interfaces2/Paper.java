package training.interfaces2;

public class Paper implements Writable, Erasable, Flat{
    private String content = "";
    private int maxContentSize = DEFAULT_CONTENT_SIZE;


    public Paper() {
    }

    public Paper(int maxContentSize) {
        this.maxContentSize = maxContentSize;
    }

    public boolean write(String text) {
        String newContent = content + text;
        if (newContent.length() <= maxContentSize) {
            content = newContent;
            return true;
        }
        return false;
    }

    public void erase() {
        content = "";
    }


    public String getContent() {
        return content;
    }
}
