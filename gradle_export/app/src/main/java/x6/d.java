package x6;

import androidx.lifecycle.e0;
import androidx.lifecycle.e1;
import androidx.lifecycle.w;
import androidx.media3.common.q;
import com.google.android.gms.cast.Cast;
import java.io.PrintWriter;
import k00.f;
import kotlin.jvm.internal.m;
import qd.s0;
import u.t0;

public final class d extends a {

    public final Object f16470a;

    public final c f16471b;

    public d(w wVar, e1 e1Var) {
        this.f16470a = wVar;
        m.e(e1Var, "store");
        t6.a aVar = t6.a.f14359b;
        m.e(aVar, "defaultCreationExtras");
        p10.a aVar2 = new p10.a(e1Var, c.f16467e, aVar);
        a10.d dVarI = f.I(c.class);
        String strM = dVarI.m();
        if (strM == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        this.f16471b = (c) aVar2.o(dVarI, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strM));
    }

    public final void b(String str, PrintWriter printWriter) {
        c cVar = this.f16471b;
        if (cVar.f16468c.C <= 0) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Loaders:");
        String str2 = str + "    ";
        int i10 = 0;
        while (true) {
            t0 t0Var = cVar.f16468c;
            if (i10 >= t0Var.C) {
                return;
            }
            b bVar = (b) t0Var.f(i10);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(cVar.f16468c.d(i10));
            printWriter.print(": ");
            printWriter.println(bVar.toString());
            printWriter.print(str2);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mArgs=");
            printWriter.println((Object) null);
            printWriter.print(str2);
            printWriter.print("mLoader=");
            printWriter.println(bVar.l);
            me.d dVar = bVar.l;
            String str3 = str2 + "  ";
            dVar.getClass();
            printWriter.print(str3);
            printWriter.print("mId=");
            printWriter.print(0);
            printWriter.print(" mListener=");
            printWriter.println(dVar.f10881a);
            if (dVar.f10882b || dVar.f10885e) {
                printWriter.print(str3);
                printWriter.print("mStarted=");
                printWriter.print(dVar.f10882b);
                printWriter.print(" mContentChanged=");
                printWriter.print(dVar.f10885e);
                printWriter.print(" mProcessingChange=");
                printWriter.println(false);
            }
            if (dVar.f10883c || dVar.f10884d) {
                printWriter.print(str3);
                printWriter.print("mAbandoned=");
                printWriter.print(dVar.f10883c);
                printWriter.print(" mReset=");
                printWriter.println(dVar.f10884d);
            }
            if (dVar.f10887g != null) {
                printWriter.print(str3);
                printWriter.print("mTask=");
                printWriter.print(dVar.f10887g);
                printWriter.print(" waiting=");
                dVar.f10887g.getClass();
                printWriter.println(false);
            }
            if (dVar.f10888h != null) {
                printWriter.print(str3);
                printWriter.print("mCancellingTask=");
                printWriter.print(dVar.f10888h);
                printWriter.print(" waiting=");
                dVar.f10888h.getClass();
                printWriter.println(false);
            }
            if (bVar.f16466n != null) {
                printWriter.print(str2);
                printWriter.print("mCallbacks=");
                printWriter.println(bVar.f16466n);
                q qVar = bVar.f16466n;
                qVar.getClass();
                printWriter.print(str2 + "  ");
                printWriter.print("mDeliveredData=");
                printWriter.println(qVar.B);
            }
            printWriter.print(str2);
            printWriter.print("mData=");
            me.d dVar2 = bVar.l;
            Object obj = bVar.f992e;
            Object obj2 = obj != e0.f987k ? obj : null;
            dVar2.getClass();
            StringBuilder sb2 = new StringBuilder(64);
            s0.X(obj2, sb2);
            sb2.append("}");
            printWriter.println(sb2.toString());
            printWriter.print(str2);
            printWriter.print("mStarted=");
            printWriter.println(bVar.f990c > 0);
            i10++;
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(Cast.MAX_NAMESPACE_LENGTH);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        s0.X(this.f16470a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
