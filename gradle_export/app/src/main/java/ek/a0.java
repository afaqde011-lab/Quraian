package ek;

import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

public class a0 extends bk.a0 {
    @Override
    public final Object b(ik.a aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        aVar.a();
        while (aVar.G()) {
            try {
                arrayList.add(Integer.valueOf(aVar.b0()));
            } catch (NumberFormatException e3) {
                throw new JsonSyntaxException(e3);
            }
        }
        aVar.v();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            atomicIntegerArray.set(i10, ((Integer) arrayList.get(i10)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override
    public final void c(ik.b bVar, Object obj) throws IOException {
        AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
        bVar.i();
        int length = atomicIntegerArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            bVar.f0(atomicIntegerArray.get(i10));
        }
        bVar.v();
    }
}
