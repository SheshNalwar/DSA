/**
 * ConvertToUppercase
 */
public class ConvertToUppercase {

    public static void main(String[] args) {
        String str = "kjhdsfhksjdfh";

        StringBuilder str2 = new StringBuilder();

        System.out.println("Original String: " + str);

        // System.out.println('a' - 'A');
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch -= 32;
            }
            str2.append(ch);
        }

        System.out.println("Lowercase String: " + str2);
    }
}