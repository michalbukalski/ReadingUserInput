public class ReadingUserInput_Console {

    public static void main(String[] args) {

        int currentYear = 2025;
//        String usersDateOfBirth = "1993";
//
//        System.out.println(parseInt(currentYear)-parseInt(usersDateOfBirth));

        System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));

    }

    public static String getInputFromConsole(int currentYear){

        String name = System.console().readLine("Hi, what's your name? ");

        System.out.println("Hi " + name + ", Thanks for taking this app!");

        String dateOfBirth = System.console().readLine("What year were you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are " + age + " years old";
    }

    public static String getInputFromScanner(int currentYear){

        return "";
    }
}
