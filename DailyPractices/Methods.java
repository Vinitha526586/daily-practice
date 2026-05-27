package DailyPractices;

// public class Methods {
//     static int cub(int n){
//         return n * n * n;
//     }  
//     public static void main(String[] args){
//         int result = cub(3);
//         System.out.println(result);
//     } 
// }


// public class Methods {
//     static void evenOdd(int num){
//         if(num % 2 == 0){
//             System.out.println("Num is Even");
//         }   
//         else{  
//         System.out.println("Num is Odd");
//         }
//     }
//     public static void main(String[] args) {
//         evenOdd(34);
//     }
// }


// public class Methods {
//     public static void maxNumber(int a,int b){
//         if(a > b){
//             System.out.println(a + "is greater");
//         }
//         else if(a<b){
//             System.out.println(b + "is greater");
//         }
//         else{
//             System.out.println("Equal");
//         }
//     }
//     public static void main(String[] args) {
//        maxNumber(12,43);
//     }
// }


// public class Methods {
//     static int sqr(int n){
//         return n * n;
//     }  
//     public static void main(String[] args){
//         int result = sqr(6);
//         System.out.println(result);
//     } 
// }


// public class Methods {
//     public static void minNumber(int a,int b){
//         if(a < b){
//             System.out.println(a + "is lessten");
//         }
//         else if(a>b){
//             System.out.println(b + "is lessten");
//         }
//         else{
//             System.out.println("Equal");
//         }
//     }
//     public static void main(String[] args) {
//        minNumber(33,55);
//     }
// }


// public class Methods {
//     public static void positiveOrNegative(int a){
//         if(a >= 1){
//             System.out.println(a + "is positive");
//         }
//         else if(a <= 1){
//             System.out.println(a + "is negative");
//         }
//         else{
//             System.out.println("Zero");
//         }
//     }
//     public static void main(String[] args) {
//        positiveOrNegative(-43333335);
//     }
// }

// public class Methods {

//     static void fact(int n){
//         int fact = 1;
//         for(int i=1;i<=n;i++){
//              fact = fact * i;
//         }
//         System.out.println(fact);

//     }
//     public static void main(String[] args) {
//         fact(5);
//     }
// }


// public class Methods {

//     static void rev(int num){
//         int rev = 0;
//         while (num != 0) {
//             int digit = num % 10;
//             rev = rev * 10 + digit;
//             num /= 10;
            
//         }
//         System.out.println(rev);
//     }
//     public static void main(String[] args) {
//         rev(1234);
//     }
// }


// public class Methods {

//     static void palindrome(int num){
//         int rev = 0;
//         int temp = num;
//         while (num != 0) {
//             int digit = num % 10;
//             rev = rev * 10 + digit;
//             num /= 10;   
//         }
//         if(rev == temp){
//             System.out.println("Palindrome");
//         }
//         else{
//             System.out.println("not palindrome");
//         }
//     }
//     public static void main(String[] args) {
//         palindrome(121);
//     }
// }


// public class Methods {

//     static void sumOfDigit(int num){
//         int sum = 0;
//         while (num != 0) {
//             int digit = num % 10;
//             sum = sum + digit;
//             num /= 10;   
//         }
//         System.out.println(sum);
//     }
//     public static void main(String[] args) {
//         sumOfDigit(12345);
//     }
// }



// public class Methods {
//     static void primeOrNot(int num){
//         boolean isPrime = true;
//         if(num <= 1){
//             isPrime = false;
//         }
//         for(int i=2;i<=num;i++){
//             if(num % 2 == 0){
//                 isPrime = false;
//                 break;
//             }
//         }
//         if(isPrime){
//             System.out.println("Prime");
//         }
//         else{
//             System.out.println("not prime");
//         }
//     }
//     public static void main(String[] args) {
//         primeOrNot(7);
//     }
// }



public class Methods {
    static void fibonacii(int num){
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        for(int i=3;i<=num;i++){
            int c = a+b;
            System.out.print(" " + c);
            a=b;
            b=c;
        }
    }
    public static void main(String[] args) {
        fibonacii(7);
    }
}