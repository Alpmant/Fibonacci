import java.util.Scanner;
public class Test {

    public static void main(String[] args) {

        // 1 1 2 3 5 8 13 21 34 55

        Scanner input=new Scanner(System.in);

        System.out.print("Kaç seri olsun:");
        int seriSayisi=input.nextInt();
        int a=1;
        int b=1;
        int c;
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<seriSayisi;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);

        }









    }
}
















