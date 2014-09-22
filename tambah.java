import java.util.Scanner;
public class tambah
{
	public static void main(String[] arg)
	{
		int a,b,c;
		Scanner input= new Scanner(System.in);
		System.out.println("Menghitung Penjumlahan");
		System.out.print("Masukan bilangan ke 1 = ");
		a= input.nextInt();
		System.out.print("Masukan bilangan ke 2 = ");
		b= input.nextInt();
		c=a+b;
		System.out.print("Hasil =" +c);
	}
}	