public class Instructor extends User {

    private String givenlecture;
    private int studentnumber;
    private int totalvideo;


    public String getGivenlecture() {
        return givenlecture;
    }

    public void setGivenlecture(String givenlecture) {
        this.givenlecture = givenlecture;
    }

    public int getStudentnumber() {
        return studentnumber;
    }

    public void setStudentnumber(int studentnumber) {
        this.studentnumber = studentnumber;
    }

    public int getTotalvideo() {
        return totalvideo;
    }

    public void setTotalvideo(int totalvideo) {
        this.totalvideo = totalvideo;
    }
}
