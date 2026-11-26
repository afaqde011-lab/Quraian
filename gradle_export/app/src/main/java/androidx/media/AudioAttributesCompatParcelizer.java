package androidx.media;

import va.b;
import va.d;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(b bVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        d dVarH = audioAttributesCompat.f1032a;
        if (bVar.e(1)) {
            dVarH = bVar.h();
        }
        audioAttributesCompat.f1032a = (AudioAttributesImpl) dVarH;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, b bVar) {
        bVar.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f1032a;
        bVar.i(1);
        bVar.l(audioAttributesImpl);
    }
}
