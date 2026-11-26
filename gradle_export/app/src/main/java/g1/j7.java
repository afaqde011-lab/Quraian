package g1;

import androidx.media3.ui.PlayerView;
import com.google.android.gms.cast.MediaError;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.onboarding.presentation.analytics.OnboardingAnalytics;
import java.util.ArrayList;
import java.util.List;

public final class j7 implements u00.k {
    public final int A;

    public j7(int i10) {
        this.A = i10;
    }

    private final Object a(Object obj) throws Exception {
        ma.a aVar = (ma.a) obj;
        kotlin.jvm.internal.m.e(aVar, "_connection");
        ma.c cVarK0 = aVar.k0("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
        try {
            boolean z10 = false;
            if (cVarK0.d0() && ((int) cVarK0.getLong(0)) != 0) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        } finally {
            cVarK0.close();
        }
    }

    private final Object e(Object obj) throws Exception {
        ma.a aVar = (ma.a) obj;
        kotlin.jvm.internal.m.e(aVar, "_connection");
        ma.c cVarK0 = aVar.k0("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            cVarK0.d(1, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN);
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
                int i10 = I13;
                int i11 = I14;
                za.g0 g0VarL = c7.i.L((int) cVarK0.getLong(I2));
                String strR2 = cVarK0.R(I3);
                String strR3 = cVarK0.R(I4);
                byte[] blob = cVarK0.getBlob(I5);
                za.g gVar = za.g.f17367b;
                za.g gVarD = kh.n.D(blob);
                za.g gVarD2 = kh.n.D(cVarK0.getBlob(I6));
                long j9 = cVarK0.getLong(I7);
                long j10 = cVarK0.getLong(I8);
                long j11 = cVarK0.getLong(I9);
                int i12 = (int) cVarK0.getLong(I10);
                int i13 = I;
                int i14 = I2;
                za.a aVarI = c7.i.I((int) cVarK0.getLong(I11));
                long j12 = cVarK0.getLong(I12);
                long j13 = cVarK0.getLong(i10);
                long j14 = cVarK0.getLong(i11);
                int i15 = I15;
                long j15 = cVarK0.getLong(i15);
                I15 = i15;
                int i16 = I16;
                int i17 = I3;
                boolean z10 = ((int) cVarK0.getLong(i16)) != 0;
                int i18 = I17;
                int i19 = I4;
                za.c0 c0VarK = c7.i.K((int) cVarK0.getLong(i18));
                int i20 = I18;
                int i21 = (int) cVarK0.getLong(i20);
                int i22 = I19;
                int i23 = (int) cVarK0.getLong(i22);
                int i24 = I20;
                long j16 = cVarK0.getLong(i24);
                int i25 = I21;
                int i26 = (int) cVarK0.getLong(i25);
                I21 = i25;
                I22 = I22;
                int i27 = (int) cVarK0.getLong(I22);
                int i28 = I23;
                Boolean boolValueOf = null;
                String strR4 = cVarK0.isNull(i28) ? null : cVarK0.R(i28);
                int i29 = I24;
                Integer numValueOf = cVarK0.isNull(i29) ? null : Integer.valueOf((int) cVarK0.getLong(i29));
                if (numValueOf != null) {
                    boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                }
                Boolean bool = boolValueOf;
                int i30 = I25;
                za.w wVarJ = c7.i.J((int) cVarK0.getLong(i30));
                int i31 = I26;
                ib.f fVarX = c7.i.X(cVarK0.getBlob(i31));
                int i32 = I27;
                boolean z11 = ((int) cVarK0.getLong(i32)) != 0;
                int i33 = I28;
                boolean z12 = ((int) cVarK0.getLong(i33)) != 0;
                int i34 = I29;
                boolean z13 = ((int) cVarK0.getLong(i34)) != 0;
                I29 = i34;
                int i35 = I30;
                int i36 = I31;
                int i37 = I32;
                I31 = i36;
                int i38 = I33;
                arrayList.add(new hb.p(strR, g0VarL, strR2, strR3, gVarD, gVarD2, j9, j10, j11, new za.e(fVarX, wVarJ, z11, z12, z13, ((int) cVarK0.getLong(i35)) != 0, cVarK0.getLong(i36), cVarK0.getLong(i37), c7.i.n(cVarK0.getBlob(i38))), i12, aVarI, j12, j13, j14, j15, z10, c0VarK, i21, i23, j16, i26, i27, strR4, bool));
                I28 = i33;
                I4 = i19;
                I17 = i18;
                I18 = i20;
                I19 = i22;
                I20 = i24;
                I23 = i28;
                I24 = i29;
                I25 = i30;
                I26 = i31;
                I27 = i32;
                I33 = i38;
                I32 = i37;
                I30 = i35;
                I = i13;
                I3 = i17;
                I13 = i10;
                I14 = i11;
                I2 = i14;
                I16 = i16;
            }
            return arrayList;
        } finally {
            cVarK0.close();
        }
    }

