public class Dog extends Animal {
    private double maxLength;

    public Dog() {
        maxLength = Math.random() > 0.5 ?  400 : 600;
    }

    public void swim(double length) {
        boolean result = length <= 10;
        showResult(this,"swim",result);
    }
    @Override
    public void run(double length) {
        boolean result = length <= maxLength;
        showResult(this, "run", result);
    }
    @Override
    public void jump(double height) {
        boolean result = height <= 0.5;
        showResult(this,"jump",result);
    }

}