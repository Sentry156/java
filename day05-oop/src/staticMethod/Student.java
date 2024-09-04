package staticMethod;

public class Student {
    private double score;
    //static 修饰的静态方法 属于类名所持有
    public static void printHellowWorld(){
        System.out.println("Hellow World");
        System.out.println("Hellow World");
        System.out.println("Hellow World");

    }
    public void printPass(){
        System.out.println(score>=60?"通过":"不及格");
    }
    public void setScore(double score){
        this.score = score;
    }
}
