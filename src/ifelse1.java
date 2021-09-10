public class ifelse1 {
    public static void main(String[] args){
        //employee service year more than 5 year, get 5% bonus
        //employee service year more than 10 year, get 10% bonus
        //employee service year more than 15 year, get 30% bonus

        int salary  = 10000;
        int year = 7;

        if(year>5) {
            System.out.println(10000*1.05);
        }
        else if(year>10) {
            System.out.println(10000*1.10);
        }
        else if(year>15) {
          System.out.println(10000*1.15) ;
        }
    }
}
