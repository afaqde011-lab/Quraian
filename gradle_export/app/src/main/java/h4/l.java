package h4;

import java.util.ArrayList;

public final class l extends n {

    public e f6591k;
    public a l;

    @Override
    public final void a(d dVar) {
        float f3;
        float f10;
        float f11;
        int i10;
        if (e4.f.b(this.f6607j) == 3) {
            g4.e eVar = this.f6599b;
            l(eVar.I, eVar.K, 1);
            return;
        }
        f fVar = this.f6602e;
        if (fVar.f6578c && !fVar.f6585j && this.f6601d == 3) {
            g4.e eVar2 = this.f6599b;
            int i11 = eVar2.f6153r;
            if (i11 == 2) {
                g4.e eVar3 = eVar2.S;
                if (eVar3 != null) {
                    f fVar2 = eVar3.f6131e.f6602e;
                    if (fVar2.f6585j) {
                        fVar.d((int) ((fVar2.f6582g * eVar2.f6160y) + 0.5f));
                    }
                }
            } else if (i11 == 3) {
                f fVar3 = eVar2.f6129d.f6602e;
                if (fVar3.f6585j) {
                    int i12 = eVar2.W;
                    if (i12 != -1) {
                        if (i12 == 0) {
                            f11 = fVar3.f6582g * eVar2.V;
                            i10 = (int) (f11 + 0.5f);
                        } else if (i12 != 1) {
                            i10 = 0;
                        } else {
                            f3 = fVar3.f6582g;
                            f10 = eVar2.V;
                        }
                        fVar.d(i10);
                    } else {
                        f3 = fVar3.f6582g;
                        f10 = eVar2.V;
                    }
                    f11 = f3 / f10;
                    i10 = (int) (f11 + 0.5f);
                    fVar.d(i10);
                }
            }
        }
        e eVar4 = this.f6605h;
        boolean z10 = eVar4.f6578c;
        ArrayList arrayList = eVar4.l;
        if (z10) {
            e eVar5 = this.f6606i;
            boolean z11 = eVar5.f6578c;
            ArrayList arrayList2 = eVar5.l;
            if (z11) {
                if (eVar4.f6585j && eVar5.f6585j && fVar.f6585j) {
                    return;
                }
                if (!fVar.f6585j && this.f6601d == 3) {
                    g4.e eVar6 = this.f6599b;
                    if (eVar6.f6152q == 0 && !eVar6.v()) {
                        e eVar7 = (e) arrayList.get(0);
                        e eVar8 = (e) arrayList2.get(0);
                        int i13 = eVar7.f6582g + eVar4.f6581f;
                        int i14 = eVar8.f6582g + eVar5.f6581f;
                        eVar4.d(i13);
                        eVar5.d(i14);
                        fVar.d(i14 - i13);
                        return;
                    }
                }
                if (!fVar.f6585j && this.f6601d == 3 && this.f6598a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    e eVar9 = (e) arrayList.get(0);
                    int i15 = (((e) arrayList2.get(0)).f6582g + eVar5.f6581f) - (eVar9.f6582g + eVar4.f6581f);
                    int i16 = fVar.m;
                    if (i15 < i16) {
                        fVar.d(i15);
                    } else {
                        fVar.d(i16);
                    }
                }
                if (fVar.f6585j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    e eVar10 = (e) arrayList.get(0);
                    e eVar11 = (e) arrayList2.get(0);
                    int i17 = eVar10.f6582g;
                    int i18 = eVar4.f6581f + i17;
                    int i19 = eVar11.f6582g;
                    int i20 = eVar5.f6581f + i19;
                    float f12 = this.f6599b.f6130d0;
                    if (eVar10 == eVar11) {
                        f12 = 0.5f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    eVar4.d((int) ((((i19 - i17) - fVar.f6582g) * f12) + i17 + 0.5f));
                    eVar5.d(eVar4.f6582g + fVar.f6582g);
                }
            }
        }
    }

    @Override
    public final void d() {
        g4.e eVar;
        g4.e eVar2;
        g4.e eVar3;
        g4.e eVar4;
        e eVar5 = this.f6591k;
        g4.e eVar6 = this.f6599b;
        boolean z10 = eVar6.f6123a;
        f fVar = this.f6602e;
        if (z10) {
            fVar.d(eVar6.k());
        }
        boolean z11 = fVar.f6585j;
        ArrayList arrayList = fVar.f6586k;
        ArrayList arrayList2 = fVar.l;
        e eVar7 = this.f6606i;
        e eVar8 = this.f6605h;
        if (!z11) {
            g4.e eVar9 = this.f6599b;
            this.f6601d = eVar9.f6150o0[1];
            if (eVar9.D) {
                this.l = new a(this);
            }
            int i10 = this.f6601d;
            if (i10 != 3) {
                if (i10 == 4 && (eVar4 = this.f6599b.S) != null && eVar4.f6150o0[1] == 1) {
                    int iK = (eVar4.k() - this.f6599b.I.e()) - this.f6599b.K.e();
                    n.b(eVar8, eVar4.f6131e.f6605h, this.f6599b.I.e());
                    n.b(eVar7, eVar4.f6131e.f6606i, -this.f6599b.K.e());
                    fVar.d(iK);
                    return;
                }
                if (i10 == 1) {
                    fVar.d(this.f6599b.k());
                }
            }
        } else if (this.f6601d == 4 && (eVar2 = (eVar = this.f6599b).S) != null && eVar2.f6150o0[1] == 1) {
            n.b(eVar8, eVar2.f6131e.f6605h, eVar.I.e());
            n.b(eVar7, eVar2.f6131e.f6606i, -this.f6599b.K.e());
            return;
        }
        boolean z12 = fVar.f6585j;
        if (z12) {
            g4.e eVar10 = this.f6599b;
            if (eVar10.f6123a) {
                g4.d[] dVarArr = eVar10.P;
                g4.d dVar = dVarArr[2];
                g4.d dVar2 = dVar.f6119f;
                if (dVar2 != null && dVarArr[3].f6119f != null) {
                    if (eVar10.v()) {
                        eVar8.f6581f = this.f6599b.P[2].e();
                        eVar7.f6581f = -this.f6599b.P[3].e();
                    } else {
                        e eVarH = n.h(this.f6599b.P[2]);
                        if (eVarH != null) {
                            n.b(eVar8, eVarH, this.f6599b.P[2].e());
                        }
                        e eVarH2 = n.h(this.f6599b.P[3]);
                        if (eVarH2 != null) {
                            n.b(eVar7, eVarH2, -this.f6599b.P[3].e());
                        }
                        eVar8.f6577b = true;
                        eVar7.f6577b = true;
                    }
                    g4.e eVar11 = this.f6599b;
                    if (eVar11.D) {
                        n.b(eVar5, eVar8, eVar11.Z);
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    e eVarH3 = n.h(dVar);
                    if (eVarH3 != null) {
                        n.b(eVar8, eVarH3, this.f6599b.P[2].e());
                        n.b(eVar7, eVar8, fVar.f6582g);
                        g4.e eVar12 = this.f6599b;
                        if (eVar12.D) {
                            n.b(eVar5, eVar8, eVar12.Z);
                            return;
                        }
                        return;
                    }
                    return;
                }
                g4.d dVar3 = dVarArr[3];
                if (dVar3.f6119f != null) {
                    e eVarH4 = n.h(dVar3);
                    if (eVarH4 != null) {
                        n.b(eVar7, eVarH4, -this.f6599b.P[3].e());
                        n.b(eVar8, eVar7, -fVar.f6582g);
                    }
                    g4.e eVar13 = this.f6599b;
                    if (eVar13.D) {
                        n.b(eVar5, eVar8, eVar13.Z);
                        return;
                    }
                    return;
                }
                g4.d dVar4 = dVarArr[4];
                if (dVar4.f6119f != null) {
                    e eVarH5 = n.h(dVar4);
                    if (eVarH5 != null) {
                        n.b(eVar5, eVarH5, 0);
                        n.b(eVar8, eVar5, -this.f6599b.Z);
                        n.b(eVar7, eVar8, fVar.f6582g);
                        return;
                    }
                    return;
                }
                if ((eVar10 instanceof g4.j) || eVar10.S == null || eVar10.i(7).f6119f != null) {
                    return;
                }
                g4.e eVar14 = this.f6599b;
                n.b(eVar8, eVar14.S.f6131e.f6605h, eVar14.p());
                n.b(eVar7, eVar8, fVar.f6582g);
                g4.e eVar15 = this.f6599b;
                if (eVar15.D) {
                    n.b(eVar5, eVar8, eVar15.Z);
                    return;
                }
                return;
            }
        }
        if (z12 || this.f6601d != 3) {
            fVar.b(this);
        } else {
            g4.e eVar16 = this.f6599b;
            int i11 = eVar16.f6153r;
            if (i11 == 2) {
                g4.e eVar17 = eVar16.S;
                if (eVar17 != null) {
                    f fVar2 = eVar17.f6131e.f6602e;
                    arrayList2.add(fVar2);
                    fVar2.f6586k.add(fVar);
                    fVar.f6577b = true;
                    arrayList.add(eVar8);
                    arrayList.add(eVar7);
                }
            } else if (i11 == 3 && !eVar16.v()) {
                g4.e eVar18 = this.f6599b;
                if (eVar18.f6152q != 3) {
                    f fVar3 = eVar18.f6129d.f6602e;
                    arrayList2.add(fVar3);
                    fVar3.f6586k.add(fVar);
                    fVar.f6577b = true;
                    arrayList.add(eVar8);
                    arrayList.add(eVar7);
                }
            }
        }
        g4.e eVar19 = this.f6599b;
        g4.d[] dVarArr2 = eVar19.P;
        g4.d dVar5 = dVarArr2[2];
        g4.d dVar6 = dVar5.f6119f;
        if (dVar6 != null && dVarArr2[3].f6119f != null) {
            if (eVar19.v()) {
                eVar8.f6581f = this.f6599b.P[2].e();
                eVar7.f6581f = -this.f6599b.P[3].e();
            } else {
                e eVarH6 = n.h(this.f6599b.P[2]);
                e eVarH7 = n.h(this.f6599b.P[3]);
                if (eVarH6 != null) {
                    eVarH6.b(this);
                }
                if (eVarH7 != null) {
                    eVarH7.b(this);
                }
                this.f6607j = 4;
            }
            if (this.f6599b.D) {
                c(eVar5, eVar8, 1, this.l);
            }
        } else if (dVar6 != null) {
            e eVarH8 = n.h(dVar5);
            if (eVarH8 != null) {
                n.b(eVar8, eVarH8, this.f6599b.P[2].e());
                c(eVar7, eVar8, 1, fVar);
                if (this.f6599b.D) {
                    c(eVar5, eVar8, 1, this.l);
                }
                if (this.f6601d == 3) {
                    g4.e eVar20 = this.f6599b;
                    if (eVar20.V > 0.0f) {
                        j jVar = eVar20.f6129d;
                        if (jVar.f6601d == 3) {
                            jVar.f6602e.f6586k.add(fVar);
                            arrayList2.add(this.f6599b.f6129d.f6602e);
                            fVar.f6576a = this;
                        }
                    }
                }
            }
        } else {
            g4.d dVar7 = dVarArr2[3];
            if (dVar7.f6119f != null) {
                e eVarH9 = n.h(dVar7);
                if (eVarH9 != null) {
                    n.b(eVar7, eVarH9, -this.f6599b.P[3].e());
                    c(eVar8, eVar7, -1, fVar);
                    if (this.f6599b.D) {
                        c(eVar5, eVar8, 1, this.l);
                    }
                }
            } else {
                g4.d dVar8 = dVarArr2[4];
                if (dVar8.f6119f != null) {
                    e eVarH10 = n.h(dVar8);
                    if (eVarH10 != null) {
                        n.b(eVar5, eVarH10, 0);
                        c(eVar8, eVar5, -1, this.l);
                        c(eVar7, eVar8, 1, fVar);
                    }
                } else if (!(eVar19 instanceof g4.j) && (eVar3 = eVar19.S) != null) {
                    n.b(eVar8, eVar3.f6131e.f6605h, eVar19.p());
                    c(eVar7, eVar8, 1, fVar);
                    if (this.f6599b.D) {
                        c(eVar5, eVar8, 1, this.l);
                    }
                    if (this.f6601d == 3) {
                        g4.e eVar21 = this.f6599b;
                        if (eVar21.V > 0.0f) {
                            j jVar2 = eVar21.f6129d;
                            if (jVar2.f6601d == 3) {
                                jVar2.f6602e.f6586k.add(fVar);
                                arrayList2.add(this.f6599b.f6129d.f6602e);
                                fVar.f6576a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            fVar.f6578c = true;
        }
    }

    @Override
    public final void e() {
        e eVar = this.f6605h;
        if (eVar.f6585j) {
            this.f6599b.Y = eVar.f6582g;
        }
    }

    @Override
    public final void f() {
        this.f6600c = null;
        this.f6605h.c();
        this.f6606i.c();
        this.f6591k.c();
        this.f6602e.c();
        this.f6604g = false;
    }

    @Override
    public final boolean k() {
        return this.f6601d != 3 || this.f6599b.f6153r == 0;
    }

    public final void m() {
        this.f6604g = false;
        e eVar = this.f6605h;
        eVar.c();
        eVar.f6585j = false;
        e eVar2 = this.f6606i;
        eVar2.c();
        eVar2.f6585j = false;
        e eVar3 = this.f6591k;
        eVar3.c();
        eVar3.f6585j = false;
        this.f6602e.f6585j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f6599b.f6136g0;
    }
}
