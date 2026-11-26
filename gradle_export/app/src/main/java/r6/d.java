package r6;

import androidx.lifecycle.w;
import g00.m;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import l1.p1;
import l1.q2;
import ri.t1;

public abstract class d {

    public static final p1 f13126a;

    static {
        m mVarS;
        try {
            ClassLoader classLoader = w.class.getClassLoader();
            kotlin.jvm.internal.m.b(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof p1) {
                        mVarS = (p1) objInvoke;
                        break;
                    }
                } else if (!(annotations[i10] instanceof g00.c)) {
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
            q2Var = new q2(new q50.b(7));
        }
        f13126a = q2Var;
    }
}
