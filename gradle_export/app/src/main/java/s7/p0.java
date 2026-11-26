package s7;

import android.net.Uri;
import com.google.android.gms.internal.measurement.b5;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class p0 implements w7.j {
    public final Uri A;
    public final g7.r B;
    public final k9.x0 C;
    public final s0 D;
    public final e7.g E;
    public volatile boolean G;
    public long I;
    public g7.j J;
    public a8.l0 K;
    public boolean L;
    public final s0 M;
    public final a8.u F = new a8.u();
    public boolean H = true;

    public p0(s0 s0Var, Uri uri, g7.f fVar, k9.x0 x0Var, s0 s0Var2, e7.g gVar) {
        this.M = s0Var;
        this.A = uri;
        this.B = new g7.r(fVar);
        this.C = x0Var;
        this.D = s0Var2;
        this.E = gVar;
        r.f13729f.getAndIncrement();
        this.J = a(0L, null);
    }

    public final g7.j a(long j9, String str) {
        Map mapD = s0.f13737r0;
        if (str != null && !str.startsWith("W/")) {
            mapD = new c50.h(4, 7).B(mapD).z("If-Range", str).d();
        }
        Map map = Collections.EMPTY_MAP;
        String str2 = this.M.I;
        Uri uri = this.A;
        ta.c0.w(uri, "The uri must be set.");
        return new g7.j(uri, 1, null, mapD, j9, -1L, str2, 6);
    }

    @Override
    public final void h() {
        g7.f qVar;
        a8.q qVar2;
        int i10;
        int iD = 0;
        String str = null;
        while (iD == 0 && !this.G) {
            try {
                long j9 = this.F.f307a;
                g7.j jVarA = a(j9, str);
                this.J = jVarA;
                long jP = this.B.p(jVarA);
                if (this.G) {
                    if (iD != 1 && this.C.u() != -1) {
                        this.F.f307a = this.C.u();
                    }
                    b5.n(this.B);
                    return;
                }
                List list = (List) this.B.A.r().get("ETag");
                str = (list == null || list.isEmpty()) ? null : (String) list.get(0);
                if (jP != -1) {
                    jP += j9;
                    s0 s0Var = this.M;
                    s0Var.R.post(new l0(s0Var, 0));
                }
                long j10 = jP;
                this.M.T = n8.b.d(this.B.A.r());
                g7.r rVar = this.B;
                n8.b bVar = this.M.T;
                if (bVar == null || (i10 = bVar.f11193f) == -1) {
                    qVar = rVar;
                } else {
                    qVar = new q(rVar, i10, this);
                    a8.l0 l0VarB = this.M.B(new r0(0, true));
                    this.K = l0VarB;
                    l0VarB.f(s0.f13738s0);
                }
                this.C.J(qVar, this.A, this.B.A.r(), j9, j10, this.D);
                if (this.M.T != null && (qVar2 = (a8.q) this.C.C) != null && (qVar2 instanceof t8.d)) {
                    ((t8.d) qVar2).f14400q = true;
                }
                if (this.H) {
                    k9.x0 x0Var = this.C;
                    long j11 = this.I;
                    a8.q qVar3 = (a8.q) x0Var.C;
                    qVar3.getClass();
                    qVar3.b(j9, j11);
                    this.H = false;
                }
                while (iD == 0 && !this.G) {
                    try {
                        this.E.a();
                        k9.x0 x0Var2 = this.C;
                        a8.u uVar = this.F;
                        a8.q qVar4 = (a8.q) x0Var2.C;
                        qVar4.getClass();
                        a8.m mVar = (a8.m) x0Var2.D;
                        mVar.getClass();
                        iD = qVar4.d(mVar, uVar);
                        long jU = this.C.u();
                        if (jU > this.M.J + j9) {
                            e7.g gVar = this.E;
                            synchronized (gVar) {
                                gVar.f5135b = false;
                            }
                            s0 s0Var2 = this.M;
                            s0Var2.R.post(s0Var2.Q);
                            j9 = jU;
                        }
                    } catch (InterruptedException unused) {
                        throw new InterruptedIOException();
                    }
                }
                if (iD == 1) {
                    iD = 0;
                } else if (this.C.u() != -1) {
                    this.F.f307a = this.C.u();
                }
                b5.n(this.B);
            } catch (Throwable th2) {
                if (iD != 1 && this.C.u() != -1) {
                    this.F.f307a = this.C.u();
                }
                b5.n(this.B);
                throw th2;
            }
        }
    }

    @Override
    public final void l() {
        this.G = true;
    }
}
