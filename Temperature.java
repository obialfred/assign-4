import java.util.Scanner;


class Temperature {
    float tempVal = 0;
    char scale = 'c';


    float set_temp(){
        Scanner ui = new Scanner(System.in);
        System.out.println("What is the temperature: ");
        tempVal = ui.nextInt();
        return tempVal;

    }

    float get_temp (){


    }

    void toString(){


    }

    boolean equals(){
        if (tempVal == tempVal2){
            return true;
        } else {
            return false;
        }
    }






}