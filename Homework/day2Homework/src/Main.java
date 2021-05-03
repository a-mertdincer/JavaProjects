public class Main {

    public static void main(String[] args) {

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~ Teacher Panel ~~~~~~~~~~~~~~~~~~~~~~~");
        Instructor teacher1 = new Instructor(1, "Mert Dincer");
        Instructor teacher2 = new Instructor(2, "Engin Demirog");
        InstructorManager instructorManager = new InstructorManager();
        InstructorManager.addInstructor(teacher1);
        InstructorManager.addInstructor(teacher2);
        Instructor[] teachers = {teacher1, teacher2};
        for (Instructor teacher : teachers) {
            System.out.println("ID: " + teacher.id);
            System.out.println("Name: " + teacher.name);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~ Category Panel ~~~~~~~~~~~~~~~~~~~~~~~");
        Category category1 = new Category("Software", 1);
        Category category2 = new Category("Tech", 2);
        CategoryManager categoryMeneger = new CategoryManager();
        categoryMeneger.addCategory(category1);
        categoryMeneger.addCategory(category2);
        Category[] categories = {category1, category2};
        for (Category category : categories) {
            System.out.println("ID: " + category.id);
            System.out.println("Name: " + category.name);
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~ Course Panel ~~~~~~~~~~~~~~~~~~~~~~~");
        Course course1 = new Course(
                1,
                "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)",
                "Engin Demirog",
                21,
                6
        );

        Course course2 = new Course(
                2,
                "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)",
                "Engin Demirog",
                16,
                2
        );
        Course course3 = new Course(
                3,
                "Programlamaya Giriş için Temel Kurs",
                "Engin Demirog",
                10,
                10
        );
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1);
        courseManager.removeCourse(course2);
        Course[] courses = {course1, course2, course3};
        for (Course course : courses) {
            System.out.println("Course ID: "+course.id);
            System.out.println("Course Name: "+course.name);
            System.out.println("Course Instructor: "+course.instructor);
            System.out.println("Course Completion Percentage: "+CourseManager.percentagecalculator(course));


        }
    }
}
