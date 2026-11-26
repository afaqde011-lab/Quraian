package ku;

import android.content.Context;
import androidx.media3.common.d;
import i7.l;
import i7.z;

public final class a {
    public final z a;
    public final z b;
    public boolean c;
    public boolean d;

    public a(Context context) {
        z zVarA = new l(context).a();
        zVarA.setAudioAttributes(new d(4, 0, 1, 1, 0, false, true), false);
        zVarA.setRepeatMode(1);
        zVarA.setVolume(0.0f);
        this.a = zVarA;
        z zVarA2 = new l(context).a();
        zVarA2.setAudioAttributes(new d(2, 0, 1, 1, 0, false, true), true);
        zVarA2.setRepeatMode(1);
        this.b = zVarA2;
    }
}
