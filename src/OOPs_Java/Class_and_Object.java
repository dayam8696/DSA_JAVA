package OOPs_Java;

public class Class_and_Object {
    public static void main(String[] args) {
            Student dayam = new Student();
            dayam.rollno =14;
            dayam.Marks =56;
            dayam.Name = "Dayam Nadeem ";
        System.out.println(dayam.Marks);
        System.out.println(dayam.rollno);
        System.out.println(dayam.Name);
    }

  static   class  Student{
        int rollno;
        String Name ;
        float Marks ;
    }
}
