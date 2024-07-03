package org.entropy.lib;

import org.entropy.lib.constant.CodecEnum;

public class Video {
    private CodecEnum codec;

    private String audio;

    private String caption;

    public Video(CodecEnum codec) {
        this.codec = codec;
    }

    public CodecEnum getCodec() {
        return codec;
    }

    public void setCodec(CodecEnum codec) {
        this.codec = codec;
    }

    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }
}
