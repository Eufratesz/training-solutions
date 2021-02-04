package week14d03;

import java.util.*;

/*
Készítsd el a `ClassNotebook` nevű osztályt melyben diákok listája található. Készíts egy lekérdező metódust
  a `ClassNoteBook` osztályban, legyen a neve `sortNotebook` mely a diákok listáját ABC sorrendben adja vissza.
 */

public class ClassnoteBook {

    List<Student>studentList;

    public ClassnoteBook(List<Student> studentList) {
        this.studentList = studentList;
    }



    public List<Student> sortNotebook(List<Student> studentList) {
        List<Student> orderedStudentList = new ArrayList<>(studentList);
        Collections.sort(orderedStudentList);
        return orderedStudentList;
    }





}






