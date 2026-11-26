package kc;

import ec.q;

public final class p implements b {

    public final int f9651a;

    public final jc.b f9652b;

    public final jc.b f9653c;

    public final jc.b f9654d;

    public final boolean f9655e;

    public p(String str, int i10, jc.b bVar, jc.b bVar2, jc.b bVar3, boolean z10) {
        this.f9651a = i10;
        this.f9652b = bVar;
        this.f9653c = bVar2;
        this.f9654d = bVar3;
        this.f9655e = z10;
    }

    @Override
    public final ec.c a(cc.i iVar, cc.a aVar, lc.b bVar) {
        return new q(bVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + this.f9652b + ", end: " + this.f9653c + ", offset: " + this.f9654d + "}";
    }
}
