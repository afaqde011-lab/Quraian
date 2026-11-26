package y7;

import android.content.Context;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.gms.internal.play_billing.q1;
import e7.d0;
import fh.d2;
import fh.r0;
import fh.t0;
import java.util.concurrent.CopyOnWriteArraySet;

public final class p {

    public final Context f16710a;

    public final n f16711b;

    public final SparseArray f16712c;

    public final boolean f16713d;

    public final c f16714e;

    public final e7.b0 f16715f;

    public final CopyOnWriteArraySet f16716g;

    public final long f16717h;

    public final v f16718i;

    public q1 f16719j = new q1();

    public d0 f16720k;
    public Pair l;
    public int m;

    public int f16721n;

    public long f16722o;

    public boolean f16723p;

    public int f16724q;

    public p(k kVar) {
        this.f16710a = kVar.f16695a;
        n nVar = kVar.f16697c;
        nVar.getClass();
        this.f16711b = nVar;
        this.f16712c = new SparseArray();
        r0 r0Var = t0.B;
        d2 d2Var = d2.E;
        this.f16713d = kVar.f16698d;
        e7.b0 b0Var = kVar.f16699e;
        this.f16715f = b0Var;
        long j9 = kVar.f16701g;
        this.f16717h = j9 != -9223372036854775807L ? -j9 : -9223372036854775807L;
        v vVar = kVar.f16702h;
        this.f16718i = vVar;
        this.f16714e = new c(kVar.f16696b, vVar, b0Var);
        this.f16716g = new CopyOnWriteArraySet();
        new androidx.media3.common.s().a();
        this.f16722o = -9223372036854775807L;
        this.f16724q = -1;
        this.f16721n = 0;
    }
}
