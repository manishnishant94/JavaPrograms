class Strings {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s);
        String t = s + "World" ;

        System.out.println(t);

        String myNumString = "25";
        int num = 120;
        double d = 127.48;
        String c = "Soup";
        // int sum = c + num;   // c will not be treated as string bcoz string has no ASCII value
        String sum =  c + num; // num will be treated as string and will be appended
        String lastString = d + c ;
        System.out.println(lastString);
    }
}
