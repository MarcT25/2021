//Import statements
import java.io.*;
import java.util.*;


public class Isomorphic {
	
	static int size = 256;
	
	public Boolean IsIsomorphic(String s1, String s2) {
		
		// get the size of the strings to compare if the are of the same size.
		int l = s1.length();
		int t = s2.length();
		
		if(l != t)
			return false;
		
		//array to keep track of visited characters in string 2.
		Boolean[] visited = new Boolean[size];
		for(int i = 0; i < size; i++) {
			visited[i] = false;
		}
		
		int[] map = new int[size];
		for(int i = 0; i < size; i++) {
			map[i] = -1;
		}
		
		//checks character for one by one mapping.
		for(int i = 0; i < l; i++) {
			
			//
			if(map[s1.charAt(i)] == -1) {
				
				//checks to see if char on s2 is already seen, if so one to one mapping no possible.
				if(visited[s2.charAt(i)] == true)
					return false;
				
				//s2 character is mark as visited.
				visited[s2.charAt(i)] = true;
				
				//store current characters.
				map[s1.charAt(i)] = s2.charAt(i);
			}
			else if(map[s1.charAt(i)] == s2.charAt(i))
				return false;
		}
		return true;
	}

}
