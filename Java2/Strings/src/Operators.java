public class Operators {
    public static void main(String[] args) {
//        System.out.println('a'+'b');
//        System.out.println("a" +"b");
//        System.out.println((char) ('a'+3));
//        System.out.println("a"+1);
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' +i);
            series=series+ch;
            System.out.println(ch);
        }
        System.out.println(series);
    }
}
