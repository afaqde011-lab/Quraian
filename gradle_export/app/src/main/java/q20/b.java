package q20;

import com.google.android.gms.internal.measurement.f4;
import e30.m0;
import h00.q;
import j10.e0;
import j10.n0;
import j10.r0;
import j10.x;
import java.util.Collection;
import m10.c0;
import u00.n;

public final class b implements f30.c {
    public static final b A = new b();

    public static void a(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static n0 e(j10.b bVar) {
        while (bVar instanceof j10.c) {
            j10.c cVar = (j10.c) bVar;
            if (cVar.getKind() != 2) {
                break;
            }
            Collection collectionM = cVar.m();
            kotlin.jvm.internal.m.d(collectionM, "getOverriddenDescriptors(...)");
            bVar = (j10.c) q.e1(collectionM);
            if (bVar == null) {
                return null;
            }
        }
        return bVar.o();
    }

    public boolean b(j10.k kVar, j10.k kVar2, boolean z) {
        if ((kVar instanceof j10.e) && (kVar2 instanceof j10.e)) {
            return kotlin.jvm.internal.m.a(((j10.e) kVar).f(), ((j10.e) kVar2).f());
        }
        if ((kVar instanceof r0) && (kVar2 instanceof r0)) {
            return d((r0) kVar, (r0) kVar2, z, a.A);
        }
        if (!(kVar instanceof j10.b) || !(kVar2 instanceof j10.b)) {
            return ((kVar instanceof e0) && (kVar2 instanceof e0)) ? kotlin.jvm.internal.m.a(((c0) ((e0) kVar)).F, ((c0) ((e0) kVar2)).F) : kotlin.jvm.internal.m.a(kVar, kVar2);
        }
        j10.b bVar = (j10.b) kVar;
        j10.b bVar2 = (j10.b) kVar2;
        if (!bVar.equals(bVar2)) {
            if (kotlin.jvm.internal.m.a(bVar.getName(), bVar2.getName()) && ((!(bVar instanceof x) || !(bVar2 instanceof x) || ((x) bVar).E() == ((x) bVar2).E()) && ((!kotlin.jvm.internal.m.a(bVar.l(), bVar2.l()) || (z && kotlin.jvm.internal.m.a(e(bVar), e(bVar2)))) && !d.m(bVar) && !d.m(bVar2)))) {
                j10.k kVarL = bVar.l();
                j10.k kVarL2 = bVar2.l();
                if (((kVarL instanceof j10.c) || (kVarL2 instanceof j10.c)) ? false : b(kVarL, kVarL2, z)) {
                    j jVar = new j(new f4(7, bVar, bVar2, z));
                    if (jVar.m(bVar, bVar2, null, true).b() != 1 || jVar.m(bVar2, bVar, null, true).b() != 1) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public boolean c(m0 m0Var, m0 m0Var2) {
        if (m0Var == null) {
            a(0);
            throw null;
        }
        if (m0Var2 != null) {
            return m0Var.equals(m0Var2);
        }
        a(1);
        throw null;
    }

    public boolean d(r0 a, r0 b, boolean z, n nVar) {
        kotlin.jvm.internal.m.e(a, "a");
        kotlin.jvm.internal.m.e(b, "b");
        if (a.equals(b)) {
            return true;
        }
        if (kotlin.jvm.internal.m.a(a.l(), b.l())) {
            return false;
        }
        j10.k kVarL = a.l();
        j10.k kVarL2 = b.l();
        return (((kVarL instanceof j10.c) || (kVarL2 instanceof j10.c)) ? ((Boolean) nVar.invoke(kVarL, kVarL2)).booleanValue() : b(kVarL, kVarL2, z)) && a.getIndex() == b.getIndex();
    }
}
