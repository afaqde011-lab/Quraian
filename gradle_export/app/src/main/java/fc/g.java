package fc;

import android.graphics.Color;

public final class g implements a {

    public final Object f5604a;

    public final f f5605b;

    public final f f5606c;

    public final f f5607d;

    public final f f5608e;

    public final f f5609f;

    public boolean f5610g = true;

    public g(a aVar, lc.b bVar, ce.c cVar) {
        this.f5604a = aVar;
        e eVarM0 = ((jc.a) cVar.B).m0();
        this.f5605b = (f) eVarM0;
        eVarM0.a(this);
        bVar.f(eVarM0);
        e eVarM1 = ((jc.b) cVar.C).m0();
        this.f5606c = (f) eVarM1;
        eVarM1.a(this);
        bVar.f(eVarM1);
        e eVarM2 = ((jc.b) cVar.D).m0();
        this.f5607d = (f) eVarM2;
        eVarM2.a(this);
        bVar.f(eVarM2);
        e eVarM3 = ((jc.b) cVar.E).m0();
        this.f5608e = (f) eVarM3;
        eVarM3.a(this);
        bVar.f(eVarM3);
        e eVarM4 = ((jc.b) cVar.F).m0();
        this.f5609f = (f) eVarM4;
        eVarM4.a(this);
        bVar.f(eVarM4);
    }

    @Override
    public final void a() {
        this.f5610g = true;
        this.f5604a.a();
    }

    public final void b(dc.a aVar) {
        if (this.f5610g) {
            this.f5610g = false;
            double dFloatValue = ((double) ((Float) this.f5607d.e()).floatValue()) * 0.017453292519943295d;
            float fFloatValue = ((Float) this.f5608e.e()).floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = ((Integer) this.f5605b.e()).intValue();
            aVar.setShadowLayer(((Float) this.f5609f.e()).floatValue(), fSin, fCos, Color.argb(Math.round(((Float) this.f5606c.e()).floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }
}
