package structure;

public class BubbleSort {
    //数组
    private long[] arr;
    //实际元素个数
    private int nElements;
    //默认初始化元素个数
    private int DEFAULT_SIZE;

    //空参构造函数
    public BubbleSort(){
        arr = new long[DEFAULT_SIZE];
        nElements = 0;
    }

    //得到实际元素的个数
    public int size(){
        return this.nElements;
    }

    //将新元素插入到末尾
    public void insert(long element){
        arr[nElements] = element;
        nElements++;
    }

    //二分查找删除元素
    public int delete(long element){
        int start = 0;
        int end = nElements - 1;
        int middle;
        while (true){
            if(start>end){
                throw new RuntimeException("元素未找到");
            }
            middle = (start + end)/2;
            if(arr[middle]==element){
                return middle;
            }else if(arr[middle]>element){
                end = middle - 1;
            }else if(arr[middle]<element){
                start = middle + 1;
            }
        }
    }
}
