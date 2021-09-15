import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Person> p=new ArrayList<Person>();
		
       try {
    	   p.add(new Person('M',22,"jack"));
    	   p.add(new Person('F',23,"julie"));
    	   p.add(new Person('M',34,"rahul"));
    	   
    	   for(Person x:p) {
    		   System.out.println(""+x);
              }
    	   }
    	   
       catch(PersonException e) {
    	   System.out.println(e);
       }
	}

}
