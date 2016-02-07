public class Node {
	protected Node _next = null;
	public Object self = null;

	public Node(Node next){
		 _next = next;
	}
	
	public Node(Object o, Node next){
		_next =  next;
		self =  o;
	}
	
	public Node delete(){
		Node tmp = _next;
		_next = null;
		return tmp;
	}
	
	public void add(Node nodeToAddAfter){
		this.setNext(nodeToAddAfter.next());
		nodeToAddAfter.setNext(this);
	}
		
	public Node next(){
		return _next;
	}
	
	public void setNext(Node next){
		_next = next;
	}
}
