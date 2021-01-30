package collectionsequalshash;

import java.util.Objects;

public class Trainer {

    private String name;
    private int year;

    public Trainer(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
/*
    @Override
    public boolean equals(Object obj) {

        //return ((Trainer) obj).name.equals(this.name);
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != Trainer.class) {
            return false;
        }
        //if(this.name == null) {
        //    return false;
        //}
       // return this.name.equals(((Trainer)obj).getName());
        return Objects.equals(this.name, ((Trainer)obj).name)
                && this.year == ((Trainer)obj).year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }

 */
//le is lehet generálni:
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trainer trainer = (Trainer) o;
        return year == trainer.year &&
                Objects.equals(name, trainer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, year);
    }
}
