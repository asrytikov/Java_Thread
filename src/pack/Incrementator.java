package pack;

public class Incrementator extends Thread{

    private volatile boolean mIsIncrement = true;
   // private volatile boolean mFinish = false;

    public void changeAction(){
        mIsIncrement = !mIsIncrement;
    }

   /* public void finish(){
        mFinish = true;
    }*/

    @Override
    public void run() {
        do{
            //if (!mFinish){
            if (!Thread.interrupted()){
                if (mIsIncrement){
                    Program.mValue++;
                }else{
                    Program.mValue--;
                }
                System.out.print(Program.mValue + " ");
            }else{
                return;
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException exp){
                return;
            }

        } while (true);
    }
}
