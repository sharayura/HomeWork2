public class Main {
    public static void main(String[] args) {
        int MashaSalary = 67760;
        int DenisSalary = 83690;
        int KristinaSalary = 76230;
        float bonus = 0.1f;
        System.out.println("Маша теперь получает " + (MashaSalary * (1 + bonus)) + " рублей. " +
                "Годовой доход вырос на " + (MashaSalary * bonus * 12) + " рублей.");
        System.out.println("Денис теперь получает " + (DenisSalary * (1 + bonus)) + " рублей. " +
                "Годовой доход вырос на " + (DenisSalary * bonus * 12) + " рублей.");
        System.out.println("Кристина теперь получает " + (KristinaSalary * (1 + bonus)) + " рублей. " +
                "Годовой доход вырос на " + (KristinaSalary * bonus * 12) + " рублей.");
    }
}