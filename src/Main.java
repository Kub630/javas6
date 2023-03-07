import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* int myint = 5 + 7 + 8;
        System.out.println(5 + 7 + 8 );
        int myint1 = 5 * 7 * 8;
        System.out.println(5 * 7 * 8);
        double myint2 = (5 + 7 + 8/3) ;
        System.out.println( 5 + 7 + 8/3);*/
      /*  int ss = 1;
        while (ss <= 10) {
            int dd = 1;
            while (dd <= 10) {
                System.out.print(ss + "*" + dd + "=" + ss * dd + "\t\t\t\t");
                dd++;
            }
            System.out.println();
            ss++;*/

        Scanner scanner1  = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        //int m = a>b?100:50;
        if (a > b) {
            System.out.println("100");
        } else
            System.out.println("50");
    }
        }




