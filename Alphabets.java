import java.util.Scanner;
public class Alphabets {
	public static void main(String[] args) {
		char a;
		Scanner in=new Scanner(System.in);
		a=in.next().charAt(0);
		if(a==('!')||a==('@')||a==('#')||a==('$')||a==('%')||a==('^')||a==('&')||a==('*')||
				a==('?'))
		{
			System.out.println("No");
		}
		else
		{
			System.out.println("Alphabets");
		}
		in.close();
	}
}
