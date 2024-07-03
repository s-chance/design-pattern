package org.entropy.lib;

import org.entropy.lib.codec.Codec;
import org.entropy.lib.codec.CodecFactory;
import org.entropy.lib.constant.CodecEnum;

public class VideoConversionFacade {
    public void conversion(Video video, CodecEnum target) {
        System.out.println("video conversion started");
        Codec codec = CodecFactory.extract(video.getCodec());
        codec.description();

        Codec targetCodec = () -> System.out.println("convert to " + target);
        targetCodec.description();

        new AudioMixer().addAudio(video);
        new CaptionMixer().addCaption(video);

        System.out.println("video conversion completed");
    }
}
