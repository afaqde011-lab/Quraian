package nf;

import java.util.AbstractMap;

public final class r extends o {
    public final s C;

    public r(s sVar) {
        this.C = sVar;
    }

    @Override
    public final Object get(int i10) {
        s sVar = this.C;
        return new AbstractMap.SimpleImmutableEntry(sVar.D.C.F.get(i10), sVar.D.D.get(i10));
    }

    @Override
    public final int size() {
        return this.C.D.D.size();
    }
}
