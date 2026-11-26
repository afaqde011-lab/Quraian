package i3;

import bv.y2;
import g00.b0;
import n3.i;
import ri.t1;

public final class f {

    public int f7185a;

    public float f7186b;

    public final Object f7187c;

    public f(int i10, y2 y2Var) {
        this.f7185a = i10;
        this.f7187c = y2Var;
    }

    public f(i iVar) {
        this.f7187c = iVar;
        this.f7185a = -1;
    }

    public float a(int i10, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        i iVar = (i) this.f7187c;
        int i11 = 1;
        if (z10) {
            int iD = n3.f.d(iVar.f11043f, i10, z10);
            int lineStart = iVar.f11043f.getLineStart(iD);
            int iF = iVar.f(iD);
            if (i10 == lineStart || i10 == iF) {
                z13 = true;
            } else {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        int i12 = i10 * 4;
        if (!z12) {
            i11 = z13 ? 2 : 3;
        } else if (z13) {
            i11 = 0;
        }
        int i13 = i12 + i11;
        if (this.f7185a == i13) {
            return this.f7186b;
        }
        float fH = z12 ? iVar.h(i10, z10) : iVar.i(i10, z10);
        if (z11) {
            this.f7185a = i13;
            this.f7186b = fH;
        }
        return fH;
    }

    public Object b(float f3, m00.c cVar) {
        e eVar;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.C = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(this, cVar);
            }
        } else {
            eVar = new e(this, cVar);
        }
        Object objInvoke = eVar.A;
        l00.a aVar = l00.a.A;
        int i11 = eVar.C;
        if (i11 == 0) {
            t1.O(objInvoke);
            y2 y2Var = (y2) this.f7187c;
            Float f10 = new Float(f3);
            eVar.C = 1;
            objInvoke = y2Var.invoke(f10, eVar);
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objInvoke);
        }
        this.f7186b += ((Number) objInvoke).floatValue();
        return b0.a;
    }
}
