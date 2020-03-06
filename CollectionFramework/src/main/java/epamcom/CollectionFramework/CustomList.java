package epamcom.CollectionFramework;
import java.util.Arrays;
public class CustomList<E> {
	private int capacity = 0;
	private static final int INITIAL_CAPACITY = 10;
	private Object arr[];
	public CustomList() {
		arr = new Object[INITIAL_CAPACITY];
	}
	public void addElement(E e) {
		if (capacity == arr.length) {
			ensure();
		}
		arr[capacity++] = e;
	}
	@SuppressWarnings("unchecked")
	public E getElement(int i) {
		if (i >= capacity || i < 0) {
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		}
		return (E) arr[i];
	}
	

	@SuppressWarnings("unchecked")
	public E removeElement(int i) {
		if (i >= capacity || i < 0) {
			throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
		}
		Object item = arr[i];
		int num = arr.length - ( i + 1 ) ;
		System.arraycopy(arr, i + 1, arr, i, num ) ;
		capacity--;
		return (E) item;
	}
	
	//Get Size of list
	public int size() {
		return capacity;
	}
	
	//Print method
	@Override
	public String toString() 
	{
		 StringBuilder sb = new StringBuilder();
		 sb.append('[');
		 for(int i = 0; i < capacity ;i++) {
			 sb.append(arr[i].toString());
			 if(i<capacity-1){
				 sb.append(",");
			 }
		 }
		 sb.append(']');
		 return sb.toString();
	}
	
	private void ensure() {
		int newSize = arr.length * 2;
		arr = Arrays.copyOf(arr, newSize);
	}
}