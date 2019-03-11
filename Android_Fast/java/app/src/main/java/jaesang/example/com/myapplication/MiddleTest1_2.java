package jaesang.example.com.myapplication;

import java.util.ArrayList;

public class MiddleTest1_2 {
    public static void main(String[] args) {

        int i = 0;
        ArrayList<Integer> ints = new ArrayList<Integer>();

        while (i < 10) {
            ints.add(i);
            i++;
        }
        System.out.print("How many Odds in the ints?");
        System.out.println(howManyOdds(ints));

    }

    public static int howManyOdds(ArrayList<Integer> ints) {
        int i=0;
        int count=0;
        for(i=0; i<ints.size(); ++i) {
            if(ints.get(i)%2==0)
                count++;
        }
        return count;
    }
}

