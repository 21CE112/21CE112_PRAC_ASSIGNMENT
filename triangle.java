import java.util.Scanner;
public class triangle {
    public static int recursion(int n)
    {
        if(n==1)
        {
            return 1;
        }
        n = n+recursion(n-1);
        return n;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number of blocks : ");
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
         n = recursion(n);
        System.out.println(n);
    }
}
