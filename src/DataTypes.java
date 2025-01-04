public class DataTypes {
    public static void main(String[] args) {
        //first comment
        /*
        I am working on these file and I like it
        okay

         */
        // Variables int
        int numberOfStudents = 30;
        int maxScore = 100;
        System.out.println(numberOfStudents);
        System.out.println(maxScore);

        // Variables double

        double temperature = 3.4;
        double price = 999.999;
        System.out.println(temperature);
        System.out.println(price);

        // Variable flout

        float pi = 3.14f;
        float radius = 5.5f;
        float area = pi * radius * radius;
        System.out.println(area);

        // Casting

        int areaInteger = (int) area;
        System.out.println(areaInteger);
        System.out.println(Math.round(area));

        // Char

        char sybol = '$';
        System.out.println(sybol);

        char r = 82;
        System.out.println(r);
        char o = 79;
        System.out.println(o);
        char m = 77;
        System.out.println(m);
        char a = 65;
        System.out.println(a);

        // Boolean is / has

        boolean isRaining = false;
        boolean hasPassedExercise = true;
        boolean isSummer = false;
        System.out.println(isSummer);
        System.out.println(isRaining);
        System.out.println(hasPassedExercise);
    }
}
