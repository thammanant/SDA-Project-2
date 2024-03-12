public class Breakfast extends Course{
    CourseFactory courseFactory;

    public Breakfast(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
    }

    void prepare(String courseType, String beverageType) {
        mealBuilder = courseFactory.createMealBuilder(courseType);
        beverage = courseFactory.createBeverage(beverageType);
    }
}
