package String;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        int lo = 0, hi = s.length()-1;
        while (lo < hi){
            if (!Character.isLetterOrDigit(s.charAt(hi)))
                hi--;
            else if (!Character.isLetterOrDigit(s.charAt(lo)))
                lo++;
            else {
                if (Character.toLowerCase(s.charAt(lo)) == Character.toLowerCase(s.charAt(hi))){
                    lo++;
                    hi--;
                }
                else return false;
            }
//            if (Character.isLetterOrDigit(s.charAt(lo)) && Character.isLetterOrDigit(s.charAt(hi))){
//                if (Character.toLowerCase(s.charAt(lo)) == Character.toLowerCase(s.charAt(hi))){
//                    lo++;
//                    hi--;
//                }
//                else return false;
//            }
//            else if (!Character.isLetterOrDigit(s.charAt(lo)))
//                lo++;
//            else if (!Character.isLetterOrDigit(s.charAt(hi)))
//                hi--;
        }
        return true;
    }
}
