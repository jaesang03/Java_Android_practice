package jaesang.example.com.myapplication;

public class for_ {

    public static void main(String[] args) {

        /*
        for (int i = 0; i < 10; i++) {

            //특정 실행 코드
            System.out.println(i);
            System.out.println("돈가스를 한 입 먹는다");
        }
        */

        for(int i=0; i<10; i++) {
            System.out.println("돈가스를 한 입 먹는다");
            if(i == 5) {
                break;
            }
        }
    }
}
