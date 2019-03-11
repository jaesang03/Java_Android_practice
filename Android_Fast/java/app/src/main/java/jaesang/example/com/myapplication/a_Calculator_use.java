package jaesang.example.com.myapplication;

public class a_Calculator_use {

    public static void main(String[] args) {

        // Calculator 함수를 사용해서 개발하는 개발자는 어떻게 해야 하나?!
        // fake Calculator 클래스를 만든다.
            //1. 먼저는 이렇게 페이크 클래스를 만들어서 사용
        //Calculator_Fake calculatorFake = new Calculator_Fake();
            //2. 실제 구현이 완료되면 바꿈
        a_Calculator calculatorFake = new a_Calculator();
        calculatorFake.sum();
        calculatorFake.by();
        calculatorFake.minus();
        calculatorFake.multiple();

        // 페이크 클래스를 사용하지 않고 이제 구현이 완료된 인터페이스를 사용한다.
    }
}
