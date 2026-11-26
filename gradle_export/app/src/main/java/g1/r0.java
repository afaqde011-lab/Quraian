package g1;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.CastDevice;
import com.google.protobuf.RuntimeVersion;
import kotlin.NoWhenBranchMatchedException;

public abstract class r0 {

    public static final l1.q2 f5948a = new l1.q2(new e00.g(13));

    public static final l1.q2 f5949b = new l1.q2(new e00.g(14));

    public static final long a(q0 q0Var, long j9) {
        long j10 = q0Var.f5907a;
        long j11 = q0Var.U;
        long j12 = q0Var.Q;
        long j13 = q0Var.M;
        long j14 = q0Var.f5927q;
        if (i2.t.c(j9, j10)) {
            return q0Var.f5909b;
        }
        if (i2.t.c(j9, q0Var.f5917f)) {
            return q0Var.f5919g;
        }
        if (i2.t.c(j9, q0Var.f5922j)) {
            return q0Var.f5923k;
        }
        if (i2.t.c(j9, q0Var.f5924n)) {
            return q0Var.f5925o;
        }
        if (i2.t.c(j9, q0Var.f5933w)) {
            return q0Var.f5934x;
        }
        if (i2.t.c(j9, q0Var.f5911c)) {
            return q0Var.f5913d;
        }
        if (i2.t.c(j9, q0Var.f5920h)) {
            return q0Var.f5921i;
        }
        if (i2.t.c(j9, q0Var.l)) {
            return q0Var.m;
        }
        if (i2.t.c(j9, q0Var.f5935y)) {
            return q0Var.f5936z;
        }
        if (i2.t.c(j9, q0Var.f5931u)) {
            return q0Var.f5932v;
        }
        if (i2.t.c(j9, q0Var.f5926p)) {
            return j14;
        }
        if (i2.t.c(j9, q0Var.f5928r)) {
            return q0Var.f5929s;
        }
        if (i2.t.c(j9, q0Var.D) || i2.t.c(j9, q0Var.F) || i2.t.c(j9, q0Var.G) || i2.t.c(j9, q0Var.H) || i2.t.c(j9, q0Var.I) || i2.t.c(j9, q0Var.J) || i2.t.c(j9, q0Var.E)) {
            return j14;
        }
        if (i2.t.c(j9, q0Var.K) || i2.t.c(j9, q0Var.L)) {
            return j13;
        }
        if (i2.t.c(j9, q0Var.O) || i2.t.c(j9, q0Var.P)) {
            return j12;
        }
        if (i2.t.c(j9, q0Var.S) || i2.t.c(j9, q0Var.T)) {
            return j11;
        }
        int i10 = i2.t.f7168h;
        return i2.t.f7167g;
    }

