import junit.framework.TestCase;

public class StackTestCases extends TestCase {
	// TC1
	public void testCreateNewEmptyStack() {
		Stack s1 = new Stack(5);
		assertEquals(true, s1.isEmpty());
		assertEquals(0, s1.getSize());
	}

	// TC2
	public void testPushNewElm() throws Exception {
		Stack s1 = new Stack(5);
		if (!s1.isFull()) {
			s1.push(1);
		}
		assertEquals(1, s1.getTop());
	}

	// TC3
	public void testPushError() throws Exception {
		Stack s1 = new Stack(5);
		try {
			s1.push(1);
			s1.push('A');
		} catch(Exception e) {
			assertEquals("All elements in the stack must be of the same type.", e.getMessage());
		}
	}

	// TC4
	public void testFILO() throws Exception {
		Stack s1 = new Stack(5);
		s1.push(1);
		s1.push(2);
		Object firstpop=s1.pop();
		Object Secondpop=s1.pop();
		assertEquals(2, firstpop);
		assertEquals(1, Secondpop);
	}
	
	// TC5
	public void TestStackSize() throws Exception {
		Stack s1 = new Stack(5);
		try {
			s1.push(1);
			s1.push(1);
			s1.push(1);
			s1.push(1);
			s1.push(1);
			s1.push(1);
		} catch(Exception e) {
			assertEquals("Can't push anymore, Stack is already full.", e.getMessage());
		}
	}
}
