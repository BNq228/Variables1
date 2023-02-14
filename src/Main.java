public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1() {
        System.out.println("Задание 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task2() {
        System.out.println("Задание 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task3() {
        System.out.println("Задание 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
public static void task4() {
    System.out.println("Задание 4");
    var friend = 19;
    System.out.println(friend);
    friend = friend + 2;
    System.out.println(friend);
    friend = friend / 7;
    System.out.println(friend);
    }
public static void task5() {
    System.out.println("Задание 5");
    var frog = 3.5;
    System.out.println(frog);
    frog = frog * 10;
    System.out.println(frog);
    frog = frog / 3.5;
    System.out.println(frog);
    frog = frog + 4;
    System.out.println(frog);
    }
public static void task6 () {
    System.out.println("Задание 6");
    var Boxer1Weight = 78.2;
    var Boxer2Weight = 82.7;
    var BoxersTotalWeight = Boxer1Weight + Boxer2Weight;
    System.out.println("Общий вес двух бойцов " + BoxersTotalWeight + " кг!");
    var BoxersWeightDifference = Boxer2Weight - Boxer1Weight;
    System.out.println("Разница между весами бойцов " + BoxersWeightDifference + " кг!");
    }
public static void task7() {
    System.out.println("Задание 7");
    var Boxer1Weight = 78.2;
    var Boxer2Weight = 82.7;
    var BoxersWeightDifferenceSubtraction = Boxer2Weight - Boxer1Weight;
    System.out.println("Разница между весами бойцов " + BoxersWeightDifferenceSubtraction + " кг!");
    var BoxersWeightDifferenceDivision = Boxer1Weight % Boxer2Weight;
    System.out.println("Разница между весами бойцов " + BoxersWeightDifferenceDivision + " кг!");
}
public static void task8() {
    System.out.println("Задание 8");
    var BetweenEmployees = 640;
    var EveryEmployee = 8;
    var allEmployee = BetweenEmployees / EveryEmployee;
    System.out.println("Всего работников в компании " + allEmployee + " человек");
    allEmployee = allEmployee + 94;
    BetweenEmployees = allEmployee * 8;
    System.out.println("Если в компании работает " + allEmployee + " человек,то всего " + BetweenEmployees + " часов работы может быть поделено между сотрудниками");
    }
}



















