import java.util.Arrays;

public class SimpleArrayList {
    private final static int INITIAL_CAPACITY = 5;
    private int cap = INITIAL_CAPACITY;
    private int size = 0;
    private int[] arr = new int[cap];

    public SimpleArrayList() {
        this.size = 0;
        this.cap = INITIAL_CAPACITY;
        this.arr = new int[cap];
    }
    public SimpleArrayList(int x){
        this.size = 1;
        this.cap = INITIAL_CAPACITY;
        arr[0] = x;
    }
    public SimpleArrayList(int[] arr){
        this.size = arr.length;
        this.cap = size*2;
        this.arr = new int[cap];
        for(int i = 0; i<arr.length; i++){
            this.arr[i] = arr[i];
        }
    }
    public SimpleArrayList(SimpleArrayList sar){
        this.cap = sar.getCap();
        this.size = sar.size();
        arr = new int[cap];
        System.arraycopy(sar.getArr(), 0, arr, 0, sar.size);
    }
    public void clear(){
        this.cap = INITIAL_CAPACITY;
        this.size = 0;
        this.arr = new int[cap];
    }
    public void trim(){
        int[] brr = new int[size];
        for(int i = 0; i < size; i++){
            brr[i] = arr[i];
        }
        this.cap = size;
        this.arr = brr;
    }
    public SimpleArrayList insert(int ind, int[] other){
        if(ind < 0 || ind > this.size) throw new IndexOutOfBoundsException();
        int sz = other.length;
        if(size + sz > cap) this.cap = 2*(size + sz);
        int[] brr = new int[cap];
        //copy stuff from initial array from 0 to specified index.
        for(int i = 0; i<ind; i++){
            brr[i] = arr[i];
        }
        //copy stuff from other from ind to sz
        for(int i = ind, j=0; j<sz; i++, j++){
            brr[i] = other[j];
        }
        //copy stuff from initial arr from ind to
        for(int i = ind+sz, j=ind; j<size ; i++, j++){
            brr[i] = arr[j];
        }
        this.size = sz+size;
        this.arr = brr;
        return this;
    }
    public SimpleArrayList insert(int ind, int e){
        return this.insert(ind, new int[] {e});
    }
    public SimpleArrayList append(int e){
        return this.insert(size, new int[] {e});
    }
    public SimpleArrayList append(int[] a){
        return this.insert(size, a);
    }
    public SimpleArrayList append(SimpleArrayList a){
        a.trim();
        return this.append(a.getArr());
    }

    public int get(int ind){
        if(ind < 0 || ind > size-1) throw new IndexOutOfBoundsException();
        return arr[ind];
    }
    public SimpleArrayList set(int ind, int val){
        if(ind < 0 || ind > size-1) throw new IndexOutOfBoundsException();
        this.arr[ind] = val;
        return this;
    }

    @Override
    public String toString() {
        return "SimpleArrayList{" +
                "cap=" + cap +
                ", size=" + size +
                ", arr=" + Arrays.toString(arr) +
                '}';
    }

    public int getCap() {
        return cap;
    }

    public int size() {
        return size;
    }

    public int[] getArr() {
        return arr;
    }
}