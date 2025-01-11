public class Sub {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
//        subArrays(arr);
        String name = "Umesh";
        subStrings(name);
    }
    static void subStrings(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length() ; j++) {
                for (int k = i; k <=j ; k++) {
                    System.out.print(s.charAt(k));
                }
                System.out.println();
            }
        }
    }
    static void subArrays(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

}
