public class LargestWordInAString {
    public static void main(String[] args) {
        String str = "I love programming in Java";
        int count = 0;
        int i = 0;
        int ans = 0;
        String currWord = " ";
        String largestWord = " ";
        while (i < str.length()) {
            if (str.charAt(i) == ' ') {
                count = 0;
                currWord = " ";
            } else {
                count++;
                currWord += str.charAt(i);
                if (ans < count) {
                    ans = count;
                    largestWord = currWord;
                }

            }
            i++;
        }

        System.out.println(largestWord + ": " + ans);
    }
}
