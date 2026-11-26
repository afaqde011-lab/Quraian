package d10;

import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public final class u implements u00.a {
    public final int A;
    public final w B;

    public u(w wVar, int i) {
        this.A = i;
        this.B = wVar;
    }

    @Override
    public final Object invoke() {
        v vVar;
        List listG1;
        m10.u uVarX0;
        int i = this.A;
        w wVar = this.B;
        switch (i) {
            case 0:
                return i2.b(wVar.d());
            default:
                j10.j0 j0VarD = wVar.d();
                int i2 = wVar.B;
                j jVar = wVar.A;
                if (j0VarD instanceof m10.u) {
                    j10.c cVarW = jVar.w();
                    n20.c cVar = i2.a;
                    if (cVarW.T() != null) {
                        j10.k kVarL = cVarW.l();
                        kotlin.jvm.internal.m.c(kVarL, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        uVarX0 = ((j10.e) kVarL).x0();
                    } else {
                        uVarX0 = null;
                    }
                    if (kotlin.jvm.internal.m.a(uVarX0, j0VarD) && jVar.w().getKind() == 2) {
                        j10.k kVarL2 = jVar.w().l();
                        kotlin.jvm.internal.m.c(kVarL2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        Class clsI = i2.i((j10.e) kVarL2);
                        if (clsI != null) {
                            return clsI;
                        }
                        throw new a40.b0("Cannot determine receiver Java type of inherited declaration: " + j0VarD);
                    }
                }
                e10.g gVarA = jVar.a();
                if (gVarA instanceof e10.c0) {
                    if (ri.t1.D(jVar)) {
                        e10.c0 c0Var = (e10.c0) gVarA;
                        z00.e eVarD = c0Var.d(i2 + 1);
                        int i3 = c0Var.d(0).B + 1;
                        listG1 = h00.q.g1(c0Var.b.a(), new z00.e(eVarD.A - i3, eVarD.B - i3, 1));
                    } else {
                        e10.c0 c0Var2 = (e10.c0) gVarA;
                        listG1 = h00.q.g1(c0Var2.b.a(), c0Var2.d(i2));
                    }
                    Type[] typeArr = (Type[]) listG1.toArray(new Type[0]);
                    Type[] typeArr2 = (Type[]) Arrays.copyOf(typeArr, typeArr.length);
                    int length = typeArr2.length;
                    if (length == 0) {
                        throw new a40.b0("Expected at least 1 type for compound type");
                    }
                    if (length == 1) {
                        return (Type) h00.n.R0(typeArr2);
                    }
                    vVar = new v(typeArr2);
                } else {
                    if (!(gVarA instanceof e10.b0)) {
                        return (Type) gVarA.a().get(i2);
                    }
                    Class[] clsArr = (Class[]) ((Collection) ((e10.b0) gVarA).d.get(i2)).toArray(new Class[0]);
                    Type[] typeArr3 = (Type[]) Arrays.copyOf(clsArr, clsArr.length);
                    int length2 = typeArr3.length;
                    if (length2 == 0) {
                        throw new a40.b0("Expected at least 1 type for compound type");
                    }
                    if (length2 == 1) {
                        return (Type) h00.n.R0(typeArr3);
                    }
                    vVar = new v(typeArr3);
                }
                return vVar;
        }
    }
}
