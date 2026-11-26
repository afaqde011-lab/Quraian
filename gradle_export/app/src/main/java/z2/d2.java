package z2;

import com.google.android.gms.cast.Cast;

public abstract class d2 {

    public static final u.w f17100a;

    public static final b2[] f17101b;

    static {
        u.w wVar = new u.w(8);
        b2.f17091a.getClass();
        c2 c2Var = a2.f17084g;
        wVar.i(1, c2Var);
        c2 c2Var2 = a2.f17083f;
        wVar.i(2, c2Var2);
        c2 c2Var3 = a2.f17079b;
        wVar.i(4, c2Var3);
        c2 c2Var4 = a2.f17081d;
        wVar.i(8, c2Var4);
        c2 c2Var5 = a2.f17085h;
        wVar.i(16, c2Var5);
        c2 c2Var6 = a2.f17082e;
        wVar.i(32, c2Var6);
        c2 c2Var7 = a2.f17086i;
        wVar.i(64, c2Var7);
        c2 c2Var8 = a2.f17080c;
        wVar.i(Cast.MAX_NAMESPACE_LENGTH, c2Var8);
        f17100a = wVar;
        f17101b = new b2[]{c2Var, c2Var2, c2Var3, c2Var7, c2Var5, c2Var6, c2Var4, a2.f17087j, c2Var8};
    }

    public static final void a(b3.r0 r0Var, u uVar, long j9, int i10, int i11) {
        if (d0.h(j9, -1L)) {
            return;
        }
        r0Var.a(uVar.b(), (int) ((j9 >>> 48) & 65535));
        r0Var.a(uVar.d(), (int) ((j9 >>> 32) & 65535));
        r0Var.a(uVar.c(), i10 - ((int) ((j9 >>> 16) & 65535)));
        r0Var.a(uVar.a(), i11 - ((int) (j9 & 65535)));
    }
}
