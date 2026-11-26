package j60;

import androidx.lifecycle.r0;
import androidx.lifecycle.u0;
import h00.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import t6.d;

public final class a extends a60.a {
    public final d c;

    public a(u00.a aVar, d dVar) {
        a60.a aVar2;
        List list;
        super(2, (aVar == null || (aVar2 = (a60.a) aVar.invoke()) == null || (list = aVar2.a) == null) ? new ArrayList() : q.o1(list));
        this.c = dVar;
    }

    @Override
    public final Object a(int i, a10.d clazz) {
        m.e(clazz, "clazz");
        return clazz.equals(a0.a.b(r0.class)) ? u0.c(this.c) : super.a(i, clazz);
    }

    @Override
    public final Object b(a10.d clazz) {
        m.e(clazz, "clazz");
        return clazz.equals(a0.a.b(r0.class)) ? u0.c(this.c) : super.b(clazz);
    }
}
