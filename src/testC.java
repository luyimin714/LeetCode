class testC extends testB implements testA {
    public void cc(){
        System.out.println(testA.aa);
    }

    public static void main(String[] args) {
        new testC().cc();
    }
}
