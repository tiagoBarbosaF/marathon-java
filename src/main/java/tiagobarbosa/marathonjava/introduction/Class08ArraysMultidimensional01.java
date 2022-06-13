package tiagobarbosa.marathonjava.introduction;

public class Class08ArraysMultidimensional01 {
    public static void main(String[] args) {

        int[][] days = new int[3][3];
        days[0][0] = 1;
        days[0][1] = 2;
        days[0][2] = 3;

        days[1][0] = 40;
        days[1][1] = 50;
        days[1][2] = 60;

        days[2][0] = 77;
        days[2][1] = 88;
        days[2][2] = 99;

        System.out.println("== Using FOR ==");
        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }
        }
        System.out.println();
        System.out.println("== Using FOREACH ==");
        for (int[] day : days) {
            for (int i : day) {
                System.out.println(i);
            }
        }
    }
}
