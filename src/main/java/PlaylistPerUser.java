import java.util.*;

public class PlaylistPerUser implements  MaxRecentlyPlayList, MaxPlayList{

    public static String[] userPlaySongInput = new String[maxSongsThatCanBeStored];
    static AddUserAndPlayList addUserAndPlayList = new AddUserAndPlayList();

    public static void main(String ...args){

        LinkedHashMap<String, String> recentSongWithUser = new LinkedHashMap<String, String>()
        {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, String> eldest)
            {
                return this.size() > maxRecentlyPlayed;
            }
        };



        //User input
        //Here I have selected a user and played some songs
        String User = "UserId0";
        userPlaySongInput[0] = "song0";
        userPlaySongInput[1] = "song1";
        userPlaySongInput[2] = "song3";
        userPlaySongInput[3] = "song3";
        userPlaySongInput[4] = "song5";
        userPlaySongInput[5] = "song5";



        for(int i =0; i<=addUserAndPlayList.addUserAndSongs().size();i++){
            if(addUserAndPlayList.addUserAndSongs().containsKey(User)){
               for(Object item : addUserAndPlayList.addUserAndSongs().get(User)){
                   for(int j =0; j<userPlaySongInput.length; j++){
                       if(item.toString().trim().equalsIgnoreCase(userPlaySongInput[j])){
                           recentSongWithUser.put(item.toString(), User);
                       }
                   }
               }
                break;
            }
        }
        //Expected output.
        System.out.println(recentSongWithUser.keySet());
    }
}
