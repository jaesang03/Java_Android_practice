package jaesang.example.com.myapplication;

public class Family_use {

    public static void main(String[] args) {
        Father Father = new Father();
        Mother Mother = new Mother();
        Son Son = new Son();

        //Father.wash();
        //Mother.cook();
        //Mother.wash();
        //Son.study();
        //Son.wash();

        Father.eat();
        Mother.eat();
        Son.eat();
        Father.wash("샴푸");
        Father.wash();
        // Father, Mother, Son 모두 겹치는 기능이 있다.
        // 상속(extend)를 사용해 보자
        // Override : 상속 받는 속성을 변경(수정)하기 위해 사용
        // Overload : 부모 클래스로 부터 받는 파라미터를 바꾸기 위해
        //              기능이 달라질건데 이 기능이 바뀌기 위해서 파라미터를 바꿔야 하는 경우
    }
}
