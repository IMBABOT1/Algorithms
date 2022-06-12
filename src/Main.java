import Algorithms.ArrayBalance;
import Sorting.HeapSort;
import Structure.Graph.Graph;
import Structure.Graph.Vertex;

import java.util.Arrays;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {
        ArrayBalance arrayBalance = new ArrayBalance();

        System.out.println(arrayBalance.arrayBalance(new int[]{2, 2, 1, 2, 2, 10, 1}));
    }
}
