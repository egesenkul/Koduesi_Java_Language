
import java.util.*;
public class Main{
	static ArrayList<String> list = new ArrayList<String>();
	public static boolean isPal(String s) { 
		int n = s.length();
		for(int i=0; i<n/2; i++)
			if(s.charAt(i) != s.charAt(n-i-1)) return false; 
	return true;
	}
	
	public static void main (String[] args){
	Scanner cin = new Scanner(System.in);
	int c=cin.nextInt();
	for(int test=0;test<c;test++){
	String s1 = cin.next();
	for(int i=0;i<=s1.length()-1;i++){
		for(int j=i+1;j<=s1.length();j++){
			String s2=s1.substring(i, j);
			if(isPal(s2)){ 
				list.add(s2);}
		}
	}
	list.trimToSize();
	Collections.sort(list);
	for (int t=0;t<list.size();t++){
	for(int i=0;i<list.size()-1;i++){
		if(list.get(i+1).equals(list.get(i))){
			list.remove(i+1);
		}
	}}
	System.out.print(list.size() + " ");
	for(int k=0;k<list.size();k++){
		System.out.print(list.get(k)+" ");
	}
	System.out.println();
	list.removeAll(list);
	}
	cin.close();
	}
} 
