package String;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0 || strs == null)
            return "";
        for (int i = 0; i < strs[0].length(); i++){
            char temp = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++){
                if (i == strs[j].length() || strs[j].charAt(i) != temp)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];

//        if (strs == null || strs.length == 0)
//            return "";
//        String string = strs[0];
//        int i = 1;
//        while (i < strs.length){
//            while (strs[i].indexOf(string) != 0)
//                string = string.substring(0, string.length()-1);
//            i++;
//        }
//        return string;

//        if (strs.length == 0 || strs[0].length() == 0)
//            return "";
//        if (strs.length == 1)
//            return strs[0];
//        StringBuilder string = new StringBuilder();
//        OUT:
//        for (int i = 0; i < strs[0].length(); i++){
//            char temp = strs[0].charAt(i);
//            for (int j = 1; j < strs.length; j++){
//                if (i >= strs[j].length())
//                    break OUT;
//                if (strs[j].charAt(i) != temp || strs[j].length() == 0)
//                    break OUT;
//            }
//            string.append(temp);
//        }
//        return string.toString();
    }
}
