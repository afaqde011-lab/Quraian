package y1;

import android.app.PendingIntent;
import l1.y1;
import q0.f2;
import sd.p1;
import z1.n;

public final class b implements y1 {
    public j A;
    public f B;
    public String C;
    public Object D;
    public Object[] E;
    public e F;
    public final f2 G = new f2(this, 21);

    public b(j jVar, f fVar, String str, Object obj, Object[] objArr) {
        this.A = jVar;
        this.B = fVar;
        this.C = str;
        this.D = obj;
        this.E = objArr;
    }

    public final void a() throws PendingIntent.CanceledException {
        String strA;
        f fVar = this.B;
        if (this.F != null) {
            throw new IllegalArgumentException(("entry(" + this.F + ") is not null").toString());
        }
        if (fVar != null) {
            f2 f2Var = this.G;
            Object objInvoke = f2Var.invoke();
            if (objInvoke == null || fVar.a(objInvoke)) {
                this.F = fVar.d(this.C, f2Var);
                return;
            }
            if (objInvoke instanceof n) {
                n nVar = (n) objInvoke;
                if (nVar.d() == l1.c.D || nVar.d() == l1.c.G || nVar.d() == l1.c.E) {
                    strA = "MutableState containing " + nVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strA = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strA = k.a(objInvoke);
            }
            throw new IllegalArgumentException(strA);
        }
    }

    @Override
    public final void b() {
        e eVar = this.F;
        if (eVar != null) {
            ((p1) eVar).L();
        }
    }

    @Override
    public final void c() {
        e eVar = this.F;
        if (eVar != null) {
            ((p1) eVar).L();
        }
    }

    @Override
    public final void d() throws PendingIntent.CanceledException {
        a();
    }
}
