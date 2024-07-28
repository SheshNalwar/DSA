public class MoveAllNegative {
    public static void main(String[] args) {
        int arry[]={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int start = 0;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i]<0){
                int temp = arry[i];
                arry[i]=arry[start];
                arry[start]=temp;
                start++;
            }
        }
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i]);
        }
    }

}
