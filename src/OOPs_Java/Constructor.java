package OOPs_Java;

public class Constructor {
    public static void main(String[] args) {
            Childern dayam = new Childern();
            dayam.chnageName("Abuzar");
            dayam.greeting();
//        System.out.println(dayam.rollno);
//        System.out.println(dayam.Name);
//        System.out.println(dayam.Marks);
    }


    static   class Childern{
        int rollno;
        String Name ;
        float Marks ;
        void greeting(){
            System.out.println("Hello my name is " + this.Name);
        }
        void chnageName(String newName ){
            Name = newName;

        }

        Childern(){
            this.rollno = 32;
            this.Name = "Dayam Nadeem";
            this.Marks = 89.0f;
        }
    }
}
