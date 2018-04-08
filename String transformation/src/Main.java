import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		int test=cin.nextInt();
		String skip=cin.nextLine();
		for(int t=0;t<test;t++)
		{
			String s1=cin.nextLine();
			StringBuilder st1= new StringBuilder(s1);
			String consonants="";
			String others="";
			for(int i=0;i<st1.length();i++){
				char harf =st1.charAt(i);
				if(harf=='q'||harf=='w'||harf=='r'||harf=='t'||harf=='y'||harf=='p'||harf=='s'||harf=='d'||harf=='f'||harf=='g'||
						harf=='h'||harf=='j'||harf=='k'||harf=='l'||harf=='z'||harf=='x'||harf=='c'||harf=='v'||harf=='b'||
						harf=='n'||harf=='m'){
					consonants+=harf;
				}
				else {others+=harf;}}
		        char[] chars = consonants.toCharArray();
		        Arrays.sort(chars);
		        String sorted = new String(chars);
				System.out.print(sorted+others);
				System.out.println();
			}		
}} 