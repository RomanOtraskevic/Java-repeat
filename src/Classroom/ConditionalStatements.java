package Classroom;

public class ConditionalStatements {
    public static void main(String[] args) {
        //If statements

        //If{Conditions}

        if (true) {
            System.out.println("This code is executed");
        }

        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        if (x > 12) {
            System.out.println("x is greater than 12");

        }
        boolean isSpring = true;
        if(isSpring) {
            System.out.println("it is spring");
        }

        //What returns true or false
        //Comparation >,<,=, >=,<=.

        //If-Else

        //Child <=12 year
        //teenager <=12 >19
        //Adult =>20 <=59
        //Else Senior

        int age =60;
        if(age <= 12) {
            System.out.println("This is child");
        } else {
            System.out.println("Something else");
        }

        if (age <=12) {
            System.out.println("These is child");
        } else if (age >=13 && age <=19) {
            System.out.println("These is teenager");
        } else if (age >=20 && age <=59) {
            System.out.println("These is adult");

        }else {
            System.out.println("These is senior");
        }

        //Write e java programm that cheks if number is positive negative or zero

        int number = -1;
        if (number < 0) {
            System.out.println("number is negative");
        } else if (number == 0) {
            System.out.println("number is zero");

        } else if (number > 0) {
            System.out.println("number is positive");

        }

        int hour = -1;
        if (hour >=0 && hour <= 11 ) {
            System.out.println("Good morning");
        } else if (hour ==0)
            System.out.println("Good morning");
        else if (hour <=12 && hour>=17) {
            System.out.println("Good afternoon");
        } else if (hour >=18 && hour <=23 ) {
            System.out.println("Good evening");
        }
        else {
            System.out.println("Invalid time provided");

        }


    }


}
