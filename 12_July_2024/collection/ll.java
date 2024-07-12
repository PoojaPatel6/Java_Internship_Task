
import java.util.LinkedList;
import java.util.Iterator;
//  import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ll {
      public static void main(String[] args) {
		
LinkedList<String> lilo = new LinkedList<>();
System.out.println("Before Adding Elements: "+lilo);

lilo.add("Pooja");
lilo.add("Rakesh");
lilo.add("Sanju");
lilo.add("Damodar");
lilo.add("Ravi");
System.out.println("After Adding Elements: "+lilo);

System.out.println("-------Using Iterator--------");

Iterator<String> iterator = (Iterator<String>) lilo.iterator();

while(iterator.hasNext()){
    System.out.println(iterator.next());

}
lilo.addFirst("Navya");
System.out.println(lilo);

lilo.addLast("Saumya");
System.out.println(lilo);


 Collections.sort(lilo);
 System.out.println(lilo);


Collections.sort(lilo,new Comparator<String>() {
	@Override
public int compare(String o1, String o2){

      return o2.compareTo(o1);
    //   return o1.compareTo(o2);


}
});
System.out.println(lilo);
// duplicacy

lilo.add("Rakesh");
lilo.add("Sanju");
System.out.println(lilo);


// remove

lilo.removeAll(Collections.singleton("Ravi"));
System.out.println(lilo);


// clear the list
lilo.clear();
System.out.println(lilo);



	}
}
