package bv;

import java.util.List;

public final class i2 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public boolean C;
    public Object D;
    public final Object E;

    public i2(int i, boolean z, os.x xVar, k00.c cVar) {
        super(2, cVar);
        this.A = 7;
        this.B = i;
        this.C = z;
        this.E = xVar;
    }

    public i2(Object obj, Object obj2, boolean z, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.D = obj;
        this.E = obj2;
        this.C = z;
    }

    public i2(jz.d0 d0Var, k00.c cVar) {
        super(2, cVar);
        this.A = 4;
        this.E = d0Var;
    }

    public i2(kotlin.jvm.internal.v vVar, e3 e3Var, k00.c cVar) {
        super(2, cVar);
        this.A = 0;
        this.D = vVar;
        this.E = e3Var;
    }

    public i2(m0.w wVar, boolean z, l1.z0 z0Var, k00.c cVar) {
        super(2, cVar);
        this.A = 3;
        this.D = wVar;
        this.C = z;
        this.E = z0Var;
    }

    public i2(uu.w wVar, boolean z, u00.n nVar, k00.c cVar) {
        super(2, cVar);
        this.A = 9;
        this.D = wVar;
        this.C = z;
        this.E = (m00.i) nVar;
    }

    public i2(boolean z, int i, l1.z0 z0Var, l1.z0 z0Var2, k00.c cVar) {
        super(2, cVar);
        this.A = 5;
        this.C = z;
        this.B = i;
        this.D = z0Var;
        this.E = z0Var2;
    }

    public i2(boolean z, Object obj, l1.y0 y0Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = z;
        this.D = obj;
        this.E = y0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                i2 i2Var = new i2((kotlin.jvm.internal.v) this.D, (e3) this.E, cVar);
                i2Var.C = ((Boolean) obj).booleanValue();
                return i2Var;
            case 1:
                return new i2((cu.a) this.D, (am.c) this.E, this.C, cVar, 1);
            case 2:
                return new i2(this.C, (List) this.D, (l1.y0) this.E, cVar, 2);
            case 3:
                return new i2((m0.w) this.D, this.C, (l1.z0) this.E, cVar);
            case 4:
                i2 i2Var2 = new i2((jz.d0) this.E, cVar);
                i2Var2.C = ((Boolean) obj).booleanValue();
                return i2Var2;
            case 5:
                return new i2(this.C, this.B, (l1.z0) this.D, (l1.z0) this.E, cVar);
            case 6:
                return new i2((no.n) this.D, (ho.q) this.E, this.C, cVar, 6);
            case 7:
                i2 i2Var3 = new i2(this.B, this.C, (os.x) this.E, cVar);
                i2Var3.D = obj;
                return i2Var3;
            case 8:
                return new i2(this.C, (l1.z0) this.D, (l1.y0) this.E, cVar, 8);
            default:
                return new i2((uu.w) this.D, this.C, (u00.n) this.E, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((i2) create(bool, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 1:
                return ((i2) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 2:
                return ((i2) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 3:
                return ((i2) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((i2) create(bool2, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 5:
                i2 i2Var = (i2) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var = g00.b0.a;
                i2Var.invokeSuspend(b0Var);
                return b0Var;
            case 6:
                return ((i2) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            case 7:
                i2 i2Var2 = (i2) create((a40.z) obj, (k00.c) obj2);
                g00.b0 b0Var2 = g00.b0.a;
                i2Var2.invokeSuspend(b0Var2);
                return b0Var2;
            case 8:
                return ((i2) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
            default:
                return ((i2) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r69) {
        throw new UnsupportedOperationException("Method not decompiled: bv.i2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
