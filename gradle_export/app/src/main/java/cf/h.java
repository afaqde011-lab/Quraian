package cf;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.internal.fido.zzhj;
import com.google.android.gms.internal.fido.zzho;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import k9.x0;
import nf.a1;
import nf.b1;
import nf.c1;
import nf.e1;
import nf.t0;
import nf.u0;
import nf.y0;
import nf.z0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ri.t1;

public final class h extends j {
    public static final Parcelable.Creator<h> CREATOR = new k0(16);
    public final u0 A;
    public final u0 B;
    public final u0 C;
    public final String[] D;

    public h(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        com.google.android.gms.common.internal.d0.h(bArr);
        u0 u0VarL = u0.l(bArr.length, bArr);
        com.google.android.gms.common.internal.d0.h(bArr2);
        u0 u0VarL2 = u0.l(bArr2.length, bArr2);
        com.google.android.gms.common.internal.d0.h(bArr3);
        u0 u0VarL3 = u0.l(bArr3.length, bArr3);
        this.A = u0VarL;
        this.B = u0VarL2;
        this.C = u0VarL3;
        com.google.android.gms.common.internal.d0.h(strArr);
        this.D = strArr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return com.google.android.gms.common.internal.d0.k(this.A, hVar.A) && com.google.android.gms.common.internal.d0.k(this.B, hVar.B) && com.google.android.gms.common.internal.d0.k(this.C, hVar.C);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(new Object[]{this.A})), Integer.valueOf(Arrays.hashCode(new Object[]{this.B})), Integer.valueOf(Arrays.hashCode(new Object[]{this.C}))});
    }

    public final String toString() {
        x0 x0Var = new x0(getClass().getSimpleName());
        nf.m0 m0Var = nf.o0.f11248d;
        byte[] bArrM = this.A.m();
        x0Var.S(m0Var.c(bArrM.length, bArrM), "keyHandle");
        byte[] bArrM2 = this.B.m();
        x0Var.S(m0Var.c(bArrM2.length, bArrM2), "clientDataJSON");
        byte[] bArrM3 = this.C.m();
        x0Var.S(m0Var.c(bArrM3.length, bArrM3), "attestationObject");
        x0Var.S(Arrays.toString(this.D), "transports");
        return x0Var.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        t1.U(parcel, 2, this.A.m());
        t1.U(parcel, 3, this.B.m());
        t1.U(parcel, 4, this.C.m());
        String[] strArr = this.D;
        if (strArr != null) {
            int iG1 = t1.g0(5, parcel);
            parcel.writeStringArray(strArr);
            t1.h0(iG1, parcel);
        }
        t1.h0(iG0, parcel);
    }

    public final JSONObject zza() {
        c1 c1Var;
        byte[] bArrJ;
        String[] strArr = this.D;
        try {
            JSONObject jSONObject = new JSONObject();
            u0 u0Var = this.B;
            if (u0Var != null) {
                jSONObject.put("clientDataJSON", ve.c.c(u0Var.m()));
            }
            u0 u0Var2 = this.C;
            if (u0Var2 != null) {
                jSONObject.put("attestationObject", ve.c.c(u0Var2.m()));
            }
            JSONArray jSONArray = new JSONArray();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                if (strArr[i10].equals("cable")) {
                    jSONArray.put(i10, "hybrid");
                } else {
                    jSONArray.put(i10, strArr[i10]);
                }
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    c1 c1Var2 = (c1) ((a1) c1.e(u0Var2.m()).c(a1.class)).B.get(new b1("authData"));
                    if (c1Var2 == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    u0 u0Var3 = ((y0) c1Var2.c(y0.class)).A;
                    byte[] bArr = u0Var3.B;
                    ByteBuffer byteBufferAsReadOnlyBuffer = ByteBuffer.wrap(bArr, 0, u0Var3.e()).asReadOnlyBuffer();
                    try {
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 32);
                        if ((byteBufferAsReadOnlyBuffer.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 4);
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + 16);
                        byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + byteBufferAsReadOnlyBuffer.getShort());
                        try {
                            int iPosition = byteBufferAsReadOnlyBuffer.position();
                            int iK = u0.k(iPosition, bArr.length, u0Var3.e());
                            e1 e1Var = new e1((iK == 0 ? u0.C : new t0(bArr, iPosition, iK)).i());
                            try {
                                c1 c1VarK = nf.b.k(e1Var);
                                try {
                                    e1Var.close();
                                } catch (IOException unused) {
                                }
                                nf.t tVar = ((a1) c1VarK.c(a1.class)).B;
                                c1 c1Var3 = (c1) tVar.get(new z0(3L));
                                c1 c1Var4 = (c1) tVar.get(new z0(1L));
                                if (c1Var3 == null || c1Var4 == null) {
                                    throw new IllegalArgumentException("COSE key missing required fields");
                                }
                                try {
                                    long j9 = ((z0) c1Var3.c(z0.class)).A;
                                    long j10 = ((z0) c1Var4.c(z0.class)).A;
                                    if (j10 == 1) {
                                        c1Var = (c1) tVar.get(new z0(-1L));
                                        if (c1Var != null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        long j11 = ((z0) c1Var.c(z0.class)).A;
                                        if (j10 != 2 && j11 == 1) {
                                            c1 c1Var5 = (c1) tVar.get(new z0(-2L));
                                            c1 c1Var6 = (c1) tVar.get(new z0(-3L));
                                            if (c1Var5 == null || c1Var6 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            u0 u0Var4 = ((y0) c1Var5.c(y0.class)).A;
                                            u0 u0Var5 = ((y0) c1Var6.c(y0.class)).A;
                                            if (u0Var4.B.length != 32 || u0Var5.B.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArrJ = nf.b.j(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), u0Var4.m(), u0Var5.m());
                                        } else if (j10 == 1 || j11 != 6) {
                                            bArrJ = null;
                                        } else {
                                            c1 c1Var7 = (c1) tVar.get(new z0(-2L));
                                            if (c1Var7 == null) {
                                                throw new IllegalArgumentException("COSE key missing required fields");
                                            }
                                            u0 u0Var6 = ((y0) c1Var7.c(y0.class)).A;
                                            if (u0Var6.B.length != 32) {
                                                throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                            }
                                            bArrJ = nf.b.j(Base64.decode("MCowBQYDK2VwAyEA", 0), u0Var6.m());
                                        }
                                    } else if (j10 == 2) {
                                        j10 = 2;
                                        c1Var = (c1) tVar.get(new z0(-1L));
                                        if (c1Var != null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        long j12 = ((z0) c1Var.c(z0.class)).A;
                                        if (j10 != 2) {
                                            if (j10 == 1) {
                                                bArrJ = null;
                                            } else {
                                                bArrJ = null;
                                            }
                                        } else if (j10 == 1) {
                                            bArrJ = null;
                                        } else {
                                            bArrJ = null;
                                        }
                                    } else {
                                        bArrJ = null;
                                    }
                                    jSONObject.put("authenticatorData", ve.c.c(u0Var3.m()));
                                    jSONObject.put("publicKeyAlgorithm", j9);
                                    if (bArrJ != null) {
                                        jSONObject.put("publicKey", Base64.encodeToString(bArrJ, 11));
                                    }
                                    return jSONObject;
                                } catch (zzho e3) {
                                    throw new IllegalArgumentException("COSE key ill-formed", e3);
                                }
                            } catch (Throwable th2) {
                                try {
                                    e1Var.close();
                                } catch (IOException unused2) {
                                }
                                throw th2;
                            }
                        } catch (zzhj | zzho e10) {
                            throw new IllegalArgumentException("failed to parse COSE key", e10);
                        }
                    } catch (IllegalArgumentException e11) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e11);
                    }
                } catch (zzho e12) {
                    throw new IllegalArgumentException("authData value has wrong type", e12);
                }
            } catch (zzhj | zzho e13) {
                throw new IllegalArgumentException("failed to parse attestation object", e13);
            }
        } catch (JSONException e14) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e14);
        }
    }
}
