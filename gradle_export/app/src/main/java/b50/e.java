package b50;

import b3.l0;
import b3.s;
import c3.z;
import com.google.android.gms.internal.measurement.f4;
import java.io.IOException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import q3.e0;
import u.q;
import v2.r;
import x40.a0;

public final class e {
    public boolean a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public IOException a(boolean z, boolean z2, IOException iOException) {
        j jVar = (j) this.b;
        if (iOException != null) {
            d(iOException);
        }
        return jVar.j(this, z2, z, iOException);
    }

    public int b(e0 e0Var, z zVar, boolean z) {
        int i;
        Object[] objArr;
        int i2;
        int i3;
        v2.c cVar = (v2.c) this.c;
        s sVar = (s) this.e;
        if (this.a) {
            return 0;
        }
        try {
            this.a = true;
            f4 f4VarV = ((o10.b) this.d).v(e0Var, zVar);
            q qVar = (q) f4VarV.C;
            int iG = qVar.g();
            while (true) {
                if (i >= iG) {
                    objArr = true;
                    break;
                }
                v2.s sVar2 = (v2.s) qVar.h(i);
                i = (sVar2.d || sVar2.h) ? 0 : i + 1;
                objArr = false;
                break;
            }
            int iG2 = qVar.g();
            for (int i4 = 0; i4 < iG2; i4++) {
                v2.s sVar3 = (v2.s) qVar.h(i4);
                if (objArr != false || r.b(sVar3)) {
                    ((l0) this.b).C(sVar3.c, (s) this.e, sVar3.i, true);
                    if (!sVar.A.h()) {
                        cVar.a(sVar3.a, r.b(sVar3), sVar);
                        sVar.clear();
                    }
                }
            }
            boolean zB = cVar.b(f4VarV, z);
            if (f4VarV.B) {
                i2 = 0;
                break;
            }
            int iG3 = qVar.g();
            int i5 = 0;
            while (true) {
                if (i5 >= iG3) {
                    i2 = 0;
                    break;
                }
                v2.s sVar4 = (v2.s) qVar.h(i5);
                if (!h2.b.b(r.h(sVar4, true), 0L) && sVar4.b()) {
                    i2 = 1;
                    break;
                }
                i5++;
            }
            int iG4 = qVar.g();
            for (int i6 = 0; i6 < iG4; i6++) {
                if (((v2.s) qVar.h(i6)).b()) {
                    i3 = 1;
                    return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
                }
            }
            i3 = 0;
            return (zB ? 1 : 0) | (i2 << 1) | (i3 << 2);
        } finally {
            this.a = false;
        }
    }

    public a0 c(boolean z) throws IOException {
        try {
            a0 a0VarD = ((c50.d) this.d).d(z);
            if (a0VarD == null) {
                return a0VarD;
            }
            a0VarD.m = this;
            return a0VarD;
        } catch (IOException e) {
            d(e);
            throw e;
        }
    }

    public void d(IOException iOException) {
        this.a = true;
        ((f) this.c).c(iOException);
        m mVarE = ((c50.d) this.d).e();
        j jVar = (j) this.b;
        synchronized (mVarE) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(mVarE.g != null) || (iOException instanceof ConnectionShutdownException)) {
                        mVarE.j = true;
                        if (mVarE.m == 0) {
                            m.d(jVar.A, mVarE.b, iOException);
                            mVarE.l++;
                        }
                    }
                } else if (((StreamResetException) iOException).A == 8) {
                    int i = mVarE.n + 1;
                    mVarE.n = i;
                    if (i > 1) {
                        mVarE.j = true;
                        mVarE.l++;
                    }
                } else if (((StreamResetException) iOException).A != 9 || !jVar.M) {
                    mVarE.j = true;
                    mVarE.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
