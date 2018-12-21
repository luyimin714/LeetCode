public class Test {
    public static void test(String str) {
        str = "not sb";
    }
    public static void main(String args[]) {
        String string = "is sb";
        test(string);
        System.out.println(string);
    }
}
