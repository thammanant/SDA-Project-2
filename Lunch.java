public class Lunch extends Course{
    CourseFactory courseFactory;

    public Lunch(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
    }

    void prepare(String beverageType) {
        courseFactory.createBeverage(beverageType);
    }
}
