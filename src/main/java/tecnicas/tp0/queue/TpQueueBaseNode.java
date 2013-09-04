package tecnicas.tp0.queue;

import java.rmi.UnexpectedException;

public class TpQueueBaseNode extends TpQueueNode {

	private static final String EMPTY_QUEUE_MESSAGE = "La cola esta vacia";
	
	private TpQueueNode nextNode;

	public TpQueueBaseNode() {
		super(null, null);
	}
	
	public TpQueueNode linkNextNode(Object item, TpQueueNode topNode) {
		 TpQueueNode node = new TpQueueNode(this, item);
		 if(topNode != this){
			 this.nextNode.linkNextNode(node);
			 this.nextNode = node;
			 return topNode;
		 }
		 this.nextNode = node;
		 return this.nextNode;
	}

	public Object getContainedItem() {
		throw new AssertionError(EMPTY_QUEUE_MESSAGE);
	}
	
	public TpQueueNode getLastNode() {
		throw new AssertionError(EMPTY_QUEUE_MESSAGE);
	}

	public int getChildCount() {
		return 0;
	}	
}
