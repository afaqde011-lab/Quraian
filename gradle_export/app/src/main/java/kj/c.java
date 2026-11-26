package kj;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import bi.g;
import bi.i;
import com.google.protobuf.RuntimeVersion;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

public final class c {

    public static final String[] f9699c = {"*", "FCM", "GCM", RuntimeVersion.SUFFIX};

    public final SharedPreferences f9700a;

    public final String f9701b;

    public c(g gVar) {
        gVar.a();
        this.f9700a = gVar.f2531a.getSharedPreferences("com.google.android.gms.appid", 0);
        gVar.a();
        i iVar = gVar.f2533c;
        String str = iVar.f2545e;
        if (str == null) {
            gVar.a();
            str = iVar.f2542b;
            if (str.startsWith("1:") || str.startsWith("2:")) {
                String[] strArrSplit = str.split(":");
                if (strArrSplit.length != 4) {
                    str = null;
                } else {
                    str = strArrSplit[1];
                    if (str.isEmpty()) {
                        str = null;
                    }
                }
            }
        }
        this.f9701b = str;
    }

    public final String a() {
        PublicKey publicKeyGeneratePublic;
        synchronized (this.f9700a) {
            String strEncodeToString = null;
            String string = this.f9700a.getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKeyGeneratePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e3) {
                Log.w("ContentValues", "Invalid key stored " + e3);
                publicKeyGeneratePublic = null;
            }
            if (publicKeyGeneratePublic == null) {
                return null;
            }
            try {
                byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKeyGeneratePublic.getEncoded());
                bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
                strEncodeToString = Base64.encodeToString(bArrDigest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return strEncodeToString;
        }
    }
}
