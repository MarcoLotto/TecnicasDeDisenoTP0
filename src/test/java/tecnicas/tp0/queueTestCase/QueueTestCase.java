package tecnicas.tp0.queueTestCase;

import tecnicas.tp0.queue.Queue;
import tecnicas.tp0.queue.TpQueue;
import junit.framework.TestCase;

public class QueueTestCase extends TestCase{
	
	public void testSimple(){
		Queue queue = new TpQueue();
		queue.add("Item1");
		queue.add("Item2");
		queue.add("Item3");
		assertEquals(3, queue.size());
		assertEquals("Item1", queue.top());
		queue.remove();
		assertEquals(2, queue.size());
		assertEquals("Item2", queue.top());
		queue.remove();
		assertEquals(1, queue.size());
		assertEquals("Item3", queue.top());
		queue.remove();
		assertEquals(0, queue.size());
		try{
			queue.remove();
		}
		catch(AssertionError e){
			return;
		}
		fail();
	}	
	
	public void testComplex(){
		Queue queue = new TpQueue();
		queue.add("Item1");
		queue.add("Item2");
		queue.add("Item3");
		assertEquals(3, queue.size());
		assertEquals("Item1", queue.top());
		queue.remove();
		assertEquals(2, queue.size());
		assertEquals("Item2", queue.top());
		queue.add("Item4");
		assertEquals(3, queue.size());
		assertEquals("Item2", queue.top());
		queue.remove();
		assertEquals("Item3", queue.top());
		queue.remove();
		assertEquals(1, queue.size());
		assertEquals("Item4", queue.top());
		queue.remove();
		assertEquals(0, queue.size());
		try{
			queue.remove();
			fail();
		}
		catch(AssertionError e){			
		}
		queue.add("Item5");
		queue.add("Item6");
		queue.remove();
		assertEquals(1, queue.size());
		assertEquals("Item6", queue.top());
		queue.add("Item7");
		assertEquals(2, queue.size());
		assertEquals("Item6", queue.top());		
		queue.remove();
		assertEquals("Item7", queue.top());	
		queue.remove();
		try{
			queue.top();
			fail();
		}
		catch(AssertionError e){			
		}
	}
}
