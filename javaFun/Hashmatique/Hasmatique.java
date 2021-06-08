import java.util.HashMap;
import java.util.Set;

public class Hasmatique{

    HashMap<String,String> trackList = new HashMap<String,String>();
    
    public void trackListMake(){
        trackList.put("Song1","Artist1");
        trackList.put("Song2","Artist2");
        trackList.put("Song3","Artist3");
        trackList.put("Song4","Artist4");
        System.out.println(trackList);
        
    }


    public void trackListIterate(){

        Set<String> tracks = trackList.keySet();
        for(String track : tracks){
            System.out.println(track);
            System.out.println(trackList.get(track));
        }
        
    }

    public String trackListGetOne(String str){
        return trackList.get(str);
    }
}   