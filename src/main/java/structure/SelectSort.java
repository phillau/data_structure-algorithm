package structure;

public class SelectSort {
    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        selectSort.insert(7);
        selectSort.insert(2);
        selectSort.insert(3);
        selectSort.insert(5);
        selectSort.insert(1);
        selectSort.display();
        selectSort.selectSort();
        selectSort.display();
    }

    private long[] arr;
    private int nElement;
    private int DEFAULT_SIZE = 10;

    public SelectSort() {
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
