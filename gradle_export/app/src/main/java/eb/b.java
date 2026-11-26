package eb;

import d0.i2;
import hb.p;
import k00.j;
import kotlin.jvm.internal.m;
import za.e;

public final class b implements c {

    public final fb.a f5239a;

    public final int f5240b;

    public final int f5241c;

    public b(fb.a aVar) {
        this(aVar, (byte) 0, false);
        this.f5240b = 1;
        m.e(aVar, "tracker");
        this.f5241c = 5;
    }

    public b(fb.a aVar, byte b7, boolean z10) {
        m.e(aVar, "tracker");
        this.f5239a = aVar;
    }

    public b(fb.a aVar, int i10) {
        this(aVar, (byte) 0, false);
        this.f5240b = i10;
        switch (i10) {
            case 2:
                m.e(aVar, "tracker");
                this(aVar, (byte) 0, false);
                this.f5241c = 9;
                break;
            default:
                m.e(aVar, "tracker");
                this.f5241c = 6;
                break;
        }
    }

    @Override
    public final d40.c a(e eVar) {
        m.e(eVar, "constraints");
        return new d40.c(new i2(this, (k00.c) null, 20), j.A, -2, c40.a.A);
    }

    @Override
    public final boolean b(p pVar) {
        switch (this.f5240b) {
            case 0:
                m.e(pVar, "workSpec");
                return pVar.f7013j.f17358c;
            case 1:
                m.e(pVar, "workSpec");
                return pVar.f7013j.f17360e;
            default:
                m.e(pVar, "workSpec");
                return pVar.f7013j.f17361f;
        }
    }
}
