public class LabeledLoops {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 3; i++) {
            inner:
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    continue outer; // skips to next iteration of outer loop
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
