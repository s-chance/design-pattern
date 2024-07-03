package org.entropy;


import org.entropy.lib.Video;
import org.entropy.lib.VideoConversionFacade;
import org.entropy.lib.constant.CodecEnum;

public class Application {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        converter.conversion(new Video(CodecEnum.AVI), CodecEnum.MPEG4);
    }
}
