package hb;

import h00.d0;
import java.util.ArrayList;
import java.util.List;
import za.g0;

public final class s implements u00.k {
    public final int A;
    public final String B;
    public final x C;

    public s(String str, x xVar, int i10) {
        this.A = i10;
        this.B = str;
        this.C = xVar;
    }

    public final Object invoke(Object obj) throws Exception {
        int i10 = this.A;
        int i11 = 16;
        int i12 = 15;
        int i13 = 14;
        int i14 = 3;
        int i15 = 2;
        int i16 = 1;
        int i17 = 0;
        String str = "getValue(...)";
        x xVar = this.C;
        String str2 = this.B;
        switch (i10) {
            case 0:
                ma.a aVar = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar, "_connection");
                ma.c cVarK0 = aVar.k0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
                try {
                    cVarK0.y(1, str2);
                    int i18 = 0;
                    u.e eVar = new u.e(0);
                    u.e eVar2 = new u.e(0);
                    while (cVarK0.d0()) {
                        String strR = cVarK0.R(i18);
                        if (!eVar.containsKey(strR)) {
                            eVar.put(strR, new ArrayList());
                        }
                        String strR2 = cVarK0.R(0);
                        if (!eVar2.containsKey(strR2)) {
                            eVar2.put(strR2, new ArrayList());
                        }
                        i18 = 0;
                    }
                    cVarK0.reset();
                    xVar.b(aVar, eVar);
                    xVar.a(aVar, eVar2);
                    ArrayList arrayList = new ArrayList();
                    while (cVarK0.d0()) {
                        String strR3 = cVarK0.R(0);
                        g0 g0VarL = c7.i.L((int) cVarK0.getLong(i16));
                        byte[] blob = cVarK0.getBlob(2);
                        za.g gVar = za.g.f17367b;
                        za.g gVarD = kh.n.D(blob);
                        int i19 = (int) cVarK0.getLong(3);
                        int i20 = (int) cVarK0.getLong(4);
                        long j9 = cVarK0.getLong(14);
                        long j10 = cVarK0.getLong(15);
                        long j11 = cVarK0.getLong(16);
                        za.a aVarI = c7.i.I((int) cVarK0.getLong(17));
                        long j12 = cVarK0.getLong(18);
                        long j13 = cVarK0.getLong(19);
                        int i21 = (int) cVarK0.getLong(20);
                        long j14 = cVarK0.getLong(21);
                        int i22 = (int) cVarK0.getLong(22);
                        za.e eVar3 = new za.e(c7.i.X(cVarK0.getBlob(6)), c7.i.J((int) cVarK0.getLong(5)), ((int) cVarK0.getLong(7)) != 0, ((int) cVarK0.getLong(8)) != 0, ((int) cVarK0.getLong(9)) != 0, ((int) cVarK0.getLong(10)) != 0, cVarK0.getLong(11), cVarK0.getLong(12), c7.i.n(cVarK0.getBlob(13)));
                        Object objO = d0.O(eVar, cVarK0.R(0));
                        kotlin.jvm.internal.m.d(objO, "getValue(...)");
                        List list = (List) objO;
                        Object objO2 = d0.O(eVar2, cVarK0.R(0));
                        kotlin.jvm.internal.m.d(objO2, "getValue(...)");
                        arrayList.add(new o(strR3, g0VarL, gVarD, j9, j10, j11, eVar3, i19, aVarI, j12, j13, i21, i20, j14, i22, list, (List) objO2));
                        i16 = 1;
                        break;
                    }
                    return arrayList;
                } finally {
                    cVarK0.close();
                }
            default:
                ma.a aVar2 = (ma.a) obj;
                kotlin.jvm.internal.m.e(aVar2, "_connection");
                ma.c cVarK1 = aVar2.k0("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)");
                try {
                    cVarK1.y(1, str2);
                    u.e eVar4 = new u.e(0);
                    u.e eVar5 = new u.e(0);
                    while (cVarK1.d0()) {
                        String strR4 = cVarK1.R(0);
                        if (!eVar4.containsKey(strR4)) {
                            eVar4.put(strR4, new ArrayList());
                        }
                        String strR5 = cVarK1.R(0);
                        if (!eVar5.containsKey(strR5)) {
                            eVar5.put(strR5, new ArrayList());
                        }
                    }
                    cVarK1.reset();
                    xVar.b(aVar2, eVar4);
                    xVar.a(aVar2, eVar5);
                    ArrayList arrayList2 = new ArrayList();
                    while (cVarK1.d0()) {
                        String strR6 = cVarK1.R(i17);
                        String str3 = str;
                        g0 g0VarL2 = c7.i.L((int) cVarK1.getLong(1));
                        byte[] blob2 = cVarK1.getBlob(i15);
                        za.g gVar2 = za.g.f17367b;
                        za.g gVarD2 = kh.n.D(blob2);
                        int i23 = (int) cVarK1.getLong(i14);
                        int i24 = (int) cVarK1.getLong(4);
                        long j15 = cVarK1.getLong(i13);
                        long j16 = cVarK1.getLong(i12);
                        long j17 = cVarK1.getLong(i11);
                        za.a aVarI2 = c7.i.I((int) cVarK1.getLong(17));
                        long j18 = cVarK1.getLong(18);
                        long j19 = cVarK1.getLong(19);
                        int i25 = (int) cVarK1.getLong(20);
                        long j20 = cVarK1.getLong(21);
                        int i26 = (int) cVarK1.getLong(22);
                        za.e eVar6 = new za.e(c7.i.X(cVarK1.getBlob(6)), c7.i.J((int) cVarK1.getLong(5)), ((int) cVarK1.getLong(7)) != 0, ((int) cVarK1.getLong(8)) != 0, ((int) cVarK1.getLong(9)) != 0, ((int) cVarK1.getLong(10)) != 0, cVarK1.getLong(11), cVarK1.getLong(12), c7.i.n(cVarK1.getBlob(13)));
                        Object objO3 = d0.O(eVar4, cVarK1.R(0));
                        kotlin.jvm.internal.m.d(objO3, str3);
                        List list2 = (List) objO3;
                        Object objO4 = d0.O(eVar5, cVarK1.R(0));
                        kotlin.jvm.internal.m.d(objO4, str3);
                        arrayList2.add(new o(strR6, g0VarL2, gVarD2, j15, j16, j17, eVar6, i23, aVarI2, j18, j19, i25, i24, j20, i26, list2, (List) objO4));
                        str = str3;
                        i11 = 16;
                        i12 = 15;
                        i13 = 14;
                        i14 = 3;
                        i15 = 2;
                        i17 = 0;
                        break;
                    }
                    return arrayList2;
                } finally {
                    cVarK1.close();
                }
        }
    }
}
