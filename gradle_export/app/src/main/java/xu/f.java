package xu;

import a40.c0;
import a40.m0;
import a40.u1;
import a40.w1;
import a40.z;
import android.content.SharedPreferences;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.f1;
import com.google.android.gms.internal.measurement.b5;
import d40.d1;
import d40.o;
import d40.p1;
import f40.m;
import g00.b0;
import h00.d0;
import h00.q;
import java.io.IOException;
import java.util.Iterator;
import k00.i;
import kotlin.NoWhenBranchMatchedException;
import ri.t1;
import su.g;
import su.h;
import su.j;
import su.r;
import su.s;
import su.t;
import u00.k;
import u00.n;
import vp.x;

public final class f {
    public final nu.a a;
    public final ht.e b;
    public final x c;
    public final zu.a d;
    public final z e;
    public final p1 f;
    public final d1 g;
    public tv.b h;
    public final u1 i;

    public f(nu.a aVar, ht.e eVar, x xVar, zu.a aVar2) {
        su.e eVar2;
        tu.a aVar3;
        Object next;
        w1 w1VarE = c0.e();
        h40.e eVar3 = m0.a;
        f40.c cVarC = c0.c(rd.a.P(w1VarE, m.a.F));
        this.a = aVar;
        this.b = eVar;
        this.c = xVar;
        this.d = aVar2;
        this.e = cVarC;
        k00.c cVar = null;
        this.f = o.c(null);
        int i = 1;
        this.g = o.b(1, 5, null);
        SharedPreferences sharedPreferences = aVar.a;
        int i2 = 0;
        if (sharedPreferences.contains("playerNew.memorization.session.surahId")) {
            String string = sharedPreferences.getString("playerNew.memorization.session.repeatCount", null);
            if (string != null) {
                Iterator it = su.e.E.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!kotlin.jvm.internal.m.a(((su.e) next).name(), string));
                eVar2 = (su.e) next;
            } else {
                eVar2 = null;
            }
            long j = sharedPreferences.getLong("playerNew.memorization.session.windowStartMs", 0L);
            long j2 = sharedPreferences.getLong("playerNew.memorization.session.windowEndMs", 0L);
            t tVar = j2 > j ? new t(j, j2) : null;
            su.b bVarA = nu.a.a(Integer.valueOf(sharedPreferences.getInt("playerNew.memorization.session.from", 0)), Integer.valueOf(sharedPreferences.getInt("playerNew.memorization.session.to", 0)));
            if (eVar2 == null || tVar == null || bVarA == null) {
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                Iterator it2 = nu.b.a.iterator();
                while (it2.hasNext()) {
                    editorEdit.remove((String) it2.next());
                }
                editorEdit.apply();
                aVar3 = null;
            } else {
                aVar3 = new tu.a(new su.c(bVarA, eVar2), new su.d(sharedPreferences.getInt("playerNew.memorization.session.surahNumber", 0), sharedPreferences.getLong("playerNew.memorization.session.surahId", 0L), sharedPreferences.getInt("playerNew.memorization.session.reciterId", 0)), tVar);
            }
        } else {
            aVar3 = null;
        }
        if (aVar3 != null) {
            p1 p1Var = this.f;
            s sVar = new s(aVar3.a, aVar3.b, aVar3.c, null, 120);
            p1Var.getClass();
            p1Var.k(null, sVar);
            this.i = ta.c0.M(this.e, (i) null, (n) null, (k) null, new rm.c(this, aVar3, cVar, 26), 31);
        }
        ta.c0.M(this.e, (i) null, (n) null, (k) null, new e(this, cVar, i2), 31);
        ta.c0.M(this.e, (i) null, (n) null, (k) null, new e(this, cVar, i), 31);
    }

    public final Object a(su.c cVar, su.d dVar, m00.c cVar2) throws IllegalSeekPositionException, IOException {
        a aVar;
        su.c cVar3;
        tv.b bVar;
        if (cVar2 instanceof a) {
            aVar = (a) cVar2;
            int i = aVar.F;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.F = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar2);
            }
        } else {
            aVar = new a(this, cVar2);
        }
        Object obj = aVar.D;
        Object obj2 = l00.a.A;
        int i2 = aVar.F;
        if (i2 == 0) {
            t1.O(obj);
            tv.b bVar2 = this.h;
            if (bVar2 == null) {
                return Boolean.FALSE;
            }
            long j = dVar.b;
            aVar.A = cVar;
            aVar.B = dVar;
            aVar.C = bVar2;
            aVar.F = 1;
            Object objF = f(j, aVar);
            if (objF == obj2) {
                return obj2;
            }
            cVar3 = cVar;
            bVar = bVar2;
            obj = objF;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = aVar.C;
            dVar = aVar.B;
            su.c cVar4 = aVar.A;
            t1.O(obj);
            cVar3 = cVar4;
        }
        su.d dVar2 = dVar;
        su.a aVar2 = (su.a) obj;
        t tVarC = aVar2 != null ? aVar2.c(cVar3.a, bVar.f()) : null;
        if (aVar2 == null || tVarC == null) {
            return Boolean.FALSE;
        }
        u1 u1Var = this.i;
        if (u1Var != null) {
            u1Var.i(null);
        }
        k(new s(cVar3, dVar2, tVarC, aVar2, 112), true);
        su.b bVar3 = cVar3.a;
        int i3 = dVar2.a;
        nu.a aVar3 = this.a;
        aVar3.getClass();
        String strR0 = q.R0(d0.V(aVar3.b(), new g00.k(Integer.valueOf(i3), bVar3)).entrySet(), ";", null, null, new m3.c0(11), 30);
        SharedPreferences.Editor editorEdit = aVar3.a.edit();
        editorEdit.putString("playerNew.memorization.lastBlocks", strR0);
        editorEdit.apply();
        long j2 = tVarC.a;
        f1 f1Var = bVar.c;
        if (f1Var != null) {
            bVar.h(j2);
            f1Var.play();
        }
        return Boolean.TRUE;
    }

    public final void b(su.q qVar) {
        s sVarD = d();
        tv.b bVar = this.h;
        if (sVarD == null || bVar == null) {
            if (bVar != null) {
                bVar.a(null);
                return;
            }
            return;
        }
        r rVarE = sVarD.e(qVar);
        s sVar = rVarE.a;
        k(sVar, !kotlin.jvm.internal.m.a(sVar.c, sVarD.c));
        su.k kVar = rVarE.b;
        if (kVar instanceof h) {
            return;
        }
        if (kVar instanceof g) {
            bVar.h(((g) kVar).a);
            return;
        }
        if (kVar instanceof su.f) {
            long j = ((su.f) kVar).a;
            f1 f1Var = bVar.c;
            if (f1Var != null) {
                f1Var.pause();
                bVar.h(j);
            }
            this.g.f(b0.a);
            return;
        }
        if (kVar instanceof j) {
            bVar.h(((j) kVar).a);
            return;
        }
        if (!(kVar instanceof su.i)) {
            throw new NoWhenBranchMatchedException();
        }
        long j2 = ((su.i) kVar).a;
        f1 f1Var2 = bVar.c;
        if (f1Var2 == null) {
            return;
        }
        bVar.h(j2);
        f1Var2.play();
    }

    public final void c() {
        if (d() == null) {
            return;
        }
        u1 u1Var = this.i;
        if (u1Var != null) {
            u1Var.i(null);
        }
        k(null, true);
    }

    public final s d() {
        return (s) this.f.getValue();
    }

    public final boolean e(su.d dVar) {
        su.d dVar2;
        s sVarD = d();
        return (sVarD == null || (dVar2 = sVarD.b) == null || dVar == null || dVar2.b != dVar.b || dVar2.c != dVar.c) ? false : true;
    }

    public final Object f(long j, m00.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i = bVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.C = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object objB = bVar.A;
        l00.a aVar = l00.a.A;
        int i2 = bVar.C;
        if (i2 == 0) {
            t1.O(objB);
            bVar.C = 1;
            objB = this.b.b(j, bVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objB);
        }
        ot.f fVar = objB instanceof ot.f ? (ot.f) objB : null;
        if (fVar != null) {
            return b5.D(fVar.a);
        }
        return null;
    }

    public final Object g(su.d dVar, m00.c cVar) throws Throwable {
        c cVar2;
        su.d dVar2;
        s sVar;
        su.a aVarD;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i = cVar2.E;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar2.E = i - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object obj = cVar2.C;
        l00.a aVar = l00.a.A;
        int i2 = cVar2.E;
        k00.c cVar3 = null;
        if (i2 == 0) {
            t1.O(obj);
            s sVarD = d();
            if (sVarD != null) {
                if (dVar == null) {
                    return new pu.c(pu.e.A);
                }
                rm.c cVar4 = new rm.c(this, dVar, cVar3, 25);
                cVar2.A = dVar;
                cVar2.B = sVarD;
                cVar2.E = 1;
                Object objL = c0.L(8000L, cVar4, cVar2);
                if (objL == aVar) {
                    return aVar;
                }
                dVar2 = dVar;
                sVar = sVarD;
                obj = objL;
            }
            return pu.a.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        sVar = cVar2.B;
        su.d dVar3 = cVar2.A;
        t1.O(obj);
        dVar2 = dVar3;
        ot.i iVar = (ot.i) obj;
        s sVarD2 = d();
        if (sVarD2 != null) {
            su.c cVar5 = sVarD2.a;
            if (kotlin.jvm.internal.m.a(sVarD2.b, sVar.b) && cVar5.a.equals(sVar.a.a)) {
                if (iVar == null || iVar.equals(ot.g.a)) {
                    return new pu.c(pu.e.B);
                }
                if (iVar.equals(ot.h.a)) {
                    aVarD = null;
                } else {
                    if (!(iVar instanceof ot.f)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVarD = b5.D(((ot.f) iVar).a);
                }
                t tVarC = aVarD != null ? aVarD.c(cVar5.a, null) : null;
                if (aVarD == null || tVarC == null) {
                    return new pu.c(pu.e.A);
                }
                u1 u1Var = this.i;
                if (u1Var != null) {
                    u1Var.i(null);
                }
                k(new s(sVarD2.a, dVar2, tVarC, aVarD, 112), true);
                return pu.b.a;
            }
        }
        return pu.a.a;
    }

    public final void h(Integer num) {
        s sVarD = d();
        if (sVarD == null) {
            return;
        }
        int i = sVarD.b.a;
        if (num != null && num.intValue() == i) {
            return;
        }
        c();
    }

    public final void i(su.d dVar) {
        s sVarD = d();
        if (sVarD == null) {
            return;
        }
        t tVar = sVarD.c;
        if (!e(dVar)) {
            c();
            return;
        }
        tv.b bVar = this.h;
        if (bVar == null) {
            return;
        }
        bVar.a(tVar);
        f1 f1Var = bVar.c;
        long currentPosition = f1Var != null ? f1Var.getCurrentPosition() : 0L;
        long jMax = tVar.a;
        if (currentPosition < tVar.b - 250) {
            jMax = Math.max(currentPosition, jMax);
        }
        if (jMax != currentPosition) {
            s sVarA = sVarD.f().a();
            p1 p1Var = this.f;
            p1Var.getClass();
            p1Var.k(null, sVarA);
            bVar.h(jMax);
        }
    }

    public final void j(su.a timeline) {
        boolean z;
        s sVarD = d();
        if (sVarD == null) {
            return;
        }
        tv.b bVar = this.h;
        s sVarC = null;
        Long lF = bVar != null ? bVar.f() : null;
        kotlin.jvm.internal.m.e(timeline, "timeline");
        su.b bVar2 = sVarD.a.a;
        if (bVar2.b == timeline.a().B) {
            z00.e eVarA = timeline.a();
            int i = eVarA.A;
            int i2 = eVarA.B;
            int i3 = bVar2.a;
            if (i > i3 || i3 > i2) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (lF == null && z) {
            sVarC = s.c(sVarD, null, null, timeline, 0, false, null, 119);
        } else {
            t tVarC = timeline.c(bVar2, lF);
            if (tVarC != null) {
                long j = tVarC.a;
                t tVar = sVarD.c;
                if (j == tVar.a) {
                    sVarC = s.c(sVarD, null, tVarC, timeline, 0, false, null, 51);
                } else {
                    sVarC = !tVarC.equals(tVar) ? s.c(sVarD, null, null, timeline, 0, false, tVarC, 55) : s.c(sVarD, null, null, timeline, 0, false, null, 119);
                }
            }
        }
        if (sVarC == null) {
            c();
        } else {
            if (sVarC.equals(sVarD)) {
                return;
            }
            k(sVarC, true);
        }
    }

    public final void k(s sVar, boolean z) throws IllegalSeekPositionException {
        tv.b bVar;
        s sVarD = d();
        t tVar = sVarD != null ? sVarD.c : null;
        this.f.j(sVar);
        if (!kotlin.jvm.internal.m.a(sVar != null ? sVar.c : null, tVar) && (bVar = this.h) != null) {
            bVar.a(sVar != null ? sVar.c : null);
        }
        if (z) {
            nu.a aVar = this.a;
            if (sVar == null) {
                SharedPreferences.Editor editorEdit = aVar.a.edit();
                Iterator it = nu.b.a.iterator();
                while (it.hasNext()) {
                    editorEdit.remove((String) it.next());
                }
                editorEdit.apply();
                return;
            }
            su.c plan = sVar.a;
            su.d recording = sVar.b;
            t window = sVar.c;
            kotlin.jvm.internal.m.e(plan, "plan");
            su.b bVar2 = plan.a;
            kotlin.jvm.internal.m.e(recording, "recording");
            kotlin.jvm.internal.m.e(window, "window");
            aVar.getClass();
            SharedPreferences.Editor editorEdit2 = aVar.a.edit();
            editorEdit2.putInt("playerNew.memorization.session.surahNumber", recording.a);
            editorEdit2.putLong("playerNew.memorization.session.surahId", recording.b);
            editorEdit2.putInt("playerNew.memorization.session.reciterId", recording.c);
            editorEdit2.putInt("playerNew.memorization.session.from", bVar2.a);
            editorEdit2.putInt("playerNew.memorization.session.to", bVar2.b);
            editorEdit2.putString("playerNew.memorization.session.repeatCount", plan.b.name());
            editorEdit2.putLong("playerNew.memorization.session.windowStartMs", window.a);
            editorEdit2.putLong("playerNew.memorization.session.windowEndMs", window.b);
            editorEdit2.apply();
        }
    }
}
