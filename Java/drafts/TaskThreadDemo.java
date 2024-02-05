public class TaskThreadDemo {
    public static void main(String[] args) {
        Runnable printA=new PrintChar('A', 5);
        printA.run();;
       Thread threadA=new Thread(printA);
        threadA.start();
    }

   static class PrintChar implements Runnable{
        private char charToPrint;
        private int times;
        public PrintChar(char c,int t){
            this.charToPrint=c;
            this.times=t;
         
        }

        @Override
        public void run() {
            for(int i=0;i<times;i++){
                System.out.println(charToPrint);
            }
        }

    }
}
