package Math;

public class AddDigits {
    public int addDigits(int num) {
        return ((num - 1) % 9)+1;
//        if(0 <= num && num <= 9)
//            return num;
//        int sum = 0;
//        while(num > 0){
//            sum += num % 10;
//            num = num / 10;
//            if(num == 0 && sum > 9){
//                num = sum;
//                sum = 0;
//            }
//        }
//        return sum;
    }
}
