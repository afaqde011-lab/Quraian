package k9;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.SparseBooleanArray;
import androidx.media3.common.PlaybackException;
import java.util.ArrayList;
import java.util.List;

public abstract class q3 {

    public static final h1.l f9407a = new h1.l("androidx.media3.session.MediaLibraryService", (Bundle) null);

    public static boolean a(c4 c4Var, c4 c4Var2) {
        androidx.media3.common.e1 e1Var = c4Var.f9253a;
        int i10 = e1Var.f1183b;
        androidx.media3.common.e1 e1Var2 = c4Var2.f9253a;
        return i10 == e1Var2.f1183b && e1Var.f1186e == e1Var2.f1186e && e1Var.f1189h == e1Var2.f1189h && e1Var.f1190i == e1Var2.f1190i;
    }

    public static int b(long j9, long j10) {
        if (j9 == -9223372036854775807L || j10 == -9223372036854775807L) {
            return 0;
        }
        if (j10 == 0) {
            return 100;
        }
        return e7.i0.h(e7.i0.L(j9, j10), 0, 100);
    }

    public static long c(t3 t3Var, long j9, long j10, long j11) {
        c4 c4Var = t3Var.f9497c;
        c4 c4Var2 = t3Var.f9497c;
        boolean z10 = c4Var.equals(c4.l) || j10 < c4Var2.f9255c;
        if (t3Var.f9516x) {
            if (z10 || j9 == -9223372036854775807L) {
                if (j11 == -9223372036854775807L) {
                    j11 = SystemClock.elapsedRealtime() - c4Var2.f9255c;
                }
                long j12 = c4Var2.f9253a.f1187f + ((long) (j11 * t3Var.f9501g.f1688a));
                long j13 = c4Var2.f9256d;
                return j13 != -9223372036854775807L ? Math.min(j12, j13) : j12;
            }
        } else if (z10 || j9 == -9223372036854775807L) {
            return c4Var2.f9253a.f1187f;
        }
        return j9;
    }

    public static androidx.media3.common.b1 d(androidx.media3.common.b1 b1Var, androidx.media3.common.b1 b1Var2) {
        if (b1Var != null) {
            androidx.media3.common.r rVar = b1Var.f1103a;
            if (b1Var2 != null) {
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
                for (int i10 = 0; i10 < rVar.f1465a.size(); i10++) {
                    if (b1Var2.a(rVar.b(i10))) {
                        int iB = rVar.b(i10);
                        ta.c0.A(!false);
                        sparseBooleanArray.append(iB, true);
                    }
                }
                ta.c0.A(!false);
                return new androidx.media3.common.b1(new androidx.media3.common.r(sparseBooleanArray));
            }
        }
        return androidx.media3.common.b1.f1101b;
    }

    public static t3 e(t3 t3Var, t3 t3Var2, r3 r3Var, androidx.media3.common.b1 b1Var, boolean z10) {
        androidx.media3.common.s2 s2Var;
        boolean z11;
        t3 t3VarL = (r3Var.f9411a && b1Var.a(17)) ? t3Var2.l(t3Var.f9504j) : t3Var2;
        if (r3Var.f9412b && b1Var.a(30)) {
            t3VarL = t3VarL.b(t3Var.F);
        }
        if (!z10 || t3Var2.f9506n != 0.0f) {
            return t3VarL;
        }
        float f3 = t3Var.f9507o;
        PlaybackException playbackException = t3VarL.f9495a;
        int i10 = t3VarL.f9496b;
        c4 c4Var = t3VarL.f9497c;
        androidx.media3.common.e1 e1Var = t3VarL.f9498d;
        androidx.media3.common.e1 e1Var2 = t3VarL.f9499e;
        int i11 = t3VarL.f9500f;
        androidx.media3.common.z0 z0Var = t3VarL.f9501g;
        int i12 = t3VarL.f9502h;
        boolean z12 = t3VarL.f9503i;
        androidx.media3.common.k2 k2Var = t3VarL.f9504j;
        int i13 = t3VarL.f9505k;
        androidx.media3.common.w2 w2Var = t3VarL.l;
        androidx.media3.common.t0 t0Var = t3VarL.m;
        float f10 = t3VarL.f9506n;
        int i14 = t3VarL.f9508p;
        androidx.media3.common.d dVar = t3VarL.f9509q;
        d7.c cVar = t3VarL.f9510r;
        androidx.media3.common.l lVar = t3VarL.f9511s;
        int i15 = t3VarL.f9512t;
        boolean z13 = t3VarL.f9513u;
        boolean z14 = t3VarL.f9514v;
        int i16 = t3VarL.f9515w;
        boolean z15 = t3VarL.f9516x;
        boolean z16 = t3VarL.f9517y;
        int i17 = t3VarL.f9518z;
        int i18 = t3VarL.A;
        androidx.media3.common.t0 t0Var2 = t3VarL.B;
        long j9 = t3VarL.C;
        long j10 = t3VarL.D;
        long j11 = t3VarL.E;
        androidx.media3.common.s2 s2Var2 = t3VarL.F;
        androidx.media3.common.q2 q2Var = t3VarL.G;
        if (!k2Var.isEmpty()) {
            s2Var = s2Var2;
            if (c4Var.f9253a.f1183b >= k2Var.getWindowCount()) {
                z11 = false;
            }
            ta.c0.A(z11);
            return new t3(playbackException, i10, c4Var, e1Var, e1Var2, i11, z0Var, i12, z12, w2Var, k2Var, i13, t0Var, f10, f3, dVar, i14, cVar, lVar, i15, z13, z14, i16, i17, i18, z15, z16, t0Var2, j9, j10, j11, s2Var, q2Var);
        }
        s2Var = s2Var2;
        z11 = true;
        ta.c0.A(z11);
        return new t3(playbackException, i10, c4Var, e1Var, e1Var2, i11, z0Var, i12, z12, w2Var, k2Var, i13, t0Var, f10, f3, dVar, i14, cVar, lVar, i15, z13, z14, i16, i17, i18, z15, z16, t0Var2, j9, j10, j11, s2Var, q2Var);
    }

    public static void f(androidx.media3.common.f1 f1Var, b2 b2Var) {
        int i10 = b2Var.f9233b;
        long j9 = b2Var.f9234c;
        fh.t0 t0Var = b2Var.f9232a;
        if (i10 == -1) {
            if (f1Var.isCommandAvailable(20)) {
                f1Var.setMediaItems(t0Var, true);
                return;
            } else {
                if (t0Var.isEmpty()) {
                    return;
                }
                f1Var.setMediaItem((androidx.media3.common.q0) t0Var.get(0), true);
                return;
            }
        }
        if (f1Var.isCommandAvailable(20)) {
            f1Var.setMediaItems(t0Var, b2Var.f9233b, j9);
        } else {
            if (t0Var.isEmpty()) {
                return;
            }
            f1Var.setMediaItem((androidx.media3.common.q0) t0Var.get(0), j9);
        }
    }

    public static ArrayList g(List list) {
        ArrayList arrayList = new ArrayList();
        Parcel parcelObtain = Parcel.obtain();
        for (int i10 = 0; i10 < list.size(); i10++) {
            try {
                Parcelable parcelable = (Parcelable) list.get(i10);
                parcelObtain.writeParcelable(parcelable, 0);
                if (parcelObtain.dataSize() >= 262144) {
                    break;
                }
                arrayList.add(parcelable);
            } catch (Throwable th2) {
                parcelObtain.recycle();
                throw th2;
            }
        }
        parcelObtain.recycle();
        return arrayList;
    }
}
