public class Stack implements IStack{
	private int maxSize;
	private int top;
	private Object[] stack;
	
	public Stack(int size) {
		maxSize=size;
		stack=new Object[maxSize];
		top=0;
	}
	
	@Override
	public int getSize() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		return true;
	}
	
	@Override
	public void push(Object elm) throws Exception {
		if(top<=maxSize) {
			if(elm instanceof Integer) {
				stack[++top]=elm;
			}else {
				throw new Exception("All elements in the stack must be of the same type.");
			}
		}else {
			throw new Exception("Can't push anymore, Stack is already full.");
		}
	}
	
	@Override
	public boolean isFull() {
		return top==maxSize-1;
	}
	
	@Override
	public Object getTop() {
		return stack[top];
	}
	
	@Override
	public Object pop() {
		return stack[top--];
	}

}
