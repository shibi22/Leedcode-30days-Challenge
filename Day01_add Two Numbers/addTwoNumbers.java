import java.util.Arrays;

class  addTwoNumbers { 
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 2, 4, 8};

         int max = Arrays.stream(arr).max().getAsInt();
         int min = Arrays.stream(arr).min().getAsInt();

        System.out.println(" Max: "  + max);
        System.out.println(" Min: "  + min);
    }
}