    public static final long b(long j9, l1.j jVar) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.c0(89374938);
        long jA = a((q0) g0Var.k(f5948a), j9);
        if (jA == 16) {
            jA = ((i2.t) g0Var.k(y0.f6028a)).f7169a;
        }
        g0Var.r(false);
        return jA;
    }

    public static q0 c(long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, int i10, int i11) {
        return new q0(j9, (i10 & 2) != 0 ? k1.e.f8621i : j10, (i10 & 4) != 0 ? k1.e.f8634x : j11, (i10 & 8) != 0 ? k1.e.f8622j : j12, (i10 & 16) != 0 ? k1.e.f8616d : j13, j14, (i10 & 64) != 0 ? k1.e.m : j15, (i10 & Cast.MAX_NAMESPACE_LENGTH) != 0 ? k1.e.B : j16, (i10 & 256) != 0 ? k1.e.f8624n : j17, j18, (i10 & 1024) != 0 ? k1.e.f8628r : j19, (i10 & 2048) != 0 ? k1.e.N : j20, (i10 & 4096) != 0 ? k1.e.f8629s : j21, j22, (i10 & 16384) != 0 ? k1.e.f8618f : j23, (i10 & 32768) != 0 ? k1.e.E : j24, j25, (131072 & i10) != 0 ? k1.e.M : j26, (262144 & i10) != 0 ? k1.e.f8627q : j27, (524288 & i10) != 0 ? j9 : j28, (1048576 & i10) != 0 ? k1.e.f8617e : j29, (2097152 & i10) != 0 ? k1.e.f8615c : j30, k1.e.f8613a, k1.e.f8619g, k1.e.f8614b, k1.e.f8620h, (67108864 & i10) != 0 ? k1.e.f8632v : j31, (134217728 & i10) != 0 ? k1.e.f8633w : j32, (268435456 & i10) != 0 ? k1.e.A : j33, (536870912 & i10) != 0 ? k1.e.F : j34, (i11 & 8) != 0 ? k1.e.L : j40, (1073741824 & i10) != 0 ? k1.e.G : j35, (i10 & Integer.MIN_VALUE) != 0 ? k1.e.H : j36, (i11 & 1) != 0 ? k1.e.I : j37, (i11 & 2) != 0 ? k1.e.J : j38, (i11 & 4) != 0 ? k1.e.K : j39, (i11 & 16) != 0 ? k1.e.f8635y : j41, (i11 & 32) != 0 ? k1.e.f8636z : j42, (i11 & 64) != 0 ? k1.e.f8623k : j43, (i11 & Cast.MAX_NAMESPACE_LENGTH) != 0 ? k1.e.l : j44, (i11 & 256) != 0 ? k1.e.C : j45, (i11 & 512) != 0 ? k1.e.D : j46, (i11 & 1024) != 0 ? k1.e.f8625o : j47, (i11 & 2048) != 0 ? k1.e.f8626p : j48, (i11 & 4096) != 0 ? k1.e.O : j49, (i11 & 8192) != 0 ? k1.e.P : j50, (i11 & 16384) != 0 ? k1.e.f8630t : j51, (i11 & 32768) != 0 ? k1.e.f8631u : j52);
    }

    public static final long d(q0 q0Var, k1.g gVar) throws NoWhenBranchMatchedException {
        switch (gVar.ordinal()) {
            case 0:
                return q0Var.f5924n;
            case 1:
                return q0Var.f5933w;
            case 2:
                return q0Var.f5935y;
            case 3:
                return q0Var.f5932v;
            case 4:
                return q0Var.f5915e;
            case 5:
                return q0Var.f5931u;
            case 6:
                return q0Var.f5925o;
            case 7:
                return q0Var.f5934x;
            case 8:
                return q0Var.f5936z;
            case 9:
                return q0Var.f5909b;
            case 10:
                return q0Var.f5913d;
            case 11:
                return q0Var.M;
            case 12:
                return q0Var.N;
            case 13:
                return q0Var.f5919g;
            case 14:
                return q0Var.f5921i;
            case 15:
                return q0Var.Q;
            case 16:
                return q0Var.R;
            case 17:
                return q0Var.f5927q;
            case TYPE_SINT64_VALUE:
                return q0Var.f5929s;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return q0Var.f5923k;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return q0Var.m;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return q0Var.U;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return q0Var.V;
            case 23:
                return q0Var.A;
            case 24:
                return q0Var.B;
            case 25:
                return q0Var.f5907a;
            case RuntimeVersion.MINOR:
                return q0Var.f5911c;
            case 27:
                return q0Var.K;
            case 28:
                return q0Var.L;
            case 29:
                return q0Var.C;
            case 30:
                return q0Var.f5917f;
            case 31:
                return q0Var.f5920h;
            case CastDevice.CAPABILITY_MULTIZONE_GROUP:
                return q0Var.O;
            case 33:
                return q0Var.P;
            case 34:
                return q0Var.f5926p;
            case 35:
                return q0Var.D;
            case 36:
                return q0Var.F;
            case 37:
                return q0Var.G;
            case 38:
                return q0Var.H;
            case 39:
                return q0Var.I;
            case 40:
                return q0Var.J;
            case 41:
                return q0Var.E;
            case 42:
                return q0Var.f5930t;
            case 43:
                return q0Var.f5928r;
            case 44:
                return q0Var.f5922j;
            case 45:
                return q0Var.l;
            case 46:
                return q0Var.S;
            case 47:
                return q0Var.T;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final long e(k1.g gVar, l1.j jVar) {
        return d((q0) ((l1.g0) jVar).k(f5948a), gVar);
    }
}
