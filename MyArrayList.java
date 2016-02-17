public class MyArrayList<T> extends List<T> {
	Object[] values;
	public MyArrayList() {
		values=new Object[10];
	}
	public MyArrayList(int size){
		values=new Object[size];
	}

	protected  Node<T> getNodeAt(int index){
		return new Node<T>((T)values[index - 1]);
	}
	
	@Override
	public void add(int index, T o) {
		createBiggerArray();
		makeRoom(index);
		values[index]= o;
	}

	private void createBiggerArray(){
		Object[]newArray=new Object[size()+1];
		for(int i=0;i<values.length;i++){
			newArray[i]= values[i];
		}
		values=newArray;
		
	}
	
	private void makeRoom(int index){
		for(int i=values.length-1; i>=index;i--){
			values[i]=values[i+1]; 
		}
	}
	
	@Override
	public void add(T o) {
		createBiggerArray();
		values[values.length-1]= o;
		
	}

	@Override
	public void clear() {
		Object[]newArray=new Object[0];
		values=newArray;
		
	}

	@Override
	public boolean contains(T o) {
		for(int i=0;i<values.length;i++){
			Object temp=values[i];
			if(temp.equals(o)){
				return true;
			}
		}
		return false;
	}

	@Override
	public T get(int index) {
		try{
		T temp=(T) values[index];
		return temp;
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("ERROR, Index "+index+" does not exist in this list!");
			return null;
		}
	}

	@Override
	public int indexOf(T o) {
		for(int i=0;i<values.length;i++){
			T temp=(T)values[i];
			if(temp.equals(o)){
				return i;
			}
		}
		System.err.println("ERROR, Object does not exist in this list!");
		return -1;
	}

	@Override
	public boolean isEmpty() {
		if(values.length==0){
			return true;
		}
		return false;
	}

	private void removeNull(int index){
		if(index!=-1){
			Object[]newArray=new Object[size()-1];
			int counter=0;
			for(int i=0;i<values.length;i++){
				if(i==index){
					//skip this value
				}
				else{
				newArray[counter]= values[i];
				counter++;
				}
			}
			values=newArray;
		}//else: do nothing
		
	}
	
	@Override
	public void removeAt(int index) {
		values[index]=null;
		removeNull(index);
	}

	@Override

	public boolean remove(T o) {
		int index=indexOf(o);
		removeAt(index);
		return true;
	}

	@Override
	public void set(int index, Object element) {
		try{
			if(element!=null){
				values[index]=element;
			}else{
				System.err.println("Object cannot be null!");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("ERROR, Index "+index+" does not exist");
		}
		
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		List<T> sublist=new LinkedList<T>();
		for(int i=fromIndex;i<toIndex;i++){
			sublist.add((T) values[i]);
		}
		return sublist;
	}

	@Override
	public Object[] toArray() {
		return values;
	}

	@Override
	public void shift(int pos) {
		Object[]newValues=new Object[size];
		for(int i= 0; i<values.length; i++){
			newValues[(i+pos)%values.length]=values[i];
		}
	
		
	}

}
