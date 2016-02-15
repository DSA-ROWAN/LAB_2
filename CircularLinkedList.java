
public class CircularLinkedList<T> extends LinkedList<T> {
	Node<T> tail = null;
	
	public CircularLinkedList(){
		super();
		this.end.setNext(this.head);
		
	}
	
	@Override
	protected void updateTail(Node<T> nd){
		tail = nd;
	}
	
	@Override
	public void clear() {
		tail = end;
		super.clear();
	}
	
	@Override
	protected Node<T> getNodeAt(int index) {
		if(index == size){
			return tail;
		}else{
			return super.getNodeAt(index);
		}
	}
	
	@Override
	public void shift(int pos){
		super.shift(pos);
		tail = this.getNodeAt(size - 1).next();
	}
}
