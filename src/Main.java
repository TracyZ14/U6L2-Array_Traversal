public class Main
{
    public static void main(String[] args)
    {
        String[] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia"};
        for(int i = 0; i < names.length; i++)
        {
            System.out.println(names[i]);
        }

        String[] list = {"red", "yellow", "blue"};
        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i].length() + "_");
        }
        System.out.println();
        for(int i = 0; i < list.length; i++)
        {
            System.out.print(list[i] + "_");
        }
        System.out.println();

        int[] numbers = {13, 33, 3, -3, -333};
        for(int i = 0; i < numbers.length; i += 2)
        {
            System.out.println(numbers[i]);
        }
    }
}