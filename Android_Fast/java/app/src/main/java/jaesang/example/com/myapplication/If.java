package jaesang.example.com.myapplication;

public class If {

    public static void main1(String[] args) {

        int money = 3000;
/*
        if(money>=10000) {
            System.out.println("돈가스를 먹는다");
        }
*/
        if (money >= 10000) {
            System.out.println("돈가스를 먹는다");
        } else {
            System.out.println("국밥을 먹는다");
        }

        if(money >= 10000) {
            System.out.println("돈가스를 먹는다");
        } else if(money >= 5000) {
            System.out.println("국밥을 먹는다");
        } else {
            System.out.println("안 먹는다");
        }

    }
}
