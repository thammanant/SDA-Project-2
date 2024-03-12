public class Lunch extends Course{
    CourseFactory courseFactory;

    public Lunch(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
    }

    void prepare(String courseType, String beverageType) {
        mealBuilder = courseFactory.createMealBuilder(courseType);
        courseFactory.createBeverage(beverageType);
    }
}
