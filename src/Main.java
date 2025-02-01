//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задача 1
        int myNumberOne = 25000;
        byte myNumberTwo = 123;
        short myNumberThree = -15220;
        long myNumberFour = 6_325_236_486_456_487L;
        float myNumberFive = -2.5048f;
        double myNumberSix = 3.45678854;

        System.out.println("Значение переменной myNumberOne с типом int равно "+myNumberOne);
        System.out.println("Значение переменной myNumberTwo с типом byte равно "+myNumberTwo);
        System.out.println("Значение переменной myNumberThree с типом short равно "+myNumberThree);
        System.out.println("Значение переменной myNumberFour с типом long равно "+myNumberFour);
        System.out.println("Значение переменной myNumberFive с типом float равно "+myNumberFive);
        System.out.println("Значение переменной myNumberSix с типом double равно "+myNumberSix);

        //Задача 2
        float numberOne = 27.12f;
        long numberTwo = 987_678_965_549L;
        double numberThree = 2.786;
        short numberFour = 569;
        short numberFive = -159;
        int numberSix = 27897;
        byte numberSeven = 67;

        //Задача 3
        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int countSheets = 480;
        int sheets;

        sheets = countSheets / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);

        System.out.println("На каждого ученика рассчитано " + sheets + " листов бумаги");

        //Задача 4
        int productivityCount = 16;
        int productivityTime = 2;
        int timeIntervalOne = 20;
        int timeIntervalTwo = 1440;
        int timeIntervalThree = 4320;
        int timeIntervalFour = 44640;

        System.out.println("За 20 минут машина произвела " + timeIntervalOne * productivityCount / productivityTime + " штук бутылок");
        System.out.println("За сутки машина произвела " + timeIntervalTwo * productivityCount / productivityTime + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + timeIntervalThree * productivityCount / productivityTime + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + timeIntervalFour * productivityCount / productivityTime + " штук бутылок");

        //Задача 5
        int paintBanks = 120;
        int countWhite = 2;
        int countBrown = 4;

        int oneClass = countWhite + countBrown;
        int countClasses = paintBanks / oneClass;
        int whiteBanks = countWhite * countClasses;
        int brownBanks = countBrown * countClasses;

        System.out.println("В школе, где " + countClasses + " классов, нужно " + whiteBanks + " банок белой краски и " + brownBanks + " банок коричневой краски");

        //Задача 6
        int bananasCount = 5;
        int bananasGram = 80;
        int milkCount = 200;
        int milkMilliliter = 100;
        int milkGram = 105;
        int iceCreamCount = 2;
        int iceCreamGram = 100;
        int eggsCount = 4;
        int eggsGram = 70;
        int grPerKg = 1000;

        int massBreakfastGram = bananasCount * bananasGram + milkCount * milkGram / milkMilliliter + iceCreamCount * iceCreamGram + eggsCount * eggsGram;
        float massBreakfastKilogram = massBreakfastGram / (float)grPerKg;

        System.out.println("Вес спортзавтрака в граммах составляет " + massBreakfastGram);
        System.out.println("Вес спортзавтрака в килограммах составляет " + massBreakfastKilogram);

        //Задача 7
        int mass = 7;
        int weightLossOne = 250;
        int weightLossTwo = 500;

        int dayCountOne = mass * 1000 / weightLossOne;
        int dayCountTwo = mass * 1000 / weightLossTwo;

        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то у него уйдет " + dayCountOne + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то у него уйдет " + dayCountTwo + " дней");

        //Задача 8
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        float extraCharge = 0.1f;

        float mashaNewSalary = mashaSalary + mashaSalary * extraCharge;
        float denisNewSalary = denisSalary + denisSalary * extraCharge;
        float kristinaNewSalary = kristinaSalary + kristinaSalary * extraCharge;

        float mashaIncomeGrowth = (mashaNewSalary - mashaSalary)*12;
        float denisIncomeGrowth = (denisNewSalary - denisSalary)*12;
        float kristinaIncomeGrowth = (kristinaNewSalary - kristinaSalary)*12;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaIncomeGrowth + " рублей");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisIncomeGrowth + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaIncomeGrowth + " рублей");

    }
}