public class Armstrong
{
    public boolean checkNum(int n)
    {
        int sum = 0;
        int original = n;
        while (n > 0)
        {
            int lastDigit = n%10;
            n = n/10;
            sum = sum + (lastDigit * lastDigit * lastDigit);

        }
        if(sum==original)
            return true;
        else
            return false;
    }
}
