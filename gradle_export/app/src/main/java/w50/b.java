package w50;

import h00.n;
import h00.q;
import h00.x;
import kotlin.jvm.internal.m;
import org.koin.core.error.InstanceCreationException;
import r30.k;
import sd.y1;

public abstract class b {
    public final v50.a a;

    public b(v50.a aVar) {
        this.a = aVar;
    }

    public Object a(y1 y1Var) throws InstanceCreationException {
        Iterable iterableK0;
        f5.c cVar = (f5.c) y1Var.a;
        StringBuilder sb = new StringBuilder("| (+) '");
        v50.a aVar = this.a;
        sb.append(aVar);
        sb.append('\'');
        cVar.E0(sb.toString());
        try {
            a60.a aVar2 = (a60.a) y1Var.e;
            if (aVar2 == null) {
                aVar2 = new a60.a(3, null);
            }
            return aVar.d.invoke((e60.a) y1Var.b, aVar2);
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e);
            sb2.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            m.d(stackTrace, "getStackTrace(...)");
            int i = 0;
            while (i < stackTrace.length) {
                String className = stackTrace[i].getClassName();
                m.d(className, "getClassName(...)");
                if (k.A0(className, "sun.reflect", false)) {
                    break;
                }
                i++;
            }
            if (i != 0) {
                iterableK0 = i != 1 ? n.k0(n.x0(stackTrace, 0, i)) : va.a.R(stackTrace[0]);
            } else {
                iterableK0 = x.A;
            }
            sb2.append(q.R0(iterableK0, "\n\t", null, null, null, 62));
            String msg = "* Instance creation error : could not create instance for '" + aVar + "': " + sb2.toString();
            m.e(msg, "msg");
            cVar.N0(x50.a.D, msg);
            String msg2 = "Could not create instance for '" + aVar + '\'';
            m.e(msg2, "msg");
            throw new InstanceCreationException(msg2, e);
        }
    }

    public abstract Object b(y1 y1Var);
}
