public class Main {
    public class DynamicArrayQueue {
        private int[] array;
        private int front;
        private int rear;
        private int size;
    
        public DynamicArrayQueue() {
            array = new int[2];
            front = 0;
            rear = -1;
            size = 0;
        }
    
        public void enqueue(int element) {
            if (size == array.length) {
                resize();
            }
            rear = (rear + 1) % array.length;
            array[rear] = element;
            size++;
        }
    
        public int dequeue() {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            int element = array[front];
            front = (front + 1) % array.length;
            size--;
            return element;
        }
    
        public boolean isEmpty() {
            return size == 0;
        }
    
        public int getSize() {
            return size;
        }
    
        private void resize() {
            int newSize = array.length * 2;
            int[] newArray = new int[newSize];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[(front + i) % array.length];
            }
            array = newArray;
            front = 0;
            rear = size - 1;
        }
    
        public static void main(String[] args) {
            DynamicArrayQueue queue = new DynamicArrayQueue();
            
            queue.enqueue(1);
            queue.enqueue(2);
            System.out.println(queue.dequeue()); 
            queue.enqueue(3);
            System.out.println(queue.dequeue()); 
            queue.enqueue(4);
            queue.enqueue(5);
            queue.enqueue(6);
            
            while (!queue.isEmpty()) {
                System.out.println(queue.dequeue()); 
            }
        }
    }
    
}
