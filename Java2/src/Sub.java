public class Sub {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        String name = "Umesh";
        subArrays(arr);
        subStrings(name);
    }
    static void subStrings(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <s.length() ; j++) {
                System.out.print(s.charAt(j));
            }
            System.out.println();
        }
    }
    static void subArrays(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length ; j++) {
                System.out.print(arr[j]);
            }
            System.out.println();
        }
    }
}
