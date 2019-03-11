package jaesang.example.com.myapplication;

import java.util.ArrayList;

public class Array_ {

    public static void main(String[] args) {

/*
        //arrayList를 생성하는 방법은 2가지
        //ArrayList의 자료형 명시하는 방법, 명시하지 않고 ADD할때 적는 방법
        //1번부터 실습하겠다.
        // ArrayList는 reference 자료형만 들어올수 있다. primitive자료형은 integer 등을 사용
        // Integer라는 참조 자료형을 따로 만들었어. 이걸 사용하자.
        //Boolean, Long, Integer, ... primitive타입 대신 reference 타입을 사용
        // primitive 타입은 null이 들어갈 수 없지만 reference타입엔 사용 가능
        // null은 존재하지 않는다는 의미.
        null은 존재하지 않기 때문에 null point exception이라는 오류 발생
*/
        int a;
        Integer a1;

        boolean b;
        Boolean b2;

        Long item;
        item = null;

        ArrayList<Integer> ints = new ArrayList<Integer>(); // 명시적으로 값을 넣어줌
        ArrayList ints2 = new ArrayList();   // 암시적인 ArrayList

        ints.add(2);
        ints.add(3);
        //ints.add(true);
        System.out.println(ints);

        ints2.add(2);
        ints2.add(3);
        ints2.add(true);
        System.out.println(ints2);
        //명시적인 방법과 명시적이지 않은 방법의 차이 : ints에는 지정된 명시적 자료형 외에는 넣을 수 없다. 반면 ints2에는 지정된 명시적 자료형이 없으므로 넣을 수 있음
        //그러므로 ArrayList를 만들 땐 목적에 맞게 사용. but 보통은 명시적 방법 사용한다.

        for(int i=0; i<ints.size(); i++) {      //array는 length, arrayList는 size
            if(ints.get(i) == 2) {
                System.out.println("2를 찾았다");
            }
        }

        ints.remove(0);
        System.out.println(ints);

    }
}



