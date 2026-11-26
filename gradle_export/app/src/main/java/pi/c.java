package pi;

import android.os.Looper;
import androidx.media3.common.b1;
import androidx.media3.common.d1;
import c40.h;
import c40.n;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import g00.b0;
import h00.q;
import i7.z;
import java.util.Iterator;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.m;
import q0.n1;
import r30.k;
import z.g0;
import z0.g;

public final class c extends j implements u00.a {
    public final int A;

    public c(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.A = i12;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                ((d) ((kotlin.jvm.internal.c) this).receiver).getClass();
                String name = Thread.currentThread().getName();
                m.d(name, "<get-threadName>(...)");
                return Boolean.valueOf(k.A0(name, "Firebase Background Thread #", false));
            case 1:
                ((d) ((kotlin.jvm.internal.c) this).receiver).getClass();
                String name2 = Thread.currentThread().getName();
                m.d(name2, "<get-threadName>(...)");
                return Boolean.valueOf(k.A0(name2, "Firebase Blocking Thread #", false));
            case 2:
                ((d) ((kotlin.jvm.internal.c) this).receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
            case 3:
                ((gx.e) ((kotlin.jvm.internal.c) this).receiver).a();
                return b0.a;
            case 4:
                n1 n1Var = (n1) ((kotlin.jvm.internal.c) this).receiver;
                h hVar = n1Var.f12670e;
                b0 b0Var = b0.a;
                if (hVar.j(b0Var) instanceof n) {
                    n1Var.f12667b.Z0(-1);
                }
                return b0Var;
            case 5:
                z0.h.d((g) ((kotlin.jvm.internal.c) this).receiver);
                return b0.a;
            case 6:
                ((sy.c) ((kotlin.jvm.internal.c) this).receiver).a();
                return b0.a;
            case 7:
                ((go.a) ((kotlin.jvm.internal.c) this).receiver).l();
                return b0.a;
            case 8:
                ((go.a) ((kotlin.jvm.internal.c) this).receiver).w();
                return b0.a;
            case 9:
                no.n nVar = (go.a) ((kotlin.jvm.internal.c) this).receiver;
                nVar.t(((z) nVar.b.a()).getCurrentPosition() - NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS);
                return b0.a;
            case 10:
                ((go.a) ((kotlin.jvm.internal.c) this).receiver).l();
                return b0.a;
            case 11:
                ((go.a) ((kotlin.jvm.internal.c) this).receiver).w();
                return b0.a;
            case 12:
                tv.d dVar = (tv.d) ((kotlin.jvm.internal.c) this).receiver;
                b1 availableCommands = dVar.getAvailableCommands();
                Iterator it = q.n1(dVar.c).iterator();
                while (it.hasNext()) {
                    ((d1) it.next()).T(availableCommands);
                }
                return b0.a;
            case 13:
                return ((x0.e) ((kotlin.jvm.internal.c) this).receiver).i0();
            case 14:
                ((rr.b) ((kotlin.jvm.internal.c) this).receiver).a();
                return b0.a;
            default:
                return Boolean.valueOf(((g0) ((kotlin.jvm.internal.c) this).receiver).V.I1(7));
        }
    }
}
