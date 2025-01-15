public class MaxConsecutives {
    public static void main(String[] args) {
            int array[]={1, 1, 0, 1, 1, 1};
            System.out.println(maxConsecutives(array));
    }
    static int maxConsecutives(int ar[]){
        int count= 0;
        int max= 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]==1)count++;
            if (ar[i]==0)count=0;
            max=Math.max(count,max);
        }
        return max;
    }
}
