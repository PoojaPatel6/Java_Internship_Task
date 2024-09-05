
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist {

    public static void main(String[] args) {
        ArrayList<Integer> al1 = new ArrayList<>();
        System.out.println("Empty ArrayList: " + al1);
        
        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(50);

        System.out.println("Now al1 is traversed: " + al1);

        for (int i = 0; i <= al1.size() - 1; i++) {
            System.out.println("Index: " + i + " Value: " + al1.get(i));
        }

        System.out.println("Using Iterator:");
        Iterator<Integer> itr = al1.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next() + " ");
        }

        System.out.println("Using List Iterator ");
        @SuppressWarnings("rawtypes")   // only for remove the  worning msg
		ListIterator li1 = al1.listIterator();
        while(li1.hasNext()){
               System.out.println(li1.next()+ " ");

}
System.out.println("In Reverse order");
while(li1.hasPrevious()){
System.out.println(li1.previous()+ "");
}

@SuppressWarnings("rawtypes")  // only for remove the worning msg


ArrayList  clone = (ArrayList) al1.clone();
System.out.println("Original ArrayList :- "+ al1);
System.out.println("Cloned ArrayList :- "+ clone);

    }
}
