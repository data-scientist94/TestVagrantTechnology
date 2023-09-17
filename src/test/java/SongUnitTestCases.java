import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Queue;

public class SongUnitTestCases {

    PlaylistPerUser playlistPerUser = new PlaylistPerUser();
    @Test
    public void checkUserInputShouldNotBeEmpty(){
        playlistPerUser.main();
        Assert.assertFalse(playlistPerUser.userPlaySongInput[0].isEmpty());
    }

    @Test
    public void checkAddUserAndPlayList(){
        playlistPerUser.addUserAndPlayList.user_song.values();
        playlistPerUser.main();

        //Checking values
        for(Queue<String> songList : playlistPerUser.addUserAndPlayList.user_song.values()){
            for(String song : songList){
                Assert.assertFalse(song.isEmpty());
                Assert.assertTrue(song.length()>0);
            }
        }
        //Checking KeyValueSet
        for(String userId : playlistPerUser.addUserAndPlayList.user_song.keySet()){
                Assert.assertFalse(userId.isEmpty());
                Assert.assertTrue(userId.length()>0);
        }
    }


    @Test
    public void checkReturnTypeOfTheFunctionaddUserAndSongs(){
        Assert.assertFalse(playlistPerUser.addUserAndPlayList.addUserAndSongs().entrySet().isEmpty());
    }
}
