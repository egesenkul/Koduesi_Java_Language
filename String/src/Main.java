import java.util.*;

public class Main {
	public static String removeDuplicates(String s) {
	    StringBuilder noDupes = new StringBuilder();
	    for (int i = 0; i < s.length(); i++) {
	        String si = s.substring(i, i + 1);
	        if (noDupes.indexOf(si) == -1) {
	            noDupes.append(si);
	        }
	    }
	    return noDupes.toString();
	}
	
	public static int Agirlik(String s){
		int agirlik=0;
		s=removeDuplicates(s);
		for(int i=0;i<s.length();i++){
			if(Character.isDigit(s.charAt(i))){
				agirlik+=Integer.parseInt(s.charAt(i)+"");
			}
			else if(Character.isLetter(s.charAt(i))){
				if(s.charAt(i)=='a'){
					agirlik+=10;
				}
				else if(s.charAt(i)=='e'){
					agirlik+=20;
				}
				else if(s.charAt(i)=='i'){
					agirlik+=30;
				}
				else if(s.charAt(i)=='o'){
					agirlik+=40;
				}
				else if(s.charAt(i)=='u'){
					agirlik+=50;
				}	
		}
		}
		return agirlik;
	}
	
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t=cin.nextInt();
		String skip=cin.nextLine();
		for(int test=0;test<t;test++){
			String s1=cin.nextLine();
			s1=s1.toLowerCase();
			System.out.println(Agirlik(s1));
		}
		cin.close();
	}
}
