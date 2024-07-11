public class SecondLargest {
    public static void main(String[] args) {
        int query[] = { 20, 42, 6, 25, 30, 88 };
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < query.length; i++) {
            if (query[i] > largest) {
                secondLargest = largest;
                largest = query[i];
            } else if (query[i] > secondLargest && query[i] != largest) {
                secondLargest = query[i];
            }
        }

        System.out.println("Largest : " + largest);
        System.out.println("2nd largest : " + secondLargest);
    }
}
