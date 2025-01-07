public class Main {
    public static void main(String[] args) {

        System.out.println("\nЗадача 1");
        int age = 13;
        if (age >= 18) {
            System.out.printf("Если человеку %s лет, то он совершеннолетний\n", age);
        } else {
            System.out.printf("Если человеку %s лет, то он не достиг совершеннолетия, " +
                    "нужно немного подождать\n", age);
        }

        System.out.println("\nЗадача 2");
        int temp = -5;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        System.out.println("\nЗадача 3");
        int speed = 120;
        if (speed > 60) {
            System.out.printf("Если скорость %s, то придется заплатить штраф\n", speed);
        } else {
            System.out.printf("Если скорость %s, то можно ездить спокойно\n", speed);
        }

        System.out.println("\nЗадача 4");
        int age2 = 15;
        if (age2 >= 2 && age2 <= 6) {
            System.out.printf("Если человеку %s лет, то ему нужно ходить в детский сад\n", age2);
        }
        if (age2 >= 7 && age2 <= 17) {
            System.out.printf("Если человеку %s лет, то ему нужно ходить в в школу\n", age2);
        }
        if (age2 >= 18 && age2 <= 24) {
            System.out.printf("Если человеку %s лет, то то его место в университете\n", age2);
        }
        if (age2 > 24) {
            System.out.printf("Если человеку %s лет, то ему пора ходить на работу\n", age2);

        }

        System.out.println("\nЗадача 5");
        int age3 = 7;
        if (age3 < 5) {
            System.out.printf("Если возраст ребенка равен %s, то ему то ему нельзя кататься на аттракционе\n", age3);
        }
        if (age3 >= 5 && age3 < 14) {
            System.out.printf("Если возраст ребенка равен %s, то ему то ему можно кататься на аттракционе в сопровождении\n", age3);
        }
        if (age3 >= 14) {
            System.out.printf("Если возраст ребенка равен %s, то ему то ему можно кататься на аттракционе без сопровождения взрослого\n", age3);
        }

        System.out.println("\nЗадача 6");
        int peopleCarriage = 38;
        if (peopleCarriage < 60) {
            System.out.println("В вагоне есть сидячие и стоячие места");
        } else if (peopleCarriage >= 60 && peopleCarriage < 102) {
            System.out.println("В вагоне есть стоячие места");
        } else {
            System.out.println("В вагоне нет места");
        }

        System.out.println("\nЗадача 7");
        int one;
        int two;
        int three;
        one = 56;
        two = 35;
        three = 78;
        int max;
        if (one > two) {
            max = one;
        } else {
            max = two;
        }
        if (max < three) {
            max = three;
        }
        System.out.println("Наибольшим из трех чисел является число " + max);
    }
}