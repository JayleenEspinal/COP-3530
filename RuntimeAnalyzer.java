import java.util.Arrays;

public class RuntimeAnalyzer {
    public static void main(String[] args)  {
        for (int size = 5; size <= 50; size += 5)  {
            int totalAssignments1 = 0;
            int totalAssignments2 = 0;
            int totalAssignments3 = 0;
            for (int i = 0; i < 20; i++)    {
                int[] testArray = new int[size];
                for (int j = 0;j < size; j++ )  {
                    testArray[j] = (int)(Math.random()*110 - 10);
                }
                totalAssignments1 += algorithm1(testArray);
                totalAssignments2 += algorithm2(testArray);
                totalAssignments3 += algorithm3(testArray);
            }
            
            System.out.println("Array size: " + size);
            System.out.println("Average number of assignments (Algorithm 1): " + totalAssignments1/20);
            System.out.println("Average number of assignments (Algorithm 2): " + totalAssignments2/20);
            System.out.println("Average number of assignments (Algorithm 3): " + totalAssignments3/20);
            System.out.println();
        }
    }

    public static int algorithm1(int[] A)   {
        int maxSum = 0;
        int assignments =0;
        for (int i = 0; i < A.length; i++)  {
            for (int j =i; j < A.length; j++)   {
                int sum = 0;
                for (int k = i; k <= j; k++)    {
                    sum += A[k];
                    assignments++;
                }
                if (sum > maxSum)   {
                    maxSum = sum;
                    assignments++;
                }
            }
        }
        return assignments;
    }

    public static int algorithm2(int[] A) {
        int maxSum = 0;
        int assignments = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                assignments++;
                if (sum > maxSum) {
                    maxSum = sum;
                    assignments++;
                }
            }
        }
        return assignments;
    }

    public static int algorithm3(int[] A)   {
        int maxSum = 0;
        int assignments = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                assignments++;
                if (sum > maxSum) {
                    maxSum = sum;
                    assignments++;
                }
                if (sum < 0)    {
                    break;
                }
            }
        }
        return assignments;
    }
}
