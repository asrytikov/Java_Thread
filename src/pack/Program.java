package pack;

public class Program {

    public static int mValue = 0;

    static Incrementator mInc;

    public static void main(String[] args) {
        mInc = new Incrementator();
        System.out.println("Result =");
        mInc.start();

        for (int i = 1; i <= 3; i++) {
            try {
                Thread.sleep(i*2*1000);
            }catch (Exception exp){}

            mInc.changeAction();
        }
        //mInc.finish();
        mInc.interrupt();
        try {
            mInc.join(100);
            mInc.setPriority(7);
            int prior = mInc.getPriority();

            mInc.setName("jdhjfhsj");
            mInc.getId();
        }catch (InterruptedException exp){}
    }

}
