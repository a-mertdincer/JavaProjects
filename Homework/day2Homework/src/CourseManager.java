public class CourseManager {

    public void addCourse(Course course){
        System.out.println(course.name +" has added to the system.");
    }

    public void removeCourse(Course course){
        System.out.println(course.name +" has deleted from the system.");
    }

    public static double percentagecalculator(Course course){

        double percentage = (course.watchedvideo/course.totalvideo)*100;
        return percentage;

    }


}
