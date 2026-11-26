package bv;

import androidx.media3.exoplayer.ExoPlayer;

public final class t1 extends m00.i implements u00.n {
    public final int A;
    public final e3 B;
    public final float C;

    public t1(e3 e3Var, float f, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.B = e3Var;
        this.C = f;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new t1(this.B, this.C, cVar, 0);
            default:
                return new t1(this.B, this.C, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                t1 t1Var = (t1) create(zVar, cVar);
                g00.b0 b0Var = g00.b0.a;
                t1Var.invokeSuspend(b0Var);
                return b0Var;
            default:
                t1 t1Var2 = (t1) create(zVar, cVar);
                g00.b0 b0Var2 = g00.b0.a;
                t1Var2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        float f = this.C;
        e3 e3Var = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                ri.t1.O(obj);
                b00.c cVar = e3Var.e;
                cVar.getClass();
                float fX = ab.a0.x(f, 0.0f, 1.0f);
                d40.p1 p1Var = cVar.i;
                Float fValueOf = Float.valueOf(fX);
                p1Var.getClass();
                p1Var.k(null, fValueOf);
                i7.z zVar = (ExoPlayer) cVar.g.getValue();
                if (zVar != null) {
                    i7.z zVar2 = zVar;
                    zVar2.A();
                    i7.z zVar3 = zVar2.l0 ? null : zVar;
                    if (zVar3 != null) {
                        zVar3.setVolume(fX);
                    }
                }
                break;
            default:
                l00.a aVar2 = l00.a.A;
                ri.t1.O(obj);
                uu.w wVar = (uu.w) e3Var.d;
                d40.p1 p1Var2 = wVar.F;
                Float fValueOf2 = Float.valueOf(f);
                p1Var2.getClass();
                p1Var2.k(null, fValueOf2);
                wVar.v(false, new e00.s(f, null));
                break;
        }
        return b0Var;
    }
}
