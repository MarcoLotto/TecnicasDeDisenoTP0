package tecnicas.tp0.queue;

public class TpQueue implements Queue{
	
	private TpQueueNode topNode;
	private TpQueueBaseNode bottomNode;
		
	public TpQueue(){
		this.bottomNode = new TpQueueBaseNode();
		this.topNode = this.bottomNode;
	}

	public boolean isEmpty() {
		return (this.size() == 0);
	}

	public int size() {
		return this.topNode.getChildCount();
	}

	public void add(Object item) {
		this.topNode = this.bottomNode.linkNextNode(item, this.topNode);		
	}

	public Object top() {
		return this.topNode.getContainedItem();
	}

	public void remove() {
		this.topNode = this.topNode.getLastNode();		
	}
}
