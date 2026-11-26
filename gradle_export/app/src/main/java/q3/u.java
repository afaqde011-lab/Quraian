package q3;

import com.google.android.gms.cast.MediaError;
import java.util.List;

public final class u implements Comparable {
    public static final u B;
    public static final u C;
    public static final u D;
    public static final u E;
    public static final u F;
    public static final u G;
    public static final u H;
    public static final u I;
    public static final u J;
    public static final u K;
    public static final u L;
    public static final u M;
    public static final u N;
    public static final u O;
    public static final List P;
    public final int A;

    static {
        u uVar = new u(100);
        u uVar2 = new u(MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN);
        u uVar3 = new u(MediaError.DetailedErrorCode.NETWORK_UNKNOWN);
        u uVar4 = new u(MediaError.DetailedErrorCode.MANIFEST_UNKNOWN);
        B = uVar4;
        u uVar5 = new u(MediaError.DetailedErrorCode.SEGMENT_UNKNOWN);
        C = uVar5;
        u uVar6 = new u(MediaError.DetailedErrorCode.TEXT_UNKNOWN);
        D = uVar6;
        u uVar7 = new u(700);
        E = uVar7;
        u uVar8 = new u(800);
        F = uVar8;
        u uVar9 = new u(MediaError.DetailedErrorCode.APP);
        G = uVar;
        H = uVar2;
        I = uVar3;
        J = uVar4;
        K = uVar5;
        L = uVar6;
        M = uVar7;
        N = uVar8;
        O = uVar9;
        P = va.a.S(uVar, uVar2, uVar3, uVar4, uVar5, uVar6, uVar7, uVar8, uVar9);
    }

    public u(int i10) {
        this.A = i10;
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        s3.a.a("Font weight can be in range [1, 1000]. Current value: " + i10);
    }

    @Override
    public final int compareTo(u uVar) {
        return kotlin.jvm.internal.m.f(this.A, uVar.A);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u) {
            return this.A == ((u) obj).A;
        }
        return false;
    }

    public final int hashCode() {
        return this.A;
    }

    public final String toString() {
        return oi.k.l(new StringBuilder("FontWeight(weight="), this.A, ')');
    }
}
