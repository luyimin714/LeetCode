package Math;

public class AddBinary {
    public String addBinary(String a, String b) {
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        int aaEnd = aa.length - 1;
        int bbEnd = bb.length - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (aaEnd >= 0 || bbEnd >= 0){
            int sum = carry;
            if (aaEnd >= 0){
                sum += aa[aaEnd] - '0';
            }
            if (bbEnd >= 0){
                sum += bb[bbEnd] - '0';
            }
            sb.append(sum % 2);
            carry = sum / 2;
            aaEnd--;
            bbEnd--;
        }
        if (carry != 0)
            sb.append(carry);
        return sb.reverse().toString();
    }
}
