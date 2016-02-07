public class Song {

	String name, artist;
	float playtime;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	private String getPlaytimeString(){
		return "getPlaytimeString needs to be changed";
	}
	public double getPlaytime() {
		return playtime;
	}
	public void setPlaytime(float playtime) {
		this.playtime = playtime;
	}
	public Song(String nameIn, String artistIn, float playtimeIn){
		setName(nameIn);
		setArtist(artistIn);
		setPlaytime(playtimeIn);
	}
	public String toString(){
		return getName()+", Artist: "+getArtist()+" , playtime: "+getPlaytimeString();
	}
	public boolean equals(Song s){
		boolean equals;
		equals=this.artist.equals(s.getArtist());
		equals&=this.name.equals(s.getName());
		equals&=this.playtime==(s.getPlaytime());
		return equals;
		
	}
}
