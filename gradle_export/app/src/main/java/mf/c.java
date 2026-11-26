package mf;

import c7.i;

public final class c extends e {
    public final transient e C;

    public c(e eVar) {
        this.C = eVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.C.contains(obj);
    }

    @Override
    public final Object get(int i10) {
        e eVar = this.C;
        i.b0(i10, eVar.size());
        return eVar.get((eVar.size() - 1) - i10);
    }

    @Override
    public final e h() {
        return this.C;
    }

    @Override
    public final e subList(int i10, int i11) {
        e eVar = this.C;
        i.c0(i10, i11, eVar.size());
        return eVar.subList(eVar.size() - i11, eVar.size() - i10).h();
    }

    @Override
    public final int indexOf(Object obj) {
        e eVar = this.C;
        int iLastIndexOf = eVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (eVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        e eVar = this.C;
        int iIndexOf = eVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (eVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override
    public final int size() {
        return this.C.size();
    }
}
