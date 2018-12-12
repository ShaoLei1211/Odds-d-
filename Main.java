public class Main {
    public static void main(String[] args) {
        scenario_1();
        scenario_2();
        scenario_3();
        scenario_4();
        scenario_5();

    }
    public static void scenario_1() {
    // Condition: Probability of rolling odd numbers, on a single 6-sided die:
    // Probability: 1/6+1/6+1/6=3/6=1/2=50%
        System.out.println("Scenario: Expected result 50.00%");
        int trial_True = 0;
        int trial_False = 0;
        int count = 100000;
        for (int i = 0; i < count; i++) {
            int result = (int)Math.floor(Math.random()*6)+1;

            if ((result == 1)||(result==3)||(result==5)){
                trial_True++;
            } else {
                trial_False++;
            }
        }
        System.out.println("Count of True : " + trial_True);
        System.out.println("Count of False : " + trial_False);
        System.out.println("Condition reached " + ((float)trial_True/(float)count)*100 + "%\n");
    }
    public static void scenario_2(){
        // Condition: Probability of rolling over 5 or even number, on a single 6-sides die:
        // Probability: 1/2+1/3-1/6=2/3

        System.out.println("Scenario: Expected result 66.67%");
        int trial_True = 0;
        int trial_False = 0;
        int count = 100000;
        for (int i = 0; i < count; i++) {
            int result = (int)Math.floor(Math.random()*6)+1;

            if ((result == 2)||(result==4)||(result==5)||(result==6)){
                trial_True++;
            } else {
                trial_False++;
            }
        }
        System.out.println("Count of True : " + trial_True);
        System.out.println("Count of False : " + trial_False);
        System.out.println("Condition reached " + ((float)trial_True/(float)count)*100 + "%\n");
    }
    public static void scenario_3(){
        // Condition: =2 6-sides die: even on the first one x odd on the second one
        // Probability: 1/2*1/2 = 1/4

        System.out.println("Scenario: Expected result 25.00%");
        int trial_True = 0;
        int trial_False = 0;
        int count = 100000;
        for (int i = 0; i < count; i++) {
            int result_1 = (int)Math.floor(Math.random()*6)+1;
            int result_2 = (int)Math.floor(Math.random()*6)+1;

            if (((result_1 == 2)||(result_1==4)||(result_1==6))&&((result_2==1)||(result_2==3)||(result_2==5))){
                trial_True++;
            } else {
                trial_False++;
            }
        }
        System.out.println("Count of True : " + trial_True);
        System.out.println("Count of False : " + trial_False);
        System.out.println("Condition reached " + ((float)trial_True/(float)count)*100 + "%\n");
    }
    public static void scenario_4(){
        // Condition: =3 6-sides die: even on the first 1&2 x 3&4 on the second one x 5&6 on the third
        // Probability: 1/3*1/3*1/3=1/27

        System.out.println("Scenario: Expected result 3.70%");
        int trial_True = 0;
        int trial_False = 0;
        int count = 100000;
        for (int i = 0; i < count; i++) {
            int result_1 = (int)Math.floor(Math.random()*6)+1;
            int result_2 = (int)Math.floor(Math.random()*6)+1;
            int result_3 = (int)Math.floor(Math.random()*6)+1;

            if (((result_1 == 1)||(result_1==2))&&((result_2==3)||(result_2==4))&&((result_3==5)||(result_3==6))){
                trial_True++;
            } else {
                trial_False++;
            }
        }
        System.out.println("Count of True : " + trial_True);
        System.out.println("Count of False : " + trial_False);
        System.out.println("Condition reached " + ((float)trial_True/(float)count)*100 + "%\n");
    }
    public static void scenario_5(){
        //
        // Probability: 6*5*4*3/6^4=360/1296

        System.out.println("Scenario: Expected result 27.78%");
        int trial_True = 0;
        int trial_False = 0;
        int count = 100000;
        for (int i = 0; i < count; i++) {
            int result_1 = (int)Math.floor(Math.random()*6)+1;
            int result_2 = (int)Math.floor(Math.random()*6)+1;
            int result_3 = (int)Math.floor(Math.random()*6)+1;
            int result_4 = (int)Math.floor(Math.random()*6)+1;

            if ((result_1!=result_2)&&(result_1!=result_3)&&(result_1!=result_4)&&(result_2!=result_3)&&(result_2!=result_4)&&(result_3!=result_4)){
                trial_True++;
            } else {
                trial_False++;
            }
        }
        System.out.println("Count of True : " + trial_True);
        System.out.println("Count of False : " + trial_False);
        System.out.println("Condition reached " + ((float)trial_True/(float)count)*100 + "%\n");
    }

}

