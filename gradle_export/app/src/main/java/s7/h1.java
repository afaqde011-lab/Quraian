package s7;

import androidx.media3.common.ParserException;
import androidx.media3.common.l2;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import com.google.protobuf.RuntimeVersion;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public final class h1 implements y, w7.h {
    public final g7.j A;
    public final g7.e B;
    public final g7.s C;
    public final tf.w D;
    public final c50.h E;
    public final l1 F;
    public final ArrayList G = new ArrayList();
    public final long H;
    public final w7.l I;
    public final androidx.media3.common.t J;
    public final boolean K;
    public boolean L;
    public byte[] M;
    public int N;

    public h1(g7.j jVar, g7.e eVar, g7.s sVar, androidx.media3.common.t tVar, long j9, tf.w wVar, c50.h hVar, boolean z10, x7.a aVar) {
        this.A = jVar;
        this.B = eVar;
        this.C = sVar;
        this.J = tVar;
        this.H = j9;
        this.D = wVar;
        this.E = hVar;
        this.K = z10;
        this.F = new l1(new l2(RuntimeVersion.SUFFIX, tVar));
        this.I = aVar != null ? new w7.l(aVar) : new w7.l("SingleSampleMediaPeriod");
    }

    @Override
    public final long c(long j9, i7.l1 l1Var) {
        return j9;
    }

    @Override
    public final boolean e(i7.m0 m0Var) {
        if (this.L) {
            return false;
        }
        w7.l lVar = this.I;
        if (lVar.b() || lVar.f15878c != null) {
            return false;
        }
        g7.f fVarT = this.B.t();
        g7.s sVar = this.C;
        if (sVar != null) {
            fVarT.s(sVar);
        }
        g1 g1Var = new g1(fVarT, this.A);
        this.D.getClass();
        lVar.d(g1Var, this, 3);
        return true;
    }

    @Override
    public final i9.d f(w7.j jVar, long j9, long j10, IOException iOException, int i10) {
        long jMin;
        i9.d dVar;
        g1 g1Var = (g1) jVar;
        g7.r rVar = g1Var.B;
        r rVar2 = new r(g1Var.A, rVar.C, rVar.D, j9, rVar.B);
        String str = e7.i0.f5136a;
        this.D.getClass();
        if (!(iOException instanceof ParserException) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof HttpDataSource$CleartextNotPermittedException) && !(iOException instanceof Loader$UnexpectedLoaderException)) {
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
        } else {
            jMin = -9223372036854775807L;
            break;
        }
        boolean z10 = jMin == -9223372036854775807L || i10 >= 3;
        if (this.K && z10) {
            e7.a.n("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.L = true;
            dVar = w7.l.f15874d;
        } else {
            dVar = jMin != -9223372036854775807L ? new i9.d(0, jMin, false) : w7.l.f15875e;
        }
        i9.d dVar2 = dVar;
        int i12 = dVar2.f7552a;
        this.E.u(rVar2, 1, -1, this.J, 0, (Object) null, 0L, this.H, iOException, !(i12 == 0 || i12 == 1));
        return dVar2;
    }

    @Override
    public final long g() {
        return (this.L || this.I.b()) ? Long.MIN_VALUE : 0L;
    }

    @Override
    public final void h(w7.j jVar, long j9, long j10, int i10) {
        g1 g1Var = (g1) jVar;
        g7.r rVar = g1Var.B;
        this.E.w(i10 == 0 ? new r(g1Var.A, j9) : new r(g1Var.A, rVar.C, rVar.D, j9, rVar.B), 1, -1, this.J, 0, (Object) null, 0L, this.H, i10);
    }

    @Override
    public final long i(v7.r[] rVarArr, boolean[] zArr, a1[] a1VarArr, boolean[] zArr2, long j9) {
        for (int i10 = 0; i10 < rVarArr.length; i10++) {
            a1 a1Var = a1VarArr[i10];
            ArrayList arrayList = this.G;
            if (a1Var != null && (rVarArr[i10] == null || !zArr[i10])) {
                arrayList.remove(a1Var);
                a1VarArr[i10] = null;
            }
            if (a1VarArr[i10] == null && rVarArr[i10] != null) {
                f1 f1Var = new f1(this);
                arrayList.add(f1Var);
                a1VarArr[i10] = f1Var;
                zArr2[i10] = true;
            }
        }
        return j9;
    }

    @Override
    public final boolean isLoading() {
        return this.I.b();
    }

    @Override
    public final void j() {
    }

    @Override
    public final long k(long j9) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.G;
            if (i10 >= arrayList.size()) {
                return j9;
            }
            f1 f1Var = (f1) arrayList.get(i10);
            if (f1Var.A == 2) {
                f1Var.A = 1;
            }
            i10++;
        }
    }

    @Override
    public final void m(x xVar, long j9) {
        xVar.a(this);
    }

    @Override
    public final void o(boolean z10, long j9) {
    }

    @Override
    public final long p() {
        return -9223372036854775807L;
    }

    @Override
    public final void r(w7.j jVar, long j9, long j10, boolean z10) {
        g1 g1Var = (g1) jVar;
        g7.r rVar = g1Var.B;
        r rVar2 = new r(g1Var.A, rVar.C, rVar.D, j9, rVar.B);
        this.D.getClass();
        this.E.s(rVar2, 1, -1, (androidx.media3.common.t) null, 0, (Object) null, 0L, this.H);
    }

    @Override
    public final l1 s() {
        return this.F;
    }

    @Override
    public final long t() {
        return this.L ? Long.MIN_VALUE : 0L;
    }

    @Override
    public final void u(w7.j jVar, long j9, long j10) {
        g1 g1Var = (g1) jVar;
        this.N = (int) g1Var.B.B;
        byte[] bArr = g1Var.C;
        bArr.getClass();
        this.M = bArr;
        this.L = true;
        g7.r rVar = g1Var.B;
        r rVar2 = new r(g1Var.A, rVar.C, rVar.D, j9, this.N);
        this.D.getClass();
        this.E.t(rVar2, 1, -1, this.J, 0, (Object) null, 0L, this.H);
    }

    @Override
    public final void v(long j9) {
    }
}
