public class LinkedList extends List {

	int size = 0;
	Node head = new Node();
	Node end = new Node();
	
	public LinkedList() {
		head.setNext(end);
		end.setNext(head);
	}
	
	@Override
	protected Node _add(int index, Object o) {
		Node nodeToAdd = new Node(o, this.getNodeAt(index));
		return nodeToAdd;
	}

	@Override
	protected Node _add(Object o) {
		return this._add(size, o);
	}
	
	@Override
	protected Node getNode(Object o) {
		Node curr = head;
		
		while(curr != end){
			if(curr.self.equals(o)){
				return curr;
			}else{
				curr = curr.next();
			}
		}
		return null;
	}

	@Override
	protected Node getNodeAt(int index) {
		Node curr = head;
		
		for(int i = 0; i <= index && curr != end; i++){
			curr = curr.next();
		}
		
		return curr == end ? null : curr;
	}

	@Override
	public  void add(int index, Object o) {
		this._add(index, this.getNodeAt(index));
	}

	@Override
	public  void add(Object o) {
		this.add(size, o);
	}
	
	@Override
	public void clear() {
		head.setNext(end);

	}
	
	@Override
	public Object contains(Object o){
		return this.getNode(o).self;
	}
	
	@Override
	public Object get(int index){
		return this.getNodeAt(index).self;
	}

	@Override
	public int indexOf(Object o) {
		Node curr = head;
		int indx = 0;
		while(curr != end){
			if(curr.self.equals(o)){
				return indx;
			}else{
				indx++;
				curr = curr.next();
			}
		}
		return -1;
	}

	@Override
	public boolean isEmpty() {
		if(head.next() == end){
			return true;
		}else{
			return false;
		}

	}

	@Override
	public void remove(int index) {
		Node nd = this.getNodeAt(index);
		Node prev = this.getNodeAt(index-1);
		if(nd != null){
			prev.setNext(nd.delete());
		}
	}

	@Override
	public void remove(Object o) {
		Node nd = this.getNode(o);
		Node prev = this.getNodeAt(this.indexOf(o));
		if(nd != null){
			prev.setNext(nd.delete());
		}
	}

	@Override
	public void set(int index, Object element) {
		Node nd = this.getNodeAt(index);
		
		if(nd != null){
			nd.self = element;
		}else{
			nd = this._add(element);
		}
		
	}

	@Override
	public int size() {
		return size;

	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		LinkedList tmpList = new LinkedList();
		Node curr = this.getNodeAt(fromIndex);
		
		for(int i = fromIndex; i <= toIndex && curr != end; i++){
			tmpList._add(curr.self);
			curr = curr.next();
		}
		
		return tmpList;
	}

	@Override
	public Object[] toArray() {
		Object[] listArray = new Object[size];
		
		Node curr = head;
		
		for(int i = 0; curr.next() != end; i++){
			curr = curr.next();
			listArray[i] = curr.self;
		}
		return listArray;
	}
	
	public void shift(int pos){
		
		pos = (0 + pos) % size;
		Node ndNewFirst = this.getNodeAt(pos);
		Node ndNewLast = this.getNodeAt(pos - 1);
		Node ndOldFirst = head.next();
		Node ndOldLast = this.getNodeAt(size);
		
		head.setNext(ndNewFirst);
		ndNewLast.setNext(end);
		ndOldLast.setNext(ndOldFirst);
		
	}
	
	
}
