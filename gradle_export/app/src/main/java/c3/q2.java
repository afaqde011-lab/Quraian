package c3;

import androidx.compose.ui.node.Owner;

public abstract class q2 {

    public static final l1.q2 f2755a = new l1.q2(b2.C);

    public static final void a(n2 n2Var, u00.n nVar, m00.c cVar) {
        o2 o2Var;
        if (cVar instanceof o2) {
            o2Var = (o2) cVar;
            int i10 = o2Var.B;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                o2Var.B = i10 - Integer.MIN_VALUE;
            } else {
                o2Var = new o2(cVar);
            }
        } else {
            o2Var = new o2(cVar);
        }
        Object obj = o2Var.A;
        l00.a aVar = l00.a.A;
        int i11 = o2Var.B;
        if (i11 != 0) {
            if (i11 == 1) {
                throw a1.b.t(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ri.t1.O(obj);
        if (!((b2.q) n2Var).A.N) {
            throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
        }
        Owner ownerZ = b3.m.z(n2Var);
        v1.h hVar = (v1.h) b3.m.y(n2Var).f2055c0;
        hVar.getClass();
        if (l1.q.D(hVar, f2755a) != null) {
            throw new ClassCastException();
        }
        o2Var.B = 1;
        b(ownerZ, nVar, o2Var);
    }

    public static final void b(Owner owner, u00.n nVar, m00.c cVar) {
        p2 p2Var;
        if (cVar instanceof p2) {
            p2Var = (p2) cVar;
            int i10 = p2Var.B;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                p2Var.B = i10 - Integer.MIN_VALUE;
            } else {
                p2Var = new p2(cVar);
            }
        } else {
            p2Var = new p2(cVar);
        }
        Object obj = p2Var.A;
        l00.a aVar = l00.a.A;
        int i11 = p2Var.B;
        if (i11 == 0) {
            ri.t1.O(obj);
            p2Var.B = 1;
            ((z) owner).J(nVar, p2Var);
        } else {
            if (i11 == 1) {
                throw a1.b.t(obj);
            }
            if (i11 == 2) {
                throw a1.b.t(obj);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
