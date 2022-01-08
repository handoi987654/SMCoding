public class ProductElements {

    public static void main(String[] args) {
        printProductElements(new int[]{2, 1, 3, 4, 5});
        printProductElements(new int[]{2});
        printProductElements(new int[]{});
        printProductElements(null);
    }

    private static void printProductElements(int[] a) {
        if (a != null && a.length > 0) {
            long m = 1;
            for (int i : a) {
                m *= i;
            }
            for (int i : a) {
                System.out.print((m / i) + " ");
            }
        }
        System.out.println();
    }
}
