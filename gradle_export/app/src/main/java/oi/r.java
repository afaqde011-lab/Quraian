package oi;

import e7.i0;
import i7.z;

public final class r implements Runnable {
    public final int A;
    public final Object B;
    public final long C;
    public final Object D;

    public r(k7.n nVar, Object obj, long j9) {
        this.A = 2;
        this.B = nVar;
        this.D = obj;
        this.C = j9;
    }

    public r(s sVar, long j9, String str, int i10) {
        this.A = i10;
        this.B = sVar;
        this.C = j9;
        this.D = str;
    }

    @Override
    public final void run() {
        int i10 = this.A;
        long j9 = this.C;
        Object obj = this.D;
        Object obj2 = this.B;
        switch (i10) {
            case 0:
                s sVar = (s) obj2;
                sVar.f12045o.f12530b.a(new r(sVar, this.C, (String) obj, 1));
                break;
            case 1:
                String str = (String) obj;
                n nVar = ((s) obj2).f12039g;
                u uVar = nVar.f12028n;
                if (uVar == null || !uVar.f12057e.get()) {
                    ((qi.d) nVar.f12025i.B).B(j9, str);
                }
                break;
            default:
                i7.v vVar = ((k7.n) obj2).f9112b;
                String str2 = i0.f5136a;
                z zVar = vVar.A;
                j7.f fVar = zVar.f7501s;
                j7.a aVarA0 = fVar.a0();
                fVar.b0(aVarA0, 26, new ii.a(aVarA0, obj, j9));
                if (zVar.V == obj) {
                    zVar.m.f(26, new a8.n(7));
                }
                break;
        }
    }
}
