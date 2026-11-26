package cf;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import ri.t1;

public final class j0 extends re.a {
    public final byte[][] A;
    public static final Parcelable.Creator<j0> CREATOR = new ah.c(23);
    public static final byte[] B = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);

    public j0(byte[][] bArr) {
        com.google.android.gms.common.internal.d0.b(bArr != null);
        com.google.android.gms.common.internal.d0.b(1 == ((bArr.length & 1) ^ 1));
        int i10 = 0;
        while (i10 < bArr.length) {
            com.google.android.gms.common.internal.d0.b(i10 == 0 || bArr[i10] != null);
            int i11 = i10 + 1;
            com.google.android.gms.common.internal.d0.b(bArr[i11] != null);
            int length = bArr[i11].length;
            com.google.android.gms.common.internal.d0.b(length == 32 || length == 64);
            i10 += 2;
        }
        this.A = bArr;
    }

    public static j0 a(JSONObject jSONObject, boolean z10) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            if (jSONObject.has("eval")) {
                arrayList.add(null);
                if (z10) {
                    arrayList.add(e(jSONObject.getJSONObject("eval")));
                } else {
                    arrayList.add(h(jSONObject.getJSONObject("eval")));
                }
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    arrayList.add(ve.c.b(next));
                    if (z10) {
                        arrayList.add(e(jSONObject2.getJSONObject(next)));
                    } else {
                        arrayList.add(h(jSONObject2.getJSONObject(next)));
                    }
                }
            }
            return new j0((byte[][]) arrayList.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static JSONObject b(byte[] bArr) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (bArr.length == 32) {
            jSONObject.put("first", Base64.encodeToString(bArr, 11));
            return jSONObject;
        }
        jSONObject.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        jSONObject.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return jSONObject;
    }

    public static byte[] c(byte[] bArr) {
        c7.g gVar;
        nf.g0 g0Var;
        int i10 = nf.j0.f11234a;
        nf.k0 k0Var = nf.i0.f11231a;
        int i11 = k0Var.F;
        MessageDigest messageDigest = k0Var.E;
        if (k0Var.G) {
            try {
                gVar = new c7.g((MessageDigest) messageDigest.clone(), i11);
            } catch (CloneNotSupportedException unused) {
                try {
                    gVar = new c7.g(MessageDigest.getInstance(messageDigest.getAlgorithm()), i11);
                } catch (NoSuchAlgorithmException e3) {
                    throw new AssertionError(e3);
                }
            }
        } else {
            gVar = new c7.g(MessageDigest.getInstance(messageDigest.getAlgorithm()), i11);
        }
        MessageDigest messageDigest2 = (MessageDigest) gVar.f2906c;
        byte[] bArr2 = B;
        bArr2.getClass();
        int length = bArr2.length;
        if (gVar.f2905b) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        messageDigest2.update(bArr2, 0, length);
        bArr.getClass();
        int length2 = bArr.length;
        if (gVar.f2905b) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        messageDigest2.update(bArr, 0, length2);
        if (gVar.f2905b) {
            throw new IllegalStateException("Cannot re-use a Hasher after calling hash() on it");
        }
        gVar.f2905b = true;
        int i12 = gVar.f2904a;
        if (i12 == messageDigest2.getDigestLength()) {
            byte[] bArrDigest = messageDigest2.digest();
            char[] cArr = nf.h0.A;
            g0Var = new nf.g0(bArrDigest);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(messageDigest2.digest(), i12);
            char[] cArr2 = nf.h0.A;
            g0Var = new nf.g0(bArrCopyOf);
        }
        return (byte[]) g0Var.B.clone();
    }

    public static byte[] e(JSONObject jSONObject) throws JSONException {
        byte[] bArrB = ve.c.b(jSONObject.getString("first"));
        if (bArrB.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        }
        if (!jSONObject.has("second")) {
            return bArrB;
        }
        byte[] bArrB2 = ve.c.b(jSONObject.getString("second"));
        if (bArrB2.length == 32) {
            return nf.b.j(bArrB, bArrB2);
        }
        throw new JSONException("hashed PRF value with wrong length");
    }

    public static byte[] h(JSONObject jSONObject) {
        byte[] bArrC = c(ve.c.b(jSONObject.getString("first")));
        return !jSONObject.has("second") ? bArrC : nf.b.j(bArrC, c(ve.c.b(jSONObject.getString("second"))));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j0) {
            return Arrays.deepEquals(this.A, ((j0) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (byte[] bArr : this.A) {
            if (bArr != null) {
                iHashCode ^= Arrays.hashCode(new Object[]{bArr});
            }
        }
        return iHashCode;
    }

    public final String toString() {
        byte[][] bArr = this.A;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = null;
            for (int i10 = 0; i10 < bArr.length; i10 += 2) {
                if (bArr[i10] == null) {
                    jSONObject.put("eval", b(bArr[i10 + 1]));
                } else {
                    if (jSONObject2 == null) {
                        jSONObject2 = new JSONObject();
                        jSONObject.put("evalByCredential", jSONObject2);
                    }
                    jSONObject2.put(ve.c.c(bArr[i10]), b(bArr[i10 + 1]));
                }
            }
            return "PrfExtension{" + jSONObject.toString() + "}";
        } catch (JSONException e3) {
            return a1.b.p("PrfExtension{Exception:", e3.getMessage(), "}");
        }
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iG0 = t1.g0(20293, parcel);
        byte[][] bArr = this.A;
        if (bArr != null) {
            int iG1 = t1.g0(1, parcel);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            t1.h0(iG1, parcel);
        }
        t1.h0(iG0, parcel);
    }
}
