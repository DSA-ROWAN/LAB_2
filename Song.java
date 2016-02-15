public class Song {

	String name, artist, strPlaytime;
	double fltPlaytime;
	
	public Song(String _name, String _artist, double _playtime){
		name = _name;
		artist = _artist;
		fltPlaytime = _playtime;
		
        int minutes = (int) fltPlaytime;
        int seconds = (int) (60 * (fltPlaytime - minutes));
        strPlaytime = String.format("%d:%02d", minutes, seconds);
	}
	
	public String toString(){
		return "song: " + name +", artist: " + artist +", playtime: " + strPlaytime;
	}
	
	public double getPlaytime() {
		return fltPlaytime;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public String getSongName() {
		return name;
	}
	
	public boolean equals(Song s){
		boolean equals;
		equals=this.artist.equals(s.getArtist());
		equals&=this.name.equals(s.getSongName());
		equals&=this.fltPlaytime==(s.getPlaytime());
		return equals;
	}
}
