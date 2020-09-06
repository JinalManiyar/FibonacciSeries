import java.util.Scanner;

public class FibonacciSeries {

    static int fNum =1, sNum =1, sum=0;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("For how many numbers do you want to see FibonacciSeries Series?");
        int numberOfFibonacci=sc.nextInt();

        System.out.println(fNum);
        System.out.println(sNum);

        fibonacciSeries((numberOfFibonacci-2));
    }

    private static void fibonacciSeries(int count){
        while(count!=0)
        {
            sum= fNum + sNum;

            System.out.println(sum);

            fNum = sNum;
            sNum =sum;
            System.out.println("--------Count"+count);
            count= count - 1;
            //fibonacciSeries(count);
        }
    }
}
