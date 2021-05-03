public class InstructorManager{

    public void add(User user){
        System.out.println(user.getName()+ " Adli kullanicinin rolu -egitmen- olarak ayarlandi");
    }

    public void showinfo(Instructor instructor){
        System.out.println(instructor.getName() + " Adli egitmenin mail adresi : " + instructor.getEmail());
        System.out.println(instructor.getName() + " Adli egitmenin telefon numarasi : " + instructor.getPhonenumber());
        System.out.println(instructor.getName() + " Adli egitmenin verdigi ders : " + instructor.getGivenlecture());
        System.out.println(instructor.getName() + " Adli egitmenin ogrenci sayisi : " + instructor.getStudentnumber());
        System.out.println(instructor.getName() + " Adli egitmenin yukledigi toplam video : " + instructor.getTotalvideo());


    }
}
