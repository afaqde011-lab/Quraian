package ca;

import a40.e1;
import e1.v0;
import is.j1;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import ri.t1;

public final class e0 implements d40.j {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;

    public e0(d40.j jVar, ZoneId zoneId, LocalDate localDate, LocalDate localDate2) {
        this.A = 3;
        this.C = jVar;
        this.B = zoneId;
        this.D = localDate;
        this.E = localDate2;
    }

    public e0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
        this.E = obj4;
    }

    public e0(kotlin.jvm.internal.z zVar, a40.z zVar2, e40.i iVar, d40.j jVar) {
        this.A = 1;
        this.B = zVar;
        this.D = zVar2;
        this.E = iVar;
        this.C = jVar;
    }

    public java.lang.Object b(int[] r13, k00.c r14) {
        throw new UnsupportedOperationException("Method not decompiled: ca.e0.b(int[], k00.c):java.lang.Object");
    }

    public final Object emit(Object obj, k00.c cVar) {
        e40.h hVar;
        j1 j1Var;
        switch (this.A) {
            case 0:
                return b((int[]) obj, cVar);
            case 1:
                if (cVar instanceof e40.h) {
                    hVar = (e40.h) cVar;
                    int i10 = hVar.E;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        hVar.E = i10 - Integer.MIN_VALUE;
                    } else {
                        hVar = new e40.h(this, cVar);
                    }
                } else {
                    hVar = new e40.h(this, cVar);
                }
                Object obj2 = hVar.C;
                l00.a aVar = l00.a.A;
                int i11 = hVar.E;
                if (i11 == 0) {
                    t1.O(obj2);
                    e1 e1Var = (e1) ((kotlin.jvm.internal.z) this.B).A;
                    if (e1Var != null) {
                        e1Var.i(new ChildCancelledException());
                        hVar.A = this;
                        hVar.B = obj;
                        hVar.E = 1;
                        if (e1Var.F(hVar) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = hVar.B;
                    this = hVar.A;
                    t1.O(obj2);
                }
                ((kotlin.jvm.internal.z) this.B).A = a40.c0.y((a40.z) this.D, (k00.i) null, a40.a0.D, new e40.g((e40.i) this.E, (d40.j) this.C, obj, (k00.c) null), 1);
                return g00.b0.a;
            case 2:
                ((Number) obj).intValue();
                j0.q qVar = ((j0.v) this.B).f7821e;
                int iH = qVar.f7808b.h() / 12;
                int iH2 = (qVar.f7808b.h() % 12) + 1;
                u00.k kVar = (u00.k) this.C;
                h1.t tVar = (h1.t) this.D;
                int i12 = ((z00.c) ((z00.e) this.E)).A + iH;
                h1.v vVar = (h1.v) tVar;
                vVar.getClass();
                kVar.invoke(new Long(vVar.e(LocalDate.of(i12, iH2, 1)).f6538e));
                return g00.b0.a;
            case 3:
                LocalDate localDate = (LocalDate) this.E;
                if (cVar instanceof j1) {
                    j1Var = (j1) cVar;
                    int i13 = j1Var.B;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        j1Var.B = i13 - Integer.MIN_VALUE;
                    } else {
                        j1Var = new j1(this, cVar);
                    }
                } else {
                    j1Var = new j1(this, cVar);
                }
                Object obj3 = j1Var.A;
                l00.a aVar2 = l00.a.A;
                int i14 = j1Var.B;
                if (i14 == 0) {
                    t1.O(obj3);
                    d40.j jVar = (d40.j) this.C;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : (List) obj) {
                        LocalDate localDate2 = Instant.ofEpochSecond(((rs.f) obj4).b).atZone((ZoneId) this.B).toLocalDate();
                        LocalDate localDate3 = (LocalDate) this.D;
                        kotlin.jvm.internal.m.b(localDate);
                        kotlin.jvm.internal.m.e(localDate3, "<this>");
                        kotlin.jvm.internal.m.e(localDate2, "value");
                        if (localDate2.compareTo((Object) localDate3) >= 0 && localDate2.compareTo((Object) localDate) <= 0) {
                            arrayList.add(obj4);
                        }
                    }
                    j1Var.B = 1;
                    if (jVar.emit(arrayList, j1Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj3);
                }
                return g00.b0.a;
            case 4:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                v0 v0Var = (v0) this.D;
                q0.j1 j1Var2 = (q0.j1) this.B;
                if (zBooleanValue && j1Var2.b()) {
                    q0.q.D((r3.x) this.C, j1Var2, v0Var.n(), (r3.j) this.E, v0Var.f5016b);
                } else {
                    q0.q.s(j1Var2);
                }
                return g00.b0.a;
            default:
                f0.h hVar2 = (f0.h) obj;
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.D;
                kotlin.jvm.internal.x xVar2 = (kotlin.jvm.internal.x) this.C;
                kotlin.jvm.internal.x xVar3 = (kotlin.jvm.internal.x) this.B;
                boolean z10 = true;
                if (hVar2 instanceof f0.k) {
                    xVar3.A++;
                } else if ((hVar2 instanceof f0.l) || (hVar2 instanceof f0.j)) {
                    xVar3.A--;
                } else if (hVar2 instanceof f0.f) {
                    xVar2.A++;
                } else if (hVar2 instanceof f0.g) {
                    xVar2.A--;
                } else if (hVar2 instanceof f0.d) {
                    xVar.A++;
                } else if (hVar2 instanceof f0.e) {
                    xVar.A--;
                }
                int i15 = xVar3.A;
                boolean z11 = false;
                boolean z12 = i15 > 0;
                boolean z13 = xVar2.A > 0;
                boolean z14 = xVar.A > 0;
                z.a0 a0Var = (z.a0) this.E;
                if (a0Var.P != z12) {
                    a0Var.P = z12;
                    z11 = true;
                }
                if (a0Var.Q != z13) {
                    a0Var.Q = z13;
                    z11 = true;
                }
                if (a0Var.R != z14) {
                    a0Var.R = z14;
                } else {
                    z10 = z11;
                }
                if (z10) {
                    b3.m.m(a0Var);
                }
                return g00.b0.a;
        }
    }
}
