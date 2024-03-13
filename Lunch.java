public class Lunch extends Course{
    CourseFactory courseFactory;
    LunchBuilder mealBuilder = new LunchBuilder();
    
    public TheMeal getMeal() {
        return mealBuilder.getLunchProduct();
    }

    public void constructMeal(String category, String options){
        mealBuilder.createNewMeal("2");

        if (category.equals("MainDish")) {
            mealBuilder.buildMainDish(options);
        } else if (category.equals("Appetizer")) {
            mealBuilder.buildAppetizer(options);
        } else if (category.equals("SingleDish")) {
            mealBuilder.buildSingleDish(options);
        }
    }

    public Lunch(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
    }

    void prepare(String courseType, String beverageType) {
        // mealBuilder = courseFactory.createMealBuilder(courseType);
        courseFactory.createBeverage(beverageType);
    }
}
