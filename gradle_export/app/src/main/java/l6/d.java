package l6;

import a1.d0;
import androidx.work.CoroutineWorker;
import c3.g1;
import com.google.protobuf.RuntimeVersion;
import kotlin.NoWhenBranchMatchedException;
import l1.y0;
import oo.c0;
import q0.k1;
import v2.j0;
import z.g0;
import z.z0;

public final class d extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final Object C;

    public d(Object obj, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = obj;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new d((r) this.C, cVar, 0);
            case 1:
                return new d((ld.h) this.C, cVar, 1);
            case 2:
                return new d((g1) this.C, cVar, 2);
            case 3:
                return new d((mb.j) this.C, cVar, 3);
            case 4:
                return new d((u00.k) this.C, cVar, 4);
            case 5:
                return new d((c0) this.C, cVar, 5);
            case 6:
                return new d((oo.g1) this.C, cVar, 6);
            case 7:
                return new d((pm.b) this.C, cVar, 7);
            case 8:
                return new d((p10.a) this.C, cVar, 8);
            case 9:
                return new d((d0) this.C, cVar, 9);
            case 10:
                return new d((k1) this.C, cVar, 10);
            case 11:
                return new d((q3.c) this.C, cVar, 11);
            case 12:
                return new d((qt.k) this.C, cVar, 12);
            case 13:
                return new d((rc.q) this.C, cVar, 13);
            case 14:
                d dVar = new d((y0) this.C, cVar, 14);
                dVar.B = ((Number) obj).intValue();
                return dVar;
            case 15:
                return new d((sn.c) this.C, cVar, 15);
            case 16:
                return new d((tv.b) this.C, cVar, 16);
            case 17:
                return new d((ut.p) this.C, cVar, 17);
            case TYPE_SINT64_VALUE:
                return new d((j0) this.C, cVar, 18);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return new d((vn.b0) this.C, cVar, 19);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return new d((x.y0) this.C, cVar, 20);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return new d((x9.a) this.C, cVar, 21);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return new d((xw.k) this.C, cVar, 22);
            case 23:
                return new d((xy.o) this.C, cVar, 23);
            case 24:
                return new d((yi.b) this.C, cVar, 24);
            case 25:
                return new d((z.a0) this.C, cVar, 25);
            case RuntimeVersion.MINOR:
                return new d((g0) this.C, cVar, 26);
            case 27:
                return new d((z0) this.C, cVar, 27);
            default:
                return new d((CoroutineWorker) this.C, cVar, 28);
        }
    }

    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        switch (this.A) {
            case 0:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 1:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 2:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 3:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 4:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 5:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 6:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 7:
                return create(obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 8:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 9:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 10:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 11:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 12:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 13:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 14:
                d dVarCreate = create(Integer.valueOf(((Number) obj).intValue()), (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                dVarCreate.invokeSuspend(b0Var);
                return b0Var;
            case 15:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 16:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 17:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case TYPE_SINT64_VALUE:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 23:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 24:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 25:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case RuntimeVersion.MINOR:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 27:
                create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            default:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws kotlin.NoWhenBranchMatchedException {
        throw new UnsupportedOperationException("Method not decompiled: l6.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
