import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class DiegoCollection {
    public static void main(String[] args) throws Exception {
        final BufferedReader r = new BufferedReader(new FileReader("input.txt"));
        final int quantity = Integer.parseInt(r.readLine());
        final String[] numbersOfStickers = r.readLine().split(" ");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(-1);
        for (String numbersOfSticker : numbersOfStickers) {
            treeSet.add(Integer.parseInt(numbersOfSticker));
        }
        ArrayList<Integer> numbersOfDiegoStickers = new ArrayList<>(quantity);
        numbersOfDiegoStickers.addAll(treeSet);
        final int quantityCollectors = Integer.parseInt(r.readLine());
        final String[] minNumberNeeded = r.readLine().split(" ");
        int minNumber;
        for (int i = 0; i < quantityCollectors; i++) {
            minNumber = Integer.parseInt(minNumberNeeded[i]);
            int index = calcInterestingCards(minNumber, numbersOfDiegoStickers);
            System.out.println(index);
        }
    }

    static int calcInterestingCards(int minNumber, ArrayList<Integer> diegoStickers) {
        int left = 0;
        int right = diegoStickers.size() - 1;
        while (left < right) {
            int mid = (left + right + 1) / 2;
            if (diegoStickers.get(mid) < minNumber) {
                left = mid;
            } else right = mid - 1;

        }
        return left;
    }
}