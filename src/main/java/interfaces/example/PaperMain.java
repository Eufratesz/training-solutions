package interfaces.example;

public class PaperMain {

    public static void main(String[] args) {
        Paper paper = new Paper();
        Writable writable = paper;
        Erasable erasable = paper;

        writable.write("alma");
        paper.write("körte");
        System.out.println(paper.getContent());
        erasable.erase();
        System.out.println(paper.getContent());
    }
}
