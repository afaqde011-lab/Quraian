package g1;

import java.util.ArrayList;
import java.util.List;

public final class d implements z2.w0 {

    public final float f5751a;

    public final float f5752b;

    public d(float f3, float f10) {
        this.f5751a = f3;
        this.f5752b = f10;
    }

    public static final void a(ArrayList arrayList, kotlin.jvm.internal.x xVar, z2.y0 y0Var, float f3, ArrayList arrayList2, ArrayList arrayList3, kotlin.jvm.internal.x xVar2, ArrayList arrayList4, kotlin.jvm.internal.x xVar3, kotlin.jvm.internal.x xVar4) {
        if (!arrayList.isEmpty()) {
            xVar.A = y0Var.R0(f3) + xVar.A;
        }
        arrayList.add(0, h00.q.n1(arrayList2));
        arrayList3.add(Integer.valueOf(xVar2.A));
        arrayList4.add(Integer.valueOf(xVar.A));
        xVar.A += xVar2.A;
        xVar3.A = Math.max(xVar3.A, xVar4.A);
        arrayList2.clear();
        xVar4.A = 0;
        xVar2.A = 0;
    }

    @Override
    public final z2.x0 j(final z2.y0 y0Var, List list, long j9) {
        z2.l1 l1Var;
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
        kotlin.jvm.internal.x xVar2 = new kotlin.jvm.internal.x();
        ArrayList arrayList4 = new ArrayList();
        kotlin.jvm.internal.x xVar3 = new kotlin.jvm.internal.x();
        kotlin.jvm.internal.x xVar4 = new kotlin.jvm.internal.x();
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            z2.l1 l1VarO = ((z2.v0) list.get(i10)).O(j9);
            boolean zIsEmpty = arrayList4.isEmpty();
            int i11 = size;
            float f3 = this.f5751a;
            if (zIsEmpty) {
                l1Var = l1VarO;
            } else {
                ArrayList arrayList5 = arrayList;
                kotlin.jvm.internal.x xVar5 = xVar2;
                if (y0Var.R0(f3) + xVar3.A + l1VarO.A <= y3.a.h(j9)) {
                    arrayList = arrayList5;
                    xVar2 = xVar5;
                    l1Var = l1VarO;
                } else {
                    xVar2 = xVar5;
                    l1Var = l1VarO;
                    arrayList = arrayList5;
                    a(arrayList, xVar2, y0Var, this.f5752b, arrayList4, arrayList2, xVar4, arrayList3, xVar, xVar3);
                }
            }
            if (!arrayList4.isEmpty()) {
                xVar3.A = y0Var.R0(f3) + xVar3.A;
            }
            arrayList4.add(l1Var);
            xVar3.A += l1Var.A;
            xVar4.A = Math.max(xVar4.A, l1Var.B);
            i10++;
            size = i11;
        }
        if (!arrayList4.isEmpty()) {
            a(arrayList, xVar2, y0Var, this.f5752b, arrayList4, arrayList2, xVar4, arrayList3, xVar, xVar3);
        }
        final int iMax = Math.max(xVar.A, y3.a.j(j9));
        int iMax2 = Math.max(xVar2.A, y3.a.i(j9));
        final float f10 = this.f5751a;
        return y0Var.o0(iMax, iMax2, h00.y.A, new u00.k() {
            public final Object invoke(Object obj) {
                z2.y0 y0Var2;
                z2.k1 k1Var = (z2.k1) obj;
                ArrayList arrayList6 = arrayList;
                int size2 = arrayList6.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    List list2 = (List) arrayList6.get(i12);
                    int size3 = list2.size();
                    int[] iArr = new int[size3];
                    int i13 = 0;
                    while (true) {
                        y0Var2 = y0Var;
                        if (i13 >= size3) {
                            break;
                        }
                        iArr[i13] = ((z2.l1) list2.get(i13)).A + (i13 < va.a.M(list2) ? y0Var2.R0(f10) : 0);
                        i13++;
                    }
                    int[] iArr2 = new int[size3];
                    h0.i.f6407b.c(y0Var2, iMax, iArr, y0Var2.getLayoutDirection(), iArr2);
                    int size4 = list2.size();
                    for (int i14 = 0; i14 < size4; i14++) {
                        k1Var.h((z2.l1) list2.get(i14), iArr2[i14], ((Number) arrayList3.get(i12)).intValue(), 0.0f);
                    }
                }
                return g00.b0.a;
            }
        });
    }
}
