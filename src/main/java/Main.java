import java.util.Calendar;

public class Main {
    public static void main(String args[]){
        Main main = new Main();
        System.out.println("Total Seconds are : " + main.findSeconds(1998,1,13));

    }
    public long findSeconds(int year, int month, int day){
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar1.set(1970, 1, 01);
        calendar2.set(year, month, day);
        long milliseconds1 = calendar1.getTimeInMillis();
        long milliseconds2 = calendar2.getTimeInMillis();
        long diff = milliseconds2 - milliseconds1;
        long seconds = diff / 1000;
        return seconds;
    }
}
