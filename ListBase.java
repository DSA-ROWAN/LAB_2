package LAB_2;
abstract class ListBase {
	abstract public void add(int index, Object o);
	abstract public void add(Object o);
	abstract public void clear();
	abstract public void contains(Object o);
	abstract public void get(int index);
	abstract public void indexOf(Object o);
	abstract public void isEmpty();
	abstract public void remove(int index);
	abstract public void remove(Object o);
	abstract public void set(int index, Object element);
	abstract public void size();
	abstract public void subList(int fromIndex, int toIndex);
	abstract public void toArray();
	abstract public void swap(int postion1, int position2);
	abstract public void shift(int pos);
}
