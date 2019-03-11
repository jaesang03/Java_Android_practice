package jaesang.example.com.myapplication;

public class a_Mother_interface implements a_Human_interface {

    public a_Mother_interface() {

    }
        // 강점 1
    // 아버지와 어머니의 기능이 모두 다르다. 이를 위해 Override를 적고 Human 클래스 안에도 적어야 하지만
    // 인터페이스를 사용하면 interface에 함수의 내용 부분을 작성하지 않고 인터페이스를 구현하는 클래스들이
    // 각각 함수 내부를 사용하기 때문. 어차피 함수를 쓰는 클래스에서 오버라이드를 할 예정이니까
    // 더 효율적이라고 할 수 있겠지! 이게 인터페이스를 통해 얻는 이점이다.

    // 강점 2
    // 어떤 클래스가 인터페이스를 구현한다고 할 경우, 인터페이스에 있는 함수들의 구현을 강제할 수 있다는
    // 강점이 또한 있다.

    // 강점 3
    // 다른 사람과 협업을 동시에 할 수 있다(인터페이스를 사용해 두 개발자가 동시에 사용할 수 있다)

    @Override
    public void eat() {
        System.out.println("어머니가 먹는다");
    }

    @Override
    public void sleep() {
        System.out.println("어머니가 잔다");

    }

    @Override
    public void wash() {
        System.out.println("어머니가 씻는다");

    }
}
