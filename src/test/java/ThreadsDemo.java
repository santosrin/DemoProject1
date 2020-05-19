public class ThreadsDemo {

    public static void main(String[] args) throws InterruptedException {


//        //System.out.println("Good");
//        Runnable h1 = new Hi();
//        Runnable h2 = new Hello();
//
           Thread t1 = new Thread(() -> {
               for(int i=1;i<=5;i++) {
                   System.out.println("Hi");
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           });

           Thread t2 = new Thread(() -> {
               for(int i=1;i<=5;i++) {
                   System.out.println("Hello");
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           });

           t1.start();
           t2.start();
////        h1.start();
////        Thread.sleep(100);
////        h2.start();
//
////        h1.show();
////        h2.show();

    }
}
