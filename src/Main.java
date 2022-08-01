public class Main {
    public static void main(String[] args) {
        double bananWeight = 80;
        double bananNum = 5;
        double milk100 = 105;
        double milkNum = 200;
        double icecreamWeight = 100;
        double icecreamNum = 2;
        double eggWeight = 70;
        double eggNum = 4;
        double allWeight = bananWeight * bananNum + milk100/100 * milkNum + icecreamWeight * icecreamNum + eggWeight * eggNum;
        double allWeightKg = allWeight / 1000;
        System.out.println("Вес спорт-завтрака " + allWeightKg + " кг." );
    }
}