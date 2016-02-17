import java.util.Random;
public class PlayListTests {

	
	private static PlayList generateRandomPlayList(PlayList lst){
		Random rand = new Random(1123581315);
		
		while(lst.totalSongs() < 1000000){
			lst.addSong(new Song(Integer.toString(rand.nextInt()), Integer.toString(rand.nextInt()), (rand.nextDouble() * 10)));
		}
		
		return lst;
	}
	
	private static void runTests(PlayList lst){
		generateRandomPlayList(lst);
		Random rand  = new Random(132357658);
		
		System.out.println("Starting Tests for " + lst.playListName());
		long runTime = System.nanoTime();
		System.out.println("Start Time " + runTime/1000000 + "ms");
		System.out.println();

		long testStartTime = System.nanoTime();
		
		for(int i = 0; i <= 500000; i++){
			int insert = rand.nextInt(lst.totalSongs() +1);
			insert = insert == 0 ? 1 : insert; 
			lst.addSongAt(new Song(Integer.toString(rand.nextInt()), Integer.toString(rand.nextInt()), (rand.nextDouble() * 10)), insert);
		}
		
		long endTime = System.nanoTime();
		long duration = (endTime - testStartTime)/1000000;
		System.out.println("Duration of insertion test " + duration + "ms");
		
		lst.getList().clear();
		generateRandomPlayList(lst);
		
		System.out.println();
		testStartTime = System.nanoTime();
		for(int i = 0; i <= 500000; i++){
			int insert = rand.nextInt(lst.totalSongs() +1);
			insert = insert == 0 ? 1 : insert; 
			Song s = lst.getSongAt(insert);
		}
		endTime = System.nanoTime();
		duration = (endTime - testStartTime)/1000000;
		System.out.println("Duration of retieval test " + duration + "ms");

		System.out.println();
		testStartTime = System.nanoTime();
		for(int i = 0; i <= 500000; i++){
			int from = rand.nextInt(lst.totalSongs() +1);
			from = from == 0 ? 1 : from;
			int to = rand.nextInt(lst.totalSongs() +1);
			to = to == 0 ? 1 : to;
			
			lst.getList().swap(from, to);
		}
		
		endTime = System.nanoTime();
		duration = (endTime - testStartTime)/1000000;
		System.out.println("Duration of swap test " + duration + "ms");

		System.out.println();
		testStartTime = System.nanoTime();
		for(int i = 0; i <= 500000; i++){
			int numPos = rand.nextInt(2000000) - 1000000;
			lst.getList().shift(numPos);
		}
		endTime = System.nanoTime();
		duration = (endTime - testStartTime)/1000000;
		System.out.println("Duration of shift test " + duration + "ms");
		System.out.println();
		
		System.out.println("End Time for " + lst.playListName() + " tests: " + endTime/1000000 + "ms");
		duration = (endTime - runTime)/1000000;
		System.out.println("Duration of tests for " + lst.playListName() + " " + duration + "ms");
		
		System.out.println("----------------------------------------------------------");
		
	}
	
	

	public static void main(String[] args) {
		PlayList ArrayPLaylist = new ArrayPlayList("ArrayPlayList");
		PlayList LinkedPlayList = new LinkedPlayList("LinkedPLayList");
		PlayList CircularPlayList = new CircularPlayList("CircularPlayList");
		
		runTests(CircularPlayList);
		runTests(LinkedPlayList);

	}

}
