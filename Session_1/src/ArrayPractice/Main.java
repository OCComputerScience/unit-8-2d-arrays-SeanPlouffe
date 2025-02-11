package ArrayPractice;

public class Main
{
    public static void main(String[] args)
    {
        // Create 2D array

        int[][] nums =
                {
                        {18, 7, 23, 12, 5, 0},
                        {524, 789, 321, 456, 871, 193, 634, 219},
                        {3, 6, 9}
                };

        int arrLength = nums.length;

        // Change the final element of the 1D array at index 0 to the total length of the 2D array

        updateValue(nums, 0, nums[0].length-1, nums[arrLength-1].length);

        print(nums);
        System.out.println();

        // Add the value at the 1st and last index of the 2D array to the value of the last element in the 1D array at index 1

        updateValue(nums, 0, nums[0].length-1, nums[0][0] + nums[arrLength-1][nums[arrLength-1].length-1]);

        print(nums);
        System.out.println();

        // Change each value of the 1D array at index 2 to display the length of each respective 1D array.

        for(int i = 0; i < arrLength; i++)
        {
            nums[i][2] = nums[i].length;
            updateValue(nums, i, 2, nums[i].length);
        }

        print(nums);

        // Print the new array
    }


    //Do not make alterations to this method!
    public static void print(int[][] array)
    {
        for(int[] row: array)
        {
            for(int num: row)
            {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static void updateValue(int[][] array, int row, int column, int value)
    {
        array[row][column] += value;
    }
}
