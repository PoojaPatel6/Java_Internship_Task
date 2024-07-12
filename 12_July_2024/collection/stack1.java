
import java.util.Stack;
import java.util.Iterator;


@SuppressWarnings("rawtypes")

public class stack1 {
@SuppressWarnings("unchecked")
public static void main(String[] args) {

	// Stack
Stack st = new Stack();
System.out.println(st);

st.push(101);
st.push("Ajay");
System.out.println("Stack after adding element"+st);
st.push("piyush");
st.push(1051);
st.push(-90.35f);
System.out.println("Stack After adding the All element: "+st);


// Iterator
Iterator it = st.iterator();
    while(it.hasNext()){
    System.out.println(it.next());
}
st.pop();
System.out.println(st);
st.pop();
System.out.println(st);
st.pop();
System.out.println(st);
st.pop();
System.out.println(st);
st.pop();
System.out.println(st);
System.out.println("after pop the element: "+st);
}
	
}



