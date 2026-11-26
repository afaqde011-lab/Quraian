package m0;

import a40.c0;
import d0.q2;
import d0.t0;
import l1.e1;
import l1.f1;
import ri.t1;

public final class b0 implements t0 {

    public final e0.h f10317a;

    public final w f10318b;

    public b0(e0.h hVar, w wVar) {
        this.f10317a = hVar;
        this.f10318b = wVar;
    }

    @Override
    public final Object a(q2 q2Var, float f3, k00.c cVar) {
        a0 a0Var;
        if (cVar instanceof a0) {
            a0Var = (a0) cVar;
            int i10 = a0Var.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                a0Var.C = i10 - Integer.MIN_VALUE;
            } else {
                a0Var = new a0(this, (m00.c) cVar);
            }
        } else {
            a0Var = new a0(this, (m00.c) cVar);
        }
        Object objD = a0Var.A;
        l00.a aVar = l00.a.A;
        int i11 = a0Var.C;
        if (i11 == 0) {
            t1.O(objD);
            u00.k aVar2 = new h00.a(this, q2Var, 21);
            a0Var.C = 1;
            objD = this.f10317a.d(q2Var, f3, aVar2, a0Var);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objD);
        }
        float fFloatValue = ((Number) objD).floatValue();
        w wVar = this.f10318b;
        a2.o oVar = wVar.f10388d;
        a2.o oVar2 = wVar.f10388d;
        if (((e1) oVar.D).h() != 0.0f && Math.abs(((e1) oVar2.D).h()) < 0.001d) {
            int iH = ((f1) oVar2.B).h();
            if (wVar.f10395k.a()) {
                c0.y(((q) wVar.m.getValue()).f10381s, (k00.i) null, (a40.a0) null, new m(wVar, null, 2), 3);
            }
            wVar.s(0.0f, iH, false);
        } else {
            new Float(((e1) oVar2.D).h());
        }
        return new Float(fFloatValue);
    }
}
