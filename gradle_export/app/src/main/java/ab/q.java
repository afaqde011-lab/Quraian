package ab;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import qd.s0;

public final class q extends rd.a {

    public static final String f401i = za.v.f("WorkContinuationImpl");

    public final y f402a;

    public final String f403b;

    public final za.l f404c;

    public final List f405d;

    public final ArrayList f406e;

    public final ArrayList f407f = new ArrayList();

    public boolean f408g;

    public za.b0 f409h;

    public q(y yVar, String str, za.l lVar, List list, int i10) {
        this.f402a = yVar;
        this.f403b = str;
        this.f404c = lVar;
        this.f405d = list;
        this.f406e = new ArrayList(list.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (lVar == za.l.A && ((za.k0) list.get(i11)).f17388b.f7022u != Long.MAX_VALUE) {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
            String string = ((za.k0) list.get(i11)).f17387a.toString();
            kotlin.jvm.internal.m.d(string, "toString(...)");
            this.f406e.add(string);
            this.f407f.add(string);
        }
    }

    public static HashSet o0(q qVar) {
        HashSet hashSet = new HashSet();
        qVar.getClass();
        return hashSet;
    }

    public final za.b0 n0() {
        if (this.f408g) {
            za.v.d().g(f401i, "Already enqueued work ids (" + TextUtils.join(", ", this.f406e) + ")");
        } else {
            y yVar = this.f402a;
            this.f409h = s0.k0(yVar.f419b.m, "EnqueueRunnable_" + this.f404c.name(), yVar.f421d.f8258a, new a1.z(this, 3));
        }
        return this.f409h;
    }
}
