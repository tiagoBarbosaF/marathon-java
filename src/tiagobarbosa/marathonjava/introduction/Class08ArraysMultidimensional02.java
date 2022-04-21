package tiagobarbosa.marathonjava.introduction;

public class Class08ArraysMultidimensional02 {
    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[]{10, 20, 30, 40, 50, 60};

        for (int[] base :
                arrayInt) {
            System.out.println("\n--------");
            for (int num :
                    base) {
                System.out.print(num + ", ");
            }
        }

        System.out.println("\n\nAnother form for initialize arrays multidimensional");
        int[][] arrayInt02 = {{0, 0}, {1, 2, 3}, {10, 20, 30, 40, 50, 60}};
        for (int[] base :
                arrayInt02) {
            System.out.println("\n-------");
            for (int num :
                    base) {
                System.out.print(num + ", ");
            }
        }

    }
}
