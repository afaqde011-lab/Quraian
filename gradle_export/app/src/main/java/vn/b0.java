package vn;

import a1.q1;
import a1.r0;
import a40.m0;
import a40.w1;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.concurrent.CancellationException;
import l60.o0;
import ri.t1;

public final class b0 {
    public final co.a a;
    public final xn.e b;
    public final tn.k c;
    public final tn.j d;
    public final u e;
    public final wo.c0 f;
    public final q1 g;
    public final ab.y h;
    public final a40.z i;
    public final j40.c j;

    public b0(co.a aVar, xn.e eVar, tn.k kVar, tn.j jVar, u uVar, wo.c0 c0Var, q1 q1Var, ab.y yVar) {
        w1 w1VarE = a40.c0.e();
        h40.e eVar2 = m0.a;
        f40.c cVarC = a40.c0.c(rd.a.P(w1VarE, h40.d.C).plus(new q3.m(a40.w.A, 3)));
        this.a = aVar;
        this.b = eVar;
        this.c = kVar;
        this.d = jVar;
        this.e = uVar;
        this.f = c0Var;
        this.g = q1Var;
        this.h = yVar;
        this.i = cVarC;
        this.j = j40.d.a();
    }

    public static final Object a(b0 b0Var, Boolean bool, boolean z, rm.c cVar) {
        a40.z zVar = b0Var.i;
        u uVar = b0Var.e;
        g00.b0 b0Var2 = g00.b0.a;
        if (z && kotlin.jvm.internal.m.a(bool, Boolean.FALSE)) {
            SharedPreferences.Editor editorEdit = uVar.a.edit();
            editorEdit.putBoolean("audio_stories_progress_import_pending", true);
            editorEdit.apply();
            a40.c0.y(zVar, null, null, new l6.d(b0Var, (k00.c) null, 19), 3);
            return b0Var2;
        }
        if (z) {
            a40.c0.y(zVar, null, null, new l6.d(b0Var, (k00.c) null, 19), 3);
            return b0Var2;
        }
        if (kotlin.jvm.internal.m.a(bool, Boolean.TRUE)) {
            oi.k.v(uVar.a, "audio_stories_progress_import_pending", false);
            Object objN = rd.a.N(b0Var.b.a, false, true, new xn.a(10), cVar);
            l00.a aVar = l00.a.A;
            if (objN != aVar) {
                objN = b0Var2;
            }
            if (objN == aVar) {
                return objN;
            }
        }
        return b0Var2;
    }

    public static final Object b(b0 b0Var, bo.c cVar, m00.c cVar2) {
        x xVar;
        bo.c cVar3;
        o0 o0Var;
        int i;
        bo.c cVar4;
        int i2;
        int i3;
        boolean z;
        boolean z2;
        un.o oVar;
        boolean zA;
        int i4;
        boolean z3;
        xn.e eVar = b0Var.b;
        if (cVar2 instanceof x) {
            xVar = (x) cVar2;
            int i5 = xVar.F;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                xVar.F = i5 - Integer.MIN_VALUE;
            } else {
                xVar = new x(b0Var, cVar2);
            }
        } else {
            xVar = new x(b0Var, cVar2);
        }
        Object objG = xVar.D;
        l00.a aVar = l00.a.A;
        int i6 = xVar.F;
        Object obj = g00.b0.a;
        if (i6 == 0) {
            t1.O(objG);
            co.a aVar2 = b0Var.a;
            int i7 = cVar.a;
            tn.k kVar = b0Var.c;
            String language = cVar.b;
            long j = cVar.c;
            boolean z4 = cVar.d;
            kotlin.jvm.internal.m.e(language, "language");
            kVar.getClass();
            long jA = ab.a0.A(j, 0L, 86400000L);
            Boolean boolValueOf = Boolean.valueOf(z4);
            if (!z4) {
                boolValueOf = null;
            }
            un.n nVar = new un.n(jA, boolValueOf, r30.k.h1(8, language));
            xVar.A = cVar;
            xVar.F = 1;
            objG = aVar2.g(i7, nVar, xVar);
            if (objG != aVar) {
                cVar3 = cVar;
            }
            return aVar;
        }
        if (i6 == 1) {
            cVar3 = xVar.A;
            t1.O(objG);
        } else {
            if (i6 == 2) {
                i2 = xVar.C;
                o0Var = xVar.B;
                bo.c cVar5 = xVar.A;
                t1.O(objG);
                cVar4 = cVar5;
                bo.c cVar6 = cVar4;
                i = i2;
                cVar3 = cVar6;
                if (o0Var.a.i()) {
                    oVar = (un.o) o0Var.b;
                    if (oVar != null) {
                        zA = kotlin.jvm.internal.m.a(oVar.getIsCompleted(), Boolean.TRUE);
                    } else {
                        zA = false;
                    }
                    if (!zA && !cVar3.d) {
                        int i8 = cVar3.a;
                        String str = cVar3.b;
                        xVar.A = null;
                        xVar.B = null;
                        xVar.C = i;
                        xVar.F = 3;
                        z = false;
                        z2 = true;
                        Object objN = rd.a.N(eVar.a, false, true, new r0(i8, str, 6), xVar);
                        if (objN == aVar) {
                            obj = objN;
                        }
                        if (obj != aVar) {
                            i4 = i;
                        }
                        return aVar;
                    }
                    if (i != 0) {
                        z3 = z2;
                    } else {
                        z3 = z;
                    }
                    return Boolean.valueOf(z3);
                }
                z = false;
                z2 = true;
                if (i != 0) {
                    z3 = z2;
                } else {
                    z3 = z;
                }
                return Boolean.valueOf(z3);
            }
            if (i6 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i4 = xVar.C;
            t1.O(objG);
            z2 = true;
            z = false;
        }
        i = i4;
        if (i != 0) {
            z3 = z2;
        } else {
            z3 = z;
        }
        return Boolean.valueOf(z3);
        o0Var = (o0) objG;
        i = (o0Var.a.i() || (400 <= (i3 = o0Var.a.D) && i3 < 500 && !c0.a.contains(Integer.valueOf(i3)))) ? 1 : 0;
        if (i == 0) {
            if (o0Var.a.i()) {
                oVar = (un.o) o0Var.b;
                if (oVar != null) {
                    zA = kotlin.jvm.internal.m.a(oVar.getIsCompleted(), Boolean.TRUE);
                } else {
                    zA = false;
                }
                if (!zA) {
                }
            }
            z = false;
            z2 = true;
            if (i != 0) {
                z3 = z2;
            } else {
                z3 = z;
            }
            return Boolean.valueOf(z3);
        }
        int i9 = cVar3.a;
        String str2 = cVar3.b;
        long j2 = cVar3.e;
        xVar.A = cVar3;
        xVar.B = o0Var;
        xVar.C = i;
        xVar.F = 2;
        Object objN2 = rd.a.N(eVar.a, false, true, new pl.b(i9, str2, j2, 1), xVar);
        if (objN2 != aVar) {
            objN2 = obj;
        }
        if (objN2 != aVar) {
            int i11 = i;
            cVar4 = cVar3;
            i2 = i11;
            bo.c cVar7 = cVar4;
            i = i2;
            cVar3 = cVar7;
            if (o0Var.a.i()) {
                oVar = (un.o) o0Var.b;
                if (oVar != null) {
                    zA = kotlin.jvm.internal.m.a(oVar.getIsCompleted(), Boolean.TRUE);
                } else {
                    zA = false;
                }
                if (!zA) {
                }
            }
            z = false;
            z2 = true;
            if (i != 0) {
                z3 = z2;
            } else {
                z3 = z;
            }
            return Boolean.valueOf(z3);
        }
        return aVar;
    }

