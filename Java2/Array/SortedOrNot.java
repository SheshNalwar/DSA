public class SortedOrNot {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        int ar2[]={2,1,2,3,4,5};
        System.out.println(sortedOrNot(ar));
        System.out.println(recursionSortorNot(ar,0));
        System.out.println(sortedOrNot(ar2));
        System.out.println(recursionSortorNot(ar2,0));
    }
    static boolean sortedOrNot(int arry[]){
        int notSorted = 0;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i]>arry[(i+1)% arry.length]){
                notSorted++;
            }
            if (notSorted>1){
                return false;
            }
        }
        return true;
    }
    static boolean recursionSortorNot(int arry[],int i){
        if (i== arry.length-1){
            return true;
        }
        return arry[i]<arry[i+1] && recursionSortorNot(arry,i+1);
    }
}
