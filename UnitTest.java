public class UnitTest {

	public static void main(String[] args) throws Exception{
		LinkedList<Integer> lst = new LinkedList<Integer>();
		
		System.out.print("Testing add(object) to end of Linked List: ");
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		lst.add(7);
		lst.add(8);
		lst.add(9);
		lst.add(10);
		
		for(int i = 1; i <= lst.size(); i++){
			assert i == lst.get(i);
		}
		System.out.println("PASS");
		
		
		System.out.print("Testing get(index) out of bounds Exception: ");
		try{
			
			for(int i = 1; i < lst.size() + 10; i++){
				assert i == lst.get(i);
			}
			System.out.println("FAIL");
			throw new Exception("Should be null pointer exception");
			
		}catch(IndexOutOfBoundsException except){
			try{
				assert 10 == lst.get(-1);
			}catch(Exception excpt){
				System.out.println("PASS");
			}
		}
		
		
		System.out.print("Testing add(index, T t) at arbitraty index: ");
		lst.add(6, 12);
		lst.add(6, 21);
		lst.add(lst.size(), 31);
		
		assert 31 == lst.get(lst.size() - 1);
		assert 21 == lst.get(6);
		assert 12 == lst.get(7);
		System.out.println("PASS");
		
		
		System.out.print("Testing Add(index) out of bounds Exception: ");
		try{
			lst.add(100, 100);
			System.out.println("FAIL");
		}catch(IndexOutOfBoundsException excpt){
			System.out.println("PASS");
		}
		
		
		System.out.print("Testing clear() and isEmpty(): ");
		lst.clear();
		if(lst.isEmpty()){
			System.out.println("PASS");
		}else{
			System.out.println("FAIL");
		}
		
		
		System.out.print("Adding Values Back after clear(): ");
		lst.add(11);
		lst.add(12);
		lst.add(13);
		lst.add(14);
		lst.add(15);
		lst.add(16);
		lst.add(17);
		lst.add(18);
		lst.add(19);
		lst.add(20);
		
		for(int i = 1; i <= lst.size(); i++){
			assert i+10 == lst.get(i);
		}
		System.out.println("PASS");
		
		
		System.out.print("Testing contains(): ");
		assert lst.contains(21) == false;
		assert lst.contains(10) == false;
		System.out.println("PASS");
		
		
		System.out.print("Testing indexOf(): ");
		assert lst.indexOf(20) == 10;
		assert lst.indexOf(1) == -1;
		System.out.println("PASS");
		
		
		System.out.print("Testing remove(index): ");
		assert lst.indexOf(20) == 10;
		assert lst.size() == 10; 
		lst.removeAt(10);
		assert lst.size() == 9;
		assert lst.contains(20) == false;
		
		assert lst.indexOf(15) == 5;
		assert lst.size() == 9; 
		lst.removeAt(5);
		assert lst.size() == 8;
		assert lst.contains(15) == false;
		
		assert lst.indexOf(11) == 1;
		assert lst.size() == 8; 
		lst.removeAt(1);
		assert lst.size() == 7;
		assert lst.contains(11) == false;
		System.out.println("PASS");
		
		
		System.out.print("Testing remove(Object): ");
		assert lst.contains(12) == true;
		assert lst.size() == 7; 
		lst.remove(12);
		assert lst.size() == 6;
		assert lst.contains(12) == false;	
		
		assert lst.contains(16) == true;
		assert lst.size() == 6; 
		lst.remove(16);
		assert lst.size() == 5;
		assert lst.contains(16) == false;
		
		assert lst.contains(19) == true;
		assert lst.size() == 5; 
		lst.remove(19);
		assert lst.size() == 4;
		assert lst.contains(19) == false;
		System.out.println("PASS");
		
		
		System.out.print("Testing set(): ");
		assert lst.get(4) == 18;
		lst.set(4, 1234);
		assert lst.contains(1234);
		assert lst.indexOf(1234) == 4;
		System.out.println("PASS");
	}
}
