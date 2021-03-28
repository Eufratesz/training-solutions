package interfaces.demo;

public class TrainerMain {

    public static void main(String[] args) {
//        Trainer trainer = new Trainer();
//        Human human = trainer;  //értékül lehet adni egy Human típusú változónak.
//
//        Human human1 = new Trainer();
//


        HasName trainer = new Trainer();
        trainer.getName();


        HasName course = new Course();
        course.getName();


    }



}
