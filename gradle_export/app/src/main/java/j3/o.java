package j3;

import c3.m0;
import com.google.protobuf.RuntimeVersion;
import java.util.Iterator;
import u.i0;
import u.q0;

public final class o implements a0, Iterable, v00.a {
    public final i0 A;
    public u.t B;
    public boolean C;
    public boolean D;

    public o() {
        long[] jArr = q0.f14885a;
        this.A = new i0();
    }

    @Override
    public final void a(z zVar, Object obj) {
        boolean z10 = obj instanceof a;
        i0 i0Var = this.A;
        if (z10 && i0Var.c(zVar)) {
            Object objG = i0Var.g(zVar);
            kotlin.jvm.internal.m.c(objG, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            a aVar = (a) objG;
            a aVar2 = (a) obj;
            String str = aVar2.f7926a;
            if (str == null) {
                str = aVar.f7926a;
            }
            g00.e eVar = aVar2.f7927b;
            if (eVar == null) {
                eVar = aVar.f7927b;
            }
            i0Var.m(zVar, new a(str, eVar));
        } else {
            i0Var.m(zVar, obj);
        }
        zVar.getClass();
    }

    public final o c() {
        o oVar = new o();
        oVar.C = this.C;
        oVar.D = this.D;
        i0 i0Var = oVar.A;
        i0Var.getClass();
        i0 i0Var2 = this.A;
        kotlin.jvm.internal.m.e(i0Var2, "from");
        Object[] objArr = i0Var2.f14857b;
        Object[] objArr2 = i0Var2.f14858c;
        long[] jArr = i0Var2.f14856a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128) {
                            int i13 = (i10 << 3) + i12;
                            i0Var.m(objArr[i13], objArr2[i13]);
                        }
                        j9 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return oVar;
    }

    public final Object e(z zVar) {
        Object objG = this.A.g(zVar);
        if (objG != null) {
            return objG;
        }
        throw new IllegalStateException("Key not present: " + zVar + " - consider getOrElse or getOrNull");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.m.a(this.A, oVar.A) && this.C == oVar.C && this.D == oVar.D;
    }

    public final void h(o oVar) {
        i0 i0Var = oVar.A;
        Object[] objArr = i0Var.f14857b;
        Object[] objArr2 = i0Var.f14858c;
        long[] jArr = i0Var.f14856a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j9 = jArr[i10];
            if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j9) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Object obj2 = objArr2[i13];
                        z zVar = (z) obj;
                        i0 i0Var2 = this.A;
                        Object objG = i0Var2.g(zVar);
                        kotlin.jvm.internal.m.c(zVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objInvoke = zVar.f8006b.invoke(objG, obj2);
                        if (objInvoke != null) {
                            i0Var2.m(zVar, objInvoke);
                        }
                    }
                    j9 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final int hashCode() {
        return Boolean.hashCode(this.D) + w.c.e(this.A.hashCode() * 31, 31, this.C);
    }

    @Override
    public final Iterator iterator() {
        u.t tVar = this.B;
        if (tVar == null) {
            i0 i0Var = this.A;
            u.t tVar2 = i0Var.f14861f;
            if (tVar2 == null) {
                tVar2 = new u.t(i0Var);
                i0Var.f14861f = tVar2;
            }
            tVar = tVar2;
            this.B = tVar;
        }
        return ((u.g) tVar.entrySet()).iterator();
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        if (this.C) {
            sb2.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = RuntimeVersion.SUFFIX;
        }
        if (this.D) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        i0 i0Var = this.A;
        Object[] objArr = i0Var.f14857b;
        Object[] objArr2 = i0Var.f14858c;
        long[] jArr = i0Var.f14856a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j9 = jArr[i10];
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j9) < 128) {
                            int i13 = (i10 << 3) + i12;
                            Object obj = objArr[i13];
                            Object obj2 = objArr2[i13];
                            sb2.append(str);
                            sb2.append(((z) obj).f8005a);
                            sb2.append(" : ");
                            sb2.append(obj2);
                            str = ", ";
                        }
                        j9 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return m0.w(this) + "{ " + ((Object) sb2) + " }";
    }
}
