
abstract public class PlayList {

	abstract public String playListName();
	abstract public void addSong(Song s);
	abstract public void addSongAt(Song s, int index);
	abstract public Song getSongAt(int index);
	abstract public List<Song> getList();
	abstract public boolean removeSong(Song s);
	abstract public int totalSongs();
	abstract double playListTime();
	abstract public boolean isSongInPlayList(String songName, String artist);
	abstract public void songsbyArtist(String artistName);
	abstract public boolean addSongsFrom(LinkedPlayList p);
	abstract public void MoveSong(Song s, int p) throws Exception;
	abstract public void MoveAllSongs(int p);


}
