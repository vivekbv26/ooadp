package singelton2;
import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		browserhistory b = browserhistory.getinstance();
		Scanner sc = new Scanner(System.in);
		b.visiturl("www.example.com");
		System.out.println("enter the url");
		String url1 = sc.nextLine();
		b.visiturl(url1);
		b.displayurl();
		
		
	}

}
