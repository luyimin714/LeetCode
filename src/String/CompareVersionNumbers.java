package String;

public class CompareVersionNumbers {
    public int compareVersion(String version1, String version2) {
        /* 在java中 \代表转义字符 \n \t 等，而 \\ 代表一个反斜杠 而.代表一个元字符
           要表示一个.就需要用 要用\.
           所以"\\." 在实际编译中 就代表.  */
        String[] s1 = version1.split("\\.");
        String[] s2 = version2.split("\\.");
        int length = Math.max(s1.length, s2.length);
        for (int i = 0; i < length; i++){
            Integer v1 = i < s1.length ? Integer.parseInt(s1[i]) : 0;
            Integer v2 = i < s2.length ? Integer.parseInt(s2[i]) : 0;
            int compare = v1.compareTo(v2);
            if (compare != 0)
                return compare;
        }
        return 0;
    }

    public static void main(String[] args) {
        String version1 = "7.5.2.4";
        String[] s1 = version1.split("\\.");
        System.out.println(s1.length);
        for (int i = 0; i < s1.length; i++){
            System.out.println(s1[i]);
        }
    }
}
