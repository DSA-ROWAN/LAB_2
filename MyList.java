public interface MyList<T> {
	
	public void add(int index, T o);
	public void add(T o);
	public void clear();
	public boolean contains(T o);
	public T get(int index);
	public int indexOf(T o);
	public boolean isEmpty();
	public void removeAt(int index);
	public boolean remove(T o);
	public void set(int index, T element);
	public List<T> subList(int fromIndex, int toIndex);
	public Object[] toArray();
	public void shift(int pos);
}
