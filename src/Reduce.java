public class Reduce
{
    public static void main(String[] args)
    {
        int numSteps = 0;
        int i = 2;
        while (i != 0)
        {
            if (i % 2 == 0)
            {
                i = i / 2;
            } else
            {
               i --;
            }
            numSteps++;
        }
        System.out.println(numSteps);
    }
}
