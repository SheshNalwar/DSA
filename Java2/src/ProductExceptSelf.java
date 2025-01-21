import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int array[]={1,2,3,4};
        System.out.println(Arrays.toString(product(array)));
    }
    static int [] product(int ar[]){
        int[]result= new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            int p=1;
            for (int j = 0; j < ar.length; j++) {
                if (j==i){
                    continue;
                }
                p=p*ar[j];
                result[i]=p;
            }
        }
        return result;
    }
}
