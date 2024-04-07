public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
        "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
        "RESULT:" + "\n");
        //Hilo Unico 
        /*
        Singleto singleton = Singleto.getInstance("FOO");
        Singleto anotherSingleton = Singleto.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);    */

        //Multihilos 
        /*
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();*/

        
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
        
        
    }

    //Multihilos 
    /*
    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            Singleto singleton = Singleto.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            Singleto singleton = Singleto.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }*/

    //Multihilos con seguridad
    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingeltonSeguridadHilos singleton = SingeltonSeguridadHilos.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingeltonSeguridadHilos singleton = SingeltonSeguridadHilos.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }



}
