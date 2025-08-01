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
        // the HOMEWORK 3
        int i = 100000;
        byte b = 100;
        short s = 1000;
        long l = 299792458L;
        float f = 9.780318f;
        double d = 3.1415926535897932384626433832795D;
        System.out.println( "Значение переменной i с типом int равно " + i );
        System.out.println( "Значение переменной b с типом byte равно " + b );
        System.out.println( "Значение переменной s с типом short равно " + s );
        System.out.println( "Значение переменной l с типом long равно " + l );
        System.out.println( "Значение переменной f с типом float равно " + f );
        System.out.println( "Значение переменной d с типом double равно " + d );
        float A = 27.12f;
        long B = 987678965549L;
        float C = 2.786f;
        short D = 569;
        short E = -159;
        short F = 27897;
        byte G = 67;
        byte lyudmilaPavlovnaHasStudents = 23;
        byte annaSergeevnaHasStudents = 27;
        byte ekaterinaAndreevnaHasStudents = 30;
        short totalNumberOfPaper = 480;
        int forEachStudentPaper = totalNumberOfPaper
                / ( lyudmilaPavlovnaHasStudents + annaSergeevnaHasStudents + ekaterinaAndreevnaHasStudents );
        System.out.println( "На каждого ученика рассчитано " + forEachStudentPaper + " листов бумаги");
        byte bottleProductionCapacity = 16 / 2 ;
        int quantityIn20Minutes = bottleProductionCapacity * 20;
        int quantityPerDay = bottleProductionCapacity * 60 * 12;
        int quantityIn3Days = quantityPerDay * 3;
        int quantityIn30Days = quantityPerDay * 30;
        System.out.println( "За 20 минут машина произвела " + quantityIn20Minutes + " штук бутылок" );
        System.out.println( "За сутки машина произвела " + quantityPerDay + " штук бутылок" );
        System.out.println( "За 3 дня машина произвела " + quantityIn3Days + " штук бутылок" );
        System.out.println( "За 1 месяц машина произвела " + quantityIn30Days + " штук бутылок" );
        short neededForRepairsCans = 120;
        byte cansOfWhite = 2;
        byte cansOfBrown = 4;
        int numberOfClasses = neededForRepairsCans / ( cansOfWhite + cansOfBrown );
        System.out.println( "В школе, где " + numberOfClasses + " классов, нужно "
                + numberOfClasses * cansOfWhite + " банок белой краски и "
                + numberOfClasses * cansOfBrown + " банок коричневой краски" );
        byte bananaWeight = 80;
        byte milk100mlWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        byte numberOfBananas = 5;
        short amountOfMilk = 200;
        byte amountOfIceCream = 2;
        byte numberOfEggs = 4;
        System.out.println( "Рецепт спортзавтрака спортсмена составил "
                + ( numberOfBananas * bananaWeight + amountOfMilk / 100 * milk100mlWeight
                + amountOfIceCream * iceCreamWeight + numberOfEggs * eggWeight ) + " гр,"
                + " соответственно " + (float) ( numberOfBananas * bananaWeight + amountOfMilk / 100 * milk100mlWeight
                + amountOfIceCream * iceCreamWeight + numberOfEggs * eggWeight ) / 1000 + " кг" );
        byte athleteNeedsToLose = 7;
        short lose250g = 250;
        short lose500g = 500;
        int athleteDryingAt250g = athleteNeedsToLose * 1000 / lose250g;
        int athleteDryingAt500g = athleteNeedsToLose * 1000 / lose500g;
        int averageDryingOfAthlete = ( athleteDryingAt250g + athleteDryingAt500g ) / 2;
        System.out.println( "Количество дней, которое потребуется при сушке "
                + lose250g + " гр в сутки составит: " + athleteDryingAt250g );
        System.out.println( "Количество дней, которое потребуется при сушке "
                + lose500g + " гр в сутки составит: " + athleteDryingAt500g );
        System.out.println( "Количество дней, которое потребуется при усредненной сушке "
                + ( lose250g + lose500g ) / 2 + " гр в сутки составит: " + averageDryingOfAthlete );
        float mashaSalary = 67760f;
        float denisSalary = 83690f;
        float christinSalary = 76230f;
        float surchargePercentage = 10f;
        float seniorityCoefficient = surchargePercentage / 100;
        byte year = 12;
        float newMashaSalary = mashaSalary * ( 1 + seniorityCoefficient );
        float newDenisSalary = denisSalary * ( 1 + seniorityCoefficient );
        float newChristinSalary = christinSalary * ( 1 + seniorityCoefficient );
        float mashaAnnualIncome = mashaSalary * year;
        float denisAnnualIncome = denisSalary * year;
        float christinAnnualIncome = christinSalary * year;
        System.out.println ( "Маша теперь получает " + newMashaSalary + " рублей."
                + " Годовой доход вырос на " + mashaAnnualIncome * seniorityCoefficient + " рублей");
        System.out.println ( "Денис теперь получает " + newDenisSalary + " рублей."
                + " Годовой доход вырос на " + denisAnnualIncome * seniorityCoefficient + " рублей");
        System.out.println ( "Кристина теперь получает " + newChristinSalary + " рублей."
                + " Годовой доход вырос на " + christinAnnualIncome * seniorityCoefficient + " рублей");
        // the HOMEWORK 4
        byte ege = 39;
        if ( ege >= 18 ) {
            System.out.println("Он совершеннолетний");
        }
        else if ( ege > 0 && ege < 18 ) {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }
        float temperatureOutside = 30;
        boolean isCold = temperatureOutside < 5;
        if ( !isCold && temperatureOutside > 5 ) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        else if ( isCold ) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if ( !isCold && temperatureOutside > 5 ) {
            System.out.println("На улице " + temperatureOutside + ", можно идти без шапки");
        }
        else if ( isCold ) {
            System.out.println("На улице " + temperatureOutside + ", нужно надеть шапку");
        }
        short speed = 60;
        boolean isSpeeding = speed > 60;
        if ( !isSpeeding && speed <= 60 ) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        byte ears = 7;
        System.out.print( "Если возраст человека равен " + ears + ", то ему нужно ходить " );
        if ( ears >= 2 && ears <= 6 ) {
            System.out.print( "в детский сад") ;
        }
        else if ( ears >= 7 && ears <= 17 ) {
            System.out.print( "в школу" );
        }
        else if ( ears >= 18 && ears <= 24 ) {
            System.out.print( "в университет" );
        }
        else if ( ears > 24 ) {
            System.out.print( "на работу" );
        }
        boolean hasAdult = true;
        ears = 5;
        System.out.print( "Если возраст ребенка равен " + ears + " то ему " );
        if ( ears < 5 ) {
            System.out.print("нельзя кататься на аттракционе");
        }
        else if ( ears >= 5 && ears < 14 && hasAdult ) {
            System.out.print("можно кататься на аттракционе в сопровождении");
        }
        else if ( ears >= 14 ) {
            System.out.print("можно кататься без сопровождения взрослого");
        }
        byte numberOfSeatsInCarriage = 102;
        byte seatingPlaces = 60;
        byte freeSpace = 80;
        if ( freeSpace <= seatingPlaces ) {
            System.out.println("В вагоне есть места сидячие");
        }
        else if ( freeSpace > seatingPlaces && freeSpace <= numberOfSeatsInCarriage ) {
            System.out.println("В вагоне есть места стоячие");
        }
        else {
            System.out.println("Вагон уже полностью забит");
        }
        int one = 1;
        int two = 2;
        int three = 3;
        int max = one;
        if ( two > max ) {
            max = two;
        }
        if ( three > max ) {
            max = three;
        }
        System.out.println( max );
    }
}