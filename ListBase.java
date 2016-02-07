abstract class ListBase {
	
	int size = 0;
	public int size(){
		return size;
	}

	public void swap(int postion1, int position2) {
		Node nd1 = this.getNodeAt(postion1);
		Node nd2 = this.getNodeAt(position2);
		
		Object tmp1 = nd1.self;
		nd1.self = nd2.self;
		nd2.self = tmp1;
	}
	
	abstract public  void add(int index, Object o);
	abstract public  void add(Object o);
	abstract public void clear();
	abstract public Object contains(Object o);
	abstract public Object get(int index);
	abstract public int indexOf(Object o);
	abstract public boolean isEmpty();
	abstract public void remove(int index);
	abstract public void remove(Object o);
	abstract public void set(int index, Object element);
	abstract public List subList(int fromIndex, int toIndex);
	abstract public Object[] toArray();
	abstract public void shift(int pos);
	
	protected abstract Node getNode(Object o);
	protected abstract Node getNodeAt(int index);
	protected abstract Node _add(int index, Object o);
	protected abstract Node _add(Object o);
	
}
