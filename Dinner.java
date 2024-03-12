public class Dinner extends Course{
    CourseFactory courseFactory;

    public Dinner(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
    }

    void prepare(String beverageType) {
        courseFactory.createBeverage(beverageType);
    }
}
