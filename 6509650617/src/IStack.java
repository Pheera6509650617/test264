public interface IStack {
	int getSize() ;
	boolean isEmpty() ;
	boolean isFull() ;
	Object getTop();
	void push(Object elm) throws Exception;
	Object pop();
}
