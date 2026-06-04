import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Count count = new Count();
        int result = count.numbersLength(1236545);
        System.out.println("Number of Digits in given Integer are " + result);

        Reverse rev = new Reverse();
        int reverse = rev.reverseInteger(1234);
        System.out.println("Reversed Number is " + reverse);

        Palindrome pal = new Palindrome();

        int n = 1234;
        boolean isPalindrome = pal.isPalindrome(n);
        if(isPalindrome == true)
            System.out.println("Entered Number " +n+ " is Palindrome");
        else
            System.out.println("Entered Number " + n + " is not Palindrome");

        GCD gcd = new GCD();
        int greatestCommonDivisor = gcd.findGreatestDivisor(20,15);
        System.out.println("Greatest Common factor: " + greatestCommonDivisor + " (GCD)");

        int nu = 12;
        Divisors divs = new Divisors();
        ArrayList<Integer> divisors = divs.findDivisors(nu);
        System.out.println("Output: " + divisors);
        System.out.print("Explanation: The divisors of " + nu + " are ");
        for(int a: divisors) {
            System.out.print(a + ", ");

        }
        System.out.println();

        Prime prime = new Prime();
        boolean p = prime.isPrime(10);
        if(p)
            System.out.println("It is a Prime number");
        else
            System.out.println("not a prime number");



        // Armstrong Number

        Armstrong a = new Armstrong();
        boolean res = a.checkNum(153);
        System.out.println(res);
    }
}