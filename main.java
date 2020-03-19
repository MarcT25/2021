import java.util.*;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		//variable declaration
		String str1;
		String str2;
		boolean answer;
		
		Isomorphic iso = new Isomorphic();
		Scanner scan = new Scanner(System.in);
		
		str1 = scan.nextLine();
		
		str2 = scan.nextLine();
		
		answer = iso.IsIsomorphic(str1, str2);
		
		System.out.println(answer);
		

	}

}
