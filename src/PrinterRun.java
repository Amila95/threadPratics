/**
 * Created by Amila Wickramarathne.
 * Date: 9/14/2019
 * Time: 8:03 AM
 */
public class PrinterRun implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("hey i'm wakeup");
        }

        for(int i=0; i<100; i++){

            System.out.println(i +"childRun");
        }
    }
}
