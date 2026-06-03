import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class GCD
{
    public int findGreatestDivisor(int n1, int n2)
    {

        List<Integer> factorsN1 = new ArrayList<>();
        List<Integer> factorsN2 = new ArrayList<>();
        for(int i = 1; i<=n1; i++)
        {
            if(n1%i==0)
                factorsN1.add(i);

            if(n2%i==0)
                factorsN2.add(i);

        }
        List<Integer> common = new ArrayList<>(factorsN1);
        common.retainAll(factorsN2);
        int greatest = Collections.max(common);
        return greatest;

    }
}
