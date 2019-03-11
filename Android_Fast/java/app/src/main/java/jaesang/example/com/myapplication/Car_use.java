package jaesang.example.com.myapplication;

public class Car_use {

    public static void main(String[] args) {

        Car normalCar = new Car(4, "일반 엔진", "브레이크", "핸들");
        Car superCar = new Car(4, "슈퍼 엔진", true, "브레이크", "핸들");

        // 객체를 선언하기 위해서 만들어진 생성자를 이용해 객체를 만든다. 메인함수 안에 작성하고
        // 해당 값들을 받아오기 위해 각 타입에 맞춰 값을 입력하고 객체를 만든다.

        normalCar.goforward();      //직진
        normalCar.gobackward();     //후진

        superCar.isSuperCar();      //슈퍼카인지 확인
        // 자바에서 미리 만들어 놓은 클래스를 확인하기 위해서는 컨트롤을 누른 채 해당 클래스를 좌클릭!
        // 해당 클래스에서 무엇을 사용할 수 있는지 확인할 수 있다.
    }
}