    private final Object f(Object obj) throws Exception {
        ma.a aVar = (ma.a) obj;
        kotlin.jvm.internal.m.e(aVar, "_connection");
        ma.c cVarK0 = aVar.k0("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
        try {
            cVarK0.d0();
            return Integer.valueOf(w00.a.x(aVar));
        } finally {
            cVarK0.close();
        }
    }

    private final Object g(Object obj) {
        y50.a aVar = (y50.a) obj;
        kotlin.jvm.internal.m.e(aVar, "$this$module");
        c8 c8Var = new c8(6);
        v50.c cVar = v50.c.B;
        kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
        a10.d dVarB = b0Var.b(gu.a.class);
        b60.b bVar = c60.a.e;
        aVar.a(new w50.a(new v50.a(bVar, dVarB, (b60.a) null, c8Var, cVar)));
        aVar.a(new w50.a(new v50.a(bVar, b0Var.b(OnboardingAnalytics.class), (b60.a) null, new c8(7), cVar)));
        aVar.a(new w50.a(new v50.a(bVar, b0Var.b(ku.a.class), (b60.a) null, new c8(8), cVar)));
        aVar.a(new w50.a(new v50.a(bVar, b0Var.b(lu.e0.class), (b60.a) null, new c8(9), cVar)));
        return g00.b0.a;
    }

    private final Object h(Object obj) {
        kotlin.jvm.internal.m.e((j3.a0) obj, "$this$clearAndSetSemantics");
        return g00.b0.a;
    }

    private final Object i(Object obj) {
        i2.c0 c0Var = (i2.c0) obj;
        kotlin.jvm.internal.m.e(c0Var, "$this$graphicsLayer");
        c0Var.v(-90.0f);
        return g00.b0.a;
    }

    private final Object j(Object obj) {
        kotlin.jvm.internal.m.e((w.v) obj, "$this$AnimatedContent");
        x.q1 q1VarW = x.c.w(MediaError.DetailedErrorCode.NETWORK_UNKNOWN, 0, x.w.f16378b, 2);
        w.j0 j0VarD = w.m.d(w.s0.c(q1VarW, 2), w.s0.d(q1VarW, 2));
        j0VarD.f15779d = new w.c2(false, new c8(10));
        return j0VarD;
    }

    public final Object invoke(Object obj) throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        int i10 = this.A;
        g00.b0 b0Var = g00.b0.a;
        switch (i10) {
            case 0:
                float f3 = z7.f6046a;
                return b0Var;
            case 1:
                j3.y.o((j3.a0) obj);
                return b0Var;
            case 2:
                a10.w[] wVarArr = j3.y.f8004a;
                ((j3.a0) obj).a(j3.w.f7982e, b0Var);
                return b0Var;
            case 3:
                List list = (List) obj;
                Object obj2 = list.get(0);
                kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                kotlin.jvm.internal.m.c(obj3, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) obj3).intValue();
                Object obj4 = list.get(2);
                kotlin.jvm.internal.m.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                return new d8(iIntValue, iIntValue2, ((Boolean) obj4).booleanValue());
            case 4:
                return b0Var;
            case 5:
                PlayerView playerView = (PlayerView) obj;
                kotlin.jvm.internal.m.e(playerView, "playerView");
                playerView.setRenderEffect(null);
                playerView.setPlayer(null);
                return b0Var;
            case 6:
                i2.c0 c0Var = (i2.c0) obj;
                kotlin.jvm.internal.m.e(c0Var, "$this$graphicsLayer");
                c0Var.L0(false);
                return b0Var;
            case 7:
                d00.n0 n0Var = (d00.n0) obj;
                kotlin.jvm.internal.m.e(n0Var, "$this$hazeEffect");
                e00.d dVar = n0Var.d0;
                e00.d dVar2 = dVar instanceof e00.d ? dVar : null;
                if (dVar2 == null) {
                    dVar2 = new e00.d();
                }
                n0Var.E1(dVar2);
                float f10 = 60;
                if (!y3.f.b(f10, dVar2.e)) {
                    dVar2.e = f10;
                    dVar2.p(dVar2.m() | 2);
                }
                if (0.15f != dVar2.f) {
                    dVar2.f = 0.15f;
                    dVar2.p(dVar2.m() | 4);
                }
                return b0Var;
            case 8:
                kotlin.jvm.internal.m.e((j3.a0) obj, "$this$semantics");
                return b0Var;
            case 9:
                return ((h0.m2) obj).f6430g;
            case 10:
                return ((h0.m2) obj).f6429f;
            case 11:
                return ((h0.m2) obj).f6426c;
            case 12:
                return ((h0.m2) obj).f6428e;
            case 13:
                b3.o2 o2Var = (b3.o2) obj;
                kotlin.jvm.internal.m.c(o2Var, "null cannot be cast to non-null type androidx.compose.material3.internal.ParentSemanticsNode");
                h1.q0 q0Var = (h1.q0) o2Var;
                q0Var.P = false;
                b3.m.o(q0Var);
                return Boolean.FALSE;
            case 14:
                ma.a aVar = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar, "_connection");
                ma.c cVarK0 = aVar.k0("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (cVarK0.d0()) {
                        arrayList.add(cVarK0.R(0));
                    }
                    cVarK0.close();
                    return arrayList;
                } catch (Throwable th2) {
                    cVarK0.close();
                    throw th2;
                }
            case 15:
                ma.a aVar2 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar2, "_connection");
                ma.c cVarK1 = aVar2.k0("DELETE FROM WorkProgress");
                try {
                    cVarK1.d0();
                    return b0Var;
                } finally {
                    cVarK1.close();
                }
            case 16:
                ma.a aVar3 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar3, "_connection");
                ma.c cVarK2 = aVar3.k0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int I = w50.c.I(cVarK2, "id");
                    int I2 = w50.c.I(cVarK2, "state");
                    int I3 = w50.c.I(cVarK2, "worker_class_name");
                    int I4 = w50.c.I(cVarK2, "input_merger_class_name");
                    int I5 = w50.c.I(cVarK2, "input");
                    int I6 = w50.c.I(cVarK2, "output");
                    int I7 = w50.c.I(cVarK2, "initial_delay");
                    int I8 = w50.c.I(cVarK2, "interval_duration");
                    int I9 = w50.c.I(cVarK2, "flex_duration");
                    int I10 = w50.c.I(cVarK2, "run_attempt_count");
                    int I11 = w50.c.I(cVarK2, "backoff_policy");
                    int I12 = w50.c.I(cVarK2, "backoff_delay_duration");
                    int I13 = w50.c.I(cVarK2, "last_enqueue_time");
                    int I14 = w50.c.I(cVarK2, "minimum_retention_duration");
                    int I15 = w50.c.I(cVarK2, "schedule_requested_at");
                    int I16 = w50.c.I(cVarK2, "run_in_foreground");
                    int I17 = w50.c.I(cVarK2, "out_of_quota_policy");
                    int I18 = w50.c.I(cVarK2, "period_count");
                    int I19 = w50.c.I(cVarK2, "generation");
                    int I20 = w50.c.I(cVarK2, "next_schedule_time_override");
                    int I21 = w50.c.I(cVarK2, "next_schedule_time_override_generation");
                    int I22 = w50.c.I(cVarK2, "stop_reason");
                    int I23 = w50.c.I(cVarK2, "trace_tag");
                    int I24 = w50.c.I(cVarK2, "backoff_on_system_interruptions");
                    int I25 = w50.c.I(cVarK2, "required_network_type");
                    int I26 = w50.c.I(cVarK2, "required_network_request");
                    int I27 = w50.c.I(cVarK2, "requires_charging");
                    int I28 = w50.c.I(cVarK2, "requires_device_idle");
                    int I29 = w50.c.I(cVarK2, "requires_battery_not_low");
                    int I30 = w50.c.I(cVarK2, "requires_storage_not_low");
                    int I31 = w50.c.I(cVarK2, "trigger_content_update_delay");
                    int I32 = w50.c.I(cVarK2, "trigger_max_content_delay");
                    int I33 = w50.c.I(cVarK2, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarK2.d0()) {
                        String strR = cVarK2.R(I);
                        int i11 = I14;
                        int i12 = I13;
                        za.g0 g0VarL = c7.i.L((int) cVarK2.getLong(I2));
                        String strR2 = cVarK2.R(I3);
                        String strR3 = cVarK2.R(I4);
                        byte[] blob = cVarK2.getBlob(I5);
                        za.g gVar = za.g.f17367b;
                        za.g gVarD = kh.n.D(blob);
                        za.g gVarD2 = kh.n.D(cVarK2.getBlob(I6));
                        long j9 = cVarK2.getLong(I7);
                        long j10 = cVarK2.getLong(I8);
                        long j11 = cVarK2.getLong(I9);
                        int i13 = (int) cVarK2.getLong(I10);
                        int i14 = I3;
                        int i15 = I2;
                        za.a aVarI = c7.i.I((int) cVarK2.getLong(I11));
                        long j12 = cVarK2.getLong(I12);
                        long j13 = cVarK2.getLong(i12);
                        long j14 = cVarK2.getLong(i11);
                        int i16 = I15;
                        long j15 = cVarK2.getLong(i16);
                        I15 = i16;
                        int i17 = I16;
                        int i18 = I;
                        boolean z10 = ((int) cVarK2.getLong(i17)) != 0;
                        int i19 = I4;
                        int i20 = I17;
                        za.c0 c0VarK = c7.i.K((int) cVarK2.getLong(i20));
                        I17 = i20;
                        int i21 = I18;
                        int i22 = (int) cVarK2.getLong(i21);
                        I18 = i21;
                        int i23 = I19;
                        int i24 = (int) cVarK2.getLong(i23);
                        int i25 = I20;
                        long j16 = cVarK2.getLong(i25);
                        int i26 = I21;
                        int i27 = (int) cVarK2.getLong(i26);
                        int i28 = I22;
                        int i29 = (int) cVarK2.getLong(i28);
                        int i30 = I23;
                        String strR4 = cVarK2.isNull(i30) ? null : cVarK2.R(i30);
                        int i31 = I24;
                        Integer numValueOf = cVarK2.isNull(i31) ? null : Integer.valueOf((int) cVarK2.getLong(i31));
                        if (numValueOf != null) {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                        } else {
                            boolValueOf = null;
                        }
                        int i32 = I25;
                        za.w wVarJ = c7.i.J((int) cVarK2.getLong(i32));
                        int i33 = I26;
                        ib.f fVarX = c7.i.X(cVarK2.getBlob(i33));
                        int i34 = I27;
                        boolean z11 = ((int) cVarK2.getLong(i34)) != 0;
                        int i35 = I28;
                        boolean z12 = ((int) cVarK2.getLong(i35)) != 0;
                        int i36 = I29;
                        boolean z13 = ((int) cVarK2.getLong(i36)) != 0;
                        I29 = i36;
                        int i37 = I30;
                        int i38 = I31;
                        int i39 = I32;
                        I31 = i38;
                        int i40 = I33;
                        I33 = i40;
                        arrayList2.add(new hb.p(strR, g0VarL, strR2, strR3, gVarD, gVarD2, j9, j10, j11, new za.e(fVarX, wVarJ, z11, z12, z13, ((int) cVarK2.getLong(i37)) != 0, cVarK2.getLong(i38), cVarK2.getLong(i39), c7.i.n(cVarK2.getBlob(i40))), i13, aVarI, j12, j13, j14, j15, z10, c0VarK, i22, i24, j16, i27, i29, strR4, boolValueOf));
                        I = i18;
                        I16 = i17;
                        I19 = i23;
                        I21 = i26;
                        I22 = i28;
                        I23 = i30;
                        I24 = i31;
                        I25 = i32;
                        I26 = i33;
                        I32 = i39;
                        I30 = i37;
                        I2 = i15;
                        I4 = i19;
                        I20 = i25;
                        I27 = i34;
                        I13 = i12;
                        I3 = i14;
                        I28 = i35;
                        I14 = i11;
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarK2.close();
                }
            case 17:
                ma.a aVar4 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar4, "_connection");
                ma.c cVarK3 = aVar4.k0("SELECT * FROM workspec WHERE state=1");
                try {
                    int I34 = w50.c.I(cVarK3, "id");
                    int I35 = w50.c.I(cVarK3, "state");
                    int I36 = w50.c.I(cVarK3, "worker_class_name");
                    int I37 = w50.c.I(cVarK3, "input_merger_class_name");
                    int I38 = w50.c.I(cVarK3, "input");
                    int I39 = w50.c.I(cVarK3, "output");
                    int I40 = w50.c.I(cVarK3, "initial_delay");
                    int I41 = w50.c.I(cVarK3, "interval_duration");
                    int I42 = w50.c.I(cVarK3, "flex_duration");
                    int I43 = w50.c.I(cVarK3, "run_attempt_count");
                    int I44 = w50.c.I(cVarK3, "backoff_policy");
                    int I45 = w50.c.I(cVarK3, "backoff_delay_duration");
                    int I46 = w50.c.I(cVarK3, "last_enqueue_time");
                    int I47 = w50.c.I(cVarK3, "minimum_retention_duration");
                    int I48 = w50.c.I(cVarK3, "schedule_requested_at");
                    int I49 = w50.c.I(cVarK3, "run_in_foreground");
                    int I50 = w50.c.I(cVarK3, "out_of_quota_policy");
                    int I51 = w50.c.I(cVarK3, "period_count");
                    int I52 = w50.c.I(cVarK3, "generation");
                    int I53 = w50.c.I(cVarK3, "next_schedule_time_override");
                    int I54 = w50.c.I(cVarK3, "next_schedule_time_override_generation");
                    int I55 = w50.c.I(cVarK3, "stop_reason");
                    int I56 = w50.c.I(cVarK3, "trace_tag");
                    int I57 = w50.c.I(cVarK3, "backoff_on_system_interruptions");
                    int I58 = w50.c.I(cVarK3, "required_network_type");
                    int I59 = w50.c.I(cVarK3, "required_network_request");
                    int I60 = w50.c.I(cVarK3, "requires_charging");
                    int I61 = w50.c.I(cVarK3, "requires_device_idle");
                    int I62 = w50.c.I(cVarK3, "requires_battery_not_low");
                    int I63 = w50.c.I(cVarK3, "requires_storage_not_low");
                    int I64 = w50.c.I(cVarK3, "trigger_content_update_delay");
                    int I65 = w50.c.I(cVarK3, "trigger_max_content_delay");
                    int I66 = w50.c.I(cVarK3, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (cVarK3.d0()) {
                        String strR5 = cVarK3.R(I34);
                        int i41 = I47;
                        int i42 = I46;
                        za.g0 g0VarL2 = c7.i.L((int) cVarK3.getLong(I35));
                        String strR6 = cVarK3.R(I36);
                        String strR7 = cVarK3.R(I37);
                        byte[] blob2 = cVarK3.getBlob(I38);
                        za.g gVar2 = za.g.f17367b;
                        za.g gVarD3 = kh.n.D(blob2);
                        za.g gVarD4 = kh.n.D(cVarK3.getBlob(I39));
                        long j17 = cVarK3.getLong(I40);
                        long j18 = cVarK3.getLong(I41);
                        long j19 = cVarK3.getLong(I42);
                        int i43 = (int) cVarK3.getLong(I43);
                        int i44 = I36;
                        int i45 = I35;
                        za.a aVarI2 = c7.i.I((int) cVarK3.getLong(I44));
                        long j20 = cVarK3.getLong(I45);
                        long j21 = cVarK3.getLong(i42);
                        long j22 = cVarK3.getLong(i41);
                        int i46 = I48;
                        long j23 = cVarK3.getLong(i46);
                        int i47 = I34;
                        int i48 = I49;
                        boolean z14 = ((int) cVarK3.getLong(i48)) != 0;
                        int i49 = I37;
                        int i50 = I50;
                        za.c0 c0VarK2 = c7.i.K((int) cVarK3.getLong(i50));
                        int i51 = I51;
                        int i52 = (int) cVarK3.getLong(i51);
                        int i53 = I52;
                        int i54 = (int) cVarK3.getLong(i53);
                        long j24 = cVarK3.getLong(I53);
                        int i55 = I54;
                        int i56 = (int) cVarK3.getLong(i55);
                        I54 = i55;
                        I55 = I55;
                        int i57 = (int) cVarK3.getLong(I55);
                        I56 = I56;
                        String strR8 = cVarK3.isNull(I56) ? null : cVarK3.R(I56);
                        int i58 = I57;
                        Integer numValueOf2 = cVarK3.isNull(i58) ? null : Integer.valueOf((int) cVarK3.getLong(i58));
                        if (numValueOf2 != null) {
                            boolValueOf2 = Boolean.valueOf(numValueOf2.intValue() != 0);
                        } else {
                            boolValueOf2 = null;
                        }
                        int i59 = I58;
                        za.w wVarJ2 = c7.i.J((int) cVarK3.getLong(i59));
                        int i60 = I59;
                        ib.f fVarX2 = c7.i.X(cVarK3.getBlob(i60));
                        I57 = i58;
                        I58 = i59;
                        int i61 = I60;
                        boolean z15 = ((int) cVarK3.getLong(i61)) != 0;
                        int i62 = I61;
                        boolean z16 = ((int) cVarK3.getLong(i62)) != 0;
                        I60 = i61;
                        int i63 = I62;
                        boolean z17 = ((int) cVarK3.getLong(i63)) != 0;
                        I61 = i62;
                        I62 = i63;
                        int i64 = I63;
                        int i65 = I64;
                        int i66 = I65;
                        int i67 = I66;
                        I64 = i65;
                        arrayList3.add(new hb.p(strR5, g0VarL2, strR6, strR7, gVarD3, gVarD4, j17, j18, j19, new za.e(fVarX2, wVarJ2, z15, z16, z17, ((int) cVarK3.getLong(i64)) != 0, cVarK3.getLong(i65), cVarK3.getLong(i66), c7.i.n(cVarK3.getBlob(i67))), i43, aVarI2, j20, j21, j22, j23, z14, c0VarK2, i52, i54, j24, i56, i57, strR8, boolValueOf2));
                        I65 = i66;
                        I63 = i64;
                        I66 = i67;
                        I47 = i41;
                        I35 = i45;
                        I36 = i44;
                        I37 = i49;
                        I49 = i48;
                        I50 = i50;
                        I51 = i51;
                        I52 = i53;
                        I59 = i60;
                        I34 = i47;
                        I48 = i46;
                        I46 = i42;
                        break;
                    }
                    return arrayList3;
                } finally {
                    cVarK3.close();
                }
            case TYPE_SINT64_VALUE:
                ma.a aVar5 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar5, "_connection");
                ma.c cVarK4 = aVar5.k0("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                try {
                    cVarK4.d0();
                    return b0Var;
                } finally {
                    cVarK4.close();
                }
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                ma.a aVar6 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar6, "_connection");
                ma.c cVarK5 = aVar6.k0("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int I67 = w50.c.I(cVarK5, "id");
                    int I68 = w50.c.I(cVarK5, "state");
                    int I69 = w50.c.I(cVarK5, "worker_class_name");
                    int I70 = w50.c.I(cVarK5, "input_merger_class_name");
                    int I71 = w50.c.I(cVarK5, "input");
                    int I72 = w50.c.I(cVarK5, "output");
                    int I73 = w50.c.I(cVarK5, "initial_delay");
                    int I74 = w50.c.I(cVarK5, "interval_duration");
                    int I75 = w50.c.I(cVarK5, "flex_duration");
                    int I76 = w50.c.I(cVarK5, "run_attempt_count");
                    int I77 = w50.c.I(cVarK5, "backoff_policy");
                    int I78 = w50.c.I(cVarK5, "backoff_delay_duration");
                    int I79 = w50.c.I(cVarK5, "last_enqueue_time");
                    int I80 = w50.c.I(cVarK5, "minimum_retention_duration");
                    int I81 = w50.c.I(cVarK5, "schedule_requested_at");
                    int I82 = w50.c.I(cVarK5, "run_in_foreground");
                    int I83 = w50.c.I(cVarK5, "out_of_quota_policy");
                    int I84 = w50.c.I(cVarK5, "period_count");
                    int I85 = w50.c.I(cVarK5, "generation");
                    int I86 = w50.c.I(cVarK5, "next_schedule_time_override");
                    int I87 = w50.c.I(cVarK5, "next_schedule_time_override_generation");
                    int I88 = w50.c.I(cVarK5, "stop_reason");
                    int I89 = w50.c.I(cVarK5, "trace_tag");
                    int I90 = w50.c.I(cVarK5, "backoff_on_system_interruptions");
                    int I91 = w50.c.I(cVarK5, "required_network_type");
                    int I92 = w50.c.I(cVarK5, "required_network_request");
                    int I93 = w50.c.I(cVarK5, "requires_charging");
                    int I94 = w50.c.I(cVarK5, "requires_device_idle");
                    int I95 = w50.c.I(cVarK5, "requires_battery_not_low");
                    int I96 = w50.c.I(cVarK5, "requires_storage_not_low");
                    int I97 = w50.c.I(cVarK5, "trigger_content_update_delay");
                    int I98 = w50.c.I(cVarK5, "trigger_max_content_delay");
                    int I99 = w50.c.I(cVarK5, "content_uri_triggers");
                    ArrayList arrayList4 = new ArrayList();
                    while (cVarK5.d0()) {
                        String strR9 = cVarK5.R(I67);
                        int i68 = I80;
                        int i69 = I79;
                        za.g0 g0VarL3 = c7.i.L((int) cVarK5.getLong(I68));
                        String strR10 = cVarK5.R(I69);
                        String strR11 = cVarK5.R(I70);
                        byte[] blob3 = cVarK5.getBlob(I71);
                        za.g gVar3 = za.g.f17367b;
                        za.g gVarD5 = kh.n.D(blob3);
                        za.g gVarD6 = kh.n.D(cVarK5.getBlob(I72));
                        long j25 = cVarK5.getLong(I73);
                        long j26 = cVarK5.getLong(I74);
                        long j27 = cVarK5.getLong(I75);
                        int i70 = (int) cVarK5.getLong(I76);
                        int i71 = I69;
                        int i72 = I68;
                        za.a aVarI3 = c7.i.I((int) cVarK5.getLong(I77));
                        long j28 = cVarK5.getLong(I78);
                        long j29 = cVarK5.getLong(i69);
                        long j30 = cVarK5.getLong(i68);
                        int i73 = I81;
                        long j31 = cVarK5.getLong(i73);
                        int i74 = I67;
                        int i75 = I82;
                        boolean z18 = ((int) cVarK5.getLong(i75)) != 0;
                        int i76 = I70;
                        int i77 = I83;
                        za.c0 c0VarK3 = c7.i.K((int) cVarK5.getLong(i77));
                        int i78 = I84;
                        int i79 = (int) cVarK5.getLong(i78);
                        int i80 = I85;
                        int i81 = (int) cVarK5.getLong(i80);
                        long j32 = cVarK5.getLong(I86);
                        int i82 = I87;
                        int i83 = (int) cVarK5.getLong(i82);
                        I87 = i82;
                        I88 = I88;
                        int i84 = (int) cVarK5.getLong(I88);
                        I89 = I89;
                        String strR12 = cVarK5.isNull(I89) ? null : cVarK5.R(I89);
                        int i85 = I90;
                        Integer numValueOf3 = cVarK5.isNull(i85) ? null : Integer.valueOf((int) cVarK5.getLong(i85));
                        if (numValueOf3 != null) {
                            boolValueOf3 = Boolean.valueOf(numValueOf3.intValue() != 0);
                        } else {
                            boolValueOf3 = null;
                        }
                        int i86 = I91;
                        za.w wVarJ3 = c7.i.J((int) cVarK5.getLong(i86));
                        int i87 = I92;
                        ib.f fVarX3 = c7.i.X(cVarK5.getBlob(i87));
                        I90 = i85;
                        I91 = i86;
                        int i88 = I93;
                        boolean z19 = ((int) cVarK5.getLong(i88)) != 0;
                        int i89 = I94;
                        boolean z20 = ((int) cVarK5.getLong(i89)) != 0;
                        I93 = i88;
                        int i90 = I95;
                        boolean z21 = ((int) cVarK5.getLong(i90)) != 0;
                        I94 = i89;
                        I95 = i90;
                        int i91 = I96;
                        int i92 = I97;
                        int i93 = I98;
                        int i94 = I99;
                        I97 = i92;
                        arrayList4.add(new hb.p(strR9, g0VarL3, strR10, strR11, gVarD5, gVarD6, j25, j26, j27, new za.e(fVarX3, wVarJ3, z19, z20, z21, ((int) cVarK5.getLong(i91)) != 0, cVarK5.getLong(i92), cVarK5.getLong(i93), c7.i.n(cVarK5.getBlob(i94))), i70, aVarI3, j28, j29, j30, j31, z18, c0VarK3, i79, i81, j32, i83, i84, strR12, boolValueOf3));
                        I98 = i93;
                        I96 = i91;
                        I99 = i94;
                        I80 = i68;
                        I68 = i72;
                        I69 = i71;
                        I70 = i76;
                        I82 = i75;
                        I83 = i77;
                        I84 = i78;
                        I85 = i80;
                        I92 = i87;
                        I67 = i74;
                        I81 = i73;
                        I79 = i69;
                        break;
                    }
                    return arrayList4;
                } finally {
                    cVarK5.close();
                }
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                ma.a aVar7 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar7, "_connection");
                ma.c cVarK6 = aVar7.k0("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)");
                try {
                    ArrayList arrayList5 = new ArrayList();
                    while (cVarK6.d0()) {
                        arrayList5.add(cVarK6.R(0));
                    }
                    cVarK6.close();
                    return arrayList5;
                } catch (Throwable th3) {
                    cVarK6.close();
                    throw th3;
                }
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                ma.a aVar8 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar8, "_connection");
                ma.c cVarK7 = aVar8.k0("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i95 = cVarK7.d0() ? (int) cVarK7.getLong(0) : 0;
                    cVarK7.close();
                    return Integer.valueOf(i95);
                } catch (Throwable th4) {
                    cVarK7.close();
                    throw th4;
                }
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return a(obj);
            case 23:
                return e(obj);
            case 24:
                return f(obj);
            case 25:
                return g(obj);
            case RuntimeVersion.MINOR:
                return h(obj);
            case 27:
                return i(obj);
            case 28:
                return j(obj);
            default:
                ot.a aVar9 = (ot.a) obj;
                kotlin.jvm.internal.m.e(aVar9, "it");
                return Integer.valueOf(aVar9.a);
        }
    }
}
