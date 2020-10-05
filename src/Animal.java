public abstract class Animal {
    protected double length;
    protected double height;

    public abstract void run(double length);
    public abstract void jump(double height);

    public void showResult(Object obj, String str, boolean result) {
        System.out.println(obj.getClass().getName() + " " + str + " : " + result);
    }
}