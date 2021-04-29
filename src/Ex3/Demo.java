package Ex3;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set StudentHeightList = new HashSet();
		Scanner sc= new Scanner(System.in);
		
		for(int i = 0; i<10; i++) {
			System.out.println("Enter Height : " + (i+1));
			StudentHeightList.add(sc.nextInt());
		}
	}
	
	for(Object object : studentHeight) {
		System.out.println(object);
	}
}

}
