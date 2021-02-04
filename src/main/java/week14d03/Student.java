package week14d03;

/*
Mai junior/mid-level feladat
Készíts egy diák (`Student`) osztályt melyben egy diák jegyeit tárolod egy Map-ben. A map kulcsa a tantárgy, értéke
pedig az adott tantárgy jegyeinek listája. Ezen felül a diáknak legyen neve, melyet konstruktorban kap meg.
Legyen benne egy metódus, ami paraméterül vár egy tantárgyat és egy jegyet, és beírja a jegyet a megfelelő tantárgyhoz.
  Készítsd el a `ClassNotebook` nevű osztályt melyben diákok listája található. Készíts egy lekérdező metódust
  a `ClassNoteBook` osztályban, legyen a neve `sortNotebook` mely a diákok listáját ABC sorrendben adja vissza.
 */

import java.util.*;

public class Student implements Comparable<Student> {
    private String name;
    Map<String, List<Integer>> gradesPerSubject = new HashMap<>();



    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Map<String, List<Integer>> getGradesPerSubject() {
        return gradesPerSubject;
    }

    public void addGradeToSubject(String subject, int grade) {
        if(!gradesPerSubject.containsKey(subject)) {
            gradesPerSubject.put(subject, new ArrayList<>());
        }
        gradesPerSubject.get(subject).add(grade);

    }

    @Override
    public int compareTo(Student o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradesPerSubject=" + gradesPerSubject +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student("Jane");
        student.addGradeToSubject("biology", 5);
        System.out.println(student.gradesPerSubject);
    }


    }

