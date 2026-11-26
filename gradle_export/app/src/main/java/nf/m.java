package nf;

public final class m extends o {
    public final transient o C;

    public m(o oVar) {
        this.C = oVar;
    }

    @Override
    public final boolean contains(Object obj) {
        return this.C.contains(obj);
    }

    @Override
    public final Object get(int i10) {
        o oVar = this.C;
        b.e(i10, oVar.size());
        return oVar.get((oVar.size() - 1) - i10);
    }

    @Override
    public final o i() {
        return this.C;
    }

    @Override
    public final int indexOf(Object obj) {
        o oVar = this.C;
        int iLastIndexOf = oVar.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return (oVar.size() - 1) - iLastIndexOf;
        }
        return -1;
    }

    @Override
    public final o subList(int i10, int i11) {
        o oVar = this.C;
        b.m(i10, i11, oVar.size());
        return oVar.subList(oVar.size() - i11, oVar.size() - i10).i();
    }

    @Override
    public final int lastIndexOf(Object obj) {
        o oVar = this.C;
        int iIndexOf = oVar.indexOf(obj);
        if (iIndexOf >= 0) {
            return (oVar.size() - 1) - iIndexOf;
        }
        return -1;
    }

    @Override
    public final int size() {
        return this.C.size();
    }
}
