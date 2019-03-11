package jaesang.example.com.myapplication;

import java.util.ArrayList;

public class MiddleTest_1_3 {
    public static void main(String[] args) {

        int i=0;
        ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();


        while (i < 10) {
            arraylist1.add(i);
            arraylist2.add(9 - i);
            i++;
        }
            System.out.println("출력 "+multipleTwoArrayLists(arraylist1,arraylist2));

    }

    public static ArrayList multipleTwoArrayLists(ArrayList<Integer> arraylist1,ArrayList<Integer> arraylist2 )
    {
        int i=0;
        ArrayList<Integer> arraylist3 = new ArrayList<Integer>();
        for(i=0; i<arraylist1.size(); ++i) {
            arraylist3.add(arraylist1.get(i) * arraylist2.get(i));
        }
        return arraylist3;
    }
}
