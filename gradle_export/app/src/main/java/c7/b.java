package c7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.lifecycle.i0;
import e7.d0;
import i7.v;

public final class b extends BroadcastReceiver {

    public final v f2892a;

    public final d0 f2893b;

    public final c f2894c;

    public b(c cVar, d0 d0Var, v vVar) {
        this.f2894c = cVar;
        this.f2893b = d0Var;
        this.f2892a = vVar;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f2893b.d(new i0(this, 4));
        }
    }
}
