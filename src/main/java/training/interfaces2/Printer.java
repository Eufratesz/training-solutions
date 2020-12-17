package training.interfaces2;

public class Printer {
    public boolean addContent(Writable writable, String content) {
        return writable.write(content);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        Paper paper = new Paper(200);
        if (printer.addContent(paper, "Ezt írjuk a papírra.")) {
            System.out.println("A papír nyomtatása sikerült");
        }
    }
}
