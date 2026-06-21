import java.util.Scanner;
class largeleineverysubarrayofsizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 2, 5, 4, 8, 6};
        int k = 3;

        for (int i = 0; i <= arr.length - k; i++) {
            int max = arr[i];

            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            System.out.print(max + " ");
        }
    }
}