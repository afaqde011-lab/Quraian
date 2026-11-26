package o9;

import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public final class z {

    public final r f11893a;

    public final int f11894b;

    public final boolean f11895c;

    public final b0 f11896d;

    public final b0 f11897e;

    public final b0 f11898f;

    public final ArrayList f11899g;

    public final WeakReference f11900h;

    public d4.k f11901i = null;

    public boolean f11902j = false;

    public boolean f11903k = false;

    public z(f fVar, b0 b0Var, r rVar, int i10, boolean z10, b0 b0Var2, Collection collection) {
        this.f11900h = new WeakReference(fVar);
        this.f11897e = b0Var;
        this.f11893a = rVar;
        this.f11894b = i10;
        this.f11895c = z10;
        this.f11896d = fVar.f11781d;
        this.f11898f = b0Var2;
        this.f11899g = collection != null ? new ArrayList(collection) : null;
        fVar.f11778a.postDelayed(new m9.f(this, 7), 15000L);
    }

    public final void a() {
        if (this.f11902j || this.f11903k) {
            return;
        }
        this.f11903k = true;
        r rVar = this.f11893a;
        if (rVar != null) {
            rVar.h(0);
            rVar.d();
        }
    }

    public final void b() {
        d4.k kVar;
        x xVarA;
        c0.b();
        if (this.f11902j || this.f11903k) {
            return;
        }
        WeakReference weakReference = this.f11900h;
        f fVar = (f) weakReference.get();
        if (fVar == null || fVar.f11784g != this || ((kVar = this.f11901i) != null && kVar.isCancelled())) {
            a();
            return;
        }
        this.f11902j = true;
        fVar.f11784g = null;
        f fVar2 = (f) weakReference.get();
        b0 b0Var = this.f11896d;
        int i10 = this.f11894b;
        if (fVar2 != null) {
            HashMap map = fVar2.f11779b;
            if (fVar2.f11781d == b0Var) {
                Message messageObtainMessage = fVar2.f11778a.obtainMessage(263, b0Var);
                messageObtainMessage.arg1 = i10;
                messageObtainMessage.sendToTarget();
                r rVar = fVar2.f11782e;
                if (rVar != null) {
                    rVar.h(i10);
                    fVar2.f11782e.d();
                }
                if (!map.isEmpty()) {
                    for (r rVar2 : map.values()) {
                        rVar2.h(i10);
                        rVar2.d();
                    }
                    map.clear();
                }
                fVar2.f11782e = null;
            }
        }
        f fVar3 = (f) weakReference.get();
        if (fVar3 == null) {
            return;
        }
        b bVar = fVar3.f11778a;
        b0 b0Var2 = this.f11897e;
        fVar3.f11781d = b0Var2;
        fVar3.f11782e = this.f11893a;
        boolean z10 = this.f11895c;
        b0 b0Var3 = this.f11898f;
        if (b0Var3 == null) {
            bVar.getClass();
            Message messageObtainMessage2 = bVar.obtainMessage(262, new e(b0Var, b0Var2, z10));
            messageObtainMessage2.arg1 = i10;
            messageObtainMessage2.sendToTarget();
        } else {
            bVar.getClass();
            Message messageObtainMessage3 = bVar.obtainMessage(264, new e(b0Var3, b0Var2, z10));
            messageObtainMessage3.arg1 = i10;
            messageObtainMessage3.sendToTarget();
        }
        fVar3.f11779b.clear();
        fVar3.j();
        fVar3.o();
        ArrayList arrayList = this.f11899g;
        if (arrayList == null || (xVarA = fVar3.f11781d.a()) == null) {
            return;
        }
        xVarA.p(arrayList);
    }
}
