import java.util.Observer;

public abstract class Store implements Observer {
    protected abstract Course createCourse(String item);

    public Course orderCourse(String type) {
        Course course = createCourse(type);
        course.prepare();
        return course;
    }
}