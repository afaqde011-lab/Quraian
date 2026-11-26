package a1;

import android.content.Context;
import com.google.protobuf.RuntimeVersion;
import com.mchutov.quranify.audiostories.data.worker.AudioStoryDownloadWorker;
import g1.b5;
import g1.f4;

public final class a0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final Object C;

    public a0(Object obj, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = obj;
    }

    public a0(k0.y yVar, int i10, k00.c cVar) {
        super(2, cVar);
        this.A = 28;
        this.C = yVar;
        this.B = i10;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new a0((b0) this.C, cVar, 0);
            case 1:
                return new a0((t1) this.C, cVar, 1);
            case 2:
                return new a0((av.p) this.C, cVar, 2);
            case 3:
                return new a0((av.q) this.C, cVar, 3);
            case 4:
                return new a0((av.t) this.C, cVar, 4);
            case 5:
                return new a0((bp.a) this.C, cVar, 5);
            case 6:
                return new a0((ca.g) this.C, cVar, 6);
            case 7:
                return new a0((ca.l0) this.C, cVar, 7);
            case 8:
                return new a0((cs.p) this.C, cVar, 8);
            case 9:
                return new a0((d0.m1) this.C, cVar, 9);
            case 10:
                return new a0((d00.w0) this.C, cVar, 10);
            case 11:
                return new a0((d40.z) this.C, cVar, 11);
            case 12:
                return new a0((l1.x1) this.C, cVar, 12);
            case 13:
                return new a0((d6.h1) this.C, cVar, 13);
            case 14:
                return new a0((Context) this.C, cVar, 14);
            case 15:
                return new a0((ds.n) this.C, cVar, 15);
            case 16:
                return new a0((a40.q) this.C, cVar, 16);
            case 17:
                return new a0((AudioStoryDownloadWorker) this.C, cVar, 17);
            case TYPE_SINT64_VALUE:
                return new a0((rc.c) this.C, cVar, 18);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return new a0((g1.o0) this.C, cVar, 19);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return new a0((g2.t) this.C, cVar, 20);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                return new a0((f4) this.C, cVar, 21);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                return new a0((q1) this.C, cVar, 22);
            case 23:
                return new a0((b5) this.C, cVar, 23);
            case 24:
                return new a0((z.p1) this.C, cVar, 24);
            case 25:
                return new a0((id.g) this.C, cVar, 25);
            case RuntimeVersion.MINOR:
                return new a0((is.c1) this.C, cVar, 26);
            case 27:
                return new a0((jd.a) this.C, cVar, 27);
            case 28:
                return new a0((k0.y) this.C, this.B, cVar);
            default:
                return new a0((h1.l) this.C, cVar, 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
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
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
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
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
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
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 28:
                a0 a0VarCreate = create((d0.y1) obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                a0VarCreate.invokeSuspend(b0Var);
                return b0Var;
            default:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        throw new UnsupportedOperationException("Method not decompiled: a1.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
