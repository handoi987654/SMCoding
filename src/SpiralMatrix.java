public class SpiralMatrix {

    private static final char RIGHT = 'R';
    private static final char DOWN = 'D';
    private static final char UP = 'U';
    private static final char LEFT = 'L';

    public static void main(String[] args) {
        printSpiralMatrixAsArray(1);
        printSpiralMatrixAsArray(2);
        printSpiralMatrixAsArray(3);
        printSpiralMatrixAsArray(4);
        printSpiralMatrixAsArray(5);
    }

    private static void printSpiralMatrixAsArray(int N) {
        int n = N > 0 ? N : -N;
        int addition = N > 0 ? 1 : -1;
//      First direction is 1 to n
        char direction = RIGHT;
//      Limit the loop
        int count = 0;
        long limit = (long) n * n;
//      Determine position of value on matrix
        int row = 1;
        int col = 1;
//      Specify boundary of spiral pattern
        int rightBoundary = n;
        int leftBoundary = 1;
        int downBoundary = n;
        int upBoundary = 2;
        do {
            if (n == 0) break;
//          Calculate and Print value
            int value = (row - 1) * n + col;
            System.out.print(addition * value + " ");
//          Increase counting printed times
            count++;
//          Determine the next position on matrix
            switch (direction) {
                case RIGHT:
                    col++;
                    break;
                case LEFT:
                    col--;
                    break;
                case UP:
                    row--;
                    break;
                case DOWN:
                    row++;
                    break;
            }
//          If the position is outside the matrix,
//          change direction, decrease the boundary by 1 and update the position
            if (direction == RIGHT && col > rightBoundary) {
                col = rightBoundary;
                rightBoundary--;
                direction = DOWN;
                row++;
            }
            if (direction == DOWN && row > downBoundary) {
                row = downBoundary;
                downBoundary--;
                direction = LEFT;
                col--;
            }
            if (direction == LEFT && col < leftBoundary) {
                col = leftBoundary;
                leftBoundary++;
                direction = UP;
                row--;
            }
            if (direction == UP && row < upBoundary) {
                row = upBoundary;
                upBoundary++;
                direction = RIGHT;
                col++;
            }
        } while (count < limit);
//      Just finish and separate the output
        System.out.println();
    }
}
