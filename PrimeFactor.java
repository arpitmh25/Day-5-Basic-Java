import java.util.Scanner;
class PrimeFactor {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		System.out.println("Prime factors for the given numbers:");
		for(int i=2;i<=n;i++)
			{
				while(n%i==0)
			{
				n=n/i;
				System.out.println(i+"");
			}
		}

	}
}