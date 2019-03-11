package jaesang.example.com.myapplication;

public class Calculator_use {
    public static void main(String[] args) {

        Calculator carculator = new Calculator(10);

        carculator.add(3);
        carculator.getResult();
        carculator.mul(2);
        carculator.getResult();
        carculator.per(4);
        carculator.getResult();
        carculator.min(5);
        carculator.getResult();
    }
}
