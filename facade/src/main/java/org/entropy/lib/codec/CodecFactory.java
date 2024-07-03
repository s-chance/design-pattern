package org.entropy.lib.codec;

import org.entropy.lib.constant.CodecEnum;

public class CodecFactory {
    public static Codec extract(CodecEnum codec) {
        return switch (codec) {
            case AVI -> () -> System.out.println("extract codec: " + CodecEnum.AVI);
            case MPEG4 -> () -> System.out.println("extract codec: " + CodecEnum.MPEG4);
        };
    }
}
