package bk;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class k extends a0 {

    public final int f2555a;

    public final a0 f2556b;

    public k(a0 a0Var, int i10) {
        this.f2555a = i10;
        this.f2556b = a0Var;
    }

    @Override
    public final Object b(ik.a aVar) throws IOException {
        switch (this.f2555a) {
            case 0:
                return new AtomicLong(((Number) this.f2556b.b(aVar)).longValue());
            default:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.G()) {
                    arrayList.add(Long.valueOf(((Number) this.f2556b.b(aVar)).longValue()));
                }
                aVar.v();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i10 = 0; i10 < size; i10++) {
                    atomicLongArray.set(i10, ((Long) arrayList.get(i10)).longValue());
                }
                return atomicLongArray;
        }
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        switch (this.f2555a) {
            case 0:
                this.f2556b.c(bVar, Long.valueOf(((AtomicLong) obj).get()));
                break;
            default:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                bVar.i();
                int length = atomicLongArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    this.f2556b.c(bVar, Long.valueOf(atomicLongArray.get(i10)));
                }
                bVar.v();
                break;
        }
    }
}
