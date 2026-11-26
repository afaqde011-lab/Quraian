package o20;

import com.google.android.gms.internal.play_billing.q1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

public abstract class l extends o {
    public final i A;

    public l() {
        this.A = new i();
    }

    public l(k kVar) {
        kVar.B.f();
        kVar.C = false;
        this.A = kVar.B;
    }

    public final boolean g() {
        z zVar = this.A.a;
        for (int i = 0; i < zVar.B.size(); i++) {
            if (!i.e((Map.Entry) zVar.B.get(i))) {
                return false;
            }
        }
        Iterator it = zVar.d().iterator();
        while (it.hasNext()) {
            if (!i.e((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int h() {
        z zVar = this.A.a;
        int iD = 0;
        for (int i = 0; i < zVar.B.size(); i++) {
            Map.Entry entry = (Map.Entry) zVar.B.get(i);
            iD += i.d((m) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : zVar.d()) {
            iD += i.d((m) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final Object i(n nVar) {
        m(nVar);
        m mVar = nVar.d;
        Object obj = this.A.a.get(mVar);
        if (obj == null) {
            return nVar.b;
        }
        if (!mVar.C) {
            return nVar.a(obj);
        }
        if (mVar.B.A != m0.ENUM) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(nVar.a(it.next()));
        }
        return arrayList;
    }

    public final boolean j(n nVar) {
        m(nVar);
        m mVar = nVar.d;
        i iVar = this.A;
        iVar.getClass();
        if (mVar.C) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return iVar.a.get(mVar) != null;
    }

    public final void k() {
        this.A.f();
    }

    public final boolean l(f fVar, q1 q1Var, h hVar, int i) throws InvalidProtocolBufferException {
        boolean z;
        boolean z2;
        Object objA;
        b bVar;
        int i2 = i & 7;
        n nVar = (n) hVar.a.get(new g(getDefaultInstanceForType(), i >>> 3));
        if (nVar == null) {
            z2 = true;
            z = false;
        } else {
            m mVar = nVar.d;
            l0 l0Var = mVar.B;
            i iVar = i.c;
            if (i2 == l0Var.B) {
                z2 = false;
                z = false;
            } else if (mVar.C && l0Var.a() && i2 == 2) {
                z = true;
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
        }
        if (z2) {
            return fVar.r(i, q1Var);
        }
        j jVarB = null;
        i iVar2 = this.A;
        if (z) {
            int iE = fVar.e(fVar.l());
            m mVar2 = nVar.d;
            if (mVar2.B != l0.G) {
                while (fVar.c() > 0) {
                    iVar2.a(mVar2, i.h(fVar, mVar2.B));
                }
            } else if (fVar.c() > 0) {
                fVar.l();
                throw null;
            }
            fVar.d(iE);
            return true;
        }
        m mVar3 = nVar.d;
        l0 l0Var2 = mVar3.B;
        boolean z3 = mVar3.C;
        int iOrdinal = l0Var2.A.ordinal();
        if (iOrdinal == 7) {
            fVar.l();
            throw null;
        }
        if (iOrdinal != 8) {
            objA = i.h(fVar, l0Var2);
        } else {
            if (!z3 && (bVar = (b) iVar2.a.get(mVar3)) != null) {
                jVarB = bVar.c();
            }
            if (jVarB == null) {
                jVarB = nVar.c.b();
            }
            if (l0Var2 == l0.E) {
                int i3 = mVar3.A;
                fVar.b();
                fVar.i++;
                jVarB.b(fVar, hVar);
                fVar.a((i3 << 3) | 4);
                fVar.i--;
            } else {
                int iL = fVar.l();
                fVar.b();
                int iE2 = fVar.e(iL);
                fVar.i++;
                jVarB.b(fVar, hVar);
                fVar.a(0);
                fVar.i--;
                fVar.d(iE2);
            }
            objA = jVarB.a();
        }
        if (z3) {
            iVar2.a(mVar3, nVar.b(objA));
            return true;
        }
        iVar2.i(mVar3, nVar.b(objA));
        return true;
    }

    public final void m(n nVar) {
        if (nVar.a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }
}
