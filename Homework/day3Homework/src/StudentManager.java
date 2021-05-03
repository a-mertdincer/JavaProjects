public class StudentManager{

    public void add(User user){
        System.out.println(user.getName()+ " Adli kullanicinin rolu -ogrenci- olarak ayarlandi");
    }

    public void showinfo(Student student){
        System.out.println(student.getName() + " Adli ogrencinin mail adresi : " + student.getEmail());
        System.out.println(student.getName() + " Adli ogrencinin telefon numarasi : " + student.getPhonenumber());
        System.out.println(student.getName() + " Adli ogrencinin aldigi ders : " + student.getTakenlecture());
        System.out.println(student.getName() + " Adli ogrencinin izledigi toplam video : " + student.getWatchedvideos());


    }

}
