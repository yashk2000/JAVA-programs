import java.util.Random;

public class Driver {

    public static void main(String[] args) {
        //int[] keys = {5, 3, 8, 6, 2, 1, 7, 9, 4, 0};
	
	// 1. Decide the size randomly
	Random r = new Random();
	int size = r.nextInt(100)+1; // Any number between 1-100
	int[] keys = new int[size]; // create an array of such size
	
	// 2. Populate the array with random elements
	for (int i=0; i<size; i++)
	    keys[i] = r.nextInt(100); // Any number between 0-99

      	// 3. Build the heap
	MinHeap m = new MinHeap(keys);
        m.print();  // prints the above array
	m.makeHeap();
        m.print();  // prints the heap constructed
	
	// 4. Check if every internal node satisfied heap property
	for (int i=0; i<=(size-2)/2; i++) {
            if ( m.right(i) != -1 ) { // if both left and right child exists
	        if ( m.get(i) > m.get(m.left(i)) || m.get(i) > m.get(m.right(i)) ) {
	            System.out.println("Test failed");
                    return;
                }      
            }
            else { // if left child alone exists
                if ( m.get(i) > m.get(m.left(i)) ) {
	            System.out.println("Test failed");
                    return;
                }  
            }
	}
	System.out.println("Test passed");
    }
}
