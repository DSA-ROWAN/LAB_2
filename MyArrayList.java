public class MyArrayList<T> extends List<T> {
	Object[] values;
	public MyArrayList() {
		values=new Object[10];
	}
	public MyArrayList(int size){
		values=new Object[size];
	}

	@Override
	public void add(int index, T o) {
		createBiggerArray();
		makeRoom(index);
		values[index]= o;
	}

	private void makeRoom(int index){
		for(int i=0; i<index;i++){
			
		}
	}
	
	@Override
	public void add(T o) {
		createBiggerArray();
		values[values.length-1]= o;
		
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean contains(T o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void removeAt(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(T o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(int index, Object element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void shift(int pos) {
		Object[]newValues=new Object[size];
		for(int i= 0; i<values.length; i++){
			newValues[(i+pos)%values.length]=values[i];
		}
	
		
	}
	
	private int getIndexOfFirstNull(){
		int counter=0;
		int temp=0;
		while(temp==0){
			if(values[counter]!=null){
				counter++;
			}
			else{
				temp=1;
			}
		}
		
		return counter;
		
	}
	private int getIndexOfFirstNull(int index){
		int counter=index;
		int temp=0;
		while(temp==0){
			if(values[counter]!=null){
				counter++;
			}
			else{
				temp=1;
			}
		}
		
		return counter;
		
	}

	private int getIndexOfFirstElement(){
		int counter=0;
		int temp=0;
		while(temp==0){
			if(values[counter]==null){
				counter++;
			}
			else{
				temp=1;
			}
		}
		
		return counter;
		
	}
	
	private void createBiggerArray(){
		Object[]newArray=new Object[size()+1];
		for(int i=0;i<values.length;i++){
			newArray[i]= values[i];
		}
		values=newArray;
		
	}

	@Override
	protected Node getNode(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Node getNodeAt(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Node _add(int index, Object o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Node _add(Object o) {
		// TODO Auto-generated method stub
		return null;
	}

}
