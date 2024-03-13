import java.util.List;
import java.util.Observable;
import java.util.Observer;

public abstract class Store implements Observer {
    protected CourseFactory courseFactory;

    public Store(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
        this.courseFactory.addObserver(this);
    }

    protected abstract Course createCourse(String item);

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof CourseFactory.CourseData) {
            CourseFactory.CourseData courseData = (CourseFactory.CourseData) arg;
            String course = courseData.getCourse();
            String courseType = courseData.getCourseType();
            String options = courseData.getOptions();
            String beverageType = courseData.getBeverageType();

            String menuOption = "";
            Menu menu = new Menu();

            switch (course) {
                case "Breakfast":
                    List<List<Object>> breakfastMenu = menu.getBreakfastMenu();
                    if (courseType.equals("FullEnglish")) {
                        List<String> fullEnglishOptions = (List<String>) breakfastMenu.get(0).get(1);
                        menuOption = fullEnglishOptions.get(Integer.parseInt(options) - 1);
                    } else if (courseType.equals("LightFare")) {
                        List<String> lightFareOptions = (List<String>) breakfastMenu.get(1).get(1);
                        menuOption = lightFareOptions.get(Integer.parseInt(options) - 1);
                    }
                    break;
                case "Lunch":
                    List<List<Object>> lunchMenu = menu.getLunchMenu();
                    if (courseType.equals("SingleDish")) {
                        List<String> singleDishOptions = (List<String>) lunchMenu.get(0).get(1);
                        menuOption = singleDishOptions.get(Integer.parseInt(options) - 1);}
                    else if (courseType.equals("TwoCourse")) {
                        List<String> appetizers = (List<String>) lunchMenu.get(1).get(1);
                        List<String> mainDishes = (List<String>) lunchMenu.get(1).get(2);
                        String[] choice = options.split(",");
                        int appetizerChoice = Integer.parseInt(choice[0]);
                        int mainDishChoice = Integer.parseInt(choice[1]);
                        menuOption = "\n--Appetizer: " + appetizers.get(appetizerChoice - 1) + "\n--Main Dish: " + mainDishes.get(mainDishChoice - 1);
                    }
                    break;
                case "Dinner":
                    List<List<Object>> dinnerMenu = menu.getDinnerMenu();
                    List<String> appetizers = (List<String>) dinnerMenu.get(0).get(1);
                    List<String> mainDishes = (List<String>) dinnerMenu.get(0).get(2);
                    List<String> desserts = (List<String>) dinnerMenu.get(0).get(3);
                    String[] choice = options.split(",");
                    int appetizerChoice = Integer.parseInt(choice[0]);
                    int mainDishChoice = Integer.parseInt(choice[1]);
                    int dessertChoice = Integer.parseInt(choice[2]);
                    menuOption = "\n--Appetizer: " + appetizers.get(appetizerChoice - 1) + "\n--Main Dish: " + mainDishes.get(mainDishChoice - 1)
                            + "\n--Dessert: " + desserts.get(dessertChoice - 1);
                    break;
                default:
                    System.out.println("Invalid choice");
                    return;
            }

            System.out.println("\n\n*********************************************************\n" +
                    "Your order-\n Course : " + course + "\n CourseType : " + courseType
                    + "\n Menu : " + menuOption + "\n Beverage : " + beverageType
                    + "\n*********************************************************");
        }
    }

}