import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int t=cin.nextInt();
		for(int test=0;test<t;test++){
		int toplam=0;
		int i = cin.nextInt();
		if(i<100 && i>9){
			int DortBasamakli=i*100;
			DortBasamakli+=(i%10)*10;
			DortBasamakli+=(i/10);
			toplam+=DortBasamakli;
			DortBasamakli=0;
			DortBasamakli=i*1000;
			DortBasamakli+=(i%10)*10;
			DortBasamakli+=(i/10);
			toplam+=DortBasamakli*10;
			toplam+=4500;
		}
		System.out.println(toplam);
	}
		cin.close();
	}
}
