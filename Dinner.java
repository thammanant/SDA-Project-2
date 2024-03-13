public class Dinner extends Course{
    CourseFactory courseFactory;
    String meal;

    DinnerBuilder mealBuilder = new DinnerBuilder();

    public TheMeal getMeal() {
        return mealBuilder.getDinnerProduct();
    }

    public void constructMeal(String category, String options){
        mealBuilder.createNewMeal("3");

        String[] option = options.split(",");

        if (category.equals("Dinner")) {
            mealBuilder.buildAppetizer(option[0]);
            mealBuilder.buildMainDish(option[1]);
            mealBuilder.buildDessert(option[2]);
        }
    }

    public Dinner(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
    }

    void prepare(String courseType,String options, String beverageType) {
        constructMeal(courseType, options);
        meal = String.valueOf(getMeal());
        System.out.println("Preparing " + meal);
        beverage = courseFactory.createBeverage(beverageType);
    }
}
