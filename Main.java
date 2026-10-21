public class Main
{
    public static void main(String[] args)
    {
        int[] numbers = {25, 80, 45, 20, 60, 90};
        int largest = numbers[0];

        for (int i = 2; i < numbers.length; i += 2)
        {
            if (numbers[i] > largest)
            {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element at even indexes = " + largest);
    }
}
