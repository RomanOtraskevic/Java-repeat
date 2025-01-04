package Classroom;

public class LearnString {
    public static void main(String[] args) {

        //String
        String name = "Roma";
        String lastName = "Otraskevic";

        System.out.println(name);
        System.out.println(lastName);

        //Exercise: Print name and surname (Example :John Doe);
        String fullName = name + " " + lastName;
        System.out.println(fullName);

        //Some Example
        System.out.println(name + " " + lastName);

        String myFullName = String.format("%s %s" , name, lastName);
        System.out.println(myFullName);

        // Hello, world!
        String hello = "Hello, ";
        String world = "World!";

        String helloWorld = hello.concat((world));
        System.out.println(helloWorld);

        String myName = "Roma";
        String myPlanguage = "java";

        System.out.println("My name is "+ myName +  " i love coding "  + myPlanguage );

        //Cltr + click = INFO

        String randomString = "some text";
        System.out.println(randomString.toUpperCase());




    }
}
