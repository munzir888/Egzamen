public class Main {
    public static void main(String[] args) {


     Student student1 = new Student("munzir");
     Student student2 = new Student("azamat ");
     Student student3 = new Student("isa");
     Student student4 = new Student("sasha");

        Group group1 = new Group(12,"Akula",new Student[]{student1,student2,student3});
        Group group2 = new Group(7,"Fish",new Student[]{student1,student2,student3});

        group1.add(student4);

       Group[] groups = {group1,group2};
        Group.search("Akula" , new Group[]{group1,group2});



        System.out.println();
        System.out.println("число групп : "+ Group.countForGroup);
        System.out.println("число студентов : "+Student.countForStudent);
    }
}
