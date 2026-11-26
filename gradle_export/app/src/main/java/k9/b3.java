package k9;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.tasks.Task;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.RuntimeVersion;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.List;

public final class b3 implements n3, e7.h, m3, xf.d, l1.d, eh.k, n7.k, th.b, o8.g, xf.a, fj.a {
    public final int A;

    public b3(int i10) {
        this.A = i10;
    }

    public b3(Object obj, int i10) {
        this.A = i10;
    }

    public b3(String str, androidx.media3.common.g1 g1Var) {
        this.A = 0;
    }

    @Override
    public Object M(Task task) throws IOException {
        boolean z10;
        int i10;
        switch (this.A) {
            case 25:
                if (task.o()) {
                    oi.b bVar = (oi.b) task.k();
                    li.c cVar = li.c.f10296a;
                    cVar.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f11988b);
                    File file = bVar.f11989c;
                    z10 = true;
                    if (file.delete()) {
                        cVar.b("Deleted report file: " + file.getPath());
                    } else {
                        cVar.f("Crashlytics could not delete report file: " + file.getPath(), null);
                    }
                } else {
                    Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.j());
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case RuntimeVersion.MINOR:
                i10 = 403;
                break;
            case 27:
                i10 = -1;
                break;
            default:
                Bundle bundle = (Bundle) task.l();
                if (bundle == null) {
                    throw new IOException("SERVICE_NOT_AVAILABLE");
                }
                String string = bundle.getString("registration_id");
                if (string != null || (string = bundle.getString("unregistered")) != null) {
                    return string;
                }
                String string2 = bundle.getString("error");
                if ("RST".equals(string2)) {
                    throw new IOException("INSTANCE_ID_RESET");
                }
                if (string2 != null) {
                    throw new IOException(string2);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        return Integer.valueOf(i10);
    }

    @Override
    public mh.b a(th.o oVar) throws GeneralSecurityException {
        nh.j jVar;
        nh.j jVar2;
        switch (this.A) {
            case com.google.android.gms.common.api.k.REMOTE_EXCEPTION:
                if (!((String) oVar.B).equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
                }
                try {
                    yh.r rVarC = yh.r.C((com.google.crypto.tink.shaded.protobuf.i) oVar.D, com.google.crypto.tink.shaded.protobuf.p.a());
                    if (rVarC.A() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    nh.j jVar3 = nh.j.f11322e;
                    int size = rVarC.y().size();
                    if (size != 16 && size != 24 && size != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size)));
                    }
                    int iX = rVarC.z().x();
                    if (iX != 12 && iX != 16) {
                        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; acceptable values have 12 or 16 bytes", Integer.valueOf(iX)));
                    }
                    yh.q1 q1Var = (yh.q1) oVar.F;
                    int iOrdinal = q1Var.ordinal();
                    if (iOrdinal == 1) {
                        jVar3 = nh.j.f11320c;
                    } else if (iOrdinal == 2) {
                        jVar3 = nh.j.f11321d;
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + q1Var.getNumber());
                        }
                        jVar3 = nh.j.f11321d;
                    }
                    nh.k kVar = new nh.k(size, iX, 16, jVar3);
                    x0 x0Var = new x0((char) 0, 16);
                    x0Var.C = null;
                    x0Var.D = null;
                    x0Var.B = kVar;
                    x0Var.C = new me.i(ai.a.a(rVarC.y().h()), 6);
                    x0Var.D = (Integer) oVar.G;
                    return x0Var.a();
                } catch (InvalidProtocolBufferException unused) {
                    throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                }
            case com.google.android.gms.common.api.k.CONNECTION_SUSPENDED_DURING_CALL:
                if (!((String) oVar.B).equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
                }
                try {
                    yh.x xVarA = yh.x.A((com.google.crypto.tink.shaded.protobuf.i) oVar.D, com.google.crypto.tink.shaded.protobuf.p.a());
                    if (xVarA.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    nh.j jVar4 = nh.j.f11325h;
                    int size2 = xVarA.x().size();
                    if (size2 != 16 && size2 != 24 && size2 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(size2)));
                    }
                    yh.q1 q1Var2 = (yh.q1) oVar.F;
                    int iOrdinal2 = q1Var2.ordinal();
                    if (iOrdinal2 == 1) {
                        jVar4 = nh.j.f11323f;
                    } else if (iOrdinal2 == 2) {
                        jVar4 = nh.j.f11324g;
                    } else if (iOrdinal2 != 3) {
                        if (iOrdinal2 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + q1Var2.getNumber());
                        }
                        jVar4 = nh.j.f11324g;
                    }
                    nh.n nVar = new nh.n(size2, 12, 16, jVar4);
                    x0 x0Var2 = new x0((char) 0, 17);
                    x0Var2.C = null;
                    x0Var2.D = null;
                    x0Var2.B = nVar;
                    x0Var2.C = new me.i(ai.a.a(xVarA.x().h()), 6);
                    x0Var2.D = (Integer) oVar.G;
                    return x0Var2.b();
                } catch (InvalidProtocolBufferException unused2) {
                    throw new GeneralSecurityException("Parsing AesGcmKey failed");
                }
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                if (!((String) oVar.B).equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                }
                try {
                    yh.b0 b0VarA = yh.b0.A((com.google.crypto.tink.shaded.protobuf.i) oVar.D, com.google.crypto.tink.shaded.protobuf.p.a());
                    if (b0VarA.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    nh.j jVar5 = nh.j.f11328k;
                    int size3 = b0VarA.x().size();
                    if (size3 != 16 && size3 != 32) {
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(size3)));
                    }
                    yh.q1 q1Var3 = (yh.q1) oVar.F;
                    int iOrdinal3 = q1Var3.ordinal();
                    if (iOrdinal3 == 1) {
                        jVar5 = nh.j.f11326i;
                    } else if (iOrdinal3 == 2) {
                        jVar5 = nh.j.f11327j;
                    } else if (iOrdinal3 != 3) {
                        if (iOrdinal3 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + q1Var3.getNumber());
                        }
                        jVar5 = nh.j.f11327j;
                    }
                    nh.q qVar = new nh.q(size3, jVar5);
                    x0 x0Var3 = new x0((char) 0, 18);
                    x0Var3.C = null;
                    x0Var3.D = null;
                    x0Var3.B = qVar;
                    x0Var3.C = new me.i(ai.a.a(b0VarA.x().h()), 6);
                    x0Var3.D = (Integer) oVar.G;
                    return x0Var3.c();
                } catch (InvalidProtocolBufferException unused3) {
                    throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                }
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                if (!((String) oVar.B).equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    yh.j0 j0VarA = yh.j0.A((com.google.crypto.tink.shaded.protobuf.i) oVar.D, com.google.crypto.tink.shaded.protobuf.p.a());
                    if (j0VarA.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    yh.q1 q1Var4 = (yh.q1) oVar.F;
                    int iOrdinal4 = q1Var4.ordinal();
                    if (iOrdinal4 == 1) {
                        jVar = nh.j.l;
                    } else if (iOrdinal4 == 2) {
                        jVar = nh.j.m;
                    } else if (iOrdinal4 == 3) {
                        jVar = nh.j.f11329n;
                    } else {
                        if (iOrdinal4 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + q1Var4.getNumber());
                        }
                        jVar = nh.j.m;
                    }
                    return nh.s.a(jVar, new me.i(ai.a.a(j0VarA.x().h()), 6), (Integer) oVar.G);
                } catch (InvalidProtocolBufferException unused4) {
                    throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                }
            default:
                if (!((String) oVar.B).equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
                }
                try {
                    yh.t1 t1VarA = yh.t1.A((com.google.crypto.tink.shaded.protobuf.i) oVar.D, com.google.crypto.tink.shaded.protobuf.p.a());
                    if (t1VarA.y() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    yh.q1 q1Var5 = (yh.q1) oVar.F;
                    int iOrdinal5 = q1Var5.ordinal();
                    if (iOrdinal5 == 1) {
                        jVar2 = nh.j.f11330o;
                    } else if (iOrdinal5 == 2) {
                        jVar2 = nh.j.f11331p;
                    } else if (iOrdinal5 == 3) {
                        jVar2 = nh.j.f11332q;
                    } else {
                        if (iOrdinal5 != 4) {
                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + q1Var5.getNumber());
                        }
                        jVar2 = nh.j.f11331p;
                    }
                    return nh.w.a(jVar2, new me.i(ai.a.a(t1VarA.x().h()), 6), (Integer) oVar.G);
                } catch (InvalidProtocolBufferException unused5) {
                    throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                }
        }
    }

    @Override
    public void accept(Object obj) {
        v3 v3Var = (v3) obj;
        switch (this.A) {
            case 1:
                v3Var.decreaseDeviceVolume();
                break;
            case 2:
            case 3:
            default:
                v3Var.clearMediaItems();
                break;
            case 4:
                v3Var.stop();
                break;
            case 5:
                v3Var.unmute();
                break;
            case 6:
                v3Var.seekToDefaultPosition();
                break;
            case 7:
                v3Var.prepare();
                break;
        }
    }

    @Override
    public Object apply(Object obj) {
        return fh.t0.s(Integer.valueOf(((t7.h) obj).A));
    }

    @Override
    public void b(v3 v3Var, a2 a2Var, List list) {
        switch (this.A) {
            case 2:
                v3Var.addMediaItems(list);
                break;
            default:
                v3Var.addMediaItems(list);
                break;
        }
    }

    @Override
    public void cancel() {
    }

    @Override
    public Object d(s1 s1Var, a2 a2Var, int i10) {
        switch (this.A) {
            case 0:
                nv.p pVar = s1Var.f9417e;
                s1Var.F(a2Var);
                pVar.getClass();
                break;
            default:
                nv.p pVar2 = s1Var.f9417e;
                s1Var.F(a2Var);
                pVar2.getClass();
                break;
        }
        return b5.x(new d4(-6));
    }

    @Override
    public boolean g(int i10, int i11, int i12, int i13, int i14) {
        return false;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }

    @Override
    public void release() {
    }
}
