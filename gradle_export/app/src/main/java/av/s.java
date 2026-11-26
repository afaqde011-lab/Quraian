package av;

import a40.b0;
import androidx.lifecycle.e1;
import d10.j1;
import j10.o0;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Type;
import kotlin.jvm.internal.a0;
import o20.v;

public final class s implements u00.a {
    public final int A;
    public final Object B;
    public final Object C;
    public final Object D;

    public s(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.C = obj2;
        this.D = obj3;
    }

    public s(m10.h hVar, d30.o oVar, o0 o0Var) {
        this.A = 3;
        this.D = hVar;
        this.B = oVar;
        this.C = o0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                eg.g gVar = (t) this.B;
                a30.l lVar = (a30.l) this.C;
                r rVar = (r) this.D;
                e1 viewModelStore = ((t) lVar.B).getViewModelStore();
                t6.b defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
                kotlin.jvm.internal.m.d(defaultViewModelCreationExtras, "<get-defaultViewModelCreationExtras>(...)");
                return c7.i.S(a0.a.b(qt.k.class), viewModelStore, (String) null, defaultViewModelCreationExtras, w50.c.M(gVar), rVar);
            case 1:
                return ((o20.c) ((v) this.B)).b((ByteArrayInputStream) this.C, ((a30.i) ((c30.q) this.D).b.a).p);
            case 2:
                j1 j1Var = (j1) this.B;
                Class cls = (Class) this.C;
                n20.b bVar = (n20.b) this.D;
                Class cls2 = j1Var.B;
                if (kotlin.jvm.internal.m.a(cls2.getSuperclass(), cls)) {
                    Type genericSuperclass = cls2.getGenericSuperclass();
                    kotlin.jvm.internal.m.b(genericSuperclass);
                    return genericSuperclass;
                }
                Class<?>[] interfaces = cls2.getInterfaces();
                kotlin.jvm.internal.m.d(interfaces, "getInterfaces(...)");
                int iJ0 = h00.n.J0(cls, interfaces);
                if (iJ0 >= 0) {
                    Type type = cls2.getGenericInterfaces()[iJ0];
                    kotlin.jvm.internal.m.b(type);
                    return type;
                }
                throw new b0("No superclass of " + j1Var + " in Java reflection for " + bVar);
            default:
                return new m10.g((m10.h) this.D, (d30.o) this.B, (o0) this.C);
        }
    }
}
