package _1_Arraylist_basics;
import java.util.ArrayList;

public class arrayListBasic {
    
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        //Add at index
        list.add(1,15);
        System.out.println(list);


        //get
        System.out.println(list.get(2));

        //set
        list.set(0,5);
        System.out.println(list);

        //remove
        list.remove(1);
        System.out.println(list);

        //size
        System.out.println(list.size());

        //indexOf
        System.out.println(list.indexOf(20));

    }
}