package list;

import java.util.*;

public class ListExample {
    public static void main(String[] args) {
//        ArrayList list1 = new ArrayList(); // A
//        List list2 = new ArrayList();      // B
//        Collection list3 = new ArrayList();// C
//
//
//        list1.add(0,"dude");
//        list2.add(0,"dude");
//        list3.add("hey");
//
//
//        System.out.println("This is the begining : " + list1+ "\n" + "this is the second line" +  list2 + "\n" + "the last one " + list3);

        Set orderedSet = new TreeSet();
        orderedSet.add("A");
        orderedSet.add("3");
        orderedSet.add("b");
        System.out.println(orderedSet);
    }
}
