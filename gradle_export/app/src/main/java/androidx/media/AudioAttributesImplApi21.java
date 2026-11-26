package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    public AudioAttributes f1033a;

    public int f1034b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f1033a.equals(((AudioAttributesImplApi21) obj).f1033a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1033a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f1033a;
    }
}
