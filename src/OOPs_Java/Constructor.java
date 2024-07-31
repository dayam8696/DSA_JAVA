package OOPs_Java;

public class Constructor {
    public static void main(String[] args) {
            Childern dayam = new Childern();
        System.out.println(dayam.rollno);
        System.out.println(dayam.Name);
        System.out.println(dayam.Marks);
    }


    static   class Childern{
        int rollno;
        String Name ;
        float Marks ;

        Childern(){
            this.rollno = 32;
            this.Name = "Dayam Nadeem";
            this.Marks = 89.0f;
        }
    }
}
