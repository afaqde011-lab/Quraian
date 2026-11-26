package uh;

import a8.q;
import a8.t;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.media3.common.l2;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.firebase.datatransport.TransportRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import fh.r0;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import l1.d2;
import ri.n2;
import s7.l1;
import sd.p1;
import sd.y1;
import vg.x;
import wj.k0;
import wj.l0;
import x.v;
import yh.q0;
import yh.q1;

public final class k implements th.b, eh.k, t, x, ud.e, e7.h, ii.e, v, ud.g, d2 {
    public final int A;

    public k(int i10) {
        this.A = i10;
    }

    public k(wj.l lVar) {
        this.A = 6;
    }

    @Override
    public mh.b a(th.o oVar) throws GeneralSecurityException {
        if (!((String) oVar.B).equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            q0 q0VarD = q0.D((com.google.crypto.tink.shaded.protobuf.i) oVar.D, com.google.crypto.tink.shaded.protobuf.p.a());
            if (q0VarD.B() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            p10.a aVar = new p10.a();
            aVar.A = null;
            aVar.B = null;
            aVar.C = null;
            aVar.D = c.f15268o;
            aVar.A = Integer.valueOf(q0VarD.z().size());
            aVar.B = Integer.valueOf(q0VarD.A().z());
            aVar.C = l.a(q0VarD.A().y());
            aVar.D = l.b((q1) oVar.F);
            j jVarH = aVar.h();
            p1 p1Var = new p1(13, false);
            p1Var.C = null;
            p1Var.D = null;
            p1Var.B = jVarH;
            p1Var.C = new me.i(ai.a.a(q0VarD.z().h()), 6);
            p1Var.D = (Integer) oVar.G;
            return p1Var.h();
        } catch (InvalidProtocolBufferException | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    @Override
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override
    public Object apply(Object obj) {
        switch (this.A) {
            case 1:
                l1 l1Var = (l1) obj;
                l1Var.getClass();
                Bundle bundle = new Bundle();
                String str = l1.f13709e;
                fh.d2 d2Var = l1Var.f13711b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(d2Var.D);
                r0 r0VarListIterator = d2Var.listIterator(0);
                while (r0VarListIterator.hasNext()) {
                    arrayList.add(((l2) r0VarListIterator.next()).c());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
            case 4:
                vi.a.f15698b.getClass();
                return si.a.f14241a.C((n2) obj).getBytes(Charset.forName("UTF-8"));
            case 6:
                String strC = l0.f16191b.C((k0) obj);
                kotlin.jvm.internal.m.d(strC, "encode(...)");
                wj.n nVar = wj.n.SESSION_START;
                Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] bytes = strC.getBytes(r30.a.a);
                kotlin.jvm.internal.m.d(bytes, "getBytes(...)");
                return bytes;
            default:
                long j9 = ((x8.a) obj).f16477b;
                if (j9 == -9223372036854775807L) {
                    j9 = 0;
                }
                return Long.valueOf(j9);
        }
    }

    @Override
    public float b(float f3) {
        float f10;
        float f11;
        switch (this.A) {
            case 10:
                if (f3 < 0.36363637f) {
                    return 7.5625f * f3 * f3;
                }
                if (f3 < 0.72727275f) {
                    float f12 = f3 - 0.54545456f;
                    f10 = 7.5625f * f12 * f12;
                    f11 = 0.75f;
                } else if (f3 < 0.90909094f) {
                    float f13 = f3 - 0.8181818f;
                    f10 = 7.5625f * f13 * f13;
                    f11 = 0.9375f;
                } else {
                    float f14 = f3 - 0.95454544f;
                    f10 = 7.5625f * f14 * f14;
                    f11 = 0.984375f;
                }
                return f10 + f11;
            default:
                return f3;
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public void d(Exception exc) {
    }

    @Override
    public q[] e() {
        return new q[]{new v8.d()};
    }

    @Override
    public Object m(y1 y1Var) {
        switch (this.A) {
            case 8:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(y1Var);
            case 9:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(y1Var);
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                return TransportRegistrar.lambda$getComponents$0(y1Var);
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                return TransportRegistrar.lambda$getComponents$1(y1Var);
            default:
                return TransportRegistrar.lambda$getComponents$2(y1Var);
        }
    }
}
