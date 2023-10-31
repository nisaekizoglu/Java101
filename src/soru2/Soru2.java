package soru2;
//0-100 arası tek sayıları yazdırın
//0-100 arası tek sayıların toplamı
public class Soru2 {
	public static void main (String []args) {
		int top=0;
		for (int i=1; i<=100; i=i+2) {
			top=top+i;
		}
		System.out.println(top);
	}
	

}
