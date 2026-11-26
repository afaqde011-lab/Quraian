package d6;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.CorruptionException;
import androidx.glance.appwidget.UnmanagedSessionReceiver;
import java.io.IOException;
import java.util.LinkedHashMap;

public final class a0 implements k00.h {
    public static final a0 A = new a0();

    public static final f1 a(String str) {
        Object objNewInstance = Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        if (objNewInstance instanceof f1) {
            return (f1) objNewInstance;
        }
        return null;
    }

    public static void b(int i10) {
        synchronized (UnmanagedSessionReceiver.f867a) {
            if (UnmanagedSessionReceiver.f868b.get(Integer.valueOf(i10)) != null) {
                throw new ClassCastException();
            }
        }
    }

    public Object c(Context context, int i10, m00.c cVar) throws Throwable {
        k1 k1Var;
        f6.s sVarQ;
        if (cVar instanceof k1) {
            k1Var = (k1) cVar;
            int i11 = k1Var.E;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                k1Var.E = i11 - Integer.MIN_VALUE;
            } else {
                k1Var = new k1(this, cVar);
            }
        } else {
            k1Var = new k1(this, cVar);
        }
        Object objC = k1Var.C;
        l00.a aVar = l00.a.A;
        int i12 = k1Var.E;
        try {
            if (i12 == 0) {
                ri.t1.O(objC);
                m6.f fVar = m6.f.f10566a;
                r1 r1Var = r1.f4693a;
                String strN = w.n(i10);
                k1Var.A = context;
                k1Var.B = i10;
                k1Var.E = 1;
                objC = fVar.c(context, r1Var, strN, k1Var);
                if (objC == aVar) {
                    return aVar;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i10 = k1Var.B;
                context = k1Var.A;
                ri.t1.O(objC);
            }
            sVarQ = (f6.s) objC;
        } catch (CorruptionException e3) {
            Log.e("GlanceAppWidget", "Set of layout structures for App Widget id " + i10 + " is corrupted", e3);
            sVarQ = f6.s.q();
        } catch (IOException e10) {
            Log.e("GlanceAppWidget", "I/O error reading set of layout structures for App Widget id " + i10, e10);
            sVarQ = f6.s.q();
        }
        Context context2 = context;
        int i13 = i10;
        androidx.glance.appwidget.protobuf.d0<f6.u> d0VarR = sVarQ.r();
        int iP = h00.d0.P(h00.r.q0(d0VarR, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        for (f6.u uVar : d0VarR) {
            linkedHashMap.put(uVar.p(), new Integer(uVar.q()));
        }
        LinkedHashMap linkedHashMapB0 = h00.d0.b0(linkedHashMap);
        return new l1(context2, linkedHashMapB0, sVarQ.s(), i13, h00.q.q1(linkedHashMapB0.values()), 16);
    }
}
