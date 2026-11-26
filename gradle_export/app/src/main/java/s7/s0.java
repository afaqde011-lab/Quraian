package s7;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.common.l2;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class s0 implements y, a8.s, w7.h, w7.k {

    public static final Map f13737r0;

    public static final androidx.media3.common.t f13738s0;
    public final Uri A;
    public final g7.f B;
    public final n7.l C;
    public final tf.w D;
    public final c50.h E;
    public final n7.h F;
    public final v0 G;
    public final a1.i H;
    public final String I;
    public final long J;
    public final androidx.media3.common.t K;
    public final long L;
    public final w7.l M;
    public final k9.x0 N;
    public final e7.g O;
    public final l0 P;
    public final l0 Q;
    public final Handler R;
    public x S;
    public n8.b T;
    public o0[] U;
    public z0[] V;
    public r0[] W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    public boolean f13739a0;

    public p10.a f13740b0;

    public a8.d0 f13741c0;

    public long f13742d0;

    public boolean f13743e0;

    public int f13744f0;

    public boolean f13745g0;

    public boolean f13746h0;

    public boolean f13747i0;

    public int f13748j0;

    public boolean f13749k0;

    public long f13750l0;

    public long f13751m0;

    public boolean f13752n0;

    public int f13753o0;

    public boolean f13754p0;

    public boolean f13755q0;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        f13737r0 = Collections.unmodifiableMap(map);
        androidx.media3.common.s sVar = new androidx.media3.common.s();
        sVar.f1491a = "icy";
        sVar.m = androidx.media3.common.x0.n("application/x-icy");
        f13738s0 = new androidx.media3.common.t(sVar);
    }

    public s0(Uri uri, g7.f fVar, k9.x0 x0Var, n7.l lVar, n7.h hVar, tf.w wVar, c50.h hVar2, v0 v0Var, a1.i iVar, String str, int i10, androidx.media3.common.t tVar, long j9, x7.a aVar) {
        this.A = uri;
        this.B = fVar;
        this.C = lVar;
        this.F = hVar;
        this.D = wVar;
        this.E = hVar2;
        this.G = v0Var;
        this.H = iVar;
        this.I = str;
        this.J = i10;
        this.K = tVar;
        this.M = aVar != null ? new w7.l(aVar) : new w7.l("ProgressiveMediaPeriod");
        this.N = x0Var;
        this.L = j9;
        this.O = new e7.g();
        this.P = new l0(this, 1);
        this.Q = new l0(this, 2);
        this.R = e7.i0.l(null);
        this.W = new r0[0];
        this.V = new z0[0];
        this.U = new o0[0];
        this.f13751m0 = -9223372036854775807L;
        this.f13744f0 = 1;
    }

    public final void A(int i10) {
        a();
        if (this.f13752n0) {
            if ((!this.Z || ((boolean[]) this.f13740b0.B)[i10]) && !this.V[i10].s(false)) {
                this.f13751m0 = 0L;
                this.f13752n0 = false;
                this.f13746h0 = true;
                this.f13750l0 = 0L;
                this.f13753o0 = 0;
                for (z0 z0Var : this.V) {
                    z0Var.w(false);
                }
                x xVar = this.S;
                xVar.getClass();
                xVar.d(this);
            }
        }
    }

    public final a8.l0 B(r0 r0Var) {
        int length = this.V.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (r0Var.equals(this.W[i10])) {
                return this.V[i10];
            }
        }
        if (this.X) {
            e7.a.m("ProgressiveMediaPeriod", "Extractor added new track (id=" + r0Var.f13735a + ") after finishing tracks.");
            return new a8.p();
        }
        n7.l lVar = this.C;
        lVar.getClass();
        z0 z0Var = new z0(this.H, lVar, this.F);
        o0 o0Var = new o0(z0Var);
        z0Var.f13802f = this;
        int i11 = length + 1;
        r0[] r0VarArr = (r0[]) Arrays.copyOf(this.W, i11);
        r0VarArr[length] = r0Var;
        this.W = r0VarArr;
        z0[] z0VarArr = (z0[]) Arrays.copyOf(this.V, i11);
        z0VarArr[length] = z0Var;
        this.V = z0VarArr;
        o0[] o0VarArr = (o0[]) Arrays.copyOf(this.U, i11);
        o0VarArr[length] = o0Var;
        this.U = o0VarArr;
        return o0Var;
    }

    public final void C(a8.d0 d0Var) {
        this.f13741c0 = this.T == null ? d0Var : new a8.v(-9223372036854775807L);
        this.f13742d0 = d0Var.f();
        boolean z10 = !this.f13749k0 && d0Var.f() == -9223372036854775807L;
        this.f13743e0 = z10;
        this.f13744f0 = z10 ? 7 : 1;
        if (this.Y) {
            this.G.u(this.f13742d0, d0Var, z10);
        } else {
            y();
        }
    }

    public final void D() {
        p0 p0Var = new p0(this, this.A, this.B, this.N, this, this.O);
        if (this.Y) {
            ta.c0.A(x());
            long j9 = this.f13742d0;
            if (j9 != -9223372036854775807L && this.f13751m0 > j9) {
                this.f13754p0 = true;
                this.f13751m0 = -9223372036854775807L;
                return;
            }
            a8.d0 d0Var = this.f13741c0;
            d0Var.getClass();
            long j10 = d0Var.d(this.f13751m0).f236a.f254b;
            long j11 = this.f13751m0;
            p0Var.F.f307a = j10;
            p0Var.I = j11;
            p0Var.H = true;
            p0Var.L = false;
            for (z0 z0Var : this.V) {
                z0Var.f13814t = this.f13751m0;
            }
            this.f13751m0 = -9223372036854775807L;
        }
        this.f13753o0 = l();
        this.M.d(p0Var, this, this.D.n(this.f13744f0));
    }

    public final boolean E() {
        return this.f13746h0 || x();
    }

    public final void a() {
        ta.c0.A(this.Y);
        this.f13740b0.getClass();
        this.f13741c0.getClass();
    }

    @Override
    public final void b(a8.d0 d0Var) {
        this.R.post(new oi.p(this, d0Var, 8));
    }

    @Override
    public final long c(long j9, i7.l1 l1Var) {
        a();
        if (!this.f13741c0.b()) {
            return 0L;
        }
        a8.c0 c0VarD = this.f13741c0.d(j9);
        return l1Var.a(j9, c0VarD.f236a.f253a, c0VarD.f237b.f253a);
    }

    @Override
    public final void d() {
        for (z0 z0Var : this.V) {
            z0Var.w(true);
            n7.e eVar = z0Var.f13804h;
            if (eVar != null) {
                eVar.c(z0Var.f13801e);
                z0Var.f13804h = null;
                z0Var.f13803g = null;
            }
        }
        k9.x0 x0Var = this.N;
        a8.q qVar = (a8.q) x0Var.C;
        if (qVar != null) {
            qVar.release();
            x0Var.C = null;
        }
        x0Var.D = null;
    }

    @Override
    public final boolean e(i7.m0 m0Var) {
        if (this.f13754p0) {
            return false;
        }
        w7.l lVar = this.M;
        if (lVar.f15878c != null || this.f13752n0) {
            return false;
        }
        if ((this.Y || this.K != null) && this.f13748j0 == 0) {
            return false;
        }
        boolean zD = this.O.d();
        if (lVar.b()) {
            return zD;
        }
        D();
        return true;
    }

    @Override
    public final i9.d f(w7.j jVar, long j9, long j10, IOException iOException, int i10) {
        long jMin;
        i9.d dVar;
        a8.d0 d0Var;
        p0 p0Var = (p0) jVar;
        g7.r rVar = p0Var.B;
        r rVar2 = new r(p0Var.J, rVar.C, rVar.D, j9, rVar.B);
        String str = e7.i0.f5136a;
        this.D.getClass();
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i11 = DataSourceException.B;
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i10 - 1) * 1000, 5000);
                break;
            }
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).A == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            dVar = w7.l.f15875e;
        } else {
            int iL = l();
            int i12 = iL > this.f13753o0 ? 1 : 0;
            if (this.f13749k0 || !((d0Var = this.f13741c0) == null || d0Var.f() == -9223372036854775807L)) {
                this.f13753o0 = iL;
            } else if (!this.Y || E()) {
                this.f13746h0 = this.Y;
                this.f13750l0 = 0L;
                this.f13753o0 = 0;
                for (z0 z0Var : this.V) {
                    z0Var.w(false);
                }
                p0Var.F.f307a = 0L;
                p0Var.I = 0L;
                p0Var.H = true;
                p0Var.L = false;
            } else {
                this.f13752n0 = true;
                dVar = w7.l.f15874d;
            }
            dVar = new i9.d(i12, jMin, false);
        }
        i9.d dVar2 = dVar;
        int i13 = dVar2.f7552a;
        this.E.u(rVar2, 1, -1, (androidx.media3.common.t) null, 0, (Object) null, p0Var.I, this.f13742d0, iOException, !(i13 == 0 || i13 == 1));
        return dVar2;
    }

    @Override
    public final long g() {
        return t();
    }

    @Override
    public final void h(w7.j jVar, long j9, long j10, int i10) {
        p0 p0Var = (p0) jVar;
        g7.r rVar = p0Var.B;
        this.E.w(i10 == 0 ? new r(p0Var.J, j9) : new r(p0Var.J, rVar.C, rVar.D, j9, rVar.B), 1, -1, (androidx.media3.common.t) null, 0, (Object) null, p0Var.I, this.f13742d0, i10);
    }

    @Override
    public final long i(v7.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j9) {
        v7.r rVar;
        a();
        p10.a aVar = this.f13740b0;
        l1 l1Var = (l1) aVar.A;
        boolean[] zArr3 = (boolean[]) aVar.C;
        int i10 = this.f13748j0;
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            a1 a1Var = a1VarArr[i11];
            if (a1Var != null && (rVarArr[i11] == null || !zArr[i11])) {
                int i12 = ((q0) a1Var).A;
                ta.c0.A(zArr3[i12]);
                this.f13748j0--;
                zArr3[i12] = false;
                a1VarArr[i11] = null;
            }
        }
        boolean z10 = !this.f13745g0 ? j9 == 0 || this.f13739a0 : i10 != 0;
        for (int i13 = 0; i13 < rVarArr.length; i13++) {
            if (a1VarArr[i13] == null && (rVar = rVarArr[i13]) != null) {
                ta.c0.A(rVar.length() == 1);
                ta.c0.A(rVar.j(0) == 0);
                int iIndexOf = l1Var.f13711b.indexOf(rVar.d());
                if (iIndexOf < 0) {
                    iIndexOf = -1;
                }
                ta.c0.A(!zArr3[iIndexOf]);
                this.f13748j0++;
                zArr3[iIndexOf] = true;
                this.f13747i0 = rVar.n().f1600t | this.f13747i0;
                a1VarArr[i13] = new q0(this, iIndexOf);
                zArr2[i13] = true;
                if (!z10) {
                    z0 z0Var = this.V[iIndexOf];
                    z10 = (z0Var.p() == 0 || z0Var.y(true, j9)) ? false : true;
                }
            }
        }
        if (this.f13748j0 == 0) {
            this.f13752n0 = false;
            this.f13746h0 = false;
            this.f13747i0 = false;
            w7.l lVar = this.M;
            if (lVar.b()) {
                for (z0 z0Var2 : this.V) {
                    z0Var2.j();
                }
                w7.i iVar = lVar.f15877b;
                iVar.getClass();
                iVar.a(false);
            } else {
                this.f13754p0 = false;
                for (z0 z0Var3 : this.V) {
                    z0Var3.w(false);
                }
            }
        } else if (z10) {
            j9 = k(j9);
            for (int i14 = 0; i14 < a1VarArr.length; i14++) {
                if (a1VarArr[i14] != null) {
                    zArr2[i14] = true;
                }
            }
        }
        this.f13745g0 = true;
        return j9;
    }

    @Override
    public final boolean isLoading() {
        boolean z10;
        if (!this.M.b()) {
            return false;
        }
        e7.g gVar = this.O;
        synchronized (gVar) {
            z10 = gVar.f5135b;
        }
        return z10;
    }

    @Override
    public final void j() throws IOException {
        int iN = this.D.n(this.f13744f0);
        w7.l lVar = this.M;
        IOException iOException = lVar.f15878c;
        if (iOException != null) {
            throw iOException;
        }
        w7.i iVar = lVar.f15877b;
        if (iVar != null) {
            if (iN == Integer.MIN_VALUE) {
                iN = iVar.A;
            }
            IOException iOException2 = iVar.E;
            if (iOException2 != null && iVar.F > iN) {
                throw iOException2;
            }
        }
        if (this.f13754p0 && !this.Y) {
            throw ParserException.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override
    public final long k(long j9) {
        int i10;
        int i11;
        a();
        boolean[] zArr = (boolean[]) this.f13740b0.B;
        if (!this.f13741c0.b()) {
            j9 = 0;
        }
        this.f13746h0 = false;
        boolean z10 = true;
        boolean z11 = this.f13750l0 == j9;
        this.f13750l0 = j9;
        if (x()) {
            this.f13751m0 = j9;
            return j9;
        }
        int i12 = this.f13744f0;
        w7.l lVar = this.M;
        if (i12 == 7 || !(this.f13754p0 || lVar.b())) {
            this.f13752n0 = false;
            this.f13751m0 = j9;
            this.f13754p0 = false;
            this.f13747i0 = false;
            if (lVar.b()) {
                for (z0 z0Var : this.V) {
                    z0Var.j();
                }
                w7.i iVar = lVar.f15877b;
                iVar.getClass();
                iVar.a(false);
                return j9;
            }
            lVar.f15878c = null;
            for (z0 z0Var2 : this.V) {
                z0Var2.w(false);
            }
        } else {
            int length = this.V.length;
            for (int i13 = 0; i13 < length; i13++) {
                z0 z0Var3 = this.V[i13];
                if (this.U[i13].f13727d.get() == n0.A && (z0Var3.p() != 0 || !z11)) {
                    if (!(this.f13739a0 ? z0Var3.x(z0Var3.f13811q) : z0Var3.y(this.f13754p0, j9)) && (zArr[i13] || !this.Z)) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (!z10) {
                this.f13752n0 = false;
                this.f13751m0 = j9;
                this.f13754p0 = false;
                this.f13747i0 = false;
                if (lVar.b()) {
                    while (i11 < r0) {
                        z0Var.j();
                    }
                    w7.i iVar2 = lVar.f15877b;
                    iVar2.getClass();
                    iVar2.a(false);
                    return j9;
                }
                lVar.f15878c = null;
                while (i10 < r0) {
                    z0Var2.w(false);
                }
            }
        }
        return j9;
    }

    public final int l() {
        int i10 = 0;
        for (z0 z0Var : this.V) {
            i10 += z0Var.f13811q + z0Var.f13810p;
        }
        return i10;
    }

    @Override
    public final void m(x xVar, long j9) {
        this.S = xVar;
        androidx.media3.common.t tVar = this.K;
        if (tVar == null) {
            this.O.d();
            D();
        } else {
            w(0, 3).f(tVar);
            C(new a8.a0(-9223372036854775807L, new long[]{0}, new long[]{0}));
            q();
            this.f13751m0 = j9;
        }
    }

    public final long n(boolean z10) {
        z0 z0Var;
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.V.length; i10++) {
            if (z10) {
                z0Var = this.V[i10];
                synchronized (z0Var) {
                    jMax = Math.max(jMax, z0Var.f13816v);
                }
            } else {
                p10.a aVar = this.f13740b0;
                aVar.getClass();
                if (((boolean[]) aVar.C)[i10]) {
                    z0Var = this.V[i10];
                    synchronized (z0Var) {
                    }
                    jMax = Math.max(jMax, z0Var.f13816v);
                } else {
                    continue;
                }
            }
        }
        return jMax;
    }

    @Override
    public final void o(boolean z10, long j9) throws Throwable {
        if (this.f13739a0) {
            return;
        }
        a();
        if (x()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f13740b0.C;
        int length = this.V.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.V[i10].i(j9, z10, zArr[i10]);
        }
    }

    @Override
    public final long p() {
        if (this.f13747i0) {
            this.f13747i0 = false;
            return this.f13750l0;
        }
        if (!this.f13746h0) {
            return -9223372036854775807L;
        }
        if (!this.f13754p0 && l() <= this.f13753o0) {
            return -9223372036854775807L;
        }
        this.f13746h0 = false;
        return this.f13750l0;
    }

    @Override
    public final void q() {
        this.X = true;
        this.R.post(this.P);
    }

    @Override
    public final void r(w7.j jVar, long j9, long j10, boolean z10) {
        p0 p0Var = (p0) jVar;
        g7.r rVar = p0Var.B;
        r rVar2 = new r(p0Var.J, rVar.C, rVar.D, j9, rVar.B);
        this.D.getClass();
        this.E.s(rVar2, 1, -1, (androidx.media3.common.t) null, 0, (Object) null, p0Var.I, this.f13742d0);
        if (z10) {
            return;
        }
        for (z0 z0Var : this.V) {
            z0Var.w(false);
        }
        if (this.f13748j0 > 0) {
            x xVar = this.S;
            xVar.getClass();
            xVar.d(this);
        }
    }

    @Override
    public final l1 s() {
        a();
        return (l1) this.f13740b0.A;
    }

    @Override
    public final long t() {
        long jN;
        boolean z10;
        long j9;
        a();
        if (this.f13754p0 || this.f13748j0 == 0) {
            return Long.MIN_VALUE;
        }
        if (x()) {
            return this.f13751m0;
        }
        if (this.Z) {
            int length = this.V.length;
            jN = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                p10.a aVar = this.f13740b0;
                if (((boolean[]) aVar.B)[i10] && ((boolean[]) aVar.C)[i10]) {
                    z0 z0Var = this.V[i10];
                    synchronized (z0Var) {
                        z10 = z0Var.f13817w;
                    }
                    if (z10) {
                        continue;
                    } else {
                        z0 z0Var2 = this.V[i10];
                        synchronized (z0Var2) {
                            j9 = z0Var2.f13816v;
                        }
                        jN = Math.min(jN, j9);
                    }
                }
            }
        } else {
            jN = Long.MAX_VALUE;
        }
        if (jN == Long.MAX_VALUE) {
            jN = n(false);
        }
        return jN == Long.MIN_VALUE ? this.f13750l0 : jN;
    }

    @Override
    public final void u(w7.j jVar, long j9, long j10) {
        p0 p0Var = (p0) jVar;
        if (this.f13742d0 == -9223372036854775807L && this.f13741c0 != null) {
            long jN = n(true);
            long j11 = jN == Long.MIN_VALUE ? 0L : jN + NotificationOptions.SKIP_STEP_TEN_SECONDS_IN_MS;
            this.f13742d0 = j11;
            this.G.u(j11, this.f13741c0, this.f13743e0);
        }
        g7.r rVar = p0Var.B;
        r rVar2 = new r(p0Var.J, rVar.C, rVar.D, j9, rVar.B);
        this.D.getClass();
        this.E.t(rVar2, 1, -1, (androidx.media3.common.t) null, 0, (Object) null, p0Var.I, this.f13742d0);
        this.f13754p0 = true;
        x xVar = this.S;
        xVar.getClass();
        xVar.d(this);
    }

    @Override
    public final void v(long j9) {
    }

    @Override
    public final a8.l0 w(int i10, int i11) {
        return B(new r0(i10, false));
    }

    public final boolean x() {
        return this.f13751m0 != -9223372036854775807L;
    }

    public final void y() {
        androidx.media3.common.t tVar;
        androidx.media3.common.v0 v0VarA;
        long j9 = this.L;
        if (this.f13755q0 || this.Y || !this.X || this.f13741c0 == null) {
            return;
        }
        z0[] z0VarArr = this.V;
        int length = z0VarArr.length;
        char c10 = 0;
        int i10 = 0;
        while (true) {
            androidx.media3.common.t tVar2 = null;
            if (i10 >= length) {
                e7.g gVar = this.O;
                synchronized (gVar) {
                    gVar.f5135b = false;
                }
                int length2 = this.V.length;
                l2[] l2VarArr = new l2[length2];
                boolean[] zArr = new boolean[length2];
                int i11 = 0;
                while (i11 < length2) {
                    z0 z0Var = this.V[i11];
                    synchronized (z0Var) {
                        tVar = z0Var.f13819y ? null : z0Var.B;
                    }
                    tVar.getClass();
                    String str = tVar.f1594n;
                    boolean zJ = androidx.media3.common.x0.j(str);
                    boolean z10 = (zJ || androidx.media3.common.x0.m(str)) ? true : c10;
                    zArr[i11] = z10;
                    char c11 = c10;
                    this.Z = (this.Z ? 1 : 0) | (z10 ? 1 : 0);
                    this.f13739a0 = (j9 != -9223372036854775807L && length2 == 1 && androidx.media3.common.x0.k(str)) ? 1 : c11;
                    n8.b bVar = this.T;
                    if (bVar != null) {
                        int i12 = bVar.f11188a;
                        if (zJ || this.W[i11].f13736b) {
                            androidx.media3.common.v0 v0Var = tVar.l;
                            if (v0Var == null) {
                                androidx.media3.common.u0[] u0VarArr = new androidx.media3.common.u0[1];
                                u0VarArr[c11] = bVar;
                                v0VarA = new androidx.media3.common.v0(u0VarArr);
                            } else {
                                androidx.media3.common.u0[] u0VarArr2 = new androidx.media3.common.u0[1];
                                u0VarArr2[c11] = bVar;
                                v0VarA = v0Var.a(u0VarArr2);
                            }
                            androidx.media3.common.s sVarA = tVar.a();
                            sVarA.f1501k = v0VarA;
                            tVar = new androidx.media3.common.t(sVarA);
                        }
                        if (zJ && tVar.f1590h == -1 && tVar.f1591i == -1 && i12 != -1) {
                            androidx.media3.common.s sVarA2 = tVar.a();
                            sVarA2.f1498h = i12;
                            tVar = new androidx.media3.common.t(sVarA2);
                        }
                    }
                    int iD = this.C.d(tVar);
                    androidx.media3.common.s sVarA3 = tVar.a();
                    sVarA3.N = iD;
                    androidx.media3.common.t tVar3 = new androidx.media3.common.t(sVarA3);
                    l2VarArr[i11] = new l2(Integer.toString(i11), tVar3);
                    this.f13747i0 = tVar3.f1600t | this.f13747i0;
                    i11++;
                    c10 = c11;
                }
                l1 l1Var = new l1(l2VarArr);
                p10.a aVar = new p10.a();
                aVar.A = l1Var;
                aVar.B = zArr;
                int i13 = l1Var.f13710a;
                aVar.C = new boolean[i13];
                aVar.D = new boolean[i13];
                this.f13740b0 = aVar;
                if (this.f13739a0 && this.f13742d0 == -9223372036854775807L) {
                    this.f13742d0 = j9;
                    this.f13741c0 = new m0(this, this.f13741c0);
                }
                this.G.u(this.f13742d0, this.f13741c0, this.f13743e0);
                this.Y = true;
                x xVar = this.S;
                xVar.getClass();
                xVar.a(this);
                return;
            }
            z0 z0Var2 = z0VarArr[i10];
            synchronized (z0Var2) {
                if (!z0Var2.f13819y) {
                    tVar2 = z0Var2.B;
                }
            }
            if (tVar2 == null) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void z(int i10) {
        a();
        p10.a aVar = this.f13740b0;
        boolean[] zArr = (boolean[]) aVar.D;
        if (zArr[i10]) {
            return;
        }
        androidx.media3.common.t tVar = ((l1) aVar.A).a(i10).f1341d[0];
        this.E.i(androidx.media3.common.x0.h(tVar.f1594n), tVar, 0, (Object) null, this.f13750l0);
        zArr[i10] = true;
    }
}
