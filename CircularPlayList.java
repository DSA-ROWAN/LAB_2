public class CircularPlayList extends PlayList {
	String playListName = "";
	CircularLinkedList<Song> plyList = new CircularLinkedList<Song>();
	
	public CircularPlayList(String name) {
		playListName = name;
	}
	
	public String playListName(){
		return playListName;
	}
	
	public void addSong(Song s){
		if(!plyList.contains(s)){
			plyList.add(s);
		}
	}
	
	public void addSongAt(Song s, int index){
		if(!plyList.contains(s)){
			plyList.add(index, s);
		}
	}
	
	public Song getSongAt(int index){
		return plyList.get(index);
	}
	
	public List<Song> getList(){
		return plyList;
	}
	
	public boolean removeSong(Song s){
		return plyList.remove(s);
	}
	
	public int totalSongs(){
		return plyList.size();
	}
	
	public double playListTime(){
		double totalTime = 0;
		for(int i = 1; i <= plyList.size(); i++){
			totalTime += plyList.get(i).getPlaytime();
		}
		return totalTime;
	}
	
	public boolean isSongInPlayList(String songName, String artist){
		for(int i = 1; i <= plyList.size(); i++){
			Song s = plyList.get(i);
			if(artist.equals(s.getArtist()) && songName.equals(s.getSongName()) ){
				return true;
			}
		}
		return false;
	}
	
	public void songsbyArtist(String artistName){
		for(int i = 1; i <= plyList.size(); i++){
			Song s = plyList.get(i);
			if(artistName.equals(s.getArtist())){
				System.out.println(s.toString());
			}
		}
	}
	
	public boolean addSongsFrom(LinkedPlayList p){
		for(int i = 1; i <= p.totalSongs(); i++){
			Song s = p.getSongAt(i);
			plyList.add(s);
		}
		return true;
	}
	
	public void MoveSong(Song s, int p) throws Exception{
		if(plyList.contains(s)){
			plyList.removeAt(plyList.indexOf(s));
			this.addSongAt(s, p);
		}else{
			throw new Exception("Song not Found");
		}
	}
	
	public void MoveAllSongs(int p){
		plyList.shift(p);		
	}
}
