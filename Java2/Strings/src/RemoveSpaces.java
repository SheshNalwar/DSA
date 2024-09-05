public class RemoveSpaces {
    public static String removeSpaces(String str) {
        char[] chars = str.toCharArray();
        StringBuilder noSpaceStr = new StringBuilder();
        for (char c : chars) {
            if (c != ' ') {
                noSpaceStr.append(c);
            }
        }
        return noSpaceStr.toString();
    }

    public static void main(String[] args) {
        String result = removeSpaces("umesh nagare 27 @ gmail . com");
        System.out.println(result);
        String name = "Umesh Nagare studies in AG Patil";
        String[] resulted = name.split(" ");
        String words = "";
        for (int i = 0; i < resulted.length; i++) {
            words+=resulted[i];
        }
        System.out.println(words);
    }
}
