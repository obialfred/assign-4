class Odometer {
    double miles = 0;
    double mpg = 0;
    double gallons = 0;
    double tripmiles = 0;

    double oReset (){
        miles = 0;
        return miles;
    }

    double set_fuelEff (){
        mpg = tripmiles/gallons;
        return mpg;

    }

    double get_totalmiles(){
        miles = miles + tripmiles;
        return miles;
    }

    







}