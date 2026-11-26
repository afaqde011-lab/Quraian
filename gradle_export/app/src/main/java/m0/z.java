package m0;

import a40.c0;
import d0.q1;
import l1.g0;
import s10.w0;

public abstract class z {

    public static final float f10409a = 56;

    public static final y f10410b;

    public static final q f10411c;

    static {
        y yVar = new y();
        f10410b = yVar;
        q1 q1Var = q1.A;
        f10411c = new q(0, 0, 0, 0, 0, 0, e0.n.f4952c, new x(), c0.c(k00.j.A), yVar, y3.b.b(0, 0, 0, 0, 15));
    }

    public static final long a(q qVar, int i10) {
        int i11 = qVar.f10367c;
        long j9 = ((long) i10) * ((long) (qVar.f10366b + i11));
        int i12 = -qVar.f10370f;
        int i13 = qVar.f10368d;
        long j10 = ((j9 + ((long) i12)) + ((long) i13)) - ((long) i11);
        int iG = (int) (qVar.f10369e == q1.B ? qVar.g() >> 32 : qVar.g() & 4294967295L);
        long jY = j10 - ((long) (iG - ab.a0.y(qVar.f10376n.b(iG, qVar.f10366b, i12, i13), 0, iG)));
        if (jY < 0) {
            return 0L;
        }
        return jY;
    }

    public static final b b(int i10, u00.a aVar, l1.j jVar, int i11) {
        Object[] objArr = new Object[0];
        w0 w0Var = b.G;
        boolean zE = ((((i11 & 896) ^ 384) > 256 && ((g0) jVar).g(aVar)) || (i11 & 384) == 256) | ((g0) jVar).e(i10) | ((g0) jVar).d(0.0f);
        g0 g0Var = (g0) jVar;
        Object objN = g0Var.N();
        if (zE || objN == l1.i.f9868a) {
            objN = new e1.w(i10, aVar, 2);
            g0Var.n0(objN);
        }
        b bVar = (b) y1.k.f(objArr, w0Var, (u00.a) objN, jVar, 0);
        bVar.F.setValue(aVar);
        return bVar;
    }
}
