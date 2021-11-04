public class main {
    public static void main(String[]args){

        Thread hilo = new Thread(new PrintMe());
        Thread hilo2 = new Thread(new PrintMe());
        Thread hilo3 = new Thread(new PrintMe());

        hilo.start();
        hilo2.start();
        hilo3.start();
        try {
            Thread.currentThread().sleep( 2000 );
        }catch( InterruptedException e ){}
    }
}