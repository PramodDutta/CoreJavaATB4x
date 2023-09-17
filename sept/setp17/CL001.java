package sept.setp17;

public class CL001 {
    public static void main(String[] args) {

//        DateData d = new DateData();
//        d.printDate();

        DateDemoC2C dateDemoC2C = new DateDemoC2C(3,3,4);
        System.out.println(dateDemoC2C.toString());

    }
}

class DateData {
    int day,month, year;


    DateData(){
        day = 25;
        month = 8;
        year = 2022;
    }

    public void printDate(){
        System.out.println("Date is "+day+month+year);
    }

}

class DateDemoC2C{
    int day;
    int currentMonth;
    int currentYear;

    DateDemoC2C(int currentMonth,int currentYear) {
        this.currentMonth = currentMonth;
        this.currentYear = currentYear;
    }

    DateDemoC2C(int cm,int cy,int day){
        this(cm,cy);
        this.day = day;
    }

    public String toString(){
        return day+" - "+currentMonth+" - "+currentYear+"";
    }


}