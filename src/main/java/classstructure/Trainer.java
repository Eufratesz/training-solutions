package classstructure;


public class Trainer {

    private String name;

    public Trainer (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNameUpperCase () {
        return name.toUpperCase();
    }

    public void changeName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Trainer trainer = new Trainer("Lökösházi Anett");
        System.out.println(trainer.getName());
        System.out.println(trainer.getNameUpperCase());

        trainer.changeName("Julia Roberts");
        System.out.println(trainer.getName());
    }
}
