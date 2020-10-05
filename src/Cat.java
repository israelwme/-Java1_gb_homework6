public class Cat extends Animal {
    @Override
    public void run(double length) {
        boolean result = length <= 200;
        showResult(this,"run",result);
    }
    @Override
    public void jump(double height) {
        boolean result = height <= 2;
        showResult(this,"jump",result);
    }

}