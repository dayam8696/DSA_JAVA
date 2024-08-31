package OOPs_Java.Inheritence;

public class boxweight extends Box{
    double weight ;
        public boxweight(){
            this.weight = -1;
        }

        public boxweight (double l ,double h ,double w , double weight){
            super(l,h,w);
            this.weight = weight;
        }


}
