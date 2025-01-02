public class Sorted {
    public static void main(String[] args) {
        int ar[]={1,3,4,5,7,8,10};
        System.out.println(linear2(ar,0,7));
    }
    static boolean sortedOrNot(int ar[]){
        for (int i = 0; i < ar.length-1; i++) {
            int j=i+1;
            if (ar[i]>ar[j]){
                return false;
            }
        }
        return true;
    }
    static boolean linear(int ar[],int index,int key){
        if (index== ar.length){
            return false;
        }
        return ar[index]==key || linear(ar,index+1,key);
    }
    static int linear2(int ar[],int index,int key){
        if (index == ar.length){
            return -1;
        }
        if (ar[index] == key) {
            return index;
        }
        return linear2(ar, index+1, key);
    }
}
