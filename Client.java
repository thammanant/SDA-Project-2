public class Client {
//    public static void main(String[] args) {
//        System.out.println("Please choose a course: ");
//        System.out.println("1. Breakfast");
//        System.out.println("2. Lunch");
//        System.out.println("3. Dinner");
//
//        switch (args[0]) {
//            case "1":
//                System.out.println("You have chosen Breakfast");
//                System.out.println("Please choose between: ");
//                System.out.println("1. Full English Breakfast");
//                System.out.println("2. Light Fare");
//                switch (args[1]) {
//                    case "1":
//                        System.out.println("You have chosen Full English Breakfast");
//                        System.out.println("Please choose a set: ");
//                        System.out.println("1. Set 1");
//                        System.out.println("2. Set 2");
//                        break;
//                    case "2":
//                        System.out.println("You have chosen Light Fare");
//                        System.out.println("Please choose a dish: ");
//                        System.out.println("1. Cereal");
//                        System.out.println("2. Toast");
//                        break;
//                }
//                break;
//            case "2":
//                System.out.println("You have chosen Lunch");
//                System.out.println("Please choose between: ");
//                System.out.println("1. Single Dish");
//                System.out.println("2. Two Course Meal");
//                switch (args[1]) {
//                    case "1":
//                        System.out.println("You have chosen Single Dish");
//                        System.out.println("Please choose a dish: ");
//                        System.out.println("1. Sandwich");
//                        System.out.println("2. Salad");
//                        break;
//                    case "2":
//                        System.out.println("You have chosen Two Course Meal");
//                        System.out.println("Please choose Appetiser: ");
//                        System.out.println("1. Soup");
//                        System.out.println("2. Salad");
//                        System.out.println("Please choose Main Dish: ");
//                        System.out.println("1. Steak");
//                        System.out.println("2. Fish");
//                        break;
//                }
//                break;
//            case "3":
//                System.out.println("You have chosen Dinner");
//                System.out.println("Please choose Appetiser: ");
//                System.out.println("1. Soup");
//                System.out.println("2. Salad");
//                System.out.println("Please choose Main Course: ");
//                System.out.println("1. Steak");
//                System.out.println("2. Fish");
//                System.out.println("Please choose Dessert: ");
//                System.out.println("1. Cake");
//                System.out.println("2. Ice Cream");
//                break;
//        }
//        System.out.println("Please choose a beverage: ");
//        System.out.println("1. Coffee");
//        System.out.println("2. Tea");
//    }

    public static void main(String[] args) {
        CourseFactory factory = new ConcreteFactory();

        // Create Breakfast
        Course breakfast = factory.createMeal("Breakfast");
        Beverage breakfastBeverage = factory.createBeverage("Coffee");
        System.out.println("Beverage: " + breakfastBeverage);

        // Create Lunch
        Course lunch = factory.createMeal("Lunch");
        Beverage lunchBeverage = factory.createBeverage("Tea");
        System.out.println("Beverage: " + lunchBeverage);

        // Create Dinner
        Course dinner = factory.createMeal("Dinner");
        Beverage dinnerBeverage = factory.createBeverage("Coffee");
        System.out.println("Beverage: " + dinnerBeverage);
    }
}
