import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Oops {
    public static void main(String[] args) {
        // ArrayList and LinkedList
        /*
        1. Which one is more efficient?
        ans: ArrayList is more efficient

        ArrayList : Retrieving elements
        LinkedList : adding/removing elements from the middle
        * **/
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        for(int i=0;i<11_000_000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        /*********************  Fetching data ******************************/
        System.out.println("Fetching data");

        long start = System.currentTimeMillis();
        linkedList.get(4_500_000);
        System.out.println("LinkedList :" + (System.currentTimeMillis()-start) + "ms");

        start = System.currentTimeMillis();
        arrayList.get(4_500_000);
        System.out.println("ArrayList : "+ (System.currentTimeMillis() - start) + "ms");
    }
}

/* Output :
* Fetching data
  LinkedList :46ms
  ArrayList : 0ms
*
* */