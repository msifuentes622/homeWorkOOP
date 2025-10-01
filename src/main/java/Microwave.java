public class Microwave extends Device {
    private int maxTime;

    public Microwave(int maxTime) {
        super(maxTime);
    }
    public Microwave(int startPower, int maxCookingTime) {
        super(startPower);
        this.maxTime = maxCookingTime;
    }
    @Override
    public void printDescription() {
        super.printDescription();
        System.out.println("Max cooking time " + maxTime);
    }
    public void heatFood(){
        System.out.println("food is Heating");
    }
}
