package g4;

import h4.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class d {

    public int f6115b;

    public boolean f6116c;

    public final e f6117d;

    public final int f6118e;

    public d f6119f;

    public e4.g f6122i;

    public HashSet f6114a = null;

    public int f6120g = 0;

    public int f6121h = Integer.MIN_VALUE;

    public d(e eVar, int i10) {
        this.f6117d = eVar;
        this.f6118e = i10;
    }

    public final void a(d dVar, int i10) {
        b(dVar, i10, Integer.MIN_VALUE, false);
    }

    public final boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            j();
            return true;
        }
        if (!z10 && !i(dVar)) {
            return false;
        }
        this.f6119f = dVar;
        if (dVar.f6114a == null) {
            dVar.f6114a = new HashSet();
        }
        HashSet hashSet = this.f6119f.f6114a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f6120g = i10;
        this.f6121h = i11;
        return true;
    }

    public final void c(int i10, m mVar, ArrayList arrayList) {
        HashSet hashSet = this.f6114a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                h4.g.b(((d) it.next()).f6117d, i10, arrayList, mVar);
            }
        }
    }

    public final int d() {
        if (this.f6116c) {
            return this.f6115b;
        }
        return 0;
    }

    public final int e() {
        d dVar;
        if (this.f6117d.f6134f0 == 8) {
            return 0;
        }
        int i10 = this.f6121h;
        return (i10 == Integer.MIN_VALUE || (dVar = this.f6119f) == null || dVar.f6117d.f6134f0 != 8) ? this.f6120g : i10;
    }

    public final d f() {
        int i10 = this.f6118e;
        int iB = e4.f.b(i10);
        e eVar = this.f6117d;
        switch (iB) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return eVar.J;
            case 2:
                return eVar.K;
            case 3:
                return eVar.H;
            case 4:
                return eVar.I;
            default:
                throw new AssertionError(c.s(i10));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f6114a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f6119f != null;
    }

    public final boolean i(d dVar) {
        if (dVar != null) {
            e eVar = dVar.f6117d;
            int i10 = dVar.f6118e;
            int i11 = this.f6118e;
            if (i10 != i11) {
                switch (e4.f.b(i11)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z10 = i10 == 2 || i10 == 4;
                        if (!(eVar instanceof i)) {
                            return z10;
                        }
                        if (z10 || i10 == 8) {
                            return true;
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z11 = i10 == 3 || i10 == 5;
                        if (!(eVar instanceof i)) {
                            return z11;
                        }
                        if (z11 || i10 == 9) {
                            return true;
                        }
                        break;
                    case 5:
                        if (i10 != 2 && i10 != 4) {
                            return true;
                        }
                        break;
                    case 6:
                        if (i10 != 6 && i10 != 8 && i10 != 9) {
                            return true;
                        }
                        break;
                    default:
                        throw new AssertionError(c.s(i11));
                }
            } else if (i11 != 6 || (eVar.D && this.f6117d.D)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        d dVar = this.f6119f;
        if (dVar != null && (hashSet = dVar.f6114a) != null) {
            hashSet.remove(this);
            if (this.f6119f.f6114a.size() == 0) {
                this.f6119f.f6114a = null;
            }
        }
        this.f6114a = null;
        this.f6119f = null;
        this.f6120g = 0;
        this.f6121h = Integer.MIN_VALUE;
        this.f6116c = false;
        this.f6115b = 0;
    }

    public final void k() {
        e4.g gVar = this.f6122i;
        if (gVar == null) {
            this.f6122i = new e4.g(1);
        } else {
            gVar.c();
        }
    }

    public final void l(int i10) {
        this.f6115b = i10;
        this.f6116c = true;
    }

    public final String toString() {
        return this.f6117d.f6136g0 + ":" + c.s(this.f6118e);
    }
}
