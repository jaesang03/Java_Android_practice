package jaesang.example.com.myapplication;

public class Car {

    int tires;
    String engine;
    Boolean superEngine;
    String break_;
    String handle;

    public Car(int tires, String engine, String break_, String handle) {
        // 클래스를 인스턴스화(실체화), 만드는 방법이 적혀 있어. 따라서 이 안에서 조립이 일어나야해
        // 받아온 파라미터에 값을 채워넣어야해. tires, engine, break_, handle값을 넣어줌
        // 생성자 함수의 2가지 특징(클래스명과 함수 명이 동일해요, 리턴타입이 없어요<적으면 안됨>)
        // 생성자는 슈퍼엔진은 받지 않고 나머지 부품들만 받아요
        // 위에 있는 Class의 tires와 파라미터의 tires를 구분하기 위해 this키워드를 사용할 수 있다.

        this.tires = tires;         //앞 부분의 타이어는 클래스의 타이어, 뒷 부분은 파라미터 타이어
        // 그러므로 this는 자기자신 즉, 클래스를 가르킨다.
        // 컨트롤을 누르고 tires를 누르면 해당 부분으로 이동하게 된다.
        this.engine = engine;
        this.break_ = break_;
        this.handle = handle;
    }

    public Car(int tires, String engie, Boolean superEngine, String break_, String handle) {

        this.tires = tires;
        this.engine = engine;
        this.break_ = break_;
        this.handle = handle;
        this.superEngine = superEngine;
    }

    public void goforward() {
        System.out.println("직진 합니다");
    }

    public void gobackward() {
        System.out.println("후진 합니다");
    }

    public void isSuperCar() {
        if (superEngine == true) {
            System.out.println("슈퍼카 입니다");
        } else {
            System.out.println("슈퍼가가 아닙니다");
        }
    }
}

