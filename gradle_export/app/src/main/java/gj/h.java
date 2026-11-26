package gj;

import d0.l3;
import e1.e0;
import e1.f0;
import g00.b0;
import hb.p;
import j3.a0;
import java.util.ArrayList;
import kh.n;
import kotlin.jvm.internal.m;
import q0.y0;
import ri.t1;
import u00.k;
import za.c0;
import za.g0;
import za.w;

public final class h implements k {
    public final int A;
    public final long B;

    public h(long j9, int i10) {
        this.A = i10;
        this.B = j9;
    }

    public final Object invoke(Object obj) throws Exception {
        a40.k kVar;
        Object objS;
        int i10 = this.A;
        long j9 = this.B;
        b0 b0Var = b0.a;
        switch (i10) {
            case 0:
                ((t5.b) obj).e(i.f6353b, Long.valueOf(j9));
                return null;
            case 1:
                ma.a aVar = (ma.a) obj;
                m.e(aVar, "_connection");
                ma.c cVarK0 = aVar.k0("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC");
                try {
                    cVarK0.d(1, j9);
                    int I = w50.c.I(cVarK0, "id");
                    int I2 = w50.c.I(cVarK0, "state");
                    int I3 = w50.c.I(cVarK0, "worker_class_name");
                    int I4 = w50.c.I(cVarK0, "input_merger_class_name");
                    int I5 = w50.c.I(cVarK0, "input");
                    int I6 = w50.c.I(cVarK0, "output");
                    int I7 = w50.c.I(cVarK0, "initial_delay");
                    int I8 = w50.c.I(cVarK0, "interval_duration");
                    int I9 = w50.c.I(cVarK0, "flex_duration");
                    int I10 = w50.c.I(cVarK0, "run_attempt_count");
                    int I11 = w50.c.I(cVarK0, "backoff_policy");
                    int I12 = w50.c.I(cVarK0, "backoff_delay_duration");
                    int I13 = w50.c.I(cVarK0, "last_enqueue_time");
                    int I14 = w50.c.I(cVarK0, "minimum_retention_duration");
                    int I15 = w50.c.I(cVarK0, "schedule_requested_at");
                    int I16 = w50.c.I(cVarK0, "run_in_foreground");
                    int I17 = w50.c.I(cVarK0, "out_of_quota_policy");
                    int I18 = w50.c.I(cVarK0, "period_count");
                    int I19 = w50.c.I(cVarK0, "generation");
                    int I20 = w50.c.I(cVarK0, "next_schedule_time_override");
                    int I21 = w50.c.I(cVarK0, "next_schedule_time_override_generation");
                    int I22 = w50.c.I(cVarK0, "stop_reason");
                    int I23 = w50.c.I(cVarK0, "trace_tag");
                    int I24 = w50.c.I(cVarK0, "backoff_on_system_interruptions");
                    int I25 = w50.c.I(cVarK0, "required_network_type");
                    int I26 = w50.c.I(cVarK0, "required_network_request");
                    int I27 = w50.c.I(cVarK0, "requires_charging");
                    int I28 = w50.c.I(cVarK0, "requires_device_idle");
                    int I29 = w50.c.I(cVarK0, "requires_battery_not_low");
                    int I30 = w50.c.I(cVarK0, "requires_storage_not_low");
                    int I31 = w50.c.I(cVarK0, "trigger_content_update_delay");
                    int I32 = w50.c.I(cVarK0, "trigger_max_content_delay");
                    int I33 = w50.c.I(cVarK0, "content_uri_triggers");
                    ArrayList arrayList = new ArrayList();
                    while (cVarK0.d0()) {
                        String strR = cVarK0.R(I);
                        int i11 = I12;
                        int i12 = I13;
                        g0 g0VarL = c7.i.L((int) cVarK0.getLong(I2));
                        String strR2 = cVarK0.R(I3);
                        String strR3 = cVarK0.R(I4);
                        byte[] blob = cVarK0.getBlob(I5);
                        za.g gVar = za.g.f17367b;
                        za.g gVarD = n.D(blob);
                        za.g gVarD2 = n.D(cVarK0.getBlob(I6));
                        long j10 = cVarK0.getLong(I7);
                        long j11 = cVarK0.getLong(I8);
                        long j12 = cVarK0.getLong(I9);
                        int i13 = (int) cVarK0.getLong(I10);
                        int i14 = I3;
                        int i15 = I4;
                        za.a aVarI = c7.i.I((int) cVarK0.getLong(I11));
                        long j13 = cVarK0.getLong(i11);
                        long j14 = cVarK0.getLong(i12);
                        long j15 = cVarK0.getLong(I14);
                        int i16 = I;
                        int i17 = I15;
                        long j16 = cVarK0.getLong(i17);
                        I15 = i17;
                        int i18 = I14;
                        int i19 = I16;
                        int i20 = I2;
                        boolean z10 = ((int) cVarK0.getLong(i19)) != 0;
                        int i21 = I17;
                        ArrayList arrayList2 = arrayList;
                        c0 c0VarK = c7.i.K((int) cVarK0.getLong(i21));
                        int i22 = I18;
                        int i23 = (int) cVarK0.getLong(i22);
                        int i24 = I19;
                        int i25 = (int) cVarK0.getLong(i24);
                        int i26 = I20;
                        long j17 = cVarK0.getLong(i26);
                        int i27 = I21;
                        int i28 = (int) cVarK0.getLong(i27);
                        int i29 = I22;
                        int i30 = (int) cVarK0.getLong(i29);
                        int i31 = I23;
                        String strR4 = cVarK0.isNull(i31) ? null : cVarK0.R(i31);
                        int i32 = I24;
                        Integer numValueOf = cVarK0.isNull(i32) ? null : Integer.valueOf((int) cVarK0.getLong(i32));
                        Boolean boolValueOf = numValueOf != null ? Boolean.valueOf(numValueOf.intValue() != 0) : null;
                        int i33 = I25;
                        w wVarJ = c7.i.J((int) cVarK0.getLong(i33));
                        int i34 = I26;
                        ib.f fVarX = c7.i.X(cVarK0.getBlob(i34));
                        I25 = i33;
                        I26 = i34;
                        int i35 = I27;
                        boolean z11 = ((int) cVarK0.getLong(i35)) != 0;
                        I27 = i35;
                        int i36 = I28;
                        boolean z12 = ((int) cVarK0.getLong(i36)) != 0;
                        int i37 = I29;
                        boolean z13 = ((int) cVarK0.getLong(i37)) != 0;
                        I29 = i37;
                        int i38 = I30;
                        int i39 = I31;
                        int i40 = I32;
                        int i41 = I33;
                        I33 = i41;
                        arrayList2.add(new p(strR, g0VarL, strR2, strR3, gVarD, gVarD2, j10, j11, j12, new za.e(fVarX, wVarJ, z11, z12, z13, ((int) cVarK0.getLong(i38)) != 0, cVarK0.getLong(i39), cVarK0.getLong(i40), c7.i.n(cVarK0.getBlob(i41))), i13, aVarI, j13, j14, j15, j16, z10, c0VarK, i23, i25, j17, i28, i30, strR4, boolValueOf));
                        I31 = i39;
                        I32 = i40;
                        I12 = i11;
                        I17 = i21;
                        I19 = i24;
                        I22 = i29;
                        I24 = i32;
                        I14 = i18;
                        I18 = i22;
                        I2 = i20;
                        I30 = i38;
                        I16 = i19;
                        I20 = i26;
                        I21 = i27;
                        I23 = i31;
                        arrayList = arrayList2;
                        I28 = i36;
                        I3 = i14;
                        I = i16;
                        I13 = i12;
                        I4 = i15;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarK0.close();
                }
            case 2:
                ma.a aVar2 = (ma.a) obj;
                m.e(aVar2, "_connection");
                ma.c cVarK1 = aVar2.k0("SELECT * FROM listening_hour_stat_data WHERE dayStart >= ? AND dayStart <= ?");
                try {
                    cVarK1.d(1, 0L);
                    cVarK1.d(2, j9);
                    int I34 = w50.c.I(cVarK1, "key");
                    int I35 = w50.c.I(cVarK1, "dayStart");
                    int I36 = w50.c.I(cVarK1, "hour");
                    int I37 = w50.c.I(cVarK1, "quranSeconds");
                    int I38 = w50.c.I(cVarK1, "updatedAt");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarK1.d0()) {
                        arrayList3.add(new gs.c(cVarK1.R(I34), cVarK1.getLong(I35), (int) cVarK1.getLong(I36), (int) cVarK1.getLong(I37), cVarK1.getLong(I38)));
                    }
                    cVarK1.close();
                    return arrayList3;
                } catch (Throwable th2) {
                    cVarK1.close();
                    throw th2;
                }
            case 3:
                l1.b bVar = (l1.b) obj;
                k kVar2 = bVar.f9828b;
                if (kVar2 != null && (kVar = bVar.f9827a) != null) {
                    try {
                        objS = kVar2.invoke(Long.valueOf(j9));
                    } catch (Throwable th3) {
                        objS = t1.s(th3);
                    }
                    kVar.resumeWith(objS);
                    break;
                }
                return b0Var;
            case 4:
                f2.d dVar = (f2.d) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (dVar.A.b() >> 32)) / 2.0f;
                return dVar.a(new l3(fIntBitsToFloat, a.a.r(dVar, fIntBitsToFloat), new i2.m(j9, 5), 3));
            case 5:
                ((a0) obj).a(e1.g0.f4964c, new f0(y0.A, this.B, e0.B, true));
                return b0Var;
            case 6:
                k2.d dVar2 = (k2.d) obj;
                m.e(dVar2, "$this$let");
                k2.d.R(dVar2, this.B, 0L, 0L, 0.0f, null, 0, 126);
                return b0Var;
            case 7:
                k2.d dVar3 = (k2.d) obj;
                m.e(dVar3, "$this$let");
                k2.d.R(dVar3, this.B, 0L, 0L, 0.0f, null, 0, 126);
                return b0Var;
            case 8:
                k2.d dVar4 = (k2.d) obj;
                m.e(dVar4, "$this$let");
                k2.d.R(dVar4, this.B, 0L, 0L, 0.0f, null, 0, 126);
                return b0Var;
            case 9:
                k2.d dVar5 = (k2.d) obj;
                m.e(dVar5, "$this$drawBackdrop");
                k2.d.R(dVar5, this.B, 0L, 0L, 0.0f, null, 0, 126);
                return b0Var;
            default:
                ma.a aVar3 = (ma.a) obj;
                m.e(aVar3, "_connection");
                ma.c cVarK2 = aVar3.k0("\n    DELETE FROM favorites_data\n    WHERE id = ?\n");
                try {
                    cVarK2.d(1, j9);
                    cVarK2.d0();
                    return b0Var;
                } finally {
                    cVarK2.close();
                }
        }
    }
}
