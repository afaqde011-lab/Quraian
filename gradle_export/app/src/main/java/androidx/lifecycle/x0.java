package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

public final class x0 implements c1 {

    public final Application f1015a;

    public final b1 f1016b;

    public final Bundle f1017c;

    public final q f1018d;

    public final ia.e f1019e;

    public x0(Application application, ia.g gVar, Bundle bundle) {
        b1 b1Var;
        this.f1019e = gVar.getSavedStateRegistry();
        this.f1018d = gVar.getLifecycle();
        this.f1017c = bundle;
        this.f1015a = application;
        if (application != null) {
            if (b1.f977c == null) {
                b1.f977c = new b1(application);
            }
            b1Var = b1.f977c;
            kotlin.jvm.internal.m.b(b1Var);
        } else {
            b1Var = new b1(null);
        }
        this.f1016b = b1Var;
    }

    @Override
    public final a1 a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return d(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override
    public final a1 b(a10.d dVar, t6.d dVar2) {
        kotlin.jvm.internal.m.e(dVar, "modelClass");
        return c(k00.f.D(dVar), dVar2);
    }

    @Override
    public final a1 c(Class cls, t6.d dVar) {
        sg.f fVar = u0.f1007e;
        LinkedHashMap linkedHashMap = dVar.f14360a;
        String str = (String) linkedHashMap.get(fVar);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(u0.f1003a) == null || linkedHashMap.get(u0.f1004b) == null) {
            if (this.f1018d != null) {
                return d(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(b1.f978d);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? y0.a(cls, y0.f1030b) : y0.a(cls, y0.f1029a);
        if (constructorA == null) {
            return this.f1016b.c(cls, dVar);
        }
        return (!zIsAssignableFrom || application == null) ? y0.b(cls, constructorA, u0.c(dVar)) : y0.b(cls, constructorA, application, u0.c(dVar));
    }

    public final a1 d(Class cls, String str) {
        q qVar = this.f1018d;
        if (qVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Application application = this.f1015a;
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? y0.a(cls, y0.f1030b) : y0.a(cls, y0.f1029a);
        if (constructorA == null) {
            if (application != null) {
                return this.f1016b.a(cls);
            }
            if (d1.f985a == null) {
                d1.f985a = new d1();
            }
            kotlin.jvm.internal.m.b(d1.f985a);
            return ze.d.r(cls);
        }
        ia.e eVar = this.f1019e;
        kotlin.jvm.internal.m.b(eVar);
        r0 r0VarB = u0.b(eVar.a(str), this.f1017c);
        s0 s0Var = new s0(str, r0VarB);
        s0Var.i(qVar, eVar);
        p pVarB = qVar.b();
        if (pVarB == p.B || pVarB.compareTo(p.D) >= 0) {
            eVar.d();
        } else {
            qVar.a(new f(qVar, eVar));
        }
        a1 a1VarB = (!zIsAssignableFrom || application == null) ? y0.b(cls, constructorA, r0VarB) : y0.b(cls, constructorA, application, r0VarB);
        a1VarB.d("androidx.lifecycle.savedstate.vm.tag", s0Var);
        return a1VarB;
    }
}
