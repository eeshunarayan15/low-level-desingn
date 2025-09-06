package Lesson1.HomeWork;
class  Student{
     private String name;
    private int age;
    private String grade;

}
class EnrollStudent{
    public  void enrollStudent(Student student){

    }
}
class ScheduledClass{
    public  void scheduledClasses(){

    }
}
class  Teacher{
 private   String name;
  private String subject;
}
class TeacherService{
    public void manageTeacher(Teacher teacher){

    }

}

public class SchoolManager {
    private  EnrollStudent enrollStudent;
    private  ScheduledClass scheduledClass;
    private  TeacherService teacherService;

    public SchoolManager(EnrollStudent enrollStudent, ScheduledClass scheduledClass, TeacherService teacherService) {
        this.enrollStudent = enrollStudent;
        this.scheduledClass = scheduledClass;
        this.teacherService = teacherService;
    }
    public void enrollStudent(Student student){
        enrollStudent.enrollStudent(student);
    }
    public void scheduleClass(){
        scheduledClass.scheduledClasses();
    }
    public  void manageTeacher(Teacher teacher){
        teacherService.manageTeacher(teacher);
    }
}
