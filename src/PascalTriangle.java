public class PascalTriangle {
    static void printPascal(int n) {
        // i is used for rows //outer loop
        for (int i = 0; i < n; i++) {
            //number will be initialized by 1 and update the value by using the formula given below
            int number = 1;
            //j will be used for columns and initialized with 0
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPascal(6);
    }
}