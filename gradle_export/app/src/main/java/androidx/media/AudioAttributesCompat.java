package androidx.media;

import android.util.SparseIntArray;
import va.d;

public class AudioAttributesCompat implements d {

    public static final int f1031b = 0;

    public AudioAttributesImpl f1032a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f1032a;
        if (audioAttributesImpl == null) {
            return audioAttributesCompat.f1032a == null;
        }
        return audioAttributesImpl.equals(audioAttributesCompat.f1032a);
    }

    public final int hashCode() {
        return this.f1032a.hashCode();
    }

    public final String toString() {
        return this.f1032a.toString();
    }
}
