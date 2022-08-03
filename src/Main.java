public class Main {
    public static void main(String[] args) {

        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.7;
        double twoBoxerWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес двух бойцов " + twoBoxerWeight + " кг.");
        double differBoxers = Math.abs(firstBoxerWeight - secondBoxerWeight);
        System.out.println("Разница между весами двух бойцов " + differBoxers + " кг.");
    }
}