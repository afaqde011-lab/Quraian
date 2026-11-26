package e30;

import java.util.ArrayDeque;

public class l0 {
    public final boolean a;
    public final boolean b;
    public final h30.o c;
    public final f30.e d;
    public final f30.f e;
    public int f;
    public ArrayDeque g;
    public n30.i h;

    public l0(boolean z, boolean z2, f30.b typeSystemContext, f30.e kotlinTypePreparator, f30.f kotlinTypeRefiner) {
        kotlin.jvm.internal.m.e(typeSystemContext, "typeSystemContext");
        kotlin.jvm.internal.m.e(kotlinTypePreparator, "kotlinTypePreparator");
        kotlin.jvm.internal.m.e(kotlinTypeRefiner, "kotlinTypeRefiner");
        this.a = z;
        this.b = z2;
        this.c = typeSystemContext;
        this.d = kotlinTypePreparator;
        this.e = kotlinTypeRefiner;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.g;
        kotlin.jvm.internal.m.b(arrayDeque);
        arrayDeque.clear();
        n30.i iVar = this.h;
        kotlin.jvm.internal.m.b(iVar);
        iVar.clear();
    }

    public boolean b(h30.g subType, h30.g gVar) {
        kotlin.jvm.internal.m.e(subType, "subType");
        return true;
    }

    public final void c() {
        if (this.g == null) {
            this.g = new ArrayDeque(4);
        }
        if (this.h == null) {
            int i = n30.i.C;
            this.h = n30.l.e();
        }
    }

    public final z0 d(h30.g type) {
        kotlin.jvm.internal.m.e(type, "type");
        return this.d.a(type);
    }

    public final w e(h30.g type) {
        kotlin.jvm.internal.m.e(type, "type");
        this.e.getClass();
        return (w) type;
    }
}
