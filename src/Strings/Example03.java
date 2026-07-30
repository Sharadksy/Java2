package Strings;
// Mutability, Thread Safety but slow --> StringBuffer
// Mutability, No Thread Safety but enhanced performance --> StringBuilder

public class Example03 {
    public static void main(String[] args) throws InterruptedException{
        StringBuffer sb = new StringBuffer();

        Task t1 = new Task(sb);
        Task t2 = new Task(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(sb.length());
    }
}
class Task extends Thread{
    private StringBuffer sb;

    public Task(StringBuffer sb){
        this.sb = sb;
    }

    @Override
    public void run() {
        for (int i=0; i<1000; i++){
            sb.append("s");
        }
    }
}