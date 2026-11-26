package fy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import l1.e1;
import l1.z0;
import ri.t1;

public final class b0 extends m00.i implements u00.n {
    public final int A = 0;
    public final boolean B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;

    public b0(String str, cy.i iVar, boolean z, Set set, c0 c0Var, k00.c cVar) {
        super(2, cVar);
        this.C = str;
        this.D = iVar;
        this.B = z;
        this.E = set;
        this.F = c0Var;
    }

    public b0(boolean z, z1.p pVar, z0 z0Var, e1 e1Var, z0 z0Var2, k00.c cVar) {
        super(2, cVar);
        this.B = z;
        this.C = pVar;
        this.D = z0Var;
        this.E = e1Var;
        this.F = z0Var2;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new b0((String) this.C, (cy.i) this.D, this.B, (Set) this.E, (c0) this.F, cVar);
            default:
                return new b0(this.B, (z1.p) this.C, (z0) this.D, (e1) this.E, (z0) this.F, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                return ((b0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
            default:
                b0 b0Var = (b0) create(zVar, cVar);
                g00.b0 b0Var2 = g00.b0.a;
                b0Var.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z;
        a2.o oVar;
        ay.f fVar;
        int iIntValue;
        cy.e eVar;
        int iIntValue2;
        int i;
        Iterator it;
        int iMax;
        boolean z2;
        cy.e eVar2;
        String str;
        int i2 = this.A;
        Object obj2 = this.C;
        boolean z3 = this.B;
        Object obj3 = this.D;
        Object obj4 = this.E;
        Object obj5 = this.F;
        switch (i2) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                String query = (String) obj2;
                cy.i catalog = (cy.i) obj3;
                Set set = (Set) obj4;
                c0 c0Var = (c0) obj5;
                kotlin.jvm.internal.m.e(query, "query");
                kotlin.jvm.internal.m.e(catalog, "catalog");
                if (!catalog.e) {
                    String strH1 = r30.k.h1(64, r30.k.j1(query).toString());
                    if (strH1.length() == 0) {
                        oVar = null;
                    } else {
                        String strC = ay.e.c(strH1);
                        ArrayList arrayListD = ay.e.d(strH1);
                        if (strC.length() == 0 && arrayListD.isEmpty()) {
                            oVar = null;
                        } else {
                            int i3 = 0;
                            while (true) {
                                if (i3 >= strH1.length()) {
                                    z = true;
                                } else if (Character.isDigit(strH1.charAt(i3))) {
                                    i3++;
                                } else {
                                    z = false;
                                }
                            }
                            String strH2 = r30.k.h1(64, r30.k.j1(strH1).toString());
                            int iI0 = r30.k.I0(strH2, ':', 0, 6);
                            if (iI0 < 0) {
                                fVar = null;
                            } else {
                                String strSubstring = strH2.substring(0, iI0);
                                kotlin.jvm.internal.m.d(strSubstring, "substring(...)");
                                Integer numY0 = r30.r.y0(r30.k.j1(strSubstring).toString());
                                if (numY0 == null || 1 > (iIntValue = numY0.intValue()) || iIntValue >= 115) {
                                    numY0 = null;
                                }
                                String strSubstring2 = strH2.substring(iI0 + 1);
                                kotlin.jvm.internal.m.d(strSubstring2, "substring(...)");
                                String string = r30.k.j1(strSubstring2).toString();
                                Integer numY1 = r30.r.y0(string);
                                if (numY1 == null || numY1.intValue() < 1) {
                                    numY1 = null;
                                }
                                fVar = (numY0 == null || !(string.length() == 0 || numY1 != null)) ? null : new ay.f(numY0.intValue(), numY1);
                            }
                            oVar = new a2.o(strH1, strC, arrayListD, fVar, z, z ? r30.r.y0(strH1) : null);
                        }
                    }
                    if (oVar != null) {
                        String str2 = (String) oVar.A;
                        boolean z4 = oVar.C;
                        ay.f fVar2 = (ay.f) oVar.E;
                        ArrayList arrayList = (ArrayList) oVar.D;
                        ArrayList arrayList2 = new ArrayList(catalog.f);
                        if (fVar2 == null) {
                            eVar = null;
                        } else {
                            int i4 = fVar2.a;
                            cy.l lVar = (cy.l) catalog.d.get(Integer.valueOf(i4));
                            if (lVar != null) {
                                cy.m mVar = lVar.b;
                                Integer numValueOf = Integer.valueOf(i4);
                                if (z3 && !set.contains(numValueOf)) {
                                    mVar = null;
                                }
                                if (mVar != null) {
                                    int i5 = mVar.a;
                                    Integer num = fVar2.b;
                                    Integer num2 = (num == null || 1 > (iIntValue2 = num.intValue()) || iIntValue2 > mVar.e) ? null : num;
                                    eVar = new cy.e(w.c.h(i5, num2 != null ? num2.intValue() : 0, "surah-", "-"), cy.f.B, 200, null, Integer.valueOf(i5), mVar.b, mVar.c, mVar.d, num2, null, num2 != null ? c0Var.m.a(2131886538, num2) : null, 520);
                                } else {
                                    eVar = null;
                                }
                            } else {
                                eVar = null;
                            }
                        }
                        if (eVar != null) {
                            arrayList2.add(eVar);
                        }
                        for (cy.k kVar : catalog.a) {
                            int iC = ay.c.c(oVar, kVar.c, ay.d.a);
                            if (iC < 100) {
                                iC = Math.max(iC, ay.c.c(oVar, kVar.d, ay.d.b));
                            }
                            int i6 = (iC >= 30 || (str = kVar.e) == null || !ay.e.a(str, arrayList)) ? iC : 30;
                            if (i6 <= 0) {
                                eVar2 = null;
                            } else {
                                String str3 = kVar.f;
                                cy.f fVar3 = cy.f.A;
                                bx.c cVar = kVar.b;
                                eVar2 = new cy.e(str3, fVar3, i6, cVar, null, null, null, null, null, null, cVar.i, 1008);
                            }
                            if (eVar2 != null) {
                                arrayList2.add(eVar2);
                            }
                        }
                        Iterator it2 = catalog.b.iterator();
                        while (it2.hasNext()) {
                            cy.l lVar2 = (cy.l) it2.next();
                            int i7 = lVar2.b.a;
                            if (fVar2 == null || i7 != fVar2.a) {
                                Integer numValueOf2 = Integer.valueOf(i7);
                                if (!z3 || set.contains(numValueOf2)) {
                                    cy.m mVar2 = lVar2.b;
                                    int i8 = mVar2.a;
                                    String str4 = (String) oVar.B;
                                    Integer num3 = (Integer) oVar.F;
                                    if (z4) {
                                        String str5 = lVar2.f;
                                        it = it2;
                                        iMax = (num3 != null && i8 == num3.intValue()) ? 100 : r30.k.A0(str5, str2, false) ? 80 : 0;
                                        int i9 = mVar2.e;
                                        if (num3 != null && i9 == num3.intValue()) {
                                            iMax = Math.max(iMax, 55);
                                        }
                                        if (iMax < 75) {
                                            z2 = false;
                                            if (r30.k.A0(str5, str2, false)) {
                                                iMax = 75;
                                            }
                                        } else {
                                            z2 = false;
                                        }
                                        if (iMax < 50 && r30.k.A0(lVar2.g, str2, z2)) {
                                            iMax = 50;
                                        }
                                    } else {
                                        it = it2;
                                        z4 = z4;
                                        iMax = 0;
                                    }
                                    int i11 = 90;
                                    if (iMax < 90) {
                                        String str6 = lVar2.c;
                                        if (str6.length() == 0 || str4.length() == 0) {
                                            i11 = 0;
                                        } else if (!str6.equals(str4)) {
                                            if (r30.r.x0(str6, str4, false)) {
                                                i11 = 80;
                                            } else if (ay.e.a(str6, arrayList)) {
                                                i11 = 70;
                                            } else {
                                                i11 = 0;
                                            }
                                        }
                                        iMax = Math.max(iMax, i11);
                                    }
                                    if (iMax < 75) {
                                        String str7 = lVar2.d;
                                        a8.d dVar = ay.d.c;
                                        iMax = Math.max(Math.max(iMax, ay.c.b(oVar, str7, dVar)), ay.c.b(oVar, lVar2.e, dVar));
                                    }
                                    int i12 = iMax;
                                    cy.e eVar3 = i12 <= 0 ? null : new cy.e(lVar2.h, cy.f.B, i12, null, Integer.valueOf(i8), mVar2.b, mVar2.c, mVar2.d, null, null, null, 1800);
                                    if (eVar3 != null) {
                                        arrayList2.add(eVar3);
                                    }
                                    it2 = it;
                                    z4 = z4;
                                }
                            }
                        }
                        boolean z5 = z4;
                        for (cy.j jVar : catalog.c) {
                            int iC2 = ay.c.c(oVar, jVar.c, ay.d.d);
                            if (iC2 < 45) {
                                Iterator it3 = jVar.d.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        cy.h hVar = (cy.h) it3.next();
                                        r30.j jVar2 = ay.e.a;
                                        if (ay.e.b(arrayList, hVar.c) || (z5 && r30.k.A0(hVar.b, str2, false))) {
                                            i = 45;
                                        } else if (iC2 < 42 && ay.e.b(arrayList, hVar.d)) {
                                            iC2 = 42;
                                        }
                                    } else {
                                        i = iC2;
                                    }
                                }
                            } else {
                                i = iC2;
                            }
                            cy.e eVar4 = i <= 0 ? null : new cy.e(jVar.e, cy.f.C, i, null, null, null, null, null, null, jVar.b, null, 1528);
                            if (eVar4 != null) {
                                arrayList2.add(eVar4);
                            }
                        }
                        h00.u.t0(arrayList2, ay.c.a);
                        if (arrayList2.size() <= 100) {
                            return arrayList2;
                        }
                        List listSubList = arrayList2.subList(0, 100);
                        kotlin.jvm.internal.m.d(listSubList, "subList(...)");
                        return h00.q.n1(listSubList);
                    }
                }
                return h00.x.A;
            default:
                z0 z0Var = (z0) obj5;
                e1 e1Var = (e1) obj4;
                z0 z0Var2 = (z0) obj3;
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                if (z3) {
                    z0Var2.setValue(Boolean.FALSE);
                    e1Var.i(0.0f);
                    z0Var.setValue((Object) null);
                } else {
                    z0Var2.setValue(Boolean.FALSE);
                    e1Var.i(0.0f);
                    z0Var.setValue((Object) null);
                    ((z1.p) obj2).clear();
                }
                return g00.b0.a;
        }
    }
}
