public class Main {
    public static void main(String[] args) {

        int minusWeight = 7000;
        int minusDayMin = 250;
        int minusDayMax = 500;
        int daysMax = minusWeight / minusDayMin;
        int daysMin = minusWeight / minusDayMax;
        int daysAv = (daysMin + daysMax)/2;
        System.out.println("Требуется от " + daysMin + " до " + daysMax + ", в среднем " +
                daysAv + " дней.");
    }
}