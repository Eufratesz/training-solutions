package aaa.week07;

/*
Hozz létre egy Lab nevű osztályt, ami azt tárolja el, hogy melyik feladattal készültél el! Három attribútuma: title ami
a tananyag neve, egy completed, hogy elkészültél-e vele, és a completedAt, ami azt tárolja, hogy mikor! Legyen két
konstruktora! Az egyik csak a címet várja, ekkor úgy állítsa be a példányt, hogy még nem készültél el. Legyen egy másik,
 ami várja a címet és a dátumot Ekkor azt állítsa be, hogy elvégezted a gyakorlati feladatot. Írj egy complete metódust,
 ami kap egy dátumot, és beállítja, hogy elvégezted a gyakorlati feladatot. Legyen egy complete metódusa, ami semmit
nem vár, ez azt állítja be, hogy MOST végezted el a gyakorlati feladatot. Írd meg a toString metódusát is!
 */

import java.time.LocalDate;

public class Lab {

    private String title;
    private boolean completed;
    private LocalDate completedAt;

    public Lab(String title) {
        this.title = title;
       // completed = false; - nem kell kiírni, mert az alapértéke false.
    }

    public Lab(String title, LocalDate completedAt) {
        this.title = title;
        this.completedAt = completedAt;
        completed = true;
    }

    public void complete(LocalDate completedAt) {
        completed = true;
        this.completedAt = completedAt;
    }

    public void complete() {
        completed = true;
        completedAt = LocalDate.now();
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDate getCompletedAt() {
        return completedAt;
    }

    @Override
    public String toString() {
        return "Lab{" +
                "title='" + title + '\'' +
                ", completed=" + completed +
                ", completedAt=" + completedAt +
                '}';
    }
}
