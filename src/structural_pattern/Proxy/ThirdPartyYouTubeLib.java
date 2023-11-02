package structural_pattern.Proxy;

import java.util.HashMap;

public interface ThirdPartyYouTubeLib {


    public HashMap<String, Video> popularVideos();
    public Video getVideo(String videoId);
}
