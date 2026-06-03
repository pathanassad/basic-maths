import java.util.ArrayList;

public class Divisors
{
     public ArrayList<Integer> findDivisors(int n)
     {
          ArrayList<Integer> divisors = new ArrayList<>();
          for (int i = 1; i<=n; i++)
          {
               if(n%i==0)
                    divisors.add(i);

          }
          return divisors;
     }
}
