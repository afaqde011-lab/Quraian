package android.support.v4.media;

import android.os.Bundle;
import android.support.v4.media.session.t;
import u.e;

public final class c {

    public final Bundle f487a;

    public c() {
        this.f487a = new Bundle();
    }

    public c(MediaMetadataCompat mediaMetadataCompat) {
        Bundle bundle = new Bundle(mediaMetadataCompat.A);
        this.f487a = bundle;
        t.a(bundle);
    }

    public final void a(String str, String str2) {
        e eVar = MediaMetadataCompat.D;
        if (eVar.containsKey(str) && ((Integer) eVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(a1.b.p("The ", str, " key cannot be used to put a String"));
        }
        this.f487a.putCharSequence(str, str2);
    }
}
