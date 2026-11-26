package a1;

import android.view.View;
import bv.e3;
import com.google.protobuf.RuntimeVersion;
import kotlin.KotlinNothingValueException;

public final class d extends m00.i implements u00.n {
    public final int A;
    public int B;
    public Object C;
    public final Object D;

    public d(Object obj, Object obj2, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.C = obj;
        this.D = obj2;
    }

    public d(Object obj, k00.c cVar, int i10) {
        super(2, cVar);
        this.A = i10;
        this.D = obj;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new d((h) this.C, (u0) this.D, cVar, 0);
            case 1:
                return new d((w2) this.C, (l9.f0) this.D, cVar, 1);
            case 2:
                return new d((d40.w0) this.C, (l9.f0) this.D, cVar, 2);
            case 3:
                return new d((a40.e1) this.C, (d0) this.D, cVar, 3);
            case 4:
                return new d((w0) this.C, (g) this.D, cVar, 4);
            case 5:
                return new d((q0.e1) this.C, (j2) this.D, cVar, 5);
            case 6:
                d dVar = new d((j2) this.D, cVar, 6);
                dVar.C = obj;
                return dVar;
            case 7:
                return new d((am.c) this.C, (String) this.D, cVar, 7);
            case 8:
                return new d((d40.z) this.C, (c40.t) this.D, cVar, 8);
            case 9:
                return new d((androidx.lifecycle.w) this.C, (av.i) this.D, cVar, 9);
            case 10:
                d dVar2 = new d((b00.c) this.D, cVar, 10);
                dVar2.C = obj;
                return dVar2;
            case 11:
                d dVar3 = new d((b1.h) this.D, cVar, 11);
                dVar3.C = obj;
                return dVar3;
            case 12:
                return new d((b4.r) this.C, (h2.c) this.D, cVar, 12);
            case 13:
                d dVar4 = new d((br.i) this.D, cVar, 13);
                dVar4.C = obj;
                return dVar4;
            case 14:
                return new d((bt.j2) this.C, (ys.f) this.D, cVar, 14);
            case 15:
                return new d((e3) this.C, (yt.a) this.D, cVar, 15);
            case 16:
                return new d((e3) this.C, (cy.g) this.D, cVar, 16);
            case 17:
                return new d((e3) this.C, (ot.e) this.D, cVar, 17);
            case TYPE_SINT64_VALUE:
                d dVar5 = new d((c3.q0) this.D, cVar, 18);
                dVar5.C = obj;
                return dVar5;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return new d((d40.n1) this.C, (c3.j2) this.D, cVar, 19);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return new d((l1.x1) this.C, (View) this.D, cVar, 20);
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                d dVar6 = new d((c4.z) this.D, cVar, 21);
                dVar6.C = obj;
                return dVar6;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                d dVar7 = new d((c40.w) this.D, cVar, 22);
                dVar7.C = obj;
                return dVar7;
            case 23:
                d dVar8 = new d((u00.k) this.D, cVar, 23);
                dVar8.C = obj;
                return dVar8;
            case 24:
                return new d((ca.l0) this.C, (u00.a) this.D, cVar, 24);
            case 25:
                return new d((l1.z0) this.C, (l1.z0) this.D, cVar, 25);
            case RuntimeVersion.MINOR:
                d dVar9 = new d((ce.c) this.D, cVar, 26);
                dVar9.C = obj;
                return dVar9;
            case 27:
                d dVar10 = new d((d0.m1) this.D, cVar, 27);
                dVar10.C = obj;
                return dVar10;
            case 28:
                return new d((d0.p1) this.C, (u00.n) this.D, cVar, 28);
            default:
                d dVar11 = new d((c40.l) this.D, cVar, 29);
                dVar11.C = obj;
                return dVar11;
        }
    }

    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        switch (this.A) {
            case 0:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 1:
                create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 2:
                create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 3:
                create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 4:
                create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 5:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 6:
                create((c3.q0) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case 7:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 8:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 9:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 10:
                return create((zz.a) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
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
                create((c3.z1) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
                return l00.a.A;
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
                return create((g00.k) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 27:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            case 28:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
            default:
                return create((a40.z) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
        }
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws kotlin.KotlinNothingValueException {
        throw new UnsupportedOperationException("Method not decompiled: a1.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
