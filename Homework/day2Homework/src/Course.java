public class Course {

    String name;
    int id;
    String instructor;
    double watchedvideo;
    double totalvideo;

    public Course(int id, String name, String instructor, double totalvideo, double  watchedvideo){

        this.id = id;
        this.name = name;
        this.instructor = instructor;
        this.watchedvideo = watchedvideo;
        this.totalvideo = totalvideo;

    }

    public Course(){

    }


}
