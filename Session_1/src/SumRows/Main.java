package SumRows;

public class Main
{
    public static void main(String[] args)
    {
        // Declare 2D array

        int[][] nums =
                {
                        {4, 4, 5, 6, 3, 1},
                        {14, 2, 5, 4, 8, 2},
                        {45, 12, 13, 5, 2, 1}
                };

        // Display sum of all rows

        for(int row = 0; row < nums.length; row++)
        {
            System.out.println(sumRow(nums, row));
        }

        System.out.println();

        // Display sum of all columns

        for(int column = 0; column < nums[0].length; column++)
        {
            System.out.println(sumColumn(nums, column));
        }

        System.out.println();

        // Display sum of all elements

        int total = sumArray(nums);

        System.out.println(total + "\n");

        // Print entire array

    }

    public static int sumRow(int[][] array, int row)
    {
        int sum = 0;

        for(int column = 0; column < array[row].length; column++)
        {
            sum += array[row][column];
        }

        return sum;

    }

    public static int sumColumn(int[][] array, int column)
    {
        int sum = 0;

        for(int row = 0; row < array.length; row++)
        {
            sum += array[row][column];
        }

        return sum;

    }

    public static int sumArray(int[][] array)
    {
        int total = 0;

        for(int row = 0; row < array.length; row++)
        {
            total += sumRow(array, row);
        }

        return total;
    }

}
