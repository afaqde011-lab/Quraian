package d10;

import com.revenuecat.purchases.common.HTTPClient;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

public final class a1 implements u00.a {
    public final int A;
    public final j1 B;

    public a1(j1 j1Var, int i) {
        this.A = i;
        this.B = j1Var;
    }

    public a1(j1 j1Var, e1 e1Var) {
        this.A = 7;
        this.B = j1Var;
    }

    @Override
    public final Object invoke() throws InvocationTargetException {
        int i = this.A;
        j1 j1Var = this.B;
        switch (i) {
            case 0:
                return new e1(j1Var);
            case 1:
                return j1.I(j1Var, j1Var.M().n().N(), f1.A);
            case 2:
                x20.n nVarK = j1Var.M().K();
                kotlin.jvm.internal.m.d(nVarK, "getStaticScope(...)");
                return j1.I(j1Var, nVarK, f1.A);
            case 3:
                return j1.I(j1Var, j1Var.M().n().N(), f1.B);
            case 4:
                x20.n nVarK2 = j1Var.M().K();
                kotlin.jvm.internal.m.d(nVarK2, "getStaticScope(...)");
                return j1.I(j1Var, nVarK2, f1.B);
            case 5:
                HashSet hashSet = j1.D;
                n20.b bVarK = j1Var.K();
                Class cls = j1Var.B;
                x1 x1Var = ((e1) j1Var.C.getValue()).a;
                a10.w wVar = k1.b[0];
                Object objInvoke = x1Var.invoke();
                kotlin.jvm.internal.m.d(objInvoke, "getValue(...)");
                o10.f fVar = (o10.f) objInvoke;
                a30.i iVar = fVar.a;
                j10.e eVarB = (bVarK.c && cls.isAnnotationPresent(Metadata.class)) ? iVar.b(bVarK) : j10.w.d(iVar.b, bVarK);
                if (eVarB != null) {
                    return eVarB;
                }
                if (cls.isSynthetic()) {
                    return j1.J(bVarK, fVar);
                }
                o10.c cVarU = k00.f.u(cls);
                h20.a aVar = cVarU != null ? (h20.a) cVarU.b.c : null;
                switch (aVar == null ? -1 : g1.a[aVar.ordinal()]) {
                    case HTTPClient.NO_STATUS_CODE:
                    case 6:
                        throw new a40.b0("Unresolved class: " + cls + " (kind = " + aVar + ')');
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return j1.J(bVarK, fVar);
                    case 5:
                        throw new a40.b0("Unknown class: " + cls + " (kind = " + aVar + ')');
                }
            case 6:
                Annotation[] annotations = j1Var.B.getAnnotations();
                kotlin.jvm.internal.m.d(annotations, "getAnnotations(...)");
                ArrayList arrayList = new ArrayList();
                for (Annotation annotation : annotations) {
                    if (!j1.D.contains(k00.f.D(k00.f.z(annotation)).getName())) {
                        arrayList.add(annotation);
                    }
                }
                return i2.k(arrayList);
            case 7:
                Class cls2 = j1Var.B;
                if (cls2.isAnonymousClass()) {
                    return null;
                }
                n20.b bVarK2 = j1Var.K();
                if (!bVarK2.c) {
                    String strB = bVarK2.f().b();
                    kotlin.jvm.internal.m.d(strB, "asString(...)");
                    return strB;
                }
                String simpleName = cls2.getSimpleName();
                Method enclosingMethod = cls2.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return r30.k.a1(simpleName, enclosingMethod.getName() + '$', simpleName);
                }
                Constructor<?> enclosingConstructor = cls2.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    return r30.k.Z0('$', simpleName, simpleName);
                }
                return r30.k.a1(simpleName, enclosingConstructor.getName() + '$', simpleName);
            case 8:
                if (j1Var.B.isAnonymousClass()) {
                    return null;
                }
                n20.b bVarK3 = j1Var.K();
                if (bVarK3.c) {
                    return null;
                }
                return bVarK3.a().a.a;
            default:
                Collection collectionZ = j1Var.z();
                ArrayList arrayList2 = new ArrayList(h00.r.q0(collectionZ, 10));
                Iterator it = collectionZ.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new l(j1Var, (j10.j) it.next()));
                }
                return arrayList2;
        }
    }
}
