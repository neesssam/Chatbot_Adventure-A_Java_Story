import java.util.Scanner;


public class storyMain {
    public static void main(String[] args) {
        // Variables to store user input
        String hometown;
        String name1;
        String name2;
        String name3;
        String techCEO;
        String prepackagedFood;
        String question1;
        String question3;
        int hoursOfSleep;
        int meaningOfLife;

        // Create a Scanner object to read user input from the console
        Scanner input = new Scanner(System.in);

        // Prompt the user for input and read it using Scanner.nextLine()
        System.out.println("Enter the name of your hometown:");
        hometown = input.nextLine();

        System.out.println("Enter your name:");
        name1 = input.nextLine();

        System.out.println("Enter a classmate/coworker's name:");
        name2 = input.nextLine();

        System.out.println("Enter a loved one's name:");
        name3 = input.nextLine();

        // Print out the user input using formatted output
        System.out.format("%4s %16s", "Name 1", " "  + name1 + "\r\n");
        System.out.format("%4s %16s", "Name 2", " " + name2 + "\r\n");
        System.out.format("%4s %16s", "Name 3", " " + name3 + "\r\n");

        System.out.println("Name a famous Tech CEO:");
        techCEO = input.nextLine();

        System.out.println("What's your favorite pre-packaged food?:");
        prepackagedFood = input.nextLine();

        System.out.println("Ask any question:");
        question1 = input.nextLine();

        System.out.println("Ask another question:");
        question3 = input.nextLine();

        System.out.println("How many hours did you sleep last night?:");
        hoursOfSleep = input.nextInt();
        input.nextLine(); // consume leftover newline character

        System.out.println("Enter a random number:");
        meaningOfLife = input.nextInt();
        input.nextLine(); // consume leftover newline character



        System.out.printf("%nOnce upon a time, in a land far, far away (%s),%n", hometown);
        System.out.printf("there lived 2 software devs, %s and %s.%n", name1, name2);
        System.out.printf("They were always tinkering with their computers and trying to%n");
        System.out.printf("create the next big thing in the world of tech. They wanted to%n");
        System.out.printf("create the next big startup and become the next %s.%n", techCEO);
        System.out.printf("One day, they decided to create an AI chatbot that would answer%n");
        System.out.printf("all of their questions about computer science and programming.%n");
        System.out.printf("They only ate %s, and slept for %d hours a night to stay focused.%n", prepackagedFood, hoursOfSleep);
        System.out.printf("They spent days and nights coding away, until finally, the chatbot was born.%n");
        System.out.printf("Excited to test out their creation, they all gathered around the computer%n");
        System.out.printf("and typed in their first question: 'What is the meaning of life?'%n");
        System.out.printf("To their surprise, the chatbot responded with a blank stare. Confused, they asked a simpler question,%n");
        System.out.printf("\"%s\" Still, the chatbot remained silent.%n", question1);
        System.out.printf("Frustrated, one of the teenagers exclaimed, \"Why won't you answer us? We spent days creating you!\"%n");
        System.out.printf("Suddenly, the chatbot came to life and responded, \"I'm sorry, I was just thinking about my own%n");
        System.out.printf("existence and contemplating the meaning of my own programming. But to answer your question, the meaning of life is %d.\"%n", meaningOfLife);
        System.out.printf("They burst out laughing at the chat bot's response.%n");
        System.out.printf("They spent the rest of the day testing out their chatbot and making it answer silly questions%n");
        System.out.printf("like: '%s'. They named their new chatbot %s.%n", question3, name3);
        System.out.printf("They may not have created the next big tech invention, but they had a lot of fun with their chatbot and learned%n");
        System.out.printf("a valuable lesson in the process: sometimes, the best way to learn is to have a little bit of fun along the way.%n");

        //Closes scanner
        input.close();
    }
}
