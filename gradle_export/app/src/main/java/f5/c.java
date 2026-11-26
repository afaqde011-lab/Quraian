package f5;

import android.content.Context;
import android.media.session.MediaController;
import android.os.Bundle;
import com.google.android.gms.common.internal.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k9.x0;
import l0.o0;
import l0.p0;
import tf.e1;
import tf.h1;
import tf.p1;
import tf.q0;
import u.w;
import x.n1;
import z2.v0;

public abstract class c implements jc.e, k10.a, p1, y20.d {
    public final int A;
    public Object B;

    public c(int i10) {
        this.A = i10;
        switch (i10) {
            case 5:
                this.B = new Object();
                break;
            case 11:
                this.B = l1.q.z(Boolean.FALSE);
                break;
            default:
                w wVar = u.m.f14876a;
                this.B = new w();
                break;
        }
    }

    public c(int i10, boolean z10) {
        this.A = i10;
    }

    public c(e30.w wVar) {
        this.A = 13;
        if (wVar != null) {
            this.B = wVar;
        } else {
            z0(0);
            throw null;
        }
    }

    public c(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    public c(String str, Bundle bundle) {
        this.A = 0;
        kotlin.jvm.internal.m.e(bundle, "data");
        this.B = bundle;
    }

    public c(k10.h hVar) {
        this.A = 3;
        if (hVar != null) {
            this.B = hVar;
        } else {
            y0(0);
            throw null;
        }
    }

    public c(h1 h1Var) {
        this.A = 9;
        d0.h(h1Var);
        this.B = h1Var;
    }

    public static void y0(int i10) {
        String str = i10 != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 1 ? 3 : 2];
        if (i10 != 1) {
            objArr[0] = "annotations";
        } else {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        }
        if (i10 != 1) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotatedImpl";
        } else {
            objArr[1] = "getAnnotations";
        }
        if (i10 != 1) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 == 1) {
            throw new IllegalStateException(str2);
        }
    }

    public static void z0(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public abstract void A0(x0 x0Var);

    public abstract void B0(c40.w wVar);

    @Override
    public e1 C() {
        throw null;
    }

    public abstract void C0();

    public abstract com.google.crypto.tink.shaded.protobuf.a D0(com.google.crypto.tink.shaded.protobuf.a aVar);

    public void E0(String str) {
        kotlin.jvm.internal.m.e(str, "msg");
        N0(x50.a.A, str);
    }

    public abstract void F0(x50.a aVar, String str);

    public abstract void G0();

    public abstract p0 H0(int i10, int i11, int i12, long j9);

    public String I0() {
        return null;
    }

    public abstract Object J0();

    public List K0(o0 o0Var, int i10, long j9) {
        w wVar = (w) this.B;
        List list = (List) wVar.b(i10);
        if (list != null) {
            return list;
        }
        List listA = o0Var.a(i10);
        int size = listA.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(((v0) listA.get(i11)).O(j9));
        }
        wVar.i(i10, arrayList);
        return arrayList;
    }

    public abstract Object L0();

    public Map M0() {
        return Collections.EMPTY_MAP;
    }

    public void N0(x50.a aVar, String str) {
        kotlin.jvm.internal.m.e(str, "msg");
        if (((x50.a) this.B).compareTo(aVar) <= 0) {
            F0(aVar, str);
        }
    }

    public abstract com.google.crypto.tink.shaded.protobuf.a O0(com.google.crypto.tink.shaded.protobuf.i iVar);

    @Override
    public ru.c P() {
        throw null;
    }

    public abstract u00.k P0(c40.w wVar);

    public void Q0(String str, Bundle bundle) {
        if (str != null && ((str.equals("android.support.v4.media.session.action.FOLLOW") || str.equals("android.support.v4.media.session.action.UNFOLLOW")) && (bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")))) {
            throw new IllegalArgumentException(a1.b.p("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));
        }
        ((MediaController.TransportControls) this.B).sendCustomAction(str, bundle);
    }

    public abstract void R0(Object obj);

    public abstract void S0(n1 n1Var);

    public abstract void T0();

    public abstract void U0(com.google.crypto.tink.shaded.protobuf.a aVar);

    public void V0() {
        e1 e1Var = ((h1) this.B).G;
        h1.g(e1Var);
        e1Var.V0();
    }

    @Override
    public Context e0() {
        throw null;
    }

    public k10.h getAnnotations() {
        k10.h hVar = (k10.h) this.B;
        if (hVar != null) {
            return hVar;
        }
        y0(1);
        throw null;
    }

    public e30.w getType() {
        e30.w wVar = (e30.w) this.B;
        if (wVar != null) {
            return wVar;
        }
        z0(1);
        throw null;
    }

    @Override
    public ve.a k0() {
        throw null;
    }

    @Override
    public q0 t() {
        throw null;
    }

    @Override
    public List t0() {
        return (List) this.B;
    }

    public String toString() {
        switch (this.A) {
            case 2:
                StringBuilder sb2 = new StringBuilder();
                List list = (List) this.B;
                if (!list.isEmpty()) {
                    sb2.append("values=");
                    sb2.append(Arrays.toString(list.toArray()));
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public boolean w0() {
        List list = (List) this.B;
        return list.isEmpty() || (list.size() == 1 && ((pc.a) list.get(0)).c());
    }
}
