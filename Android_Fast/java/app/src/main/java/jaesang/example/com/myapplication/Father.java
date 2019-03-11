package jaesang.example.com.myapplication;

public class Father extends Human {

    public Father() {

    }

    public void work() {
        System.out.println("일한다");
    }

    // Override 기능 : 부모 클래스의 기능을 물려받되, 그 기능이 내 클래스의 요구조건과 일치하지 않을 때
    //                  그 키워드를 수정하는 것. 아래 예시 참조

    @Override   //골뱅이를 적고 이 아래 바꿀 기능의 메소드를 적는다.
    public void eat() {     // 이 안에서 어떻게 오버라이드를 바꾸고 싶은지 정하면 된다.
        // super.eat();    // 슈퍼 키워드는 자기 자신(this)이 아니라 부모 클래스를 의미
        //Human.eat();   // 여기서 super는 Father의 부모 클래스인 Human이다.
                        // 그러므로 Human.eat() 기능을 의미한다.
        //이 키워드인 super.eat()을 쓰지 않으면 해당 기능을 그대로 사용하지 않고 변경하는 것

        System.out.println("많이 먹는다");

    }

    public void wash(String sampoo) {       //이렇게 키워드 따로 없이 같은 메서드명을 사용해
        System.out.println("샴푸로 샤워한다"); // 파라미터를 넣어주기만 하면 된다.
    }
}
