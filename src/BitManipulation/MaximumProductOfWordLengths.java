package BitManipulation;

public class MaximumProductOfWordLengths {
    /*
    假设单词第i位字母为c，该单词的值为val |= 1<<(c-'a')，
    遍历该单词每个字母后，就可以算出该单词的val了。c-'a'最大为26，
    因此1<<(c-'a')不会超过int范围。若val的第n位为1，那么该单词一定包含'a'+n对应的字母
     */
    public int maxProduct(String[] words) {
        int len = words.length;
        int[] value = new int[len];
        for (int i = 0; i < len; i++){
            value[i] = 0;
            String word = words[i];
            for (int j = 0; j < word.length(); j++){
                value[i] |= 1 << (word.charAt(j) - 'a');
            }
        }
        int maxProduct = 0;
        for (int i = 0; i < len; i++){
            for (int j = i + 1; j < len; j++){
                if (((value[i] & value[j]) == 0) && words[i].length() * words[j].length() > maxProduct)
                    maxProduct = words[i].length() * words[j].length();
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        System.out.println('d' - 'a');
    }
}
