package c2;

import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import b3.l0;
import c3.z;
import g2.a0;
import j3.o;
import j3.u;
import kotlin.KotlinNothingValueException;
import u.i0;
import u.x;

public final class c extends i implements g2.j {
    public final me.i A;
    public final u B;
    public final z C;
    public final k3.b D;
    public final String E;
    public final Rect F = new Rect();
    public final AutofillId G;
    public final x H;
    public boolean I;

    public c(me.i iVar, u uVar, z zVar, k3.b bVar, String str) throws KotlinNothingValueException {
        this.A = iVar;
        this.B = uVar;
        this.C = zVar;
        this.D = bVar;
        this.E = str;
        zVar.setImportantForAutofill(1);
        AutofillId autofillId = zVar.getAutofillId();
        if (autofillId == null) {
            throw a1.b.u("Required value was null.");
        }
        this.G = autofillId;
        this.H = new x();
    }

    @Override
    public final void b(a0 a0Var, a0 a0Var2) {
        l0 l0VarY;
        o oVarZ;
        l0 l0VarY2;
        o oVarZ2;
        if (a0Var != null && (l0VarY2 = b3.m.y(a0Var)) != null && (oVarZ2 = l0VarY2.z()) != null) {
            i0 i0Var = oVarZ2.A;
            if (i0Var.b(j3.n.f7946g) || i0Var.b(j3.n.f7947h)) {
                ((AutofillManager) this.A.B).notifyViewExited(this.C, l0VarY2.B);
            }
        }
        if (a0Var2 == null || (l0VarY = b3.m.y(a0Var2)) == null || (oVarZ = l0VarY.z()) == null) {
            return;
        }
        i0 i0Var2 = oVarZ.A;
        if (i0Var2.b(j3.n.f7946g) || i0Var2.b(j3.n.f7947h)) {
            int i10 = l0VarY.B;
            this.D.f8932b.F(i10, new a(this, i10));
        }
    }
}
