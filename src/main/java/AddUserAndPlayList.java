import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class AddUserAndPlayList implements  MaxPlayList, MaxNumberOfUserSupported{

    static LinkedHashMap<String, Queue<String>> user_song = new LinkedHashMap<String, Queue<String>>(){
        @Override
        protected boolean removeEldestEntry(Map.Entry<String, Queue<String>> eldestSong)
        {
            return this.size() > maxSongsThatCanBeStored;
        }
    };

    /**
     * Adding sample/test data of user and songs
     * @return
     */
    protected static LinkedHashMap<String, Queue<String>> addUserAndSongs() {
        Queue<String> songsList = new LinkedList<>();
        for (int userIndex = 0; userIndex < maxNoOfUserSupported; userIndex++) {
            for (int songIndex = 0; songIndex < maxSongsThatCanBeStored; songIndex++) {
                if(songsList.contains("song" + songIndex)){
                    //DO NOTHING
                }else{ songsList.add("song" + songIndex); }
            }
            user_song.put("UserId"+userIndex, songsList);
        }
        return user_song;
    }
}
