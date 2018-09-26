package structure;

//简单选择排序
public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.insert(7);
        selectionSort.insert(2);
        selectionSort.insert(3);
        selectionSort.insert(5);
        selectionSort.insert(1);
        selectionSort.display();
        selectionSort.selectSort();
        selectionSort.display();
    }

    private long[] arr;
    private int nElement;
    private int DEFAULT_SIZE = 10;

    public SelectionSort() {
        this.arr = new long[DEFAULT_SIZE];
        this.nElement = 0;
    }

    public void insert(long element) {
        arr[nElement] = element;
        nElement++;
    }

    public void display(){
        for (int i = 0; i < nElement ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    // 2 1 6 8 5
    //选择排序
    public void selectSort() {
        for (int i = 0; i < nElement; i++) {
            int k = i;
            for (int j = i; j < nElement; j++) {
                if (arr[k] > arr[j]) {
                    k = j;
                }
            }
            if (arr[k] < arr[i]) {
                long temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
