import java.util.List;
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

        Menu menu = new Menu();
        List<List<List<Object>>> allCourses = menu.getAllCourses();

        System.out.println("Please choose a course: ");
        System.out.println("1. Breakfast");
        System.out.println("2. Lunch");
        System.out.println("3. Dinner");

        String courseChoice = scanner.nextLine();

        switch (courseChoice) {
            case "1":
                course = "Breakfast";
                System.out.println("Please choose between: ");
                for (int i = 0; i < allCourses.get(0).size(); i++) {
                    System.out.println((i + 1) + ". " + allCourses.get(0).get(i).get(0));
                }
                String breakfastChoice = scanner.nextLine();
                switch (breakfastChoice) {
                    case "1":
                        courseType = (String) allCourses.get(0).get(0).get(0);
                        System.out.println("Please choose a set: ");
                        List<String> FullEnglishChoice = (List<String>) allCourses.get(0).get(0).get(1); // Get the options for breakfast
                        for (int i = 0; i < FullEnglishChoice.size(); i++) {
                            System.out.println((i + 1) + ". " + FullEnglishChoice.get(i));
                        }
                        options = scanner.nextLine();
                        break;
                    case "2":
                        courseType = (String) allCourses.get(0).get(1).get(0);
                        System.out.println("Please choose a dish: ");
                        List<String> LightFareChoice = (List<String>) allCourses.get(0).get(1).get(1); // Get the options for breakfast
                        for (int i = 0; i < LightFareChoice.size(); i++) {
                            System.out.println((i + 1) + ". " + LightFareChoice.get(i));
                        }
                        options = scanner.nextLine();
                        break;
                }
                break;
            case "2":
                course = "Lunch";
                System.out.println("Please choose between: ");
                for (int i = 0; i < allCourses.get(1).size(); i++) {
                    System.out.println((i + 1) + ". " + allCourses.get(1).get(i).get(0));
                }
                String lunchChoice = scanner.nextLine();
                switch (lunchChoice) {
                    case "1":
                        courseType = (String) allCourses.get(1).get(0).get(0);
                        System.out.println("Please choose a dish: ");
                        List<String> SingleDishChoice = (List<String>) allCourses.get(1).get(0).get(1);
                        for (int i = 0; i < SingleDishChoice.size(); i++) {
                            System.out.println((i + 1) + ". " + SingleDishChoice.get(i));
                        }
                        options = scanner.nextLine();
                        break;
                    case "2":
                        courseType = (String) allCourses.get(1).get(1).get(0);
                        System.out.println("Please choose Appetizer: ");
                        List<String> LunchAppetizerChoice = (List<String>) allCourses.get(1).get(1).get(1);
                        for (int i = 0; i < LunchAppetizerChoice.size(); i++) {
                            System.out.println((i + 1) + ". " + LunchAppetizerChoice.get(i));
                        }
                        String option1 = scanner.nextLine();

                        System.out.println("Please choose Main Dish: ");
                        List<String> LunchMainDish = (List<String>) allCourses.get(1).get(1).get(2);
                        for (int i = 0; i < LunchMainDish.size(); i++) {
                            System.out.println((i + 1) + ". " + LunchMainDish.get(i));
                        }
                        String option2 = scanner.nextLine();
                        options = option1 + "," + option2;
                        break;
                }
                break;
            case "3":
                course = "Dinner";
                courseType = (String) allCourses.get(2).get(0).get(0);
                System.out.println("Please choose Appetizer: ");
                List<String> DinnerAppetizer = (List<String>) allCourses.get(2).get(0).get(1);
                for (int i = 0; i < DinnerAppetizer.size(); i++) {
                    System.out.println((i + 1) + ". " + DinnerAppetizer.get(i));
                }
                String appetizer = scanner.nextLine();
                System.out.println("Please choose Main Course: ");
                List<String> MainCourseChoice = (List<String>) allCourses.get(2).get(0).get(2);
                for (int i = 0; i < MainCourseChoice.size(); i++) {
                    System.out.println((i + 1) + ". " + MainCourseChoice.get(i));
                }
                String mainCourse = scanner.nextLine();
                System.out.println("Please choose Dessert: ");
                List<String> DessertChoice = (List<String>) allCourses.get(2).get(0).get(3);
                for (int i = 0; i < DessertChoice.size(); i++) {
                    System.out.println((i + 1) + ". " + DessertChoice.get(i));
                }
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
        System.out.println("3. Juice");
        beverageType = scanner.nextLine();
        if (beverageType.equals("1")) {
            beverageType = "Coffee";
        } else if (beverageType.equals("2")) {
            beverageType = "Tea";
        } else if (beverageType.equals("3")) {
            beverageType = "Juice";
        } else {
            System.out.println("Invalid choice");
        }

        store.orderCourse(course, courseType, options, beverageType);
        concreteFactory.setData(course, courseType, options, beverageType);
    }
}