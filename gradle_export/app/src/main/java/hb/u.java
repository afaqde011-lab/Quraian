package hb;

import androidx.work.impl.WorkDatabase;
import com.google.protobuf.RuntimeVersion;
import g00.b0;
import j3.a0;
import java.util.ArrayList;
import java.util.List;
import za.g0;

public final class u implements u00.k {
    public final int A;
    public final String B;

    public u(String str, int i10) {
        this.A = i10;
        this.B = str;
    }

    public final Object invoke(Object obj) throws Exception {
        int i10 = this.A;
        Integer dVar = null;
        int i11 = 0;
        b0 b0Var = b0.a;
        String str = this.B;
        switch (i10) {
            case 0:
                ma.a aVar = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar, "_connection");
                ma.c cVarK0 = aVar.k0("UPDATE workspec SET period_count=period_count+1 WHERE id=?");
                try {
                    cVarK0.y(1, str);
                    cVarK0.d0();
                    return b0Var;
                } finally {
                    cVarK0.close();
                }
            case 1:
                ma.a aVar2 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar2, "_connection");
                ma.c cVarK1 = aVar2.k0("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)");
                try {
                    cVarK1.y(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (cVarK1.d0()) {
                        byte[] blob = cVarK1.getBlob(0);
                        za.g gVar = za.g.f17367b;
                        arrayList.add(kh.n.D(blob));
                    }
                    cVarK1.close();
                    return arrayList;
                } catch (Throwable th2) {
                    cVarK1.close();
                    throw th2;
                }
            case 2:
                ma.a aVar3 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar3, "_connection");
                ma.c cVarK2 = aVar3.k0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    cVarK2.y(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarK2.d0()) {
                        arrayList2.add(cVarK2.R(0));
                    }
                    cVarK2.close();
                    return arrayList2;
                } catch (Throwable th3) {
                    cVarK2.close();
                    throw th3;
                }
            case 3:
                ma.a aVar4 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar4, "_connection");
                ma.c cVarK3 = aVar4.k0("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?");
                try {
                    cVarK3.y(1, str);
                    cVarK3.d0();
                    return Integer.valueOf(w00.a.x(aVar4));
                } finally {
                    cVarK3.close();
                }
            case 4:
                ma.a aVar5 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar5, "_connection");
                ma.c cVarK4 = aVar5.k0("DELETE FROM workspec WHERE id=?");
                try {
                    cVarK4.y(1, str);
                    cVarK4.d0();
                    return b0Var;
                } finally {
                    cVarK4.close();
                }
            case 5:
                ma.a aVar6 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar6, "_connection");
                ma.c cVarK5 = aVar6.k0("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    cVarK5.y(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarK5.d0()) {
                        String strR = cVarK5.R(0);
                        g0 g0VarL = c7.i.L((int) cVarK5.getLong(1));
                        kotlin.jvm.internal.m.e(strR, "id");
                        n nVar = new n();
                        nVar.f6986a = strR;
                        nVar.f6987b = g0VarL;
                        arrayList3.add(nVar);
                    }
                    cVarK5.close();
                    return arrayList3;
                } catch (Throwable th4) {
                    cVarK5.close();
                    throw th4;
                }
            case 6:
                ma.a aVar7 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar7, "_connection");
                ma.c cVarK6 = aVar7.k0("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
                try {
                    cVarK6.y(1, str);
                    ArrayList arrayList4 = new ArrayList();
                    while (cVarK6.d0()) {
                        arrayList4.add(cVarK6.R(0));
                    }
                    cVarK6.close();
                    return arrayList4;
                } catch (Throwable th5) {
                    cVarK6.close();
                    throw th5;
                }
            case 7:
                ma.a aVar8 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar8, "_connection");
                ma.c cVarK7 = aVar8.k0("DELETE FROM worktag WHERE work_spec_id=?");
                try {
                    cVarK7.y(1, str);
                    cVarK7.d0();
                    return b0Var;
                } finally {
                    cVarK7.close();
                }
            case 8:
                WorkDatabase workDatabase = (WorkDatabase) obj;
                kotlin.jvm.internal.m.e(workDatabase, "db");
                du.w wVar = p.A;
                x xVarW = workDatabase.w();
                xVarW.getClass();
                kotlin.jvm.internal.m.e(str, "name");
                Object objApply = wVar.apply((List) rd.a.M(xVarW.f7028a, true, true, new s(str, xVarW, i11)));
                kotlin.jvm.internal.m.d(objApply, "apply(...)");
                return (List) objApply;
            case 9:
                a0 a0Var = (a0) obj;
                kotlin.jvm.internal.m.e(a0Var, "$this$semantics");
                j3.y.e(a0Var, str);
                return b0Var;
            case 10:
                ma.a aVar9 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar9, "_connection");
                ma.c cVarK8 = aVar9.k0("SELECT * FROM listening_day_reciter_stat_data WHERE `key` = ?");
                try {
                    cVarK8.y(1, str);
                    return cVarK8.d0() ? new gs.a(cVarK8.R(w50.c.I(cVarK8, "key")), cVarK8.getLong(w50.c.I(cVarK8, "dayStart")), (int) cVarK8.getLong(w50.c.I(cVarK8, "reciterId")), (int) cVarK8.getLong(w50.c.I(cVarK8, "seconds")), cVarK8.getLong(w50.c.I(cVarK8, "updatedAt"))) : null;
                } finally {
                    cVarK8.close();
                }
            case 11:
                ma.a aVar10 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar10, "_connection");
                ma.c cVarK9 = aVar10.k0("SELECT * FROM listening_day_surah_stat_data WHERE `key` = ?");
                try {
                    cVarK9.y(1, str);
                    return cVarK9.d0() ? new gs.b(cVarK9.R(w50.c.I(cVarK9, "key")), cVarK9.getLong(w50.c.I(cVarK9, "dayStart")), (int) cVarK9.getLong(w50.c.I(cVarK9, "surahNumber")), (int) cVarK9.getLong(w50.c.I(cVarK9, "reciterId")), (int) cVarK9.getLong(w50.c.I(cVarK9, "seconds")), cVarK9.getLong(w50.c.I(cVarK9, "updatedAt"))) : null;
                } finally {
                    cVarK9.close();
                }
            case 12:
                ma.a aVar11 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar11, "_connection");
                ma.c cVarK10 = aVar11.k0("SELECT * FROM listening_hour_stat_data WHERE `key` = ?");
                try {
                    cVarK10.y(1, str);
                    return cVarK10.d0() ? new gs.c(cVarK10.R(w50.c.I(cVarK10, "key")), cVarK10.getLong(w50.c.I(cVarK10, "dayStart")), (int) cVarK10.getLong(w50.c.I(cVarK10, "hour")), (int) cVarK10.getLong(w50.c.I(cVarK10, "quranSeconds")), cVarK10.getLong(w50.c.I(cVarK10, "updatedAt"))) : null;
                } finally {
                    cVarK10.close();
                }
            case 13:
                ma.a aVar12 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar12, "_connection");
                ma.c cVarK11 = aVar12.k0("SELECT * FROM listening_hour_background_sound_stat_data WHERE `key` = ?");
                try {
                    cVarK11.y(1, str);
                    int I = w50.c.I(cVarK11, "key");
                    int I2 = w50.c.I(cVarK11, "dayStart");
                    int I3 = w50.c.I(cVarK11, "hour");
                    int I4 = w50.c.I(cVarK11, "soundId");
                    int I5 = w50.c.I(cVarK11, "seconds");
                    int I6 = w50.c.I(cVarK11, "avgVolumeTimes1000");
                    int I7 = w50.c.I(cVarK11, "updatedAt");
                    if (cVarK11.d0()) {
                        dVar = new gs.d(cVarK11.R(I), cVarK11.getLong(I2), (int) cVarK11.getLong(I3), cVarK11.R(I4), (int) cVarK11.getLong(I5), cVarK11.isNull(I6) ? null : Integer.valueOf((int) cVarK11.getLong(I6)), cVarK11.getLong(I7));
                    }
                    return dVar;
                } finally {
                    cVarK11.close();
                }
            case 14:
                ma.a aVar13 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar13, "_connection");
                ma.c cVarK12 = aVar13.k0("SELECT * FROM streak_info_data WHERE `key` = ?");
                try {
                    cVarK12.y(1, str);
                    int I8 = w50.c.I(cVarK12, "key");
                    int I9 = w50.c.I(cVarK12, "dayStart");
                    int I10 = w50.c.I(cVarK12, "listenedSeconds");
                    int I11 = w50.c.I(cVarK12, "dailyGoalMinutes");
                    int I12 = w50.c.I(cVarK12, "updateDate");
                    if (cVarK12.d0()) {
                        dVar = new gs.i(cVarK12.R(I8), cVarK12.getLong(I9), (int) cVarK12.getLong(I11), cVarK12.getLong(I10), cVarK12.getLong(I12));
                    }
                    return dVar;
                } finally {
                    cVarK12.close();
                }
            case 15:
                a0 a0Var2 = (a0) obj;
                kotlin.jvm.internal.m.e(a0Var2, "$this$semantics");
                j3.y.e(a0Var2, str);
                return b0Var;
            case 16:
                a0 a0Var3 = (a0) obj;
                kotlin.jvm.internal.m.e(a0Var3, "$this$semantics");
                j3.y.e(a0Var3, str);
                return b0Var;
            case 17:
                a0 a0Var4 = (a0) obj;
                kotlin.jvm.internal.m.e(a0Var4, "$this$semantics");
                j3.y.e(a0Var4, str);
                return b0Var;
            case TYPE_SINT64_VALUE:
                a0 a0Var5 = (a0) obj;
                kotlin.jvm.internal.m.e(a0Var5, "$this$semantics");
                j3.y.e(a0Var5, str);
                return b0Var;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                a0 a0Var6 = (a0) obj;
                kotlin.jvm.internal.m.e(a0Var6, "$this$semantics");
                j3.y.e(a0Var6, str);
                return b0Var;
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                a0 a0Var7 = (a0) obj;
                kotlin.jvm.internal.m.e(a0Var7, "$this$semantics");
                j3.y.e(a0Var7, str);
                return b0Var;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                a0 a0Var8 = (a0) obj;
                kotlin.jvm.internal.m.e(a0Var8, "$this$semantics");
                j3.y.e(a0Var8, str);
                return b0Var;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                a0 a0Var9 = (a0) obj;
                kotlin.jvm.internal.m.e(a0Var9, "$this$semantics");
                j3.y.e(a0Var9, str);
                return b0Var;
            case 23:
                String str2 = (String) obj;
                kotlin.jvm.internal.m.e(str2, "it");
                if (r30.k.L0(str2)) {
                    return str2.length() < str.length() ? str : str2;
                }
                return w.c.j(str, str2);
            case 24:
                a0 a0Var10 = (a0) obj;
                kotlin.jvm.internal.m.e(a0Var10, "$this$semantics");
                j3.y.k(a0Var10, 0);
                j3.y.e(a0Var10, str);
                return b0Var;
            case 25:
                a0 a0Var11 = (a0) obj;
                kotlin.jvm.internal.m.e(a0Var11, "$this$semantics");
                j3.y.e(a0Var11, str);
                return b0Var;
            case RuntimeVersion.MINOR:
                a0 a0Var12 = (a0) obj;
                kotlin.jvm.internal.m.e(a0Var12, "$this$semantics");
                j3.y.e(a0Var12, str);
                return b0Var;
            default:
                a0 a0Var13 = (a0) obj;
                j3.y.e(a0Var13, str);
                j3.y.k(a0Var13, 5);
                return b0Var;
        }
    }
}
