package mh;

import a30.x;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import th.t;
import yh.a1;
import yh.c1;
import yh.d1;
import yh.e1;
import yh.f1;
import yh.q1;
import yh.v0;
import yh.w0;
import yh.x0;
import yh.z0;

public final class f {

    public static final f f10907c;

    public static final f f10908d;

    public static final f f10909e;

    public final int f10910a;

    public final Object f10911b;

    static {
        int i10 = 0;
        f10907c = new f("ENABLED", i10);
        f10908d = new f("DISABLED", i10);
        f10909e = new f("DESTROYED", i10);
    }

    public f(x xVar, Class cls) {
        this.f10910a = 2;
        if (((Map) xVar.C).keySet().contains(cls) || Void.class.equals(cls)) {
            this.f10911b = xVar;
            return;
        }
        throw new IllegalArgumentException("Given internalKeyMananger " + xVar.toString() + " does not support primitive class " + cls.getName());
    }

    public f(Object obj, int i10) {
        this.f10910a = i10;
        this.f10911b = obj;
    }

    public static f b(String str, byte[] bArr, int i10) {
        q1 q1Var;
        z0 z0VarC = a1.C();
        z0VarC.d();
        a1.v((a1) z0VarC.B, str);
        com.google.crypto.tink.shaded.protobuf.h hVarC = com.google.crypto.tink.shaded.protobuf.i.c(0, bArr.length, bArr);
        z0VarC.d();
        a1.w((a1) z0VarC.B, hVarC);
        int iB = e4.f.b(i10);
        if (iB == 0) {
            q1Var = q1.TINK;
        } else if (iB == 1) {
            q1Var = q1.LEGACY;
        } else if (iB == 2) {
            q1Var = q1.RAW;
        } else {
            if (iB != 3) {
                throw new IllegalArgumentException("Unknown output prefix type");
            }
            q1Var = q1.CRUNCHY;
        }
        z0VarC.d();
        a1.x((a1) z0VarC.B, q1Var);
        return new f((a1) z0VarC.a(), 3);
    }

    public synchronized void a(a1 a1Var) {
        e1 e1VarC;
        synchronized (this) {
            e1VarC = c(m.e(a1Var), a1Var.z());
        }
        c1 c1Var = (c1) this.f10911b;
        c1Var.d();
        f1.w((f1) c1Var.B, e1VarC);
    }

    public synchronized e1 c(x0 x0Var, q1 q1Var) {
        int iA;
        synchronized (this) {
            iA = t.a();
            while (e(iA)) {
                iA = t.a();
            }
        }
        return (e1) d1VarE.a();
        if (q1Var == q1.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        d1 d1VarE = e1.E();
        d1VarE.d();
        e1.v((e1) d1VarE.B, x0Var);
        d1VarE.d();
        e1.y((e1) d1VarE.B, iA);
        d1VarE.d();
        e1.x((e1) d1VarE.B);
        d1VarE.d();
        e1.w((e1) d1VarE.B, q1Var);
        return (e1) d1VarE.a();
    }

    public synchronized k9.x0 d() {
        return k9.x0.r((f1) ((c1) this.f10911b).a());
    }

    public synchronized boolean e(int i10) {
        Iterator it = Collections.unmodifiableList(((f1) ((c1) this.f10911b).B).z()).iterator();
        while (it.hasNext()) {
            if (((e1) it.next()).A() == i10) {
                return true;
            }
        }
        return false;
    }

    public x0 f(com.google.crypto.tink.shaded.protobuf.i iVar) throws GeneralSecurityException {
        x xVar = (x) this.f10911b;
        try {
            f5.c cVarM = xVar.m();
            com.google.crypto.tink.shaded.protobuf.a aVarO0 = cVarM.O0(iVar);
            cVarM.U0(aVarO0);
            com.google.crypto.tink.shaded.protobuf.a aVarD0 = cVarM.D0(aVarO0);
            v0 v0VarC = x0.C();
            String strI = xVar.i();
            v0VarC.d();
            x0.v((x0) v0VarC.B, strI);
            try {
                int iA = ((com.google.crypto.tink.shaded.protobuf.x) aVarD0).a(null);
                byte[] bArr = new byte[iA];
                com.google.crypto.tink.shaded.protobuf.m mVar = new com.google.crypto.tink.shaded.protobuf.m(iA, bArr);
                aVarD0.e(mVar);
                if (mVar.f4293d - mVar.f4294e != 0) {
                    throw new IllegalStateException("Did not write as much data as expected.");
                }
                com.google.crypto.tink.shaded.protobuf.h hVar = new com.google.crypto.tink.shaded.protobuf.h(bArr);
                v0VarC.d();
                x0.w((x0) v0VarC.B, hVar);
                w0 w0VarQ = xVar.q();
                v0VarC.d();
                x0.x((x0) v0VarC.B, w0VarQ);
                return (x0) v0VarC.a();
            } catch (IOException e3) {
                throw new RuntimeException(aVarD0.b("ByteString"), e3);
            }
        } catch (InvalidProtocolBufferException e10) {
            throw new GeneralSecurityException("Unexpected proto", e10);
        }
    }

    public String toString() {
        switch (this.f10910a) {
            case 0:
                return (String) this.f10911b;
            default:
                return super.toString();
        }
    }
}
