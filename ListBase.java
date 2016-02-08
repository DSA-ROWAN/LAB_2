abstract class ListBase<T> {
	
	int size = 0;
	public int size(){
		return size;
	}

	public void swap(int postion1, int position2) {
		if((postion1 < 1 || postion1 > size) || (position2 < 1 || position2 > size)){
			throw new IndexOutOfBoundsException();
		}else{
			Node<T> nd1 = this.getNodeAt(postion1);
			Node<T> nd2 = this.getNodeAt(position2);
			
			T tmp1 = (T)nd1.self;
			nd1.self = nd2.self;
			nd2.self = tmp1;
		}
	}
	
	abstract public  void add(int index, T o);
	abstract public  void add(T o);
	abstract public void clear();
	abstract public boolean contains(T o);
	abstract public T get(int index);
	abstract public int indexOf(T o);
	abstract public boolean isEmpty();
	abstract public void removeAt(int index);
	abstract public void remove(T o);
	abstract public void set(int index, T element);
	abstract public List<T> subList(int fromIndex, int toIndex);
	abstract public T[] toArray();
	abstract public void shift(int pos);
	
	protected abstract Node<T> getNode(T o);
	protected abstract Node<T> getNodeAt(int index);
	protected abstract Node<T> _add(int index, T o);
	protected abstract Node<T> _add(T o);
	
}
