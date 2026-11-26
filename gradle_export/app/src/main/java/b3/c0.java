package b3;

import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class c0 implements Comparator {
    public final int A;

    public c0(int i10) {
        this.A = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                l0 l0Var = (l0) obj;
                l0 l0Var2 = (l0) obj2;
                float f3 = l0Var.f2060h0.f2122p.f2015e0;
                float f10 = l0Var2.f2060h0.f2122p.f2015e0;
                return f3 == f10 ? kotlin.jvm.internal.m.f(l0Var.y(), l0Var2.y()) : Float.compare(f3, f10);
            case 1:
                return Integer.compare(((g9.d) obj).f6265a.f6268b, ((g9.d) obj2).f6265a.f6268b);
            case 2:
                return Long.compare(((g9.c) obj).f6262b, ((g9.c) obj2).f6262b);
            case 3:
                return kotlin.jvm.internal.m.f(((l0.n1) obj2).f9778a, ((l0.n1) obj).f9778a);
            case 4:
                return kotlin.jvm.internal.m.f(((l0.p0) obj).getIndex(), ((l0.p0) obj2).getIndex());
            case 5:
                return kotlin.jvm.internal.m.f(((l1.l0) obj).f9897b, ((l1.l0) obj2).f9897b);
            case 6:
                m7.b bVar = (m7.b) obj;
                m7.b bVar2 = (m7.b) obj2;
                int iCompare = Integer.compare(bVar.f10578c, bVar2.f10578c);
                return iCompare != 0 ? iCompare : bVar.f10577b.compareTo(bVar2.f10577b);
            case 7:
                m9.f0 f0Var = (m9.f0) obj;
                m9.f0 f0Var2 = (m9.f0) obj2;
                int iCompare2 = Integer.compare(f0Var2.f10661b, f0Var.f10661b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompareTo = f0Var.f10662c.compareTo(f0Var2.f10662c);
                return iCompareTo != 0 ? iCompareTo : f0Var.f10663d.compareTo(f0Var2.f10663d);
            case 8:
                m9.f0 f0Var3 = (m9.f0) obj;
                m9.f0 f0Var4 = (m9.f0) obj2;
                int iCompare3 = Integer.compare(f0Var4.f10660a, f0Var3.f10660a);
                if (iCompare3 != 0) {
                    return iCompare3;
                }
                int iCompareTo2 = f0Var4.f10662c.compareTo(f0Var3.f10662c);
                return iCompareTo2 != 0 ? iCompareTo2 : f0Var4.f10663d.compareTo(f0Var3.f10663d);
            case 9:
                z00.e eVar = (z00.e) obj;
                z00.e eVar2 = (z00.e) obj2;
                return (((z00.c) eVar).B - ((z00.c) eVar).A) - (((z00.c) eVar2).B - ((z00.c) eVar2).A);
            case 10:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 11:
                return ((ri.f0) ((ri.q1) obj)).f13335a.compareTo(((ri.f0) ((ri.q1) obj2)).f13335a);
            case 12:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 13:
                String name = ((File) obj).getName();
                int i10 = ui.a.f15296f;
                return name.substring(0, i10).compareTo(((File) obj2).getName().substring(0, i10));
            case 14:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i11 = 0; i11 < bArr.length; i11++) {
                    byte b7 = bArr[i11];
                    byte b10 = bArr2[i11];
                    if (b7 != b10) {
                        return b7 - b10;
                    }
                }
                return 0;
            case 15:
                return ((androidx.media3.common.t) obj2).f1592j - ((androidx.media3.common.t) obj).f1592j;
            case 16:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 17:
                return Integer.compare(((v7.g) ((List) obj).get(0)).F, ((v7.g) ((List) obj2).get(0)).F);
            case TYPE_SINT64_VALUE:
                List list = (List) obj;
                List list2 = (List) obj2;
                int i12 = 22;
                return fh.e0.f(v7.o.c((v7.o) Collections.max(list, new c0(21)), (v7.o) Collections.max(list2, new c0(21)))).a(list.size(), list2.size()).b((v7.o) Collections.max(list, new c0(i12)), (v7.o) Collections.max(list2, new c0(i12)), new c0(i12)).e();
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return ((v7.f) Collections.max((List) obj)).compareTo((v7.f) Collections.max((List) obj2));
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return ((v7.l) ((List) obj).get(0)).compareTo((v7.l) ((List) obj2).get(0));
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return v7.o.c((v7.o) obj, (v7.o) obj2);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                v7.o oVar = (v7.o) obj;
                v7.o oVar2 = (v7.o) obj2;
                boolean z10 = oVar.E;
                int i13 = oVar.J;
                fh.b2 b2VarA = (z10 && oVar.H) ? v7.p.f15511k : v7.p.f15511k.a();
                boolean z11 = oVar.F.F;
                fh.g0 g0VarB = fh.g0.f5672a;
                if (z11) {
                    g0VarB = g0VarB.b(Integer.valueOf(i13), Integer.valueOf(oVar2.J), v7.p.f15511k.a());
                }
                return g0VarB.b(Integer.valueOf(oVar.K), Integer.valueOf(oVar2.K), b2VarA).b(Integer.valueOf(i13), Integer.valueOf(oVar2.J), b2VarA).e();
            case 23:
                return ((w7.p) obj).f15879a - ((w7.p) obj2).f15879a;
            case 24:
                return Float.compare(((w7.p) obj).f15881c, ((w7.p) obj2).f15881c);
            default:
                return Integer.compare(((y8.d) obj2).f16804b, ((y8.d) obj).f16804b);
        }
    }
}
