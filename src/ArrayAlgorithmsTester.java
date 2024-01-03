import java.util.Arrays;
public class ArrayAlgorithmsTester
{
    public static void main(String[] args)
    {
        String[] words = {"hello", "hola", "hi", "what's up?"};
        ArrayAlgorithms.printExclamation(words);
        System.out.println("----");
        // original word list NOT modified
        System.out.println(Arrays.toString(words));

        System.out.println();

        String[] words1 = {"hello", "hola", "hi", "what's up?"};
        ArrayAlgorithms.addExclamation(words1);
        // original word list IS modified
        System.out.println(Arrays.toString(words1));

        System.out.println();

        int[] nums = {6, 4, 0, 3, 9, -2, 5};
        int sum = ArrayAlgorithms.sum(nums);
        System.out.println(sum);
        System.out.println("----");
        // original numbers list NOT modified
        System.out.println(Arrays.toString(nums));

        System.out.println();

        int[] nums1 = {6, 4, 0, 3, 9};
        double avg = ArrayAlgorithms.average(nums1);
        System.out.println(avg);
        int[] nums2 = {4, 6, 7};
        double avg2 = ArrayAlgorithms.average(nums2);
        System.out.println(avg2);
        System.out.println("----");
        // original numbers lists NOT modified
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        System.out.println();

        int[] nums3 = {6, 4, 3, 9, 2, 5};
        int min = ArrayAlgorithms.minimum(nums3);
        System.out.println(min);
        int[] nums4 = {-4, 5, -7, 3};
        int min2 = ArrayAlgorithms.minimum(nums4);
        System.out.println(min2);
        System.out.println("----");
        // original numbers lists NOT modified
        System.out.println(Arrays.toString(nums3));
        System.out.println(Arrays.toString(nums4));
    }
}