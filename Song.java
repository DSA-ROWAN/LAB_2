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
	private String getPlaytimeString(){String time;
	int sec=0, min=0, hour=0;
	float temp=playtime;
	for(int i=0;i<temp;i++){
		sec++;
		if(sec>=60){
			min++;
			sec=0;
		}
		if(min>=60){
			hour++;
			min=0;
		}
	}
	if(hour>=1){
		time=hour+":"+min+":"+sec;
	}
	else{
		time=min+":"+sec;
	}
	return time;
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
