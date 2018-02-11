public class RandomIntegerFromSegment {
    public static int getRandomIntegerFromSegment(int a, int b) {
        if (a > b) {
            throw new IllegalArgumentException("a must be less than b");
        }
        int i = 0;
        i = (int) Math.floor(Math.random() * (b - a + 1)) + a;
        return i;
    }
}
