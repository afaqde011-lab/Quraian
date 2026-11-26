package q8;

import a10.h0;
import a8.n0;
import androidx.media3.common.u0;
import androidx.media3.common.v0;
import com.google.android.gms.cast.Cast;
import e7.e0;
import e7.u;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m10.z;

public final class c extends h0 {

    public final u f12779f = new u();

    public final n0 f12780g = new n0();

    public e0 f12781h;

    public final v0 t(j8.a aVar, ByteBuffer byteBuffer) {
        u0 eVar;
        long j9;
        long j10;
        u uVar = this.f12779f;
        n0 n0Var = this.f12780g;
        e0 e0Var = this.f12781h;
        if (e0Var != null) {
            long j11 = aVar.J;
            synchronized (e0Var) {
                j10 = e0Var.f5125b;
            }
            if (j11 != j10) {
                e0 e0Var2 = new e0(aVar.G);
                this.f12781h = e0Var2;
                e0Var2.a(aVar.G - aVar.J);
            }
        } else {
            e0 e0Var3 = new e0(aVar.G);
            this.f12781h = e0Var3;
            e0Var3.a(aVar.G - aVar.J);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        uVar.L(iLimit, bArrArray);
        n0Var.o(iLimit, bArrArray);
        n0Var.t(39);
        long jI = (((long) n0Var.i(1)) << 32) | ((long) n0Var.i(32));
        n0Var.t(20);
        int i10 = n0Var.i(12);
        int i11 = n0Var.i(8);
        uVar.O(14);
        if (i11 == 0) {
            eVar = new e();
        } else if (i11 == 255) {
            long jC = uVar.C();
            int i12 = i10 - 4;
            uVar.k(0, i12, new byte[i12]);
            eVar = new a(0, jC, jI);
        } else if (i11 == 4) {
            int iA = uVar.A();
            ArrayList arrayList = new ArrayList(iA);
            for (int i13 = 0; i13 < iA; i13++) {
                uVar.C();
                boolean z10 = (uVar.A() & Cast.MAX_NAMESPACE_LENGTH) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z10) {
                    int iA2 = uVar.A();
                    boolean z11 = (iA2 & 64) != 0;
                    boolean z12 = (iA2 & 32) != 0;
                    if (z11) {
                        uVar.C();
                    }
                    if (!z11) {
                        int iA3 = uVar.A();
                        ArrayList arrayList3 = new ArrayList(iA3);
                        for (int i14 = 0; i14 < iA3; i14++) {
                            uVar.A();
                            uVar.C();
                            arrayList3.add(new hb.f());
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z12) {
                        uVar.A();
                        uVar.C();
                    }
                    uVar.H();
                    uVar.A();
                    uVar.A();
                }
                arrayList.add(new z(arrayList2));
            }
            eVar = new f(arrayList);
        } else if (i11 == 5) {
            e0 e0Var4 = this.f12781h;
            uVar.C();
            boolean z13 = (uVar.A() & Cast.MAX_NAMESPACE_LENGTH) != 0;
            List list = Collections.EMPTY_LIST;
            if (z13) {
                j9 = -9223372036854775807L;
            } else {
                int iA4 = uVar.A();
                boolean z14 = (iA4 & 64) != 0;
                boolean z15 = (iA4 & 32) != 0;
                boolean z16 = (iA4 & 16) != 0;
                long jD = (!z14 || z16) ? -9223372036854775807L : a.d(jI, uVar);
                if (!z14) {
                    int iA5 = uVar.A();
                    ArrayList arrayList4 = new ArrayList(iA5);
                    for (int i15 = 0; i15 < iA5; i15++) {
                        uVar.A();
                        e0Var4.b(!z16 ? a.d(jI, uVar) : -9223372036854775807L);
                        arrayList4.add(new gj.e(28));
                    }
                    list = arrayList4;
                }
                if (z15) {
                    uVar.A();
                    uVar.C();
                }
                uVar.H();
                uVar.A();
                uVar.A();
                j9 = jD;
            }
            eVar = new d(j9, e0Var4.b(j9), list);
        } else if (i11 != 6) {
            eVar = null;
        } else {
            e0 e0Var5 = this.f12781h;
            long jD2 = a.d(jI, uVar);
            eVar = new a(1, jD2, e0Var5.b(jD2));
        }
        return eVar == null ? new v0(new u0[0]) : new v0(eVar);
    }
}
