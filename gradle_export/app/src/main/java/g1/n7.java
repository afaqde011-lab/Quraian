package g1;

import java.util.ArrayList;
import java.util.List;

public final class n7 implements z2.w0 {

    public final float f5894a;

    public n7(float f3) {
        this.f5894a = f3;
    }

    @Override
    public final z2.x0 j(z2.y0 y0Var, List list, final long j9) {
        Object obj;
        Object obj2;
        final float fG = y3.a.g(j9) * this.f5894a;
        int i10 = 0;
        long jA = y3.a.a(j9, 0, 0, 0, 0, 10);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj3 = list.get(i11);
            z2.v0 v0Var = (z2.v0) obj3;
            if (z2.d0.j(v0Var) != s3.A && z2.d0.j(v0Var) != s3.B) {
                arrayList.add(obj3);
            }
        }
        final ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i12 = 0; i12 < size2; i12++) {
            arrayList2.add(((z2.v0) arrayList.get(i12)).O(jA));
        }
        int size3 = list.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                obj = null;
                break;
            }
            obj = list.get(i13);
            if (z2.d0.j((z2.v0) obj) == s3.A) {
                break;
            }
            i13++;
        }
        z2.v0 v0Var2 = (z2.v0) obj;
        int size4 = list.size();
        while (true) {
            if (i10 >= size4) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i10);
            if (z2.d0.j((z2.v0) obj2) == s3.B) {
                break;
            }
            i10++;
        }
        z2.v0 v0Var3 = (z2.v0) obj2;
        final float size5 = 6.2831855f / arrayList2.size();
        z2.l1 l1VarO = v0Var2 != null ? v0Var2.O(jA) : null;
        final z2.l1 l1VarO2 = v0Var3 != null ? v0Var3.O(jA) : null;
        final z2.l1 l1Var = l1VarO;
        return y0Var.o0(y3.a.j(j9), y3.a.i(j9), h00.y.A, new u00.k() {
            public final Object invoke(Object obj4) {
                long j10;
                z2.k1 k1Var = (z2.k1) obj4;
                int i14 = 0;
                z2.l1 l1Var2 = l1Var;
                if (l1Var2 != null) {
                    k1Var.h(l1Var2, 0, 0, 0.0f);
                }
                ArrayList arrayList3 = arrayList2;
                int size6 = arrayList3.size();
                while (true) {
                    j10 = j9;
                    if (i14 >= size6) {
                        break;
                    }
                    z2.l1 l1Var3 = (z2.l1) arrayList3.get(i14);
                    int iH = (y3.a.h(j10) / 2) - (l1Var3.A / 2);
                    int iG = (y3.a.g(j10) / 2) - (l1Var3.B / 2);
                    double d3 = fG;
                    double d5 = ((double) (size5 * i14)) - 1.5707963267948966d;
                    k1Var.h(l1Var3, w00.a.E((Math.cos(d5) * d3) + ((double) iH)), w00.a.E((Math.sin(d5) * d3) + ((double) iG)), 0.0f);
                    i14++;
                    arrayList3 = arrayList3;
                }
                z2.l1 l1Var4 = l1VarO2;
                if (l1Var4 != null) {
                    k1Var.h(l1Var4, (y3.a.j(j10) - l1Var4.A) / 2, (y3.a.i(j10) - l1Var4.B) / 2, 0.0f);
                }
                return g00.b0.a;
            }
        });
    }
}
