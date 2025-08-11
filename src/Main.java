public class Main {
    public static void main(String[] args) {
        System.out.println("Привет Мир!");
        System.out.println("Hello World!");
        // the HOMEWORK 2
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        dog += 4;
        cat += 4;
        paper += 4;
        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);
        var friend = 19;
        System.out.println("1. friend = " + friend);
        friend = friend * 2;
        System.out.println("2. friend * 2 = " + friend);
        friend = friend / 7;
        System.out.println("3. friend / 7 = " + friend);
        var frog = 3.5;
        System.out.println("1. frog = " + frog);
        frog *= 10;
        System.out.println("2. frog * 10 = " + frog);
        frog /= 3.5;
        System.out.println("3. frog / 3.5 = " + frog);
        frog += 4;
        System.out.println("4. frog + 4 = " + frog);
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        System.out.println("Общая масса двух бойцов состовляет: "
                + (firstBoxerWeight + secondBoxerWeight) + " кг.");
        var differenceMasses = firstBoxerWeight % secondBoxerWeight;
        System.out.println("Разница между массами бойцов составляет: "
                + differenceMasses + " кг.");
        differenceMasses = firstBoxerWeight % secondBoxerWeight;
        System.out.println("Остаток от деления между двумя весами: "
                + differenceMasses);
        var operationHours = 640;
        var eachEmployeeHours = 8;
        var numberEmployees = operationHours / eachEmployeeHours;
        System.out.println(
                "Всего работников в компании - " + numberEmployees + " человек");
        numberEmployees += 94;
        operationHours = numberEmployees * eachEmployeeHours;
        System.out.println("Если в компании работает " + numberEmployees
                + " человек, то \nвсего " + operationHours + " часов работы"
                + " может быть поделено между сотрудниками.");
        // the HOMEWORK 3
        int i = 100000;
        byte b = 100;
        short s = 1000;
        long l = 299792458L;
        float f = 9.780318f;
        double d = 3.1415926535897932384626433832795D;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
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
                / (lyudmilaPavlovnaHasStudents + annaSergeevnaHasStudents + ekaterinaAndreevnaHasStudents);
        System.out.println("На каждого ученика рассчитано " + forEachStudentPaper + " листов бумаги");
        byte bottleProductionCapacity = 16 / 2;
        int quantityIn20Minutes = bottleProductionCapacity * 20;
        int quantityPerDay = bottleProductionCapacity * 60 * 12;
        int quantityIn3Days = quantityPerDay * 3;
        int quantityIn30Days = quantityPerDay * 30;
        System.out.println("За 20 минут машина произвела " + quantityIn20Minutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + quantityPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + quantityIn3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + quantityIn30Days + " штук бутылок");
        short neededForRepairsCans = 120;
        byte cansOfWhite = 2;
        byte cansOfBrown = 4;
        int numberOfClasses = neededForRepairsCans / (cansOfWhite + cansOfBrown);
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно "
                + numberOfClasses * cansOfWhite + " банок белой краски и "
                + numberOfClasses * cansOfBrown + " банок коричневой краски");
        byte bananaWeight = 80;
        byte milk100mlWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        byte numberOfBananas = 5;
        short amountOfMilk = 200;
        byte amountOfIceCream = 2;
        byte numberOfEggs = 4;
        System.out.println("Рецепт спортзавтрака спортсмена составил "
                + (numberOfBananas * bananaWeight + amountOfMilk / 100 * milk100mlWeight
                + amountOfIceCream * iceCreamWeight + numberOfEggs * eggWeight) + " гр,"
                + " соответственно " + (float) (numberOfBananas * bananaWeight + amountOfMilk / 100 * milk100mlWeight
                + amountOfIceCream * iceCreamWeight + numberOfEggs * eggWeight) / 1000 + " кг");
        byte athleteNeedsToLose = 7;
        short lose250g = 250;
        short lose500g = 500;
        int athleteDryingAt250g = athleteNeedsToLose * 1000 / lose250g;
        int athleteDryingAt500g = athleteNeedsToLose * 1000 / lose500g;
        int averageDryingOfAthlete = (athleteDryingAt250g + athleteDryingAt500g) / 2;
        System.out.println("Количество дней, которое потребуется при сушке "
                + lose250g + " гр в сутки составит: " + athleteDryingAt250g);
        System.out.println("Количество дней, которое потребуется при сушке "
                + lose500g + " гр в сутки составит: " + athleteDryingAt500g);
        System.out.println("Количество дней, которое потребуется при усредненной сушке "
                + (lose250g + lose500g) / 2 + " гр в сутки составит: " + averageDryingOfAthlete);
        float mashaSalary = 67760f;
        float denisSalary = 83690f;
        float christinSalary = 76230f;
        float surchargePercentage = 10f;
        float seniorityCoefficient = surchargePercentage / 100;
        byte years = 12;
        float newMashaSalary = mashaSalary * (1 + seniorityCoefficient);
        float newDenisSalary = denisSalary * (1 + seniorityCoefficient);
        float newChristinSalary = christinSalary * (1 + seniorityCoefficient);
        float mashaAnnualIncome = mashaSalary * years;
        float denisAnnualIncome = denisSalary * years;
        float christinAnnualIncome = christinSalary * years;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей."
                + " Годовой доход вырос на " + mashaAnnualIncome * seniorityCoefficient + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей."
                + " Годовой доход вырос на " + denisAnnualIncome * seniorityCoefficient + " рублей");
        System.out.println("Кристина теперь получает " + newChristinSalary + " рублей."
                + " Годовой доход вырос на " + christinAnnualIncome * seniorityCoefficient + " рублей");
        // the HOMEWORK 4
        byte ege = 39;
        if (ege >= 18) {
            System.out.println("Он совершеннолетний");
        } else if (ege > 0 && ege < 18) {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }
        float temperatureOutside = 30;
        boolean isCold = temperatureOutside < 5;
        if (!isCold) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (!isCold) {
            System.out.println("На улице " + temperatureOutside + ", можно идти без шапки");
        } else {
            System.out.println("На улице " + temperatureOutside + ", нужно надеть шапку");
        }
        short speed = 60;
        boolean isSpeeding = speed > 60;
        if (!isSpeeding) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        } else {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        }
        byte ears = 7;
        System.out.print("Если возраст человека равен " + ears + ", то ему нужно ходить ");
        if (ears >= 2 && ears <= 6) {
            System.out.print("в детский сад");
        } else if (ears >= 7 && ears <= 17) {
            System.out.print("в школу\n");
        } else if (ears >= 18 && ears <= 24) {
            System.out.print("в университет\n");
        } else if (ears > 24) {
            System.out.print("на работу\n");
        }
        boolean hasAdult = true;
        ears = 5;
        System.out.print("Если возраст ребенка равен " + ears + " то ему ");
        if (ears < 5) {
            System.out.print("нельзя кататься на аттракционе");
        } else if (ears >= 5 && ears < 14 && hasAdult) {
            System.out.print("можно кататься на аттракционе в сопровождении\n");
        } else if (ears >= 14) {
            System.out.print("можно кататься без сопровождения взрослого\n");
        }
        byte numberOfSeatsInCarriage = 102;
        byte seatingPlaces = 60;
        byte freeSpace = 80;
        if (freeSpace <= seatingPlaces) {
            System.out.println("В вагоне есть места сидячие");
        } else if (freeSpace > seatingPlaces && freeSpace <= numberOfSeatsInCarriage) {
            System.out.println("В вагоне есть места стоячие");
        } else {
            System.out.println("Вагон уже полностью забит");
        }
        int one = 5;
        int two = 2;
        int three = 3;
        int max = one;
        if (two >= max) {
            max = two;
        }
        if (three >= max) {
            max = three;
        }
        System.out.println(max);
        // the HOMEWORK 5
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        short clientDeviceYear = 2015;
        if (clientOS == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear <= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        short year = 2021;
        if ((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && year > 1584)
            System.out.println(year + " год является високосным");
        else
            System.out.println(year + " год не является високосным");
        short deliveryDistance = 95;
        byte days = 0;
        if (deliveryDistance < 20) {
            days = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            days = 3;
        } else {
            System.out.println("Доставки нет");
        }
        switch (days) {
            case 1:
                System.out.println("Потребуется дней: " + days);
                break;
            case 2:
                System.out.println("Потребуется дней: " + days);
                break;
            case 3:
                System.out.println("Потребуется дней: " + days);
                break;
            default:
                System.out.println("Доставки нет");
        }
        byte monthNumber = 12;
        if (monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                case 2:
                case 12:
                    System.out.println("Зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Осень");
                    break;
                default:
                    System.out.println("Такого сезона нет");
            }
        }
        // the HOMEWORK 6
        for (int j = 1; j <= 10; j++) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int j = 0; j <= 17; j++) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
        for (int j = 10; j >= -10; j--) {
            System.out.print(j + " ");
        }
        for (int y = 1904; y <= 2096; y += 4) {
            System.out.println(y + " год является високосным");
        }
        for (int j = 1; j <= 14; j++) {
            System.out.print(j * 7 + " ");
        }
        System.out.println();
        for (int j = 0; j < 10; j++) {
            System.out.print((int) Math.pow(2, j) + " ");
        }
        System.out.println();
        double monthSavings = 0D;
        for (int month = 1; month <= 12; month++) {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (monthSavings += 29000) + " рублей");
        }
        monthSavings = 0D;
        for (int month = 1; month <= 12; month++) {
            monthSavings = monthSavings * 1.01 + 29000;
            System.out.println("Месяц " + month
                    + ", сумма накоплений равна " + String.format("%.2f", monthSavings) + " рублей");
        }
        for (int j = 1; j <= 10; j++) {
            System.out.println("2*" + j + "=" + 2 * j);
        }
        // the HOMEWORK 7
        double total = 0D;
        short month = 1;
        while (total <= 2459000) {
            total += 15000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + String.format("%.2f", total) + " рублей");
            month++;
        }
        int j = 1;
        while (j <= 10) {
            System.out.print(j++ + " ");
        }
        System.out.println();
        for (j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
        int populatioNumberPeople = 12000000;
        for (year = 2025; year <= 2025 + 10; year++) {
            System.out.println("Год " + year + ", численность населения составляет "
                    + populatioNumberPeople);
            populatioNumberPeople = populatioNumberPeople + (populatioNumberPeople * (17 - 8) / 1000);
        }
        double vasiliyDeposit = 15000;
        month = 1;
        while (vasiliyDeposit <= 12000000) {
            vasiliyDeposit *= (1 + 0.07);
            System.out.println(" Месяц " + month + ", сумма накопления состовляет "
                    + String.format("%.2f", vasiliyDeposit));
            month++;
        }
        vasiliyDeposit = 15000;
        month = 1;
        while (vasiliyDeposit <= 12000000) {
            vasiliyDeposit *= (1 + 0.07);
            if (month % 6 == 0) {
                System.out.println(" Месяц " + month + ", сумма накопления состовляет "
                        + String.format("%.2f", vasiliyDeposit));
            }
            month++;
        }
        vasiliyDeposit = 15000;
        year = 9;
        for (month = 1; month <= 12 * year; month++) {
            vasiliyDeposit *= (1 + 0.07);
            if (month % 6 == 0) {
                System.out.println(" Месяц " + month + ", сумма накопления состовляет "
                        + String.format("%.2f", vasiliyDeposit));
            }
        }
        int firstFriday = 5;
        int friday = firstFriday;
        for (int day = firstFriday; day <= 31; day++) {
            if (day % friday == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
                friday += 7;
            }
        }
        short currentYear = 2025;
        for (int y = currentYear - 200; y <= currentYear + 100; y++) {
            if (y % 79 == 0) {
                System.out.println(y);
            }
        }
        // the HOMEWORK 8
        int[] masInt = new int[]{1, 2, 3};
        float[] masFloat = new float[]{1.57f, 7.654f, 9.986f};
        int[] mas = new int[30];
        int lengthMas = mas.length;
        for (int k = 0; k < lengthMas; k++) {
            mas[k] = k + 7;
        }
        lengthMas = masInt.length;
        for (int k = 0; k < lengthMas; k++) {
            System.out.print(masInt[k]);
            if (k < lengthMas - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        lengthMas = masFloat.length;
        for (int k = 0; k < lengthMas; k++) {
            System.out.print(masFloat[k]);
            if (k < lengthMas - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        lengthMas = mas.length;
        for (int k = 0; k < lengthMas; k++) {
            System.out.print(mas[k]);
            if (k < lengthMas - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        lengthMas = masInt.length;
        for (int k = lengthMas - 1; k >= 0; k--) {
            System.out.print(masInt[k]);
            if (k > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        lengthMas = masFloat.length;
        for (int k = lengthMas - 1; k >= 0; k--) {
            System.out.print(masFloat[k]);
            if (k > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        lengthMas = mas.length;
        for (int k = lengthMas - 1; k >= 0; k--) {
            System.out.print(mas[k]);
            if (k > 0) {
                System.out.print(", ");
            }
        }
        lengthMas = masInt.length;
        for (int k = 0; k < lengthMas; k++) {
            if (masInt[k] % 2 != 0) {
                int tmp = masInt[k];
                masInt[k] = tmp + 1;
            }
        }
        System.out.println();
        lengthMas = masInt.length;
        for (int k = 0; k < lengthMas; k++) {
            System.out.print(masInt[k]);
            if (k < lengthMas - 1) {
                System.out.print(", ");
            }
        }
        // the HOMEWORK 9
        int[] costs1 = {100000, 200000, 300000, 100000, 300000};
        int monthExpenses = 0;
        for (int c = 0; c < costs1.length; c++) {
            monthExpenses += costs1[c];
        }
        System.out.printf("\nСумма трат за месяц составила " + monthExpenses + " рублей");
        int[] costs2 = {10, 9, 70, 40, 7};
        int minCost = costs2[0];
        int maxCost = costs2[0];
        for (int c = 0; c < costs2.length; c++) {
            if (minCost > costs2[c]) {
                minCost = costs2[c];
            }
            if (maxCost < costs2[c]) {
                maxCost = costs2[c];
            }
        }
        System.out.printf("\nМинимальная сумма трат за неделю составила " + minCost + " рублей."
                + " Максимальная сумма трат за неделю составила " + maxCost + " рублей");
        int[] costs3 = new int[5];
        int totalCosts = 0;
        for (int c = 0; c < costs3.length; c++) {
            costs3[c] = c + 7;
        }
        for (int cost : costs3) {
            totalCosts += cost;
        }
        System.out.println("\nСредняя сумма трат за месяц составила " + (double) totalCosts / costs3.length + " рублей");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int ln = reverseFullName.length;
        for (int n = 0; n < ln / 2; n++) {
            char tmp = reverseFullName[n];
            reverseFullName[n] = reverseFullName[ln - 1 - n];
            reverseFullName[ln - 1 - n] = tmp;
        }
        System.out.println(reverseFullName);
        // the HOMEWORK 10
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + '\s' + firstName + '\s' + middleName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName.replace('ё', 'е'));
    }
}