public class Student {
    public  static  int countForStudent = 0 ;
    private  String nameStudent;

    public Student(String nameStudent) {
        this.nameStudent = nameStudent;
       countForStudent++ ;
    }

    public String getNamesStudent() {
        return nameStudent;
    }

    public void setNamesStudent(String namesStudent) {
        this.nameStudent = namesStudent;
    }
}
