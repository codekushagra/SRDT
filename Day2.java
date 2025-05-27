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
        System.out.println(isPrime(number));
        System.out.println(sumofDigits(number));
        pattern1(4);
        pattern2(4);
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
        for(int i=1;i<=4;i++){
            for(int j=1;j<i;j++){
                if(i==3 && j==2 ){
                    System.out.print("");
                }
                System.out.print(" * ");

                
            }
            System.out.println();
        }
    }
    /*pattern 3
    *
    *  *
    *    *
    * * * *
    
    */


}
