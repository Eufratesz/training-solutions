package exam02.cv;

import java.util.ArrayList;
import java.util.List;

public class Cv {

    private String name;
    private List<Skill>skills;

    public Cv(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public int addSkills() {
        List<Skill>skills = new ArrayList<>();
        skills.add(nameOfSkill);
        return skills.getSkills().size();
    }


    public void findSkillLevelByName(List<Skill> skills) {
        Skill found = null;
        for (Skill skill : skills) {
            if (skill.getName().equals())


        }

            throw new SkillNotFoundException;
    }
}
