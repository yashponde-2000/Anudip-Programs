package labNo38;

import java.util.LinkedList;

	class ProducerConsumer {
	    private final LinkedList<Integer> buffer = new LinkedList<>();
	    private final int capacity;

	    public ProducerConsumer(int capacity) {
	        this.capacity = capacity;
	    }

	    public void produce() throws InterruptedException {
	        int value = 0;
	        while (true) {
	            synchronized (this) {
	                while (buffer.size() == capacity) {
	                    wait();
	                }

	                System.out.println("Producer produces: " + value);
	                buffer.add(value++);

	                notify();

	                Thread.sleep(1000); // Simulate some time for production
	            }
	        }
	    }

	    public void consume() throws InterruptedException {
	        while (true) {
	            synchronized (this) {
	                while (buffer.isEmpty()) {
	                    wait();
	                }

	                int consumedValue = buffer.removeFirst();
	                System.out.println("Consumer consumes: " + consumedValue);

	                notify();

	                Thread.sleep(1000); // Simulate some time for consumption
	            }
	        }
	    }
	}

	public class ProducerConsumerScenario {
	    public static void main(String[] args) {
	        ProducerConsumer pc = new ProducerConsumer(5);

	        Thread producerThread = new Thread(() -> {
	            try {
	                pc.produce();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        Thread consumerThread = new Thread(() -> {
	            try {
	                pc.consume();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        });

	        producerThread.start();
	        consumerThread.start();
	    }
	


}
