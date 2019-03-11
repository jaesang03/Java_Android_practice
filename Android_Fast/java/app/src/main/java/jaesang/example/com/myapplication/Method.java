package jaesang.example.com.myapplication;

public class Method {

    public int plus(int a, int b) {
        int result;
        result = a+b;
        return result;
    }

    public void plus1(int a, int b) {
        int result;
        result = a+b;
    }

    public static void main2(String[] args) {

        Method Meth = new Method();
        Meth.plus(10,20);
        Meth.plus1(30,40);

        int number1;
        int number2;

        number1 = Meth.plus(100, 100);
        number2 = Meth.plus(50, 50);

        System.out.println(number1);
        System.out.println(number2);

    }
}
