import java.util.Scanner;

public class Day2_Array {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int sum=0;
        float avg;

        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum);
        System.out.println(avg=sum/10);
    }
}