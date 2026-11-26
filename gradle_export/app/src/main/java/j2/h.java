package j2;

import u.w;

public abstract class h {

    public static final w f7893a;

    static {
        r rVar = d.f7867e;
        int i10 = rVar.f7862c;
        e eVar = new e(rVar, rVar, 1);
        int i11 = rVar.f7862c;
        l lVar = d.f7884x;
        int i12 = (lVar.f7862c << 6) | i11;
        g gVar = new g(rVar, lVar, 0);
        int i13 = (i11 << 6) | lVar.f7862c;
        g gVar2 = new g(lVar, rVar, 0);
        w wVar = u.m.f14876a;
        w wVar2 = new w();
        wVar2.i(i10 | (i10 << 6), eVar);
        wVar2.i(i12, gVar);
        wVar2.i(i13, gVar2);
        f7893a = wVar2;
    }
}
