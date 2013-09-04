package tecnicas.tp0.queue;

public class TpQueueNode {
	
	private TpQueueNode lastNode;
	private Object containedItem;
	
	public TpQueueNode(TpQueueNode lastNode, Object item){
		this.containedItem = item;
		this.lastNode = lastNode;
	}

	public void linkNextNode(TpQueueNode lastNode){
		this.lastNode = lastNode;
	}
	
	public void setContainedItem(Object containedItem) {
		this.containedItem = containedItem;
	}

	public Object getContainedItem() {
		return containedItem;
	}

	public TpQueueNode getLastNode() {
		return this.lastNode;
	}

	public int getChildCount() {
		return 1 + this.lastNode.getChildCount();
	}

}
