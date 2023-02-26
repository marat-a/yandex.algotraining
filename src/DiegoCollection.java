import com.sun.source.tree.Tree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class DiegoCollection {
    public static void main(String[] args) throws Exception {
        final LocalDateTime start = LocalDateTime.now();
        final BufferedReader r = new BufferedReader(new FileReader("input14.txt"));
        final int quantity = Integer.parseInt(r.readLine());
        final String[] numbersOfStickers = r.readLine().split(" ");
        ArrayList<Integer> numbersOfDiegoStickers = new ArrayList<>(quantity);
        for (int i = 0; i < numbersOfStickers.length; i++) {
            numbersOfDiegoStickers.add(Integer.parseInt(numbersOfStickers[i]));
        }
        final int quantityCollectors = Integer.parseInt(r.readLine());
        final String[] minNumberNeeded = r.readLine().split(" ");
        int minNumber;
        for (int i = 0; i < quantityCollectors; i++) {
            minNumber = Integer.parseInt(minNumberNeeded[i]);
            int index = calcInterestingCards(minNumber, numbersOfDiegoStickers);
            System.out.println(numbersOfDiegoStickers.size()-index);
        }
        System.out.println(Duration.between(start, LocalDateTime.now()).toMillis());
    }

    static int calcInterestingCards(int minNumber, ArrayList<Integer> diegoStickers){
        int left = 0;
        int right = diegoStickers.size()-1;
        int index = 0;
        while (left<right) {
            int mid = (left  + right +1) / 2;
            if ()

        }
        return index;
    }
}