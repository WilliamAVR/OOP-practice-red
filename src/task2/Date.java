package task2;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.year=year;
        this.month=checkMonth(month);
        this.day=checkDay(day);
    }
    private boolean isLeap(){
        //we will need this in order to check if the day is valid on Febuary
        if(year%400 == 0){
            return true;
        }
        if((year%4 == 0)&&(year%100!=0)){
            return true;
        }
        return false;
    }
    private int checkMonth(int month){
        if(month>0 && month<13){
            return month;
        }
        System.out.println("invalid month");
        return 1;
    }
    private int checkDay(int day){
        //checks that the day is between the number of days for the respective month, if true will return the number, otherwise initializes as 1
        if(month==2){
            if(isLeap()){
                if(day<=29 &&day>0){
                    return day;
                }
            }else if(day<29 && day>0){
                return day;
            }

        }else if((month==4)||(month==6)||(month==9)||(month==11)){
            if(day<=30 && day>0){
                return day;
            }
        }else{
            if(day<=31 && day>0){
                return day;
            }
        }
        System.out.println("invalid day");
        return 1;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d",day,month,year);
    }
}
