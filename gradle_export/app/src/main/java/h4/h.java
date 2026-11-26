package h4;

public final class h extends n {
    @Override
    public final void a(d dVar) {
        e eVar = this.f6605h;
        if (eVar.f6578c && !eVar.f6585j) {
            eVar.d((int) ((((e) eVar.l.get(0)).f6582g * ((g4.i) this.f6599b).f6199p0) + 0.5f));
        }
    }

    @Override
    public final void d() {
        g4.e eVar = this.f6599b;
        g4.i iVar = (g4.i) eVar;
        int i10 = iVar.f6200q0;
        int i11 = iVar.f6201r0;
        int i12 = iVar.f6203t0;
        e eVar2 = this.f6605h;
        if (i12 == 1) {
            if (i10 != -1) {
                eVar2.l.add(eVar.S.f6129d.f6605h);
                this.f6599b.S.f6129d.f6605h.f6586k.add(eVar2);
                eVar2.f6581f = i10;
            } else if (i11 != -1) {
                eVar2.l.add(eVar.S.f6129d.f6606i);
                this.f6599b.S.f6129d.f6606i.f6586k.add(eVar2);
                eVar2.f6581f = -i11;
            } else {
                eVar2.f6577b = true;
                eVar2.l.add(eVar.S.f6129d.f6606i);
                this.f6599b.S.f6129d.f6606i.f6586k.add(eVar2);
            }
            m(this.f6599b.f6129d.f6605h);
            m(this.f6599b.f6129d.f6606i);
            return;
        }
        if (i10 != -1) {
            eVar2.l.add(eVar.S.f6131e.f6605h);
            this.f6599b.S.f6131e.f6605h.f6586k.add(eVar2);
            eVar2.f6581f = i10;
        } else if (i11 != -1) {
            eVar2.l.add(eVar.S.f6131e.f6606i);
            this.f6599b.S.f6131e.f6606i.f6586k.add(eVar2);
            eVar2.f6581f = -i11;
        } else {
            eVar2.f6577b = true;
            eVar2.l.add(eVar.S.f6131e.f6606i);
            this.f6599b.S.f6131e.f6606i.f6586k.add(eVar2);
        }
        m(this.f6599b.f6131e.f6605h);
        m(this.f6599b.f6131e.f6606i);
    }

    @Override
    public final void e() {
        g4.e eVar = this.f6599b;
        int i10 = ((g4.i) eVar).f6203t0;
        e eVar2 = this.f6605h;
        if (i10 == 1) {
            eVar.X = eVar2.f6582g;
        } else {
            eVar.Y = eVar2.f6582g;
        }
    }

    @Override
    public final void f() {
        this.f6605h.c();
    }

    @Override
    public final boolean k() {
        return false;
    }

    public final void m(e eVar) {
        e eVar2 = this.f6605h;
        eVar2.f6586k.add(eVar);
        eVar.l.add(eVar2);
    }
}
