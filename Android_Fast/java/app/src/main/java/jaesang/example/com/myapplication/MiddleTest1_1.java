package jaesang.example.com.myapplication;

import java.util.ArrayList;

public class MiddleTest1_1 {
    public static void main(String[] args) {

        int i =0;
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        ArrayList<Boolean> arrayList2 = new ArrayList<Boolean>();

        while(i < 10 ) {
            arrayList1.add(i);
            i++;
        }
        System.out.print(arrayList1);
        System.out.println();

        for(i=0; i<arrayList1.size(); ++i) {
            if(arrayList1.get(i) < 5)
                arrayList2.add(true);
            else
                arrayList2.add(false);
        }

        System.out.print(arrayList2);
        System.out.println();
    }
}
