import java.util.ArrayList;
import java.util.List;

public class ArrayQuestions {


    public int majorityElement(int[] nums) {
        int count = 0, candidate = -1;

        for (int j : nums) {
            if (count == 0) {
                candidate = j;
                count = 1;
            } else {

                if (j == candidate)
                    count++;
                else
                    count--;
            }
        }
        count = 0;

        for (int num : nums) {
            if (num == candidate)
                count++;
        }

        if (count > nums.length / 2)
            return candidate;
        return -1;

    }

    public List<Integer> majorityElementTwo(int[] nums) {

        List<Integer> list = new ArrayList<>();
        int count1 = 0, count2 = 0;
        int candidate1 = -1, candidate2 = -1;

        for (int num : nums) {

            if (num == candidate1) {
                count1++;
            } else if (num == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }


        count1 = 0;
        count2 = 0;


        for (int num : nums) {
            if (num == candidate1)
                count1++;
            else if (num == candidate2)
                count2++;

        }


        if (count1 >= nums.length / 3+1)
            list.add(candidate1);

        if (count2 >= nums.length/3+1)
            list.add(candidate2);

        return list;

    }

    public int[] findMissingAndReapeatingNumbers(int[] nums4) {

        return new int[0];
    }
}
