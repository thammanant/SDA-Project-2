import java.util.Observable;

public class ConcreteStore extends Store{
    public ConcreteStore(CourseFactory courseFactory) {
        super(courseFactory);
    }

    protected Course createCourse(String item) {
        Course course = null;
        CourseFactory courseFactory = new ConcreteFactory();

        switch (item) {
            case "Breakfast":
                course = new Breakfast(courseFactory);
                break;
            case "Lunch":
                course = new Lunch(courseFactory);
                break;
            case "Dinner":
                course = new Dinner(courseFactory);
                break;
        }
        return course;
    }

    public Course orderCourse(String course, String courseType, String options, String beverageType) {
        Course set = createCourse(course);
        set.prepare(courseType, options, beverageType);
        return set;
    }

    @Override
    public void update(Observable o, Object arg) {
        super.update(o, arg);
    }
}
