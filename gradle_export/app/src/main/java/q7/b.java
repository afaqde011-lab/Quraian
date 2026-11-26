package q7;

import a10.h0;
import ab.r;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.s0;
import androidx.media3.common.t;
import androidx.media3.common.t0;
import androidx.media3.common.u0;
import androidx.media3.common.v0;
import e7.i0;
import e7.p;
import i7.v;
import i7.z;
import java.util.ArrayList;
import s7.a0;
import ta.c0;

public final class b extends i7.a implements Handler.Callback {
    public final a S;
    public final v T;
    public final Handler U;
    public final j8.a V;
    public h0 W;
    public boolean X;
    public boolean Y;
    public long Z;

    public v0 f12774a0;

    public long f12775b0;

    public b(v vVar, Looper looper) {
        Handler handler;
        super(5);
        this.T = vVar;
        if (looper == null) {
            handler = null;
        } else {
            String str = i0.f5136a;
            handler = new Handler(looper, this);
        }
        this.U = handler;
        this.S = a.f12773a;
        this.V = new j8.a(1);
        this.f12775b0 = -9223372036854775807L;
    }

    @Override
    public final int B(t tVar) {
        if (this.S.b(tVar)) {
            return i7.a.c(tVar.O == 0 ? 4 : 2, 0, 0, 0);
        }
        return i7.a.c(0, 0, 0, 0);
    }

    public final void E(v0 v0Var, ArrayList arrayList) {
        int i10 = 0;
        while (true) {
            u0[] u0VarArr = v0Var.f1660a;
            if (i10 >= u0VarArr.length) {
                return;
            }
            t tVarA = u0VarArr[i10].a();
            if (tVarA != null) {
                a aVar = this.S;
                if (aVar.b(tVarA)) {
                    h0 h0VarA = aVar.a(tVarA);
                    byte[] bArrC = u0VarArr[i10].c();
                    bArrC.getClass();
                    j8.a aVar2 = this.V;
                    aVar2.q();
                    aVar2.s(bArrC.length);
                    aVar2.E.put(bArrC);
                    aVar2.t();
                    v0 v0VarS = h0VarA.s(aVar2);
                    if (v0VarS != null) {
                        E(v0VarS, arrayList);
                    }
                } else {
                    arrayList.add(u0VarArr[i10]);
                }
            } else {
                arrayList.add(u0VarArr[i10]);
            }
            i10++;
        }
    }

    public final long F(long j9) {
        c0.A(j9 != -9223372036854775807L);
        c0.A(this.f12775b0 != -9223372036854775807L);
        return j9 - this.f12775b0;
    }

    public final void G(v0 v0Var) {
        v vVar = this.T;
        z zVar = vVar.A;
        t0 t0Var = zVar.f7500r0;
        p pVar = zVar.m;
        s0 s0VarA = t0Var.a();
        int i10 = 0;
        while (true) {
            u0[] u0VarArr = v0Var.f1660a;
            if (i10 >= u0VarArr.length) {
                break;
            }
            u0VarArr[i10].b(s0VarA);
            i10++;
        }
        zVar.f7500r0 = new t0(s0VarA);
        t0 t0VarD = zVar.d();
        if (!t0VarD.equals(zVar.T)) {
            zVar.T = t0VarD;
            pVar.c(14, new r(vVar, 25));
        }
        pVar.c(28, new r(v0Var, 26));
        pVar.b();
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        G((v0) message.obj);
        return true;
    }

    @Override
    public final String i() {
        return "MetadataRenderer";
    }

    @Override
    public final boolean k() {
        return this.Y;
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void n() {
        this.f12774a0 = null;
        this.W = null;
        this.f12775b0 = -9223372036854775807L;
    }

    @Override
    public final void p(long j9, boolean z10, boolean z11) {
        this.f12774a0 = null;
        this.X = false;
        this.Y = false;
    }

    @Override
    public final void u(t[] tVarArr, long j9, long j10, a0 a0Var) {
        this.W = this.S.a(tVarArr[0]);
        v0 v0Var = this.f12774a0;
        if (v0Var != null) {
            long j11 = v0Var.f1661b;
            long j12 = (this.f12775b0 + j11) - j10;
            if (j11 != j12) {
                v0Var = new v0(j12, v0Var.f1660a);
            }
            this.f12774a0 = v0Var;
        }
        this.f12775b0 = j10;
    }

    @Override
    public final void x(long j9, long j10) {
        boolean z10 = true;
        while (z10) {
            if (!this.X && this.f12774a0 == null) {
                j8.a aVar = this.V;
                aVar.q();
                h7.b bVar = this.C;
                bVar.m();
                int iW = w(bVar, aVar, 0);
                if (iW == -4) {
                    if (aVar.c(4)) {
                        this.X = true;
                    } else if (aVar.G >= this.L) {
                        aVar.J = this.Z;
                        aVar.t();
                        h0 h0Var = this.W;
                        String str = i0.f5136a;
                        v0 v0VarS = h0Var.s(aVar);
                        if (v0VarS != null) {
                            ArrayList arrayList = new ArrayList(v0VarS.f1660a.length);
                            E(v0VarS, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f12774a0 = new v0(F(aVar.G), (u0[]) arrayList.toArray(new u0[0]));
                            }
                        }
                    }
                } else if (iW == -5) {
                    t tVar = (t) bVar.B;
                    tVar.getClass();
                    this.Z = tVar.f1599s;
                }
            }
            v0 v0Var = this.f12774a0;
            if (v0Var == null || v0Var.f1661b > F(j9)) {
                z10 = false;
            } else {
                v0 v0Var2 = this.f12774a0;
                Handler handler = this.U;
                if (handler != null) {
                    handler.obtainMessage(1, v0Var2).sendToTarget();
                } else {
                    G(v0Var2);
                }
                this.f12774a0 = null;
                z10 = true;
            }
            if (this.X && this.f12774a0 == null) {
                this.Y = true;
            }
        }
    }
}
