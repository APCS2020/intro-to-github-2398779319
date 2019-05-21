public static String weekday(int d){
    if (d==1){
        return"monday";
    } else if (d == 2){
        return"tuesday";
    } else if (d == 3){
        return"wednesday";
    } else if (d == 4){
        return"thursday";
    } else if (d == 5){
        return"friday";
    } else if (d == 6){
        return"saturday";
    } else if (d == 7){
        return"sunday";
    } else {
        return "you have to enter a number between 1-7";
    }
}
