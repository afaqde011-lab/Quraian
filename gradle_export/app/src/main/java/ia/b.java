package ia;

import android.os.Bundle;
import androidx.lifecycle.a1;
import androidx.lifecycle.e1;
import androidx.lifecycle.f1;
import androidx.lifecycle.i;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w;
import d.n;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.m;

public final class b implements u {
    public final int A;
    public final Object B;

    public b(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void a(w wVar, o oVar) {
        switch (this.A) {
            case 0:
                g gVar = (g) this.B;
                if (oVar != o.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                wVar.getLifecycle().d(this);
                Bundle bundleA = gVar.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (bundleA == null) {
                    return;
                }
                ArrayList<String> stringArrayList = bundleA.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(c.class);
                        m.b(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                m.b(objNewInstance);
                                if (!(gVar instanceof f1)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + gVar).toString());
                                }
                                e1 viewModelStore = ((f1) gVar).getViewModelStore();
                                e savedStateRegistry = gVar.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f998a;
                                for (String str2 : new HashSet(linkedHashMap.keySet())) {
                                    m.e(str2, "key");
                                    a1 a1Var = (a1) linkedHashMap.get(str2);
                                    if (a1Var != null) {
                                        u0.a(a1Var, savedStateRegistry, gVar.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.d();
                                }
                            } catch (Exception e3) {
                                throw new RuntimeException(a1.b.o("Failed to instantiate ", str), e3);
                            }
                        } catch (NoSuchMethodException e10) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
                        }
                    } catch (ClassNotFoundException e11) {
                        throw new RuntimeException(a1.b.p("Class ", str, " wasn't found"), e11);
                    }
                }
                return;
            case 1:
                new HashMap();
                i[] iVarArr = (i[]) this.B;
                if (iVarArr.length > 0) {
                    i iVar = iVarArr[0];
                    throw null;
                }
                if (iVarArr.length <= 0) {
                    return;
                }
                i iVar2 = iVarArr[0];
                throw null;
            case 2:
                if (oVar != o.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + oVar).toString());
                }
                wVar.getLifecycle().d(this);
                ((v0) this.B).b();
                return;
            default:
                n nVar = (n) this.B;
                n.access$ensureViewModelStore(nVar);
                nVar.getLifecycle().d(this);
                return;
        }
    }
}
