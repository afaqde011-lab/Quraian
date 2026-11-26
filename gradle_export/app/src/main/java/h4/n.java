package h4;

public abstract class n implements d {

    public int f6598a;

    public g4.e f6599b;

    public k f6600c;

    public int f6601d;

    public final f f6602e = new f(this);

    public int f6603f = 0;

    public boolean f6604g = false;

    public final e f6605h = new e(this);

    public final e f6606i = new e(this);

    public int f6607j = 1;

    public n(g4.e eVar) {
        this.f6599b = eVar;
    }

    public static void b(e eVar, e eVar2, int i10) {
        eVar.l.add(eVar2);
        eVar.f6581f = i10;
        eVar2.f6586k.add(eVar);
    }

    public static e h(g4.d dVar) {
        g4.d dVar2 = dVar.f6119f;
        if (dVar2 == null) {
            return null;
        }
        g4.e eVar = dVar2.f6117d;
        int iB = e4.f.b(dVar2.f6118e);
        if (iB == 1) {
            return eVar.f6129d.f6605h;
        }
        if (iB == 2) {
            return eVar.f6131e.f6605h;
        }
        if (iB == 3) {
            return eVar.f6129d.f6606i;
        }
        if (iB == 4) {
            return eVar.f6131e.f6606i;
        }
        if (iB != 5) {
            return null;
        }
        return eVar.f6131e.f6591k;
    }

    public static e i(g4.d dVar, int i10) {
        g4.d dVar2 = dVar.f6119f;
        if (dVar2 == null) {
            return null;
        }
        g4.e eVar = dVar2.f6117d;
        n nVar = i10 == 0 ? eVar.f6129d : eVar.f6131e;
        int iB = e4.f.b(dVar2.f6118e);
        if (iB == 1 || iB == 2) {
            return nVar.f6605h;
        }
        if (iB == 3 || iB == 4) {
            return nVar.f6606i;
        }
        return null;
    }

    public final void c(e eVar, e eVar2, int i10, f fVar) {
        eVar.l.add(eVar2);
        eVar.l.add(this.f6602e);
        eVar.f6583h = i10;
        eVar.f6584i = fVar;
        eVar2.f6586k.add(eVar);
        fVar.f6586k.add(eVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        if (i11 == 0) {
            g4.e eVar = this.f6599b;
            int i12 = eVar.f6156u;
            int iMax = Math.max(eVar.f6155t, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            g4.e eVar2 = this.f6599b;
            int i13 = eVar2.f6159x;
            int iMax2 = Math.max(eVar2.f6158w, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    public long j() {
        f fVar = this.f6602e;
        if (fVar.f6585j) {
            return fVar.f6582g;
        }
        return 0L;
    }

    public abstract boolean k();

    public final void l(g4.d dVar, g4.d dVar2, int i10) {
        f fVar;
        float f3;
        int i11;
        e eVarH = h(dVar);
        e eVarH2 = h(dVar2);
        if (eVarH.f6585j && eVarH2.f6585j) {
            int iE = dVar.e() + eVarH.f6582g;
            int iE2 = eVarH2.f6582g - dVar2.e();
            int i12 = iE2 - iE;
            f fVar2 = this.f6602e;
            if (!fVar2.f6585j && this.f6601d == 3) {
                int i13 = this.f6598a;
                if (i13 == 0) {
                    fVar2.d(g(i12, i10));
                } else if (i13 == 1) {
                    fVar2.d(Math.min(g(fVar2.m, i10), i12));
                } else if (i13 == 2) {
                    g4.e eVar = this.f6599b;
                    g4.e eVar2 = eVar.S;
                    if (eVar2 != null) {
                        f fVar3 = (i10 == 0 ? eVar2.f6129d : eVar2.f6131e).f6602e;
                        if (fVar3.f6585j) {
                            fVar2.d(g((int) ((fVar3.f6582g * (i10 == 0 ? eVar.f6157v : eVar.f6160y)) + 0.5f), i10));
                        }
                    }
                } else if (i13 == 3) {
                    g4.e eVar3 = this.f6599b;
                    n nVar = eVar3.f6129d;
                    if (nVar.f6601d == 3 && nVar.f6598a == 3) {
                        l lVar = eVar3.f6131e;
                        if (lVar.f6601d != 3 || lVar.f6598a != 3) {
                            if (i10 == 0) {
                                nVar = eVar3.f6131e;
                            }
                            fVar = nVar.f6602e;
                            if (fVar.f6585j) {
                                f3 = eVar3.V;
                                if (i10 == 1) {
                                    i11 = (int) ((fVar.f6582g / f3) + 0.5f);
                                } else {
                                    i11 = (int) ((f3 * fVar.f6582g) + 0.5f);
                                }
                                fVar2.d(i11);
                            }
                        }
                    } else {
                        if (i10 == 0) {
                            nVar = eVar3.f6131e;
                        }
                        fVar = nVar.f6602e;
                        if (fVar.f6585j) {
                            f3 = eVar3.V;
                            if (i10 == 1) {
                                i11 = (int) ((fVar.f6582g / f3) + 0.5f);
                            } else {
                                i11 = (int) ((f3 * fVar.f6582g) + 0.5f);
                            }
                            fVar2.d(i11);
                        }
                    }
                }
            }
            if (fVar2.f6585j) {
                int i14 = fVar2.f6582g;
                e eVar4 = this.f6606i;
                e eVar5 = this.f6605h;
                if (i14 == i12) {
                    eVar5.d(iE);
                    eVar4.d(iE2);
                    return;
                }
                g4.e eVar6 = this.f6599b;
                float f10 = i10 == 0 ? eVar6.f6128c0 : eVar6.f6130d0;
                if (eVarH == eVarH2) {
                    iE = eVarH.f6582g;
                    iE2 = eVarH2.f6582g;
                    f10 = 0.5f;
                }
                eVar5.d((int) ((((iE2 - iE) - i14) * f10) + iE + 0.5f));
                eVar4.d(eVar5.f6582g + fVar2.f6582g);
            }
        }
    }
}
