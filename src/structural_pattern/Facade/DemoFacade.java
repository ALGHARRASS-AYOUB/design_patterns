package structural_pattern.Facade;

import java.io.File;

public class DemoFacade {

    public static void testDemoFacade() {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}
