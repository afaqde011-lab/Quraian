package androidx.media;

import android.media.AudioAttributes;
import va.b;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(b bVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f1033a = (AudioAttributes) bVar.g(audioAttributesImplApi21.f1033a, 1);
        audioAttributesImplApi21.f1034b = bVar.f(audioAttributesImplApi21.f1034b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, b bVar) {
        bVar.getClass();
        bVar.k(audioAttributesImplApi21.f1033a, 1);
        bVar.j(audioAttributesImplApi21.f1034b, 2);
    }
}
