import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Group {
 public  static  int countForGroup = 0 ;

   private int idGroup  ;
   public  String nameGroup  ;
   Student student[]  ;


    public Group(int idGroup, String nameGroup, Student[] student) {
      this.idGroup = idGroup;
      this.nameGroup = nameGroup;
      this.student = student;
      countForGroup++;
   }

   public Student[] getStudent() {
      return student;
   }

   public void setStudent(Student[] student) {
      this.student = student;
   }





   public int getIdGroup() {
      return idGroup;
   }

   public void setIdGroup(int idGroup) {
      this.idGroup = idGroup;
   }

   public String getNameGroup() {
      return nameGroup;
   }

   public void setNameGroup(String nameGroup) {
      this.nameGroup = nameGroup;
   }

   public  void  add (Student name){
       int count = 0 ;

      for (int i = 0; i < student.length; i++) {
         if(student[i]!=null){
            student[i]=name ;
            count++;
             System.out.println("студент "+student[i].getNamesStudent()+" добавлен !");
             if(count==1){return;}
         }else {
            System.out.println("мест в группе нету !");
         }
      }

   }

   public static void  search(String group, Group[]  groups){

       for (int i = 0; i < groups.length; i++) {
           if(group.equals( groups[i].getNameGroup())){
               System.out.println("название группы : "+groups[i].getNameGroup());
               for (int j = 0; j < groups[i].getStudent().length; j++) {
                   System.out.println(groups[i].getStudent()[j].getNamesStudent());
               }
               System.out.println("число студентов этого группы : "+groups[i].getStudent().length);
           }
       }

   }




}




