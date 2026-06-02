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

    }
}