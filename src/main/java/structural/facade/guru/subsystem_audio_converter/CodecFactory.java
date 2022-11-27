package structural.facade.guru.subsystem_audio_converter;

public class CodecFactory {

    public static final String MP4 = "mp4";

    public static Codec extract(VideoFile file) {
        String type = file.getCodecType();
        if (type.equals(MP4)) {
            System.out.println("CodecFactory: extracting mpeg audio...");
            return new MPEG4CompressionCodec();
        } else {
            System.out.println("CodecFactory: extracting ogg audio...");
            return new OggCompressionCodec();
        }
    }
}
