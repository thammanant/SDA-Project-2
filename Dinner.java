public class Dinner extends Course{
    CourseFactory courseFactory;
    DinnerBuilder mealBuilder = new DinnerBuilder();

    public TheMeal getMeal() {
        return mealBuilder.getDinnerProduct();
    }

    public void constructMeal(String category, String options){
        mealBuilder.createNewMeal("3");

        if (category.equals("MainDish")) {
            mealBuilder.buildMainDish(options);
        } else if (category.equals("Appetizer")) {
            mealBuilder.buildAppetizer(options);
        } else if (category.equals("Dessert")) {
            mealBuilder.buildDessert(options);
        }
    }

    public Dinner(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
    }

    void prepare(String courseType, String beverageType) {
        // mealBuilder = courseFactory.createMealBuilder(courseType);
        courseFactory.createBeverage(beverageType);
    }
}
