import java.util.Scanner;
public class segitiga
{
	public static void main(String[] arg)
	{
		float a,t,L;
		Scanner input= new Scanner(System.in);
		System.out.println("Menghitung Luas Segitiga");
		System.out.print("Masukan alas : ");
		a= input.nextInt();
		System.out.print("Masukan tinggi : ");
		t= input.nextInt();
		L=(a*t)/2;
		System.out.print("Luas Persegi Panjang adalah  " +L);
	}
}	