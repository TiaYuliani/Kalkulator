import java.util.Scanner;
public class persegipanjang
{
	public static void main(String[] arg)
	{
		float p,l,L;
		Scanner input= new Scanner(System.in);
		System.out.println("Menghitung Luas Persegi Panjang");
		System.out.print("Masukan panjang : ");
		p= input.nextInt();
		System.out.print("Masukan lebar : ");
		l= input.nextInt();
		L=p*l;
		System.out.print("Luas Persegi Panjang adalah  " +L);
	}
}	