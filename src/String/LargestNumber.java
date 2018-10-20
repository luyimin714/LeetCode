package String;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
    public String largestNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return "";
        String[] s_nums = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            s_nums[i] = String.valueOf(nums[i]);
        //在List或数组中的对象如果没有实现Comparable接口时，
        //那么就需要调用者为需要排序的数组或List设置一个Compartor，
        //Compartor的compare方法用来告诉代码应该怎么去比较两个实例，
        //然后根据比较结果进行排序
        //此处需要重新定义两个字符串的比较方式
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1 = o1 + o2;
                String s2 = o2 + o1;
                return s1.compareTo(s2);
            }
        };

        Arrays.sort(s_nums, comparator);

        if (s_nums[0].charAt(0) == '0')
            return "0";

        StringBuilder ans = new StringBuilder();
        for (String s : s_nums)
            ans.append(s);

        return ans.toString();
    }
}
