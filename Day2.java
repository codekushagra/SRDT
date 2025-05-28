public class Day2 {
    public static void main(String[] args) {
        /*
         * Conditional Statements
         * // int n=10;
         * // if(n%2==0){
         * // System.out.println("Number is even");
         * // }else{
         * // System.out.println("Number is odd" );
         */

        /*
         * Loops ->
         * 1.for
         * 2.do while(used in circular linked list for iteration)
         * 3.while,
         * 4. for-each
         * 
         * 
         * 
         * 
         */
        int number = 53;
        // reverse(number);
        // System.out.println(isPrime(number));
        // System.out.println(sumofDigits(number));
        pattern4(4);
        pattern33(4);
        // pattern2(4);
        // isPrime(number);

        // int sum=0;
        // while(number>0){
        // int digits = number %10;
        // sum = sum*10+digits;
        // number/=10;
        // }
        // System.out.println(sum);

        // if(number==sum){
        // System.out.println("Palindrome yes");
        // }else{
        // System.out.println("Number not palindrome");
        // }

    }

    static boolean isPrime(int n) {
        if (n < 1) {
            return false;
        }
        int c = 2;
        while (c * c <= n) {
            if (n % c == 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
    public static int sumofDigits(int n){
        int sum=0;
        while(n>0){
        int digits = n%10;
        sum+=digits;
        n/=10; 
        }
       
        return sum;
    }

    public static void reverse(int n) {
        int sum = 0;
        while (n > 0) {
            int digits = n % 10;
            sum = sum * 10 + digits;
            n /= 10;
        }
        System.out.println(sum);
    }

    //Pattern functions
    public static void pattern1(int n){
        for(int i=0;i<=4;i++){
            for(int j=0;j<4;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    //pattern 2
    public static void pattern2(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==n || j==2 || i==j ){
                    System.out.print("* ");
                }else{
                System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    /*pattern 3
    *
    *  *
    *  *
    * *
    
    */
public static void pattern3(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
            if(i==0 || j==0 || i==(4-j-1) || j==(4-i-1)){
            System.out.print("* ");
            }else{
                System.out.print("  ");
            }
        }
        System.out.println();
        //i+j==4
    }
}
public static void pattern4(int n){
    for(int i=0;i<=n;i++){
        for(int j=n;j>i;j--){
            System.out.print(" * ");
        }
        System.out.println();
    }
}
public static void pattern33(int n){
    for(int i=0;i<4;i++){
        for(int j=0;j<4-i;j++){
            if(i+j==4){
                System.out.print("* ");
            }
            else{
                System.out.println("  ");
            }
        }
        System.out.println();
    }
}

}
