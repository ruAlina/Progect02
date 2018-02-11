
public class Program {
       public static void main(String[] args) {
        int[] array;
        array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = RandomIntegerFromSegment.getRandomIntegerFromSegment(-10, 10);
            System.out.print(array[i] + "  ");
        }
        int maxNeg = -11;
        int minPos = 11;
        int maxNegInd = 0;
        int minPosInd = 0;
        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minPos) {
                if (array[i] >= 0) {
                    minPos = array[i];
                    minPosInd = i;
                }
            }
            if (array[i] > maxNeg) {
                if (array[i] < 0) {
                    maxNeg = array[i];
                    maxNegInd = i;
                }
            }
        }
        if (maxNeg == -11) {
            throw new IllegalArgumentException("No negative elements found");
        }
        if (minPos == 11) {
            throw new IllegalArgumentException("No positive elements found");
        }
        System.out.println("\n" + "первый минимальный положительный:" + minPos);
        System.out.println("первый максимальный отрицательный:" + maxNeg);
        a = array[maxNegInd];
        array[maxNegInd] = array[minPosInd];
        array[minPosInd] = a;
        for (int i : array) {
            System.out.print(i + "  ");
        }
    }
}
