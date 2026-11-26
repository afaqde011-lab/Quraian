package z0;

import java.util.List;
import kotlin.jvm.internal.m;
import l1.i1;
import m3.h0;
import m3.q0;
import q3.e0;
import y1.j;
import z1.p;

public final class e implements f, j {
    public static final e B = new e(0);
    public static final e C = new e(1);
    public final int A;

    public e(int i10) {
        this.A = i10;
    }

    @Override
    public Object c(y1.b bVar, Object obj) {
        List listS;
        switch (this.A) {
            case 1:
                g gVar = (g) obj;
                String string = gVar.d().C.toString();
                long j9 = gVar.d().D;
                int i10 = q0.f10519c;
                Integer numValueOf = Integer.valueOf((int) (j9 >> 32));
                Integer numValueOf2 = Integer.valueOf((int) (gVar.d().D & 4294967295L));
                e0 e0Var = gVar.f16993a;
                c1.d dVar = (c1.d) ((i1) e0Var.C).getValue();
                if (dVar != null) {
                    Integer numValueOf3 = Integer.valueOf(dVar.f2599a);
                    String str = dVar.f2600b;
                    String str2 = dVar.f2601c;
                    long j10 = dVar.f2602d;
                    int i11 = q0.f10519c;
                    Integer numValueOf4 = Integer.valueOf((int) (j10 >> 32));
                    Integer numValueOf5 = Integer.valueOf((int) (j10 & 4294967295L));
                    long j11 = dVar.f2603e;
                    listS = va.a.S(numValueOf3, str, str2, numValueOf4, numValueOf5, Integer.valueOf((int) (j11 >> 32)), Integer.valueOf((int) (j11 & 4294967295L)), Long.valueOf(dVar.f2604f));
                } else {
                    listS = null;
                }
                return va.a.S(string, numValueOf, numValueOf2, va.a.S(listS, h.A.c(bVar, (c1.e) e0Var.B)));
            default:
                c1.e eVar = (c1.e) obj;
                i00.b bVarS = va.a.s();
                bVarS.add(Integer.valueOf(eVar.f2607a));
                p pVar = eVar.f2608b;
                bVarS.add(Integer.valueOf(pVar.size()));
                p pVar2 = eVar.f2609c;
                bVarS.add(Integer.valueOf(pVar2.size()));
                int size = pVar.size();
                int i12 = 0;
                while (true) {
                    gj.e eVar2 = c1.d.f2598i;
                    if (i12 >= size) {
                        int size2 = pVar2.size();
                        for (int i13 = 0; i13 < size2; i13++) {
                            bVarS.add(eVar2.c(bVar, pVar2.get(i13)));
                        }
                        return va.a.k(bVarS);
                    }
                    bVarS.add(eVar2.c(bVar, pVar.get(i12)));
                    i12++;
                }
                break;
        }
    }

    @Override
    public Object f(Object obj) {
        switch (this.A) {
            case 1:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Object obj3 = list.get(1);
                Object obj4 = list.get(2);
                Object obj5 = list.get(3);
                m.c(obj2, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj2;
                m.c(obj3, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj3).intValue();
                m.c(obj4, "null cannot be cast to non-null type kotlin.Int");
                long jB = h0.b(iIntValue, ((Integer) obj4).intValue());
                m.b(obj5);
                List list2 = (List) obj5;
                Object obj6 = list2.get(0);
                Object obj7 = list2.get(1);
                c1.d dVar = obj6 != null ? (c1.d) c1.d.f2598i.f(obj6) : null;
                m.b(obj7);
                return new g(str, jB, new e0(dVar, (c1.e) h.A.f(obj7)));
            default:
                List list3 = (List) obj;
                int iIntValue2 = ((Number) list3.get(0)).intValue();
                int iIntValue3 = ((Number) list3.get(1)).intValue();
                int iIntValue4 = ((Number) list3.get(2)).intValue();
                i00.b bVarS = va.a.s();
                int i10 = 3;
                while (true) {
                    int i11 = iIntValue3 + 3;
                    gj.e eVar = c1.d.f2598i;
                    if (i10 >= i11) {
                        i00.b bVarK = va.a.k(bVarS);
                        i00.b bVarS2 = va.a.s();
                        while (i10 < iIntValue3 + iIntValue4 + 3) {
                            bVarS2.add(eVar.f(list3.get(i10)));
                            i10++;
                        }
                        return new c1.e(bVarK, va.a.k(bVarS2), iIntValue2);
                    }
                    bVarS.add(eVar.f(list3.get(i10)));
                    i10++;
                }
                break;
        }
    }

    public String toString() {
        switch (this.A) {
            case 0:
                return "TextFieldLineLimits.SingleLine";
            default:
                return super.toString();
        }
    }
}
