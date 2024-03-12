import java.util.Observable;
import java.util.Observer;

public abstract class Store implements Observer {
    protected CourseFactory courseFactory;

    public Store(CourseFactory courseFactory) {
        this.courseFactory = courseFactory;
        this.courseFactory.addObserver(this);
    }

    protected abstract Course createCourse(String item);


    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof CourseFactory.CourseData) {
            CourseFactory.CourseData courseData = (CourseFactory.CourseData) arg;
            System.out.println("Received update: CourseType = " + courseData.getCourseType() + ", BeverageType = " + courseData.getBeverageType());
        }
    }
}