package jaesang.example.com.myapplication;

public class a_Father_interface implements a_Human_interface{

    public a_Father_interface() {

    }
        // 마우스 오른쪽 누른 다음 generate를 해서 interface의 목록들을 작성한다.
        // alt + insert를 눌러도 됨
    @Override
    public void eat() {
        System.out.println("아버지가 먹는다");
    }

    @Override
    public void sleep() {
        System.out.println("아버지가 잔다");
    }

    @Override
    public void wash() {
        System.out.println("아버지가 씻는다");
    }
}
