import com.sun.org.apache.bcel.internal.generic.ANEWARRAY;

import java.util.*;

public class Main {
    //welcome to my house, my house is really big!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //String input = "welcome to my house, my house is really big!";
        StringBuilder word = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        Set<String> set = new HashSet<>();
        int count = 0;
        for (int i = 0; i < input.length(); i++){
            if (input.charAt(i) == ',' || input.charAt(i) == '!'){
                if (set.add(word.toString())){
                    word.append(input.charAt(i));
                    ans.append(word);
                    ans.append(' ');
                    count++;
                }
                word = new StringBuilder();
            }
            else if (input.charAt(i) == ' '){
                if (word.length() == 0)
                    continue;
                if (set.add(word.toString())){
                    ans.append(word);
                    ans.append(input.charAt(i));
                    count++;
                }
                word = new StringBuilder();
            }
            else {
                word.append(input.charAt(i));
            }
        }
        System.out.println(count);
        System.out.println(ans.toString());
    }
}
