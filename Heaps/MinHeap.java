public class MinHeap {
    
    int[]arr;
    
    public MinHeap(int[]keys) {
        arr = keys;
    }
    
    public void print() {
        for( int i = 0; i < arr.length; ++i) {
            System.out.print(arr[0] + " ");
        }
    }
    
    public int get(int i) {
        return arr[i];
    }
    
    public int getParent(int i) {
        return (i-1)/2;
    }
    
    public int left(int i) {
        if((2*i) + 1 < arr.length) 
            return 2*i + 1;
        else 
            return -1;
    }
    
    public int right(int i) {
        if(2*i + 2 < arr.length)
            return 2*i + 2;
        else 
            return -1;
    }
    
    public int checkHeap(int i) {
        if(left(i) == -1 && right(i) == -1) {
            return i;
        } else if (right(i) == -1) {
            if(arr[left(i)] < arr[i])
                return left(i);
            else
                return i;
        } else if(arr[i] < arr[left(i)]  && arr[i] <arr[right(i)]) {
            return i;
        } else if(arr[i] > arr[left(i)] && arr[i] < arr[right(i)]) {
            return left(i);
        } else if(arr[i] < arr[left(i)] && arr[i] > arr[right(i)]) {
            return right(i);
        } else if(arr[left(i)] < arr[right(i)]) {
            return left(i);
        } else {
            return right(i);
        }
    }
    
    public void exchange(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void buildHeap(int i) {
        int j = checkHeap(i);
        if(i == j)
            return;
        else {
            exchange(i, j);
            buildHeap(j);
        }
    }
    
    public void makeHeap() {
        for(int i = (arr.length - 2) / 2; i >= 0; --i) {
            buildHeap(i);
        }
    }
    
    public int extractMin() {
        int min = arr[0];
        arr[0] = arr[arr.length - 1];
        buildHeap(0);
        
        return min;
    }
}
