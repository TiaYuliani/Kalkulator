import java.util.Scanner;
public class bagi
{
	public static void main(String[] arg)
	{
		int a,b;
		float c;
		Scanner input= new Scanner(System.in);
		System.out.println("Menghitung Pembagian");
		System.out.print("Masukan bilangan ke 1 = ");
		a= input.nextInt();
		System.out.print("Masukan bilangan ke 2 = ");
		b= input.nextInt();
		c=a/b;
		System.out.print("Hasil =" +c);
	}
}	