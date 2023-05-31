/* 2) Create an arraylist of Integer class
      a) add 5 elements (11, 12 ,13 ,14 ,15)
      b) print list
      c) get an element (3 index)
      d) remove index 2 (0 based indexing)
      e) set index 2 to 10
      f) check whether 90 exists in array list or not
      g) add 9 at index 1
      h) print size of array list
      i) iterate through array list and print values stored            */
import java.util.ArrayList;
import java.util.*;
public class LQ2
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        // Add
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println(list);
        // get
        int element = list.get(3);
        System.out.println(element);
        // remove
        list.remove(2);
        System.out.println(list);
        // set
        list.set(2, 10);
        System.out.println(list);
        // contains
        System.out.println(list.contains(90));
        // add at a particular index
        list.add(1, 9);
        System.out.println(list);
        // size of list
        System.out.println(list.size());
        // iterating and printing array list
        for (int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
    }
}
