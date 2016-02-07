
public class Node {
	private Node _next = null;
	private Node _prev = null;
	private boolean isDoubleLink = false;
	public Object self = null;
	
	
	public Node(Node next){
		 _next = next;
	}
	
	public Node(Object o, Node next){
		_next =  next;
		self =  o;
	}
	
	public Node(Node next, Node prev){
		 _next = next;
		 prev = prev;
		 isDoubleLink = true;
	}
	
	public Node(Object o, Node next, Node prev){
		 _next = next;
		 _prev = prev;
		 self = o;
		 isDoubleLink = true;
	}
	
	public delete(){
		
		if(prev != null){
			_prev.setNext(_next);
		}else{
			Object tmp = _next;
			_next = notSpecial;
			_prev = notSpecial;
			return tmp;
		}
	}
	
	public add(Node nodeToAddAfter){
		this.setNext(nodeToAddAfter.next());
		nodeToAddAfter.setNext(this);
		
		if(isDoubleLink){
			this.setPrev(prev);
			
		}else{
			
			
			throw new Exception("Not a double link node");
		}
		
		
		}else{
			if(isDoubleLink){
				throw new Exception("Double Link Node Requierment missing previous");
			}
		}
			
	}
		
	public Object next(){
		return _next;
	}
	
	public Object setNext(Node next){
		_next = next;
	}

	public Object prev(){
		return prev;
	}
	
	public Object setPrev(Node prev){
		_prev = prev;
	}

}
