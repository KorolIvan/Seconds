import java.util.Calendar;

/**
 * Created by Dell Laptop on 10.09.2016.
 */
public class Seconds {
    public static void main(String[] args) throws InterruptedException {
        int sec=0;
        int min=0;
        while(true){
                Thread.sleep(1000);
                ++sec;
            if(sec<10) {
                System.out.println(min + ":0" + sec);
            }else{
                System.out.println(min+":"+sec);
            }

            if(sec==59){
                sec=0;
                min++;
                if(sec==0){
                    System.out.println(min+":0"+sec);
                }
                if(sec>0) {
                    System.out.println(min + ":" + sec);
                }
            }

        }
    }
}
