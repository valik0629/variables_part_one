public class Main {
    public static void main(String[] args )
    {
        // Task 1
        System.out.println("Task 1");
        var dog = 8.0; // Инициализировали переменную dog типа var и присвоили ей начальное значение 8.0
        var cat = 3.6; // Инициализировали переменную cat типа var и присвоили ей начальное значение 3.6
        var paper = 763789; // Инициализировали переменную paper типа var и присвоили ей начальное значение 763789
        System.out.println("Выводим значение переменной dog = " + dog);
        System.out.println("Выводим значение переменной cat = " + cat);
        System.out.println("Выводим значение переменной paper = " + paper);

        // Task 2
        System.out.println("Task 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Увеличили значение переменной dog на 4 и получили dog = " + dog);
        System.out.println("Увеличили значение переменной cat на 4 и получили cat= " + cat);
        System.out.println("Увеличили значение переменной paper на 4 и получили paper = " + paper);

        // Task 3
        System.out.println("Task 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Уменьшили значение переменной dog на 3,5 и получили dog = " + dog);
        System.out.println("Уменьшиши значение переменной cat на 1,6 и получили cat = " + cat);
        System.out.println("Уменьшили значение переменной paper на 7639 и получили paper = " + paper);

        // Task 4
        System.out.println("Task 4");
        var friend = 19;  // Инициализировали переменную friend типа var и присвоили ей значение 19
        System.out.println("Выводим первоначальное значение переменной friend = " + friend);
        friend = friend + 2;
        System.out.println("Выводим значение переменной friend, увеличенное на 2, friend = " + friend);
        friend = friend / 7;
        System.out.println("Выводим значнеие переменной friend, уменьшенное в три раза, friend = " + friend);

        // Task 5
        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println("Начальное значение переменной " + frog);
        frog = frog * 10;
        System.out.println("Увеличили переменную в 10 раз, получили " + frog);
        frog = frog / 3.5;
        System.out.println("Поделили переменную на 3,5, получили " + frog);
        frog = frog + 4;
        System.out.println("Добавили к последнему значению 4, получили  " + frog);

        // Task 6
        System.out.println("Task 6");
        var firstBoxerWeight = 78.2; //Вес первого боксера
        System.out.println("Вес первого боксера " + firstBoxerWeight +  " кг");
        var secondBoxerWeight = 82.7;  //Вес второго боксера
        System.out.println("Вес второго боксера " + secondBoxerWeight + " кг");
        var totalWeight = firstBoxerWeight + secondBoxerWeight; // Вычисляем общий вес боксеров
        var weightDifference = secondBoxerWeight - firstBoxerWeight; // Определяем, на сколько второй боксер тяжелее первого
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        System.out.println("Второй боксер тяжелее первого на " + weightDifference + " кг" );

        // Task 7
        System.out.println("Task 7");
        System.out.println("Вычислим разницу масс спортсменов:");
        // Используя переменные, объявленые в Задании 6, вычитаем из большей массы меньшую
        var weightDifference7_1 = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Разница в массе, способ первый - " + weightDifference7_1);
        // Используя оператор &, выясняем остаток от деления нацело, заведома зная, что второй спортсмен тяжелее первого
        var weightDifference7_2 = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Разница в массе, способ второй - " + weightDifference7_2);

        // Task 8
        System.out.println("Task 8");

        System.out.println("Part 1");
        var totalWorkingTime = 640; // Общее количество рабочих часов
        var workingHoursPerDay = 8; // Количество рабочих часов на одного работника в день
        var amountOfWorkers = totalWorkingTime / workingHoursPerDay; //  Количество работников в компании
        System.out.println("Общее количество рабочих часов в компании в день - " + totalWorkingTime);
        System.out.println("Количество рабочих часов на одного работника в день - " + workingHoursPerDay);
        System.out.println("Всего работников в компании " + amountOfWorkers + " человек.");

        System.out.println("Part 2");
        // Если в компании будет на 94 сотрудника больше, то общее количество сотрудников будет
        var newAmountOfWorkers = amountOfWorkers + 94;
        System.out.println("Если сотрудников будет на 94 больше, то всего их будет " + newAmountOfWorkers + " человека");

        // Если количество рабочего времени на одного сотрудника в день останется на уровне 8 часов, то чтоб занять
        // новое количество сотрудников потребуется
        var newTotalWorkingTime = newAmountOfWorkers * 8;
        System.out.println("Если в компании работает " + newAmountOfWorkers + " человека, то всего " + newTotalWorkingTime + " часа работы может быть поделено между сотрудниками.");


    }
}