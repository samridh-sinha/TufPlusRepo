import java.util.List;

public class Main {
    public static void main(String[] args) {

        ArrayQuestions questions = new ArrayQuestions();
        int[] nums = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        int majorityElement = questions.majorityElement(nums);
        System.out.println("The majority element is :" + majorityElement);

        int[] nums3 = {1, 2, 1, 1, 3, 2, 2, 3};
        List<Integer> list = questions.majorityElementTwo(nums3);
        System.out.println(list);

        int[] nums4 = {6, 5, 7, 1, 8, 6, 4, 3, 2};
        int[] missingAndReapeatingNumbers = questions.findMissingAndReapeatingNumbers(nums4);
        for (int num: missingAndReapeatingNumbers) {
            System.out.println(num);
        }
    }
}
