public class Main {

    static void  run(){
        System.out.println("run");
   }
//
//   static void start(){
//       System.out.println("make process for run new thread");
//       run();
//   }


    public static void main(String[] args) throws InterruptedException {

       //start();
//        run();


// Using Runnable Interface
//        RunnableDemo run1 = new RunnableDemo();
//        Thread run = new Thread(run1);
//        run.start();

// Using extents Thread
//        Printer thread1 = new Printer();
//        thread1.start();



//        Printer printer = new Printer();
//        printer.setDaemon(true);
//        printer.start();

//        PrinterRun printerRun = new PrinterRun();
//        Thread thread1 = new Thread(printerRun);
//        Thread thread2 = new Thread(printerRun);
////        Thread.currentThread().setPriority(1);
////        System.out.println("Main" + Thread.currentThread().getPriority());
////        System.out.println("child" + thread.getPriority());
//
//        thread1.run();
//        thread2.start();

       ThreadDemo demo1 = new ThreadDemo("demo1");
       ThreadDemo demo2 = new ThreadDemo("demo2");
        ThreadDemo demo3 = new ThreadDemo("demo3");
        ThreadDemo demo4 = new ThreadDemo("demo4");
//        demo1.setPriority(1);
//        demo4.setPriority(10);
//        demo1.setPriority(1);
////
//        demo2.setPriority(10);

        demo1.start();
        System.out.println("is live 1111"+ demo1.isAlive());
        demo1.stop();
        System.out.println("is live @@@@@ "+ demo1.isAlive());
        demo2.start();
        demo3.start();
        demo4.start();
        demo2.join();
        demo3.join();
        demo4.join();
       // demo1.resume();

        System.out.println("is live 2"+ demo2.isAlive());

       // demo1.suspend();

        //demo2.start();
       // demo3.start();



//        ThreadDemo demo1 = new ThreadDemo();
//        ThreadDemo demo2 = new ThreadDemo();
//        ThreadDemo demo3 = new ThreadDemo();
//        ThreadDemo demo4 = new ThreadDemo("demo4");

//
//        demo1.start();
//        try{
//            demo1.join();
//        }catch(Exception e){System.out.println(e);}
//        demo1.start();
//        demo2.start();
//        demo3.start();
//        demo4.start();
//        demo4.start();
//        thread.interrupt();
//        thread.join();

//        for(int i=0; i<100; i++){
//            System.out.println(i +"main");
//        }
//        demo1.resume();
    }
}
