package String;

public class ZigZagConversion {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++)
            sb[i] = new StringBuilder();
        int i = 0;
        while (i < len){
            /*************************
             * *****从上向下***********
             *************************/
            for (int line = 0; line < numRows && i < len; line++)
                sb[line].append(c[i++]);
            /*************************
             * *******斜向上***********
             *************************/
            for (int line = numRows - 2; line >= 1 && i < len; line--)
                sb[line].append(c[i++]);
        }
        for (int j = 1; j < numRows; j++)
            sb[0].append(sb[j]);
        return sb[0].toString();
    }

    public static void main(String[] args) {
        System.out.println(14 / 3);
    }
}
