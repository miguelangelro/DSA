public class QueueImpl<E> implements Queue<E> {
    private E[] data;
    private int p;

    public QueueImpl(int len){
        this.data= (E[])new Object[len];
        this.p= 0; // p numElementos
    }

    public void push(E e) throws FullQueueException {
        if(this.isFull()) throw  new FullQueueException();
        this.data[this.p++]= e;
    }

    public E pop() throws EmptyQueueException {
        if(this.isEmpty()) throw  new EmptyQueueException();
        E ret= this.data[0];
        for(int i=0; i<this.p;i++) {
            this.data[i]=this.data[i+1];
        }
        this.p--;
        return ret;
    }

    public int size() {
        return this.p;
    }

    private boolean isFull(){
        return this.p>=this.data.length;
    }

    private boolean isEmpty(){
        return this.p==0;
    }



}
