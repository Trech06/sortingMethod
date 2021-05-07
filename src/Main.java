import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] j = new int[args.length];
        int tmp;
        for (int i=0; i < args.length; i++) {
            j[i] = Integer.parseInt(args[i]);
        }
        for (int i=0; i <= j.length+1; i++){
            if (j[i] > j[i+1]){
                tmp = j[i];
                j[i] = j[i+1];
                j[i+1] = tmp;

            }
            System.out.println(j[i]);
        }
        }
}
