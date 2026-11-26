package ja;

import g00.c;
import g00.m;
import h.e;
import ia.g;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import l1.p1;
import l1.q2;
import ri.t1;

public abstract class a {

    public static final p1 f8257a;

    static {
        m mVarS;
        try {
            ClassLoader classLoader = g.class.getClassLoader();
            kotlin.jvm.internal.m.b(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            kotlin.jvm.internal.m.d(annotations, "getAnnotations(...)");
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof p1) {
                        mVarS = (p1) objInvoke;
                        break;
                    }
                } else if (!(annotations[i10] instanceof c)) {
                    i10++;
                }
                mVarS = null;
                break;
            }
        } catch (Throwable th2) {
            mVarS = t1.s(th2);
        }
        p1 q2Var = (p1) (mVarS instanceof m ? null : mVarS);
        if (q2Var == null) {
            q2Var = new q2(new e(3));
        }
        f8257a = q2Var;
    }
}
