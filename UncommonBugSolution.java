public class UncommonBugSolution {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i); // Print before checking conditions
            i++;
            if (i == 5) {
                continue; // Skip the increment for the next iteration after printing 5
            }
        }
    }
}