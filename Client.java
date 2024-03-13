import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String course = "";
        String courseType = "";
        String options = "";
        String beverageType = "";
        ConcreteFactory concreteFactory = new ConcreteFactory();
        ConcreteStore store = new ConcreteStore(concreteFactory);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please choose a course: ");
        System.out.println("1. Breakfast");
        System.out.println("2. Lunch");
        System.out.println("3. Dinner");

        String courseChoice = scanner.nextLine();

        switch (courseChoice) {
            case "1":
                course = "Breakfast";
                System.out.println("You have chosen Breakfast");
                System.out.println("Please choose between: ");
                System.out.println("1. Full English Breakfast");
                System.out.println("2. Light Fare");
                String breakfastChoice = scanner.nextLine();
                switch (breakfastChoice) {
                    case "1":
                        courseType = "FullEnglish";
                        System.out.println("You have chosen Full English Breakfast");
                        System.out.println("Please choose a set: ");
                        System.out.println("1. Set 1");
                        System.out.println("2. Set 2");
                        options = scanner.nextLine();
                        break;
                    case "2":
                        courseType = "LightFare";
                        System.out.println("You have chosen Light Fare");
                        System.out.println("Please choose a dish: ");
                        System.out.println("1. Cereal");
                        System.out.println("2. Toast");
                        options = scanner.nextLine();
                        break;
                }
                break;
            case "2":
                course = "Lunch";
                System.out.println("You have chosen Lunch");
                System.out.println("Please choose between: ");
                System.out.println("1. Single Dish");
                System.out.println("2. Two Course Meal");
                String lunchChoice = scanner.nextLine();
                switch (lunchChoice) {
                    case "1":
                        courseType = "SingleDish";
                        System.out.println("You have chosen Single Dish");
                        System.out.println("Please choose a dish: ");
                        System.out.println("1. Sandwich");
                        System.out.println("2. Salad");
                        options = scanner.nextLine();
                        break;
                    case "2":
                        courseType = "TwoCourseMeal";
                        System.out.println("You have chosen Two Course Meal");
                        System.out.println("Please choose Appetizer: ");
                        System.out.println("1. Soup");
                        System.out.println("2. Salad");
                        String option1 = scanner.nextLine();

                        System.out.println("Please choose Main Dish: ");
                        System.out.println("1. Steak");
                        System.out.println("2. Fish");
                        String option2 = scanner.nextLine();
                        options = option1 + "," + option2;
                        break;
                }
                break;
            case "3":
                course = "Dinner"; courseType = "Dinner";
                System.out.println("You have chosen Dinner");
                System.out.println("Please choose Appetizer: ");
                System.out.println("1. Soup");
                System.out.println("2. Salad");
                String appetizer = scanner.nextLine();
                System.out.println("Please choose Main Course: ");
                System.out.println("1. Steak");
                System.out.println("2. Fish");
                String mainCourse = scanner.nextLine();
                System.out.println("Please choose Dessert: ");
                System.out.println("1. Cake");
                System.out.println("2. Ice Cream");
                String dessert = scanner.nextLine();
                options = appetizer + "," + mainCourse + "," + dessert;
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

        System.out.println("Please choose a beverage: ");
        System.out.println("1. Coffee");
        System.out.println("2. Tea");
        beverageType = scanner.nextLine();
        if (beverageType.equals("1")) {
            System.out.println("You have chosen Coffee");
            beverageType = "Coffee";
        } else if (beverageType.equals("2")) {
            System.out.println("You have chosen Tea");
            beverageType = "Tea";
        } else {
            System.out.println("Invalid choice");
        }

        Course set = store.orderCourse(course, courseType, options, beverageType);
        System.out.println("Ethan ordered a " + set + "\n");

    }
}