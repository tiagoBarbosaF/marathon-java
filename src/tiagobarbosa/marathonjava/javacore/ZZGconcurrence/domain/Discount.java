package tiagobarbosa.marathonjava.javacore.ZZGconcurrence.domain;

public class Discount {
    public enum Code{
        NONE(0),
        SUPER_01(5),
        SUPER_02(10),
        SUPER_03(15);

        private final int percentage;

        Code(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }
}
