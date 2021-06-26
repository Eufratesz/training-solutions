package aaa.week08;

public class Trainer {

    private CanMark canMark;

    public Trainer(CanMark canMark) {
        this.canMark = canMark;
    }

    public int giveMark(){
        return canMark.giveMark();
    }

    public CanMark getCanMark() {
        return canMark;
    }

    public static void main(String[] args) {
        Trainer happyTrainer = new Trainer(new GoodMood());
        Trainer sadTrainer = new Trainer(new BadMood());

        System.out.println(happyTrainer.giveMark());    //5
        System.out.println(sadTrainer.giveMark());      //3
    }
}