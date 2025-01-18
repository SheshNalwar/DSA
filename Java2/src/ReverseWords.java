public class ReverseWords {
    public static void main(String[] args) {
        reverse("My Name is Umesh");
    }
    static void reverse(String s){
        String a[]=s.split(" ");
        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]+" ");
        }
    }
}
