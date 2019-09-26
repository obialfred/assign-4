import java.Util.Scanner;



class Grading {
    
    String get_grade(){
        java.util.Scanner ui = new Scanner (System.in);
        int grade = ui.nextInt(); 
        if (grade >= 90){
            return "A";

        }

        if (grade >= 80){
            return "B";

        }

        if (grade >= 70){
            return "C";

        }

        if (grade >= 60){
            return "D";

        }
        else {
            return "F";

        }


    }

}