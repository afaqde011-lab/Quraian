package androidx.media3.common;

import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import k9.z3;

public final class k1 implements e7.m, k9.c1, e7.h, a5.p {
    public final int A;
    public final int B;
    public final Object C;

    public k1(int i10, fh.d2 d2Var, int i11) {
        this.A = i11;
        this.B = i10;
        this.C = d2Var;
    }

    public k1(int i10, z3 z3Var, Bundle bundle) {
        this.A = 4;
        this.B = i10;
        this.C = z3Var;
    }

    public k1(Object obj, int i10, int i11) {
        this.A = i11;
        this.C = obj;
        this.B = i10;
    }

    @Override
    public void accept(Object obj) {
        k9.q qVarB;
        k9.a2 a2Var = (k9.a2) this.C;
        int i10 = this.B;
        try {
            qVarB = (k9.q) ((kh.v) obj).get();
            ta.c0.w(qVarB, "LibraryResult must not be null");
        } catch (InterruptedException | ExecutionException e3) {
            e7.a.n("MediaSessionStub", "Library operation failed", e3);
            qVarB = k9.q.b(-1);
        } catch (CancellationException e10) {
            e7.a.n("MediaSessionStub", "Library operation cancelled", e10);
            qVarB = k9.q.b(1);
        }
        try {
            k9.z1 z1Var = a2Var.f9209d;
            z1Var.getClass();
            z1Var.j(i10, qVarB);
        } catch (RemoteException e11) {
            e7.a.n("MediaSessionStub", "Failed to send result to browser " + a2Var, e11);
        }
    }

    @Override
    public boolean b(View view) {
        ((SideSheetBehavior) this.C).v(this.B);
        return true;
    }

    @Override
    public void g(k9.t0 t0Var) {
        switch (this.A) {
            case 2:
                fh.t0 t0Var2 = (fh.t0) this.C;
                k9.u uVar = t0Var.f9438a;
                if (t0Var.isConnected()) {
                    fh.d2 d2Var = t0Var.f9456u;
                    fh.d2 d2Var2 = t0Var.f9457v;
                    t0Var.f9455t = fh.t0.o(t0Var2);
                    fh.d2 d2VarC = k9.t0.C(t0Var2, t0Var.f9454s, t0Var.f9458w, t0Var.f9461z, t0Var.J);
                    t0Var.f9456u = d2VarC;
                    t0Var.f9457v = k9.t0.B(d2VarC, t0Var.f9454s, t0Var.J, t0Var.f9458w, t0Var.f9461z);
                    boolean zEquals = t0Var.f9456u.equals(d2Var);
                    t0Var.f9457v.equals(d2Var2);
                    uVar.getClass();
                    ta.c0.A(Looper.myLooper() == uVar.f9523f.getLooper());
                    k9.s sVar = uVar.f9522e;
                    sVar.getClass();
                    kh.t tVarZ = k9.s.z();
                    if (!zEquals) {
                        sVar.o();
                    }
                    t0Var.F(this.B, tVarZ);
                    break;
                }
                break;
            case 3:
                List list = (List) this.C;
                k9.u uVar2 = t0Var.f9438a;
                if (t0Var.isConnected()) {
                    fh.d2 d2Var3 = t0Var.f9456u;
                    fh.d2 d2Var4 = t0Var.f9457v;
                    t0Var.f9454s = fh.t0.o(list);
                    fh.d2 d2VarC2 = k9.t0.C(t0Var.f9455t, list, t0Var.f9458w, t0Var.f9461z, t0Var.J);
                    t0Var.f9456u = d2VarC2;
                    t0Var.f9457v = k9.t0.B(d2VarC2, list, t0Var.J, t0Var.f9458w, t0Var.f9461z);
                    boolean zEquals2 = t0Var.f9456u.equals(d2Var3);
                    t0Var.f9457v.equals(d2Var4);
                    uVar2.getClass();
                    ta.c0.A(Looper.myLooper() == uVar2.f9523f.getLooper());
                    k9.s sVar2 = uVar2.f9522e;
                    sVar2.getClass();
                    kh.t tVarZ2 = k9.s.z();
                    if (!zEquals2) {
                        sVar2.o();
                    }
                    t0Var.F(this.B, tVarZ2);
                    break;
                }
                break;
            default:
                z3 z3Var = (z3) this.C;
                k9.u uVar3 = t0Var.f9438a;
                if (t0Var.isConnected()) {
                    uVar3.getClass();
                    ta.c0.A(Looper.myLooper() == uVar3.f9523f.getLooper());
                    t0Var.F(this.B, uVar3.f9522e.d(z3Var));
                    break;
                }
                break;
        }
    }

    @Override
    public void invoke(Object obj) {
        switch (this.A) {
            case 0:
                ((d1) obj).v(((b2) this.C).f1127z, this.B);
                break;
            default:
                ((d1) obj).v(((i7.c1) this.C).f7247a, this.B);
                break;
        }
    }
}
