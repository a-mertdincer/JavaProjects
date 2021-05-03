public class Main {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Ahmet Mert Dincer");
        student1.setEmail("a.mertdincr@gmail.com");
        student1.setPhonenumber("53123423");
        student1.setTakenlecture("Java");
        student1.setWatchedvideos(5);


        Instructor instructor1 = new Instructor();
        instructor1.setId(2);
        instructor1.setName("Engin Demirog");
        instructor1.setEmail("engindemirog@gmail.com");
        instructor1.setPhonenumber("53232313");
        instructor1.setGivenlecture("Java");
        instructor1.setStudentnumber(12378961);
        instructor1.setTotalvideo(1278361);

        System.out.println("******Kullanici ekleme paneli******\n");
        UserManager userManager = new UserManager();
        userManager.add(student1);
        userManager.add(instructor1);

        System.out.println("******Ogrenci Paneli******\n");
        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);
        studentManager.showinfo(student1);

        System.out.println("******Egitmen paneli******\n");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor1);
        instructorManager.showinfo(instructor1);


    }
}
