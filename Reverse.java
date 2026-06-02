public class Reverse
{
    public int reverseInteger(int n)
    {
        int revNumber = 0;

        while(n > 0)
        {
            int lastDigit = n%10;

            n = n/10;

            revNumber = (revNumber*10) + lastDigit;

        }
        return revNumber;
    }
}