package jaesang.example.com.myapplication;

public class Array {

    public static void main(String[] args) {


        boolean[] booleans = new boolean[4];
        int[] ints = new int[4];

//        int[] ints1 = new int[];

        boolean[] booleans2 = {true, false, true, false};
        System.out.println(""+ booleans2);  // 변수가 메모리의 어딘가에 저장되었는데 그 주소값을 출력해 준다

        int[] ints1 = {1,2,3,4};

        booleans[0] = true;
        booleans[1] = false;
        booleans[2] = false;
        booleans[3] = true;

//        booleans[4] = true;

        int first = ints1[0];
        int second = ints1[1];
        int third = ints1[2];
        int fourth = ints1[3];

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);

        //booleans2에 들어있는 값들을 하나하나 꺼내서 true일 경우 참 false일 경우 거짓을 출력하는 반복 제어문 만들어 보자

        for(int i = 0; i<booleans.length; ++i) {
            if (booleans[i] == true) {
                System.out.println("참");
            } else {
                System.out.println("거짓");
            }
        }

        for(int i=0; i<ints1.length; i++) {
            if (ints1[i] == 1) {
                System.out.println("1 발견!");
            } else if (ints1[i] == 2) {
                System.out.println("2 발견!");
            } else {
                System.out.println("모르는 수 발견!");
            }
        }
    }
}
