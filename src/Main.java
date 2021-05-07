import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] sorted = new int[args.length];
        int tmp;
        for (int i=0; i < args.length; i++) {
                sorted[i] = Integer.parseInt(args[i]);
        }
        System.out.println(Arrays.toString(sorted));
        for (int i=0; i < sorted.length; i++) {
            for (int j = i+1; j < sorted.length; j++) {
                if (sorted[i] > sorted[j]) {
                    tmp = sorted[j];
                    sorted[j] = sorted[i];
                    sorted[i] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(sorted));
        }
}
