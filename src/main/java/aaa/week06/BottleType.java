package aaa.week06;

public enum BottleType {

    GLASS_BOTTLE(150), PET_BOTTLE(200);

    private int maximumAmount;

    BottleType(int maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    public int getMaximumAmount() {
        return maximumAmount;
    }
}
