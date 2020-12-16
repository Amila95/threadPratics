public class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    ThreadDemo( String name) {
        threadName = name;
        //System.out.println("Creating " +  threadName );
    }

//    int count= 0;
//
//    void incrementCount(){
//        count++;
//        System.out.println("count "+ count+ this.getName());
//
//    }

    public void  run() {
       // System.out.println("Running " +  threadName );
//        for(int i=0;i<10;i++){
//            incrementCount();
//        }


            for(int i = 0; i <10; i++) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

       // System.out.println("Thread " +  threadName + " exiting.");
    }

//    public void start () {
//        System.out.println("Starting " +  threadName );
//        super.start();
//       // t.start ();
////        if (t == null) {
////            t = new Thread (this, threadName);
////            t.start ();
////        }
//    }

//    public void run(){
//        for(int i=1;i<=5;i++){
//            try{
//                Thread.sleep(500);
//            }catch(Exception e){System.out.println(e);}
//            System.out.println(i);
//        }
//    }
}
