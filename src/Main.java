import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] sorted = new int[args.length];
        ArrayList<Integer> firstArrayList = new ArrayList<>();
        ArrayList<Integer> secondArrayList = new ArrayList<>();
        ArrayList<Integer> thirdArrayList = new ArrayList<>();
        int tmp;
        for (int i=0; i < args.length; i++) {
            try {
                sorted[i] = Integer.parseInt(args[i]);
                firstArrayList.add(Integer.parseInt(args[i]));
                secondArrayList.add(Integer.parseInt(args[i]));
            } catch (NumberFormatException e ){
                System.out.println("Введенные строки исключены из проверки");
            }
        }
        System.out.println("Arrays    " + Arrays.toString(sorted));
        System.out.println("ArrayList " + firstArrayList.toString());

        for (int i=0; i < sorted.length; i++) {
            for (int j = i+1; j < sorted.length; j++) {
                if (sorted[i] > sorted[j]) {
                    tmp = sorted[j];
                    sorted[j] = sorted[i];
                    sorted[i] = tmp;
                }
            }
        }
        thirdArrayList = firstArrayList;
        System.out.println("ArraysSorted           " + Arrays.toString(sorted));
        Collections.sort(firstArrayList);
        System.out.println("ArrayListSorted        "+ firstArrayList.toString());

        Collections.sort(secondArrayList, Collections.reverseOrder());
        System.out.println("ArrayListSortedReverse "+ secondArrayList.toString());

        System.out.println("thirdArrayList " +thirdArrayList.toString());

        }
}
