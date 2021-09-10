package septemberclass;

public class ifelse4 {
    public static void main(String[] args) {
        //1 accident = 50
        //2 accident = 120
        //3 accident = 220
        //4 accident = 370
        //5 accident = 570
        //6 or more accident = no insurance
        int accident = 3;
        if(accident==1) {
            System.out.println(500+50);
        }
        else if(accident==2) {
            System.out.println(500+120);
        }
        else if(accident==3) {
            System.out.println(500+220);
        }
        else if(accident==4){
            System.out.println(500+370);
        }
        else if(accident==5) {
            System.out.println(500+570);
        }
        else if(accident==6) {
            System.out.println("no insurance");
        }

    }
}
