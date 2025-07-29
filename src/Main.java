public class Main {
    public static void main(String[] args) {
        System.out.println("Привет Мир!");
        System.out.println("Hello World!");
        // the HOMEWORK 2
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println( "dog = " + dog );
        System.out.println( "cat = " + cat );
        System.out.println( "paper = " + paper );
        dog += 4;
        cat += 4;
        paper += 4;
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println( "dog = " + dog );
        System.out.println( "cat = " + cat );
        System.out.println( "paper = " + paper );
        var friend = 19;
        System.out.println( "1. friend = " + friend );
        friend = friend * 2;
        System.out.println( "2. friend * 2 = " + friend );
        friend = friend / 7;
        System.out.println( "3. friend / 7 = " + friend );
        var frog = 3.5;
        System.out.println( "1. frog = " + frog );
        frog *= 10;
        System.out.println( "2. frog * 10 = " + frog );
        frog /= 3.5;
        System.out.println( "3. frog / 3.5 = " + frog );
        frog += 4;
        System.out.println( "4. frog + 4 = " + frog );
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println( "Общая масса двух бойцов состовляет: "
                + ( firstBoxerWeight + secondBoxerWeight ) + " кг.");
        var differenceMasses = firstBoxerWeight % secondBoxerWeight;
        System.out.println( "Разница между массами бойцов составляет: "
                + differenceMasses + " кг.");
        differenceMasses = firstBoxerWeight % secondBoxerWeight;
        System.out.println( "Остаток от деления между двумя весами: "
                + differenceMasses);
        var operationHours = 640;
        var eachEmployeeHours = 8;
        var numberEmployees = operationHours / eachEmployeeHours;
        System.out.println(
                "Всего работников в компании - " + numberEmployees + " человек");
        numberEmployees += 94;
        operationHours = numberEmployees * eachEmployeeHours;
        System.out.println( "Если в компании работает " + numberEmployees
                + " человек, то \nвсего " + operationHours + " часов работы"
                + " может быть поделено между сотрудниками." );
    }
}