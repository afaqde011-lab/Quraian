package u8;

import androidx.media3.common.ParserException;
import e7.u;

public final class a {

    public final int f15000a;

    public int f15001b;

    public int f15002c;

    public long f15003d;

    public final boolean f15004e;

    public final u f15005f;

    public final u f15006g;

    public int f15007h;

    public int f15008i;

    public a(u uVar, u uVar2, boolean z10) throws ParserException {
        this.f15006g = uVar;
        this.f15005f = uVar2;
        this.f15004e = z10;
        uVar2.N(12);
        this.f15000a = uVar2.E();
        uVar.N(12);
        this.f15008i = uVar.E();
        a8.b.c("first_chunk must be 1", uVar.m() == 1);
        this.f15001b = -1;
    }

    public final boolean a() {
        int i10 = this.f15001b + 1;
        this.f15001b = i10;
        if (i10 == this.f15000a) {
            return false;
        }
        boolean z10 = this.f15004e;
        u uVar = this.f15005f;
        this.f15003d = z10 ? uVar.G() : uVar.C();
        if (this.f15001b == this.f15007h) {
            u uVar2 = this.f15006g;
            this.f15002c = uVar2.E();
            uVar2.O(4);
            int i11 = this.f15008i - 1;
            this.f15008i = i11;
            this.f15007h = i11 > 0 ? uVar2.E() - 1 : -1;
        }
        return true;
    }
}
