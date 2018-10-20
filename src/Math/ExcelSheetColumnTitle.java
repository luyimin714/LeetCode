package Math;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder answer = new StringBuilder();
        while (n != 0){
            n--;
            char digit = (char)('A' + n % 26);
            answer.append(digit);
            n = n / 26;

        }
        return answer.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println((char)('A'+25));
    }
}
