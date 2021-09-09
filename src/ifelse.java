public class ifelse {
    public static void main(String[] args) {

        //income less than 25000 is considered low income
        //25001-78000 lower middle income
        //78001-187000 upper middle income
        //187001/+upper income

        int income = 78000;

        if(income < 25000) {
            System.out.println("low income");
        }
        else if(income >= 25001 || income <= 78000) {
            System.out.println("lower middle income");
        }
        else if(income >= 78001 || income <= 187000) {
            System.out.println("upper middle income");
        }
        else if(income >= 187001){
            System.out.println("upper income");
        }
        else {
            System.out.println("upper income");
        }
    }
}
