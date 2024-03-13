public class Lunch extends Course{
    LunchBuilder mealBuilder = new LunchBuilder();
    
    public TheMeal getMeal() {
        return mealBuilder.getLunchProduct();
    }

    public void constructMeal(String category, String options){
        mealBuilder.createNewMeal("2");

        String[] option = options.split(",");

        if (category.equals("TwoCourseMeal")) {
            mealBuilder.buildAppetizer(option[0]);
            mealBuilder.buildMainDish(option[1]);
        } else if (category.equals("SingleDish")) {
            mealBuilder.buildSingleDish(options);
        }
    }

    public Lunch(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
    }

    public void prepare(String courseType,String options, String beverageType) {
        constructMeal(courseType, options);
        meal = getMeal();
        System.out.println("Preparing " + meal);
        beverage = courseFactory.createBeverage(beverageType);
    }
}
