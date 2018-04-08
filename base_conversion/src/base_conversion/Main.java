package base_conversion;

import java.util.*;
public class Main{
	public static void main (String[] args){
		Scanner cin = new Scanner(System.in);
		int i=cin.nextInt();
		for(int j=0;j<i;j++){	
			String x=cin.next();
			Integer base=cin.nextInt();
			System.out.println(Integer.toString(Integer.parseInt(x, 10), base));
		}
	cin.close();
	}	
} 
