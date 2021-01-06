package exam02.cv;

import java.util.List;

public class Skill {

    private String nameOfSkill;
        private int level;

    public Skill(String nameOfSkill, int level) {
        this.nameOfSkill = nameOfSkill;
        this.level = level;
    }

    public String getName() {
        return nameOfSkill;
    }


    public String getLevel() {
        return "\""+ getName() + " (" + level + ")";
    }
}
