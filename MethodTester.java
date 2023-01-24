
/*Jayleen Espinal
  Assignment 1
  1/23/23
  COP 3530
*/
import java.util.Arrays;

public class MethodTester    {
    public static void main(String[] args)  {
        int[] testArray = {-1, 12, -3, 14, -4, 3};
        System.out.println("Maximum sum: " + algorithm1(testArray));
    }

    public static int algorithm1(int[] A)   {
        int maxSum = 0;
        for (int i = 0; i < A.length; i++)  {
            for (int j = i; j < A.length; j++)  {
                int sum = 0;
                for (int k = i; k <= j; k++)    {
                    sum += A[k];
                }
                if (sum > maxSum)   {
                    maxSum = sum;
                }
            }
        }

        return maxSum;
    }
}
