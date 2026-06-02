public class Palindrome
{
    public boolean isPalindrome(int n)
    {
        int revNumber = 0;
        int original = n;
        while (n > 0)
        {
            int lastDigit = n%10;
            n = n/10;
            revNumber = (revNumber*10) + lastDigit;

        }

        if(original==revNumber)
            return true;
        else
            return false;
    }
}