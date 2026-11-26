package m00;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import g00.b0;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import k9.x0;
import kotlin.jvm.internal.m;
import ri.t1;

public abstract class a implements k00.c, d, Serializable {
    private final k00.c<Object> completion;

    public a(k00.c cVar) {
        this.completion = cVar;
    }

    public k00.c<b0> create(Object obj, k00.c<?> completion) {
        m.e(completion, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public k00.c<b0> create(k00.c<?> completion) {
        m.e(completion, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public d getCallerFrame() {
        k00.c<Object> cVar = this.completion;
        if (cVar instanceof d) {
            return (d) cVar;
        }
        return null;
    }

    public final k00.c<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null || eVar.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        x0 x0Var = f.b;
        x0 x0Var2 = f.a;
        if (x0Var == null) {
            try {
                x0 x0Var3 = new x0(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(DiagnosticsEntry.NAME_KEY, null), 5);
                f.b = x0Var3;
                x0Var = x0Var3;
            } catch (Exception unused2) {
                f.b = x0Var2;
                x0Var = x0Var2;
            }
        }
        if (x0Var != x0Var2 && (method = (Method) x0Var.B) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) x0Var.C) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = (Method) x0Var.D;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override
    public final void resumeWith(Object obj) {
        ?? r2 = this;
        while (true) {
            a aVar = (a) r2;
            k00.c<Object> cVar = aVar.completion;
            m.b(cVar);
            try {
                obj = aVar.invokeSuspend(obj);
                if (obj == l00.a.A) {
                    return;
                }
            } catch (Throwable th) {
                obj = t1.s(th);
            }
            aVar.releaseIntercepted();
            if (!(cVar instanceof a)) {
                cVar.resumeWith(obj);
                return;
            }
            r2 = cVar;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }
}
