public class task6
{
    public static void main(String[] args)
    {

        for(int row =0; row<=5; row++)
        {
            System.out.println();
            for (int col = 5; col > row; col--)
            {
                System.out.print(" *");
            }
        }
    }
}