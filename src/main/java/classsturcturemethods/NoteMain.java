package classsturcturemethods;

public class NoteMain {
    public static void main(String[] args) {
        Note note = new Note();

        note.setName("Julia Roberts");
        note.setTopic("Films");
        note.setText("I enjoyed filming Pretty woman!");
/*
        System.out.println(note.getName());
        System.out.println(note.getTopic());
        System.out.println(note.getText());
*/
        System.out.println(note.getNoteText());
    }
}