    public static final java.lang.Object c(vn.b0 r30, java.util.List r31, java.util.List r32, m00.c r33) {
        throw new UnsupportedOperationException("Method not decompiled: vn.b0.c(vn.b0, java.util.List, java.util.List, m00.c):java.lang.Object");
    }

    public final java.lang.Object d(m00.c r14) {
        throw new UnsupportedOperationException("Method not decompiled: vn.b0.d(m00.c):java.lang.Object");
    }

    public final Object e(ho.q qVar, m00.c cVar) {
        w wVar;
        ho.q qVar2 = qVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i = wVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                wVar.D = i - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object objN = wVar.B;
        l00.a aVar = l00.a.A;
        int i2 = wVar.D;
        g00.b0 b0Var = g00.b0.a;
        xn.e eVar = this.b;
        if (i2 == 0) {
            t1.O(objN);
            int i3 = qVar2.a;
            String str = qVar2.b;
            wVar.A = qVar2;
            wVar.D = 1;
            objN = rd.a.N(eVar.a, true, false, new r0(i3, str, 5), wVar);
            if (objN != aVar) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objN);
            return b0Var;
        }
        qVar2 = wVar.A;
        t1.O(objN);
        bo.c cVar2 = (bo.c) objN;
        int i4 = qVar2.a;
        String str2 = qVar2.b;
        long j = qVar2.c;
        if (j < 0) {
            j = 0;
        }
        bo.c cVar3 = new bo.c(i4, str2, j, qVar2.d || (cVar2 != null && cVar2.d), System.currentTimeMillis(), true);
        wVar.A = null;
        wVar.D = 2;
        Object objN2 = rd.a.N(eVar.a, false, true, new mu.q(eVar, cVar3, 27), wVar);
        if (objN2 != aVar) {
            objN2 = b0Var;
        }
        return objN2 == aVar ? aVar : b0Var;
    }

    public final Object f(u00.k kVar, m00.c cVar) {
        z zVar;
        boolean zBooleanValue;
        if (cVar instanceof z) {
            zVar = (z) cVar;
            int i = zVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                zVar.C = i - Integer.MIN_VALUE;
            } else {
                zVar = new z(this, cVar);
            }
        } else {
            zVar = new z(this, cVar);
        }
        Object objInvoke = zVar.A;
        Object obj = l00.a.A;
        int i2 = zVar.C;
        try {
            if (i2 == 0) {
                t1.O(objInvoke);
                zVar.C = 1;
                objInvoke = kVar.invoke(zVar);
                if (objInvoke == obj) {
                    return obj;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(objInvoke);
            }
            zBooleanValue = ((Boolean) objInvoke).booleanValue();
        } catch (IOException unused) {
            zBooleanValue = false;
        } catch (CancellationException e) {
            throw e;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    public final java.lang.Object g(m00.c r13) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: vn.b0.g(m00.c):java.lang.Object");
    }
}
