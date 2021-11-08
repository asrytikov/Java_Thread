package pack;

public class EggVoise extends Thread{

    @Override
    public void run(){
        for (int i=0; i<5; i++){
            try {
                sleep(1000);
            }catch (Exception exception){}

            System.out.println("Egg");
        }
    }

}
