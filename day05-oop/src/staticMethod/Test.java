package staticMethod;

public class Test {
    public static void main(String[] args) {

        Student.printHellowWorld();
        Student s1 = new Student();
        //不建议通过实例对象来访问 类所持有的静态方法
        s1.printHellowWorld();
       // Student.printPass();//报错 printPass属于实例方法，不能通过类名来访问
        s1.setScore(59);
        s1.printPass();
        printHelloWorld2();
    }
    public static void printHelloWorld2(){
        System.out.println("helloWorld");
    }
}
