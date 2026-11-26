package c7;

import android.media.AudioFocusRequest;
import android.os.Handler;
import java.util.Objects;

public final class h {

    public final int f2907a;

    public final d f2908b;

    public final Handler f2909c;

    public final androidx.media3.common.d f2910d;

    public final boolean f2911e;

    public final AudioFocusRequest f2912f;

    public h(int i10, d dVar, Handler handler, androidx.media3.common.d dVar2, boolean z10) {
        this.f2907a = i10;
        this.f2909c = handler;
        this.f2910d = dVar2;
        this.f2911e = z10;
        this.f2908b = dVar;
        this.f2912f = new AudioFocusRequest.Builder(i10).setAudioAttributes(dVar2.b()).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(dVar, handler).build();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f2907a == hVar.f2907a && this.f2911e == hVar.f2911e && equals(hVar.f2908b) && Objects.equals(this.f2909c, hVar.f2909c) && Objects.equals(this.f2910d, hVar.f2910d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f2907a), this.f2908b, this.f2909c, this.f2910d, Boolean.valueOf(this.f2911e));
    }
}
