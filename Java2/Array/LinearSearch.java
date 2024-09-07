public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 10, 225, 32, 40,45,21,22,27 };
        String name = "Umesh";
        char [] chars = name.toCharArray();
        for (int i = 0; i < name.length(); i++) {
            System.out.print(chars[i]);
        }
//        System.out.println(search(name,'e'));
        System.out.println(search(arr,27));
    }
    static int search(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    static int search(String st,char target){
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }

}
