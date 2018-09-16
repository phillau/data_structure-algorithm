package structure;

//数据结构之有序数组以及二分查找法
public class SortArray {

    public static void main(String[] args) {
        SortArray sortArray = new SortArray();
        sortArray.insert(1);
        sortArray.insert(3);
        sortArray.insert(2);
        sortArray.insert(8);
        sortArray.insert(5);
        sortArray.display();
        sortArray.delete(2);
        sortArray.display();
        System.out.println(sortArray.find(4));
    }

    //得到实际元素的数量
    public int size() {
        return nElements;
    }

    //数组
    private long[] arr;
    //实际元素个数
    private int nElements;
    //默认初始容量
    private int DEFAULT_SIZE = 10;

    //初始化
    public SortArray() {
        arr = new long[DEFAULT_SIZE];
        nElements = 0;
    }

    //增加元素的方法
    public void insert(long element) {
        boolean flag = false;
        if(nElements==0){
            arr[0] = element;
        }
        for (int i = 0; i < nElements; i++) {
            if (arr[i] < element) continue;
            for (int j = nElements; j > i; j--) {
                flag = true;
                arr[j] = arr[j -1];
            }
            arr[i] = element;
        }
        if(!flag) arr[nElements] = element;
        nElements++;
    }

    //循环展示元素
    public void display() {
        for (int i = 0; i < nElements; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    //删除元素
    public void delete(long element) {
        boolean exist = false;
        for (int i = 0; i < nElements; i++) {
            if(arr[i]-element==0){
                exist = true;
                for (int j = i; j < nElements; j++) {
                    arr[j] = arr[j+1];
                }
            }
        }
        if(!exist){
            throw new RuntimeException("元素不存在");
        }else {
            nElements--;
        }
    }

    //二分查找
    public int find(long element){
        //初始位置
        int start = 0;
        //结束位置
        int end = nElements - 1;
        //中间位置
        int middle;
        while (true){
            middle = (end + start)/2;
            if(element == arr[middle]){
                return middle;
            }else if(element < arr[middle]){
                end = middle - 1;
            }else if(element > arr[middle]){
                start = middle + 1;
            }
            if(start>end){
                throw new RuntimeException("元素不存在");
            }
        }
    }
}