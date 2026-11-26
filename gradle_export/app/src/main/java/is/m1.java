package is;

import android.content.SharedPreferences;
import bt.y1;
import d40.p1;
import g00.b0;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import ri.t1;

public final class m1 {
    public final js.k a;
    public final fs.n b;
    public final SharedPreferences c;
    public final CopyOnWriteArrayList d;
    public final Object e;
    public final p1 f;

    public m1(js.k kVar, fs.n nVar, SharedPreferences sharedPreferences) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.a = kVar;
        this.b = nVar;
        this.c = sharedPreferences;
        this.d = copyOnWriteArrayList;
        this.e = new Object();
        this.f = d40.o.c(Integer.valueOf(sharedPreferences.getInt("DAILY_GOAL_KEY", 5)));
    }

    public final int a() {
        List listN1 = h00.q.n1(this.d);
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        kotlin.jvm.internal.m.d(zoneIdSystemDefault, "systemDefault(...)");
        return a.a.g(listN1, zoneIdSystemDefault);
    }

    public final int b() {
        return ((Number) this.f.getValue()).intValue();
    }

    public final Integer c() {
        Integer numValueOf = Integer.valueOf(this.c.getInt("PENDING_DAILY_GOAL_KEY", 0));
        if (numValueOf.intValue() != 0) {
            return numValueOf;
        }
        return null;
    }

    public final int d() {
        List listN1 = h00.q.n1(this.d);
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        kotlin.jvm.internal.m.d(zoneIdSystemDefault, "systemDefault(...)");
        if (listN1.isEmpty()) {
            return 0;
        }
        int iMax = 0;
        int i = 0;
        while (true) {
            LocalDate localDate = null;
            for (rs.f fVar : h00.q.i1(listN1, new ba.m(25))) {
                LocalDate localDate2 = Instant.ofEpochSecond(fVar.b).atZone(zoneIdSystemDefault).toLocalDate();
                if (a.a.O(fVar)) {
                    i = (localDate == null || !kotlin.jvm.internal.m.a(localDate.plusDays(1L), localDate2)) ? 1 : i + 1;
                    iMax = Math.max(iMax, i);
                    localDate = localDate2;
                } else {
                    i = 0;
                }
            }
            return Math.max(iMax, a.a.g(listN1, zoneIdSystemDefault));
        }
    }

    public final y1 e() {
        return new y1(rd.a.o(this.a.a.a, false, new String[]{"streak_info_data"}, new ks.e(12)), this, 12);
    }

    public final void f(rs.f fVar) {
        synchronized (this.e) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.d;
            final h00.a aVar = new h00.a(fVar, 4);
            copyOnWriteArrayList.removeIf(new Predicate() {
                @Override
                public final boolean test(Object obj) {
                    return ((Boolean) aVar.invoke(obj)).booleanValue();
                }
            });
            this.d.add(fVar);
        }
    }

    public final void g(int i) {
        SharedPreferences.Editor editorEdit = this.c.edit();
        editorEdit.putInt("DAILY_GOAL_KEY", i);
        editorEdit.apply();
        Integer numValueOf = Integer.valueOf(i);
        p1 p1Var = this.f;
        p1Var.getClass();
        p1Var.k(null, numValueOf);
    }

    public final void h(Integer num) {
        SharedPreferences.Editor editorEdit = this.c.edit();
        if (num == null) {
            editorEdit.remove("PENDING_DAILY_GOAL_KEY");
        } else {
            editorEdit.putInt("PENDING_DAILY_GOAL_KEY", num.intValue());
        }
        editorEdit.apply();
    }

    public final Object i(int i, LocalDateTime localDateTime, m00.c cVar) {
        l1 l1Var;
        LocalDate localDate;
        String strZ;
        int iB;
        ZoneId zoneIdSystemDefault;
        long epochSecond;
        int i2;
        rs.f fVar;
        gs.i iVar;
        if (cVar instanceof l1) {
            l1Var = (l1) cVar;
            int i3 = l1Var.J;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                l1Var.J = i3 - Integer.MIN_VALUE;
            } else {
                l1Var = new l1(this, cVar);
            }
        } else {
            l1Var = new l1(this, cVar);
        }
        Object obj = l1Var.H;
        l00.a aVar = l00.a.A;
        int i4 = l1Var.J;
        fs.n nVar = this.b;
        js.k kVar = this.a;
        g00.b0 b0Var = g00.b0.a;
        if (i4 == 0) {
            t1.O(obj);
            localDate = localDateTime.toLocalDate();
            kotlin.jvm.internal.m.b(localDate);
            strZ = f50.c.z(localDate);
            iB = b();
            zoneIdSystemDefault = ZoneId.systemDefault();
            epochSecond = localDateTime.atZone(zoneIdSystemDefault).toEpochSecond();
            l1Var.C = localDate;
            l1Var.D = strZ;
            l1Var.E = zoneIdSystemDefault;
            l1Var.A = i;
            l1Var.B = iB;
            l1Var.G = epochSecond;
            l1Var.J = 1;
            Object objN = rd.a.N(kVar.a.a, true, false, new hb.u(strZ, 14), l1Var);
            if (objN != aVar) {
                i2 = i;
                obj = objN;
            }
            return aVar;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                iVar = (gs.i) l1Var.F;
                t1.O(obj);
                nVar.getClass();
                f(fs.n.X(iVar));
                return b0Var;
            }
            if (i4 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (rs.f) l1Var.F;
            t1.O(obj);
            f(fVar);
            return b0Var;
        }
        epochSecond = l1Var.G;
        iB = l1Var.B;
        i2 = l1Var.A;
        zoneIdSystemDefault = l1Var.E;
        strZ = l1Var.D;
        localDate = l1Var.C;
        t1.O(obj);
        int i5 = iB;
        String str = strZ;
        long j = epochSecond;
        gs.i iVar2 = (gs.i) obj;
        if (iVar2 != null) {
            nVar.getClass();
            rs.f fVarX = fs.n.X(iVar2);
            long j2 = iVar2.c + ((long) i2);
            String key = fVarX.a;
            long j3 = fVarX.b;
            DayOfWeek dayOfWeek = fVarX.f;
            kotlin.jvm.internal.m.e(key, "key");
            rs.f fVar2 = new rs.f(key, j3, j2, i5, j, dayOfWeek);
            l1Var.C = null;
            l1Var.D = null;
            l1Var.E = null;
            l1Var.F = fVar2;
            l1Var.A = i2;
            l1Var.B = i5;
            l1Var.G = j;
            l1Var.J = 3;
            final ks.o oVar = kVar.a;
            final gs.i iVar3 = new gs.i(key, j3, i5, j2, j);
            final int i6 = 0;
            Object objN2 = rd.a.N(oVar.a, false, true, new u00.k() {
                @Override
                public final Object invoke(Object obj2) {
                    ma.a _connection = (ma.a) obj2;
                    switch (i6) {
                        case 0:
                            kotlin.jvm.internal.m.e(_connection, "_connection");
                            oVar.c.C(_connection, iVar3);
                            break;
                        default:
                            kotlin.jvm.internal.m.e(_connection, "_connection");
                            oVar.b.i0(_connection, iVar3);
                            break;
                    }
                    return b0.a;
                }
            }, l1Var);
            if (objN2 != aVar) {
                objN2 = b0Var;
            }
            if (objN2 != aVar) {
                objN2 = b0Var;
            }
            if (objN2 != aVar) {
                fVar = fVar2;
                f(fVar);
                return b0Var;
            }
        } else {
            if (i2 <= 0) {
                return b0Var;
            }
            long epochSecond2 = localDate.atStartOfDay(zoneIdSystemDefault).toEpochSecond();
            long j4 = i2;
            gs.i iVar4 = new gs.i(str, epochSecond2, i5, j4, j);
            l1Var.C = null;
            l1Var.D = null;
            l1Var.E = null;
            l1Var.F = iVar4;
            l1Var.A = i2;
            l1Var.B = i5;
            l1Var.G = j;
            l1Var.J = 2;
            final ks.o oVar2 = kVar.a;
            final gs.i iVar5 = new gs.i(str, epochSecond2, i5, j4, j);
            final int i7 = 1;
            Object objN3 = rd.a.N(oVar2.a, false, true, new u00.k() {
                @Override
                public final Object invoke(Object obj2) {
                    ma.a _connection = (ma.a) obj2;
                    switch (i7) {
                        case 0:
                            kotlin.jvm.internal.m.e(_connection, "_connection");
                            oVar2.c.C(_connection, iVar5);
                            break;
                        default:
                            kotlin.jvm.internal.m.e(_connection, "_connection");
                            oVar2.b.i0(_connection, iVar5);
                            break;
                    }
                    return b0.a;
                }
            }, l1Var);
            if (objN3 != aVar) {
                objN3 = b0Var;
            }
            if (objN3 != aVar) {
                objN3 = b0Var;
            }
            if (objN3 != aVar) {
                iVar = iVar4;
                nVar.getClass();
                f(fs.n.X(iVar));
                return b0Var;
            }
        }
        return aVar;
    }
}
