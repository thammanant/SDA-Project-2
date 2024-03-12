public class Dinner extends Course{
    CourseFactory courseFactory;

    public Dinner(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
    }

    void prepare(String courseType, String beverageType) {
        mealBuilder = courseFactory.createMealBuilder(courseType);
        courseFactory.createBeverage(beverageType);
    }
}
