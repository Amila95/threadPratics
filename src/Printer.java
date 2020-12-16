/**
 * Created by Amila Wickramarathne.
 * Date: 9/14/2019
 * Time: 6:51 AM
 */
public class Printer extends Thread {

//    @Override
//    public void start(){
//        super.start();
//        System.out.println("this is a start method");
//    }

    @Override
    public void run(){
        //update testlint
        for(int i=0; i<100; i++){
            System.out.println(i +"using thread ");
        }

    }


}

//start(){
//    run();
//}

//class camara{
//
//}
//interface phone{
//
//
//}
//
//
//class camaraphone extends camara implements phone {
//
//}