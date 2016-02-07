
public class DLNode extends Node {
	private DLNode _prev = null;

	public DLNode(DLNode next, DLNode prev) {
		super(next, prev);
		// TODO Auto-generated constructor stub
	}

	public DLNode(Object o, DLNode next, DLNode prev) {
		super(o, next);
		_prev = prev;
		_prev._next = new DLNode(prev, prev);
	}
	
	public Node delete(){
		_prev.setNext(_next);
		((DLNode) _next).setPrev(_prev);
		_next = null;
		_prev = null;
		return this;
	}

	public void add(DLNode nodeToAddAfter){
		this.setNext(nodeToAddAfter.next());
		this.setPrev(nodeToAddAfter);
		
		DLNode nextAfterThisNode = (DLNode)nodeToAddAfter.next();
		nextAfterThisNode.setPrev(this);
		nodeToAddAfter.setNext(this);
	}
	
	
	public DLNode prev(){
		return _prev;
	}
	
	public void setPrev(DLNode prev){
		_prev = prev;
	}

}
