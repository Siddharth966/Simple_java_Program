import java.util.LinkedList;

 public class ProducerConsumer {

    LinkedList <Integer> list = new LinkedList<>();

    int capacity= 1;

    public  void producer() throws InterruptedException{
        int value = 0;
        while(true){
            synchronized (this){
                while(list.size()==capacity){
                    wait();
                }
                    list.add(value++);
                    System.out.println("Producer produced : "+value);

                    notify();

                    Thread.sleep(1000);
                }
            }
        }

    public  void consumer () throws InterruptedException{
        while(true){
            synchronized (this){
                while(list.size()==0) {
                    wait();
                }
                    int value = list.removeFirst();
                    System.out.println("Consumer Consumed : "+value);

                    notify();

                    Thread.sleep(1000);
                }
            }
        }
    }




