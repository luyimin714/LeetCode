package Math;

import javax.naming.NamingEnumeration;

public class RomanToInteger {
    public int romanToInt(String s) {
        int n = s.length();
        int sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            char k = s.charAt(i);
            switch (k) {
                case 'I':
                    sum += (sum >= 5 ? -1 : 1);
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    sum += 10 * (sum >= 50 ? -1 : 1);
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    sum += 100 * (sum >= 500 ? -1 : 1);
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'M':
                    sum += 1000;
                    break;
            }

        }
        return sum;

            //        int n = s.length();
//        int sum = 0;
//        for (int i = 0; i < n; ){
//            int num = 0;
//            char k = s.charAt(i);
//            if (i < n-1) {
//                char next = s.charAt(i + 1);
//                if (k == 'I' && next == 'V') {
//                    num = 4;
//                    i += 2;
//                } else if (k == 'I' && next == 'X') {
//                    num = 9;
//                    i += 2;
//                } else if (k == 'X' && next == 'L') {
//                    num = 40;
//                    i += 2;
//                } else if (k == 'X' && next == 'C') {
//                    num = 90;
//                    i += 2;
//                } else if (k == 'C' && next == 'D') {
//                    num = 400;
//                    i += 2;
//                } else if (k == 'C' && next == 'M') {
//                    num = 900;
//                    i += 2;
//                } else {
//                    switch (k) {
//                        case 'I':
//                            num = 1;
//                            i++;
//                            break;
//                        case 'V':
//                            num = 5;
//                            i++;
//                            break;
//                        case 'X':
//                            num = 10;
//                            i++;
//                            break;
//                        case 'L':
//                            num = 50;
//                            i++;
//                            break;
//                        case 'C':
//                            num = 100;
//                            i++;
//                            break;
//                        case 'D':
//                            num = 500;
//                            i++;
//                            break;
//                        case 'M':
//                            num = 1000;
//                            i++;
//                            break;
//                    }
//                }
//                sum += num;
//            }
//            else {
//                switch (k) {
//                    case 'I':
//                        num = 1;
//                        i++;
//                        break;
//                    case 'V':
//                        num = 5;
//                        i++;
//                        break;
//                    case 'X':
//                        num = 10;
//                        i++;
//                        break;
//                    case 'L':
//                        num = 50;
//                        i++;
//                        break;
//                    case 'C':
//                        num = 100;
//                        i++;
//                        break;
//                    case 'D':
//                        num = 500;
//                        i++;
//                        break;
//                    case 'M':
//                        num = 1000;
//                        i++;
//                        break;
//                }
//                sum += num;
//            }
//        }
//        return sum;
}
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(s.charAt(0));
    }
}
