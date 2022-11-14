public class Main {
    public static void main(String[] args) {
        //Exercise 1
        int age = 19;
        boolean isAdult = age >= 18;
        if(isAdult){
            System.out.println("Congratulations, you are adult!");
        } else if (age > 0 && age <18){
            System.out.println("You are minor, please wait!");
        } else {
            System.out.println("The age can't be 0 or less!");
        }

        //Exercise 2
        int personAge = 32;
        if (personAge >= 7 &&personAge < 18){
            System.out.println("The person goes to school");
        } else if (personAge >= 18 && personAge < 24){
            System.out.println("The person finished the school and should go to university!");
        } else if ( personAge >= 24){
            System.out.println("The person finished university and should work");
        } else if (personAge > 0 && personAge < 7){
            System.out.println("The person is very young!");
        } else {
            System.out.println("The age can't be 0 or less!");
        }

        //Exercise 3

        int peopleInWagon = 72;
        if (peopleInWagon > 0 && peopleInWagon < 60){
            System.out.println("There are free seat and standing places!");
        } else if (peopleInWagon >= 60 && peopleInWagon < 102){
            System.out.println("There are only standing places!");
        } else if(peopleInWagon == 0){
            System.out.println("The wagon is free!");
        } else if (peopleInWagon == 102){
            System.out.println("The wagon is full!");
        } else if (peopleInWagon > 102){
            System.out.println("People do not fit in the wagon!");
        } else {
            System.out.println("Wrong number of people!");
        }

        // Exercise 4: Напишите программу, которая помогает определить
        // в какое учреждение нужно отправить человека в зависимости от его возраста

        int ageOfPerson = 25;
        if (ageOfPerson >= 2 && ageOfPerson <= 6){
            System.out.println("Если возраст человека равен " + ageOfPerson + ", то ему нужно ходить в детский сад");
        } else if( ageOfPerson >= 7 && ageOfPerson <= 18){
            System.out.println("Если возраст человека равен" + ageOfPerson +", то ему нужно ходить в школу");
        } else if (ageOfPerson > 18 && ageOfPerson <= 24) {
            System.out.println("Если возраст человека равен" + ageOfPerson +", то ему нужно ходить в университет");
        } else if (ageOfPerson > 24 && ageOfPerson < 100){
            System.out.println("Если возраст человека равен" + ageOfPerson +", то ему нужно ходить на работу");
        } else if (ageOfPerson < 2 && ageOfPerson > 0){
            System.out.println("The person is too young");
        } else {
            System.out.println("Wrong number");
        }

        //Exercise 5: Как правило, на аттракционах действуют ограничения и для детей по возрасту:
        int minorAge = 16;
        if(minorAge > 0 && minorAge < 5){
            System.out.println("The minor is too young");
        } else if(minorAge >= 5 && minorAge < 14){
            System.out.println("The minor can ride the attraction only with adult");
        } else if(minorAge >= 14){
            System.out.println("The minor can ride the attraction");
        } else{
            System.out.println("Wrong number");
        }

        // Exercise 6: С помощью условного оператора и конструкции else напишите программу, которая вычисляет,
        // какое из трех чисел бОльшее и выводит результат в консоль.
        int one = 4;
        int two = 6;
        int three = -2;
        if(one > two && one > three){
            System.out.println("The first number " + one + " is the largest");
        } else if ( two > one && two > three){
            System.out.println("The second number " + two + " is the largest");
        } else {
            System.out.println("The third number " + three + " is the largest");
        }
    }
}