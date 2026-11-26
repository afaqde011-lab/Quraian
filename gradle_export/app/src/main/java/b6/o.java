package b6;

import a10.w;
import com.google.protobuf.RuntimeVersion;
import g00.b0;
import j3.a0;
import j3.y;
import java.util.ArrayList;
import za.c0;
import za.g0;

public final class o implements u00.k {
    public final int A;
    public final String B;

    public o(String str, int i10) {
        this.A = i10;
        this.B = str;
    }

    public final Object invoke(Object obj) throws Exception {
        Long lValueOf;
        hb.p pVar;
        g0 g0VarL;
        int i10 = this.A;
        b0 b0Var = b0.a;
        String str = this.B;
        switch (i10) {
            case 0:
                ((k6.a) obj).f8972a.put(k6.c.f8974a, va.a.R(str));
                return b0Var;
            case 1:
                String str2 = (String) obj;
                kotlin.jvm.internal.m.e(str2, "day");
                return Boolean.valueOf(str2.compareTo(str) >= 0);
            case 2:
                y.e((a0) obj, str);
                return b0Var;
            case 3:
                a0 a0Var = (a0) obj;
                y.h(a0Var, 0);
                y.e(a0Var, str);
                return b0Var;
            case 4:
                a0 a0Var2 = (a0) obj;
                m3.h hVar = new m3.h(str);
                w[] wVarArr = y.f8004a;
                a0Var2.a(j3.w.C, va.a.R(hVar));
                y.k(a0Var2, 0);
                return b0Var;
            case 5:
                a0 a0Var3 = (a0) obj;
                m3.h hVar2 = new m3.h(str);
                w[] wVarArr2 = y.f8004a;
                a0Var3.a(j3.w.C, va.a.R(hVar2));
                y.k(a0Var3, 0);
                return b0Var;
            case 6:
                y.i((a0) obj, str);
                return b0Var;
            case 7:
                a0 a0Var4 = (a0) obj;
                y.h(a0Var4, 0);
                y.e(a0Var4, str);
                return b0Var;
            case 8:
                y.i((a0) obj, str);
                return b0Var;
            case 9:
                a0 a0Var5 = (a0) obj;
                y.e(a0Var5, str);
                y.k(a0Var5, 5);
                return b0Var;
            case 10:
                a0 a0Var6 = (a0) obj;
                y.i(a0Var6, str);
                y.p(a0Var6, 0.0f);
                return b0Var;
            case 11:
                a0 a0Var7 = (a0) obj;
                y.k(a0Var7, 3);
                y.e(a0Var7, str);
                return b0Var;
            case 12:
                y.e((a0) obj, str);
                return b0Var;
            case 13:
                y.e((a0) obj, str);
                return b0Var;
            case 14:
                a0 a0Var8 = (a0) obj;
                y.o(a0Var8);
                y.e(a0Var8, str);
                return b0Var;
            case 15:
                y.e((a0) obj, str);
                return b0Var;
            case 16:
                a0 a0Var9 = (a0) obj;
                y.h(a0Var9, 1);
                y.i(a0Var9, str);
                return b0Var;
            case 17:
                w[] wVarArr3 = y.f8004a;
                ((a0) obj).a(j3.w.O, str);
                return b0Var;
            case TYPE_SINT64_VALUE:
                ma.a aVar = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar, "_connection");
                ma.c cVarK0 = aVar.k0("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                try {
                    cVarK0.y(1, str);
                    return Boolean.valueOf(cVarK0.d0() && ((int) cVarK0.getLong(0)) != 0);
                } finally {
                    cVarK0.close();
                }
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                ma.a aVar2 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar2, "_connection");
                ma.c cVarK1 = aVar2.k0("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
                try {
                    cVarK1.y(1, str);
                    ArrayList arrayList = new ArrayList();
                    while (cVarK1.d0()) {
                        arrayList.add(cVarK1.R(0));
                    }
                    cVarK1.close();
                    return arrayList;
                } catch (Throwable th2) {
                    cVarK1.close();
                    throw th2;
                }
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                ma.a aVar3 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar3, "_connection");
                ma.c cVarK2 = aVar3.k0("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                try {
                    cVarK2.y(1, str);
                    return Boolean.valueOf(cVarK2.d0() && ((int) cVarK2.getLong(0)) != 0);
                } finally {
                    cVarK2.close();
                }
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                ma.a aVar4 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar4, "_connection");
                ma.c cVarK3 = aVar4.k0("SELECT long_value FROM Preference where `key`=?");
                try {
                    cVarK3.y(1, str);
                    if (cVarK3.d0() && !cVarK3.isNull(0)) {
                        lValueOf = Long.valueOf(cVarK3.getLong(0));
                        break;
                    } else {
                        lValueOf = null;
                    }
                    return lValueOf;
                } finally {
                    cVarK3.close();
                }
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                ma.a aVar5 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar5, "_connection");
                ma.c cVarK4 = aVar5.k0("DELETE FROM SystemIdInfo where work_spec_id=?");
                try {
                    cVarK4.y(1, str);
                    cVarK4.d0();
                    return b0Var;
                } finally {
                    cVarK4.close();
                }
            case 23:
                ma.a aVar6 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar6, "_connection");
                ma.c cVarK5 = aVar6.k0("SELECT name FROM workname WHERE work_spec_id=?");
                try {
                    cVarK5.y(1, str);
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarK5.d0()) {
                        arrayList2.add(cVarK5.R(0));
                    }
                    cVarK5.close();
                    return arrayList2;
                } catch (Throwable th3) {
                    cVarK5.close();
                    throw th3;
                }
            case 24:
                ma.a aVar7 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar7, "_connection");
                ma.c cVarK6 = aVar7.k0("DELETE from WorkProgress where work_spec_id=?");
                try {
                    cVarK6.y(1, str);
                    cVarK6.d0();
                    return b0Var;
                } finally {
                    cVarK6.close();
                }
            case 25:
                ma.a aVar8 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar8, "_connection");
                ma.c cVarK7 = aVar8.k0("SELECT * FROM workspec WHERE id=?");
                try {
                    cVarK7.y(1, str);
                    int I = w50.c.I(cVarK7, "id");
                    int I2 = w50.c.I(cVarK7, "state");
                    int I3 = w50.c.I(cVarK7, "worker_class_name");
                    int I4 = w50.c.I(cVarK7, "input_merger_class_name");
                    int I5 = w50.c.I(cVarK7, "input");
                    int I6 = w50.c.I(cVarK7, "output");
                    int I7 = w50.c.I(cVarK7, "initial_delay");
                    int I8 = w50.c.I(cVarK7, "interval_duration");
                    int I9 = w50.c.I(cVarK7, "flex_duration");
                    int I10 = w50.c.I(cVarK7, "run_attempt_count");
                    int I11 = w50.c.I(cVarK7, "backoff_policy");
                    int I12 = w50.c.I(cVarK7, "backoff_delay_duration");
                    int I13 = w50.c.I(cVarK7, "last_enqueue_time");
                    int I14 = w50.c.I(cVarK7, "minimum_retention_duration");
                    int I15 = w50.c.I(cVarK7, "schedule_requested_at");
                    int I16 = w50.c.I(cVarK7, "run_in_foreground");
                    int I17 = w50.c.I(cVarK7, "out_of_quota_policy");
                    int I18 = w50.c.I(cVarK7, "period_count");
                    int I19 = w50.c.I(cVarK7, "generation");
                    int I20 = w50.c.I(cVarK7, "next_schedule_time_override");
                    int I21 = w50.c.I(cVarK7, "next_schedule_time_override_generation");
                    int I22 = w50.c.I(cVarK7, "stop_reason");
                    int I23 = w50.c.I(cVarK7, "trace_tag");
                    int I24 = w50.c.I(cVarK7, "backoff_on_system_interruptions");
                    int I25 = w50.c.I(cVarK7, "required_network_type");
                    int I26 = w50.c.I(cVarK7, "required_network_request");
                    int I27 = w50.c.I(cVarK7, "requires_charging");
                    int I28 = w50.c.I(cVarK7, "requires_device_idle");
                    int I29 = w50.c.I(cVarK7, "requires_battery_not_low");
                    int I30 = w50.c.I(cVarK7, "requires_storage_not_low");
                    int I31 = w50.c.I(cVarK7, "trigger_content_update_delay");
                    int I32 = w50.c.I(cVarK7, "trigger_max_content_delay");
                    int I33 = w50.c.I(cVarK7, "content_uri_triggers");
                    if (cVarK7.d0()) {
                        String strR = cVarK7.R(I);
                        g0 g0VarL2 = c7.i.L((int) cVarK7.getLong(I2));
                        String strR2 = cVarK7.R(I3);
                        String strR3 = cVarK7.R(I4);
                        byte[] blob = cVarK7.getBlob(I5);
                        za.g gVar = za.g.f17367b;
                        za.g gVarD = kh.n.D(blob);
                        za.g gVarD2 = kh.n.D(cVarK7.getBlob(I6));
                        long j9 = cVarK7.getLong(I7);
                        long j10 = cVarK7.getLong(I8);
                        long j11 = cVarK7.getLong(I9);
                        int i11 = (int) cVarK7.getLong(I10);
                        za.a aVarI = c7.i.I((int) cVarK7.getLong(I11));
                        long j12 = cVarK7.getLong(I12);
                        long j13 = cVarK7.getLong(I13);
                        long j14 = cVarK7.getLong(I14);
                        long j15 = cVarK7.getLong(I15);
                        boolean z10 = ((int) cVarK7.getLong(I16)) != 0;
                        c0 c0VarK = c7.i.K((int) cVarK7.getLong(I17));
                        int i12 = (int) cVarK7.getLong(I18);
                        int i13 = (int) cVarK7.getLong(I19);
                        long j16 = cVarK7.getLong(I20);
                        int i14 = (int) cVarK7.getLong(I21);
                        int i15 = (int) cVarK7.getLong(I22);
                        String strR4 = cVarK7.isNull(I23) ? null : cVarK7.R(I23);
                        Integer numValueOf = cVarK7.isNull(I24) ? null : Integer.valueOf((int) cVarK7.getLong(I24));
                        pVar = new hb.p(strR, g0VarL2, strR2, strR3, gVarD, gVarD2, j9, j10, j11, new za.e(c7.i.X(cVarK7.getBlob(I26)), c7.i.J((int) cVarK7.getLong(I25)), ((int) cVarK7.getLong(I27)) != 0, ((int) cVarK7.getLong(I28)) != 0, ((int) cVarK7.getLong(I29)) != 0, ((int) cVarK7.getLong(I30)) != 0, cVarK7.getLong(I31), cVarK7.getLong(I32), c7.i.n(cVarK7.getBlob(I33))), i11, aVarI, j12, j13, j14, j15, z10, c0VarK, i12, i13, j16, i14, i15, strR4, numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null);
                    } else {
                        pVar = null;
                    }
                    return pVar;
                } finally {
                    cVarK7.close();
                }
            case RuntimeVersion.MINOR:
                ma.a aVar9 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar9, "_connection");
                ma.c cVarK8 = aVar9.k0("SELECT state FROM workspec WHERE id=?");
                try {
                    cVarK8.y(1, str);
                    if (cVarK8.d0()) {
                        Integer numValueOf2 = cVarK8.isNull(0) ? null : Integer.valueOf((int) cVarK8.getLong(0));
                        if (numValueOf2 != null) {
                            g0VarL = c7.i.L(numValueOf2.intValue());
                        } else {
                            g0VarL = null;
                        }
                        break;
                    } else {
                        g0VarL = null;
                    }
                    return g0VarL;
                } finally {
                    cVarK8.close();
                }
            case 27:
                ma.a aVar10 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar10, "_connection");
                ma.c cVarK9 = aVar10.k0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    cVarK9.y(1, str);
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarK9.d0()) {
                        arrayList3.add(cVarK9.R(0));
                    }
                    cVarK9.close();
                    return arrayList3;
                } catch (Throwable th4) {
                    cVarK9.close();
                    throw th4;
                }
            case 28:
                ma.a aVar11 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar11, "_connection");
                ma.c cVarK10 = aVar11.k0("UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?");
                try {
                    cVarK10.y(1, str);
                    cVarK10.d0();
                    return Integer.valueOf(w00.a.x(aVar11));
                } finally {
                    cVarK10.close();
                }
            default:
                ma.a aVar12 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar12, "_connection");
                ma.c cVarK11 = aVar12.k0("UPDATE workspec SET run_attempt_count=0 WHERE id=?");
                try {
                    cVarK11.y(1, str);
                    cVarK11.d0();
                    return Integer.valueOf(w00.a.x(aVar12));
                } finally {
                    cVarK11.close();
                }
        }
    }
}
