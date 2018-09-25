package structure;

public class InsertionSort {
    public static void main(String[] args) {

    }

    private long[] arr;
    private int nElements;
    private final int DEFALUT_SIZE = 10;

    public InsertionSort(int nElements) {
        this.arr = new long[DEFALUT_SIZE];
        this.nElements = 0;
    }

    public void insert(long element){
        arr[nElements] = element;
        nElements++;
    }

    public void display(){
        for (int i = 0; i < nElements ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


}
