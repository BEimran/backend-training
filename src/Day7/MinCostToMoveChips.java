package Day7;

public class MinCostToMoveChips {
    public static int minCostToMoveChips(int[] position) {
        int oddCount = 0, evenCount = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        return Math.min(oddCount, evenCount);
    }

    public static void main(String[] args) {

        int[] position1 = {1, 2, 3, 4};
        System.out.println(minCostToMoveChips(position1));

    }
}
