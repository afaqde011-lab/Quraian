package kc;

import android.graphics.Path;

public final class d implements b {

    public final int f9588a;

    public final Path.FillType f9589b;

    public final jc.a f9590c;

    public final jc.a f9591d;

    public final jc.a f9592e;

    public final jc.a f9593f;

    public final boolean f9594g;

    public d(String str, int i10, Path.FillType fillType, jc.a aVar, jc.a aVar2, jc.a aVar3, jc.a aVar4, boolean z10) {
        this.f9588a = i10;
        this.f9589b = fillType;
        this.f9590c = aVar;
        this.f9591d = aVar2;
        this.f9592e = aVar3;
        this.f9593f = aVar4;
        this.f9594g = z10;
    }

    @Override
    public final ec.c a(cc.i iVar, cc.a aVar, lc.b bVar) {
        return new ec.h(iVar, aVar, bVar, this);
    }
}
