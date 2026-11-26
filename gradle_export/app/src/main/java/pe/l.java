package pe;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.s0;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public abstract class l extends bh.a implements s0 {

    public final int f12507f;

    public l(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData", 5);
        d0.b(bArr.length == 25);
        this.f12507f = Arrays.hashCode(bArr);
    }

    public static byte[] l2(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e3) {
            throw new AssertionError(e3);
        }
    }

    public final boolean equals(Object obj) {
        ye.a aVarZzd;
        if (obj instanceof s0) {
            try {
                s0 s0Var = (s0) obj;
                if (s0Var.zze() == this.f12507f && (aVarZzd = s0Var.zzd()) != null) {
                    return Arrays.equals(k2(), (byte[]) ye.b.l2(aVarZzd));
                }
            } catch (RemoteException e3) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f12507f;
    }

    @Override
    public final boolean j2(int i10, Parcel parcel, Parcel parcel2) {
        if (i10 == 1) {
            ye.a aVarZzd = zzd();
            parcel2.writeNoException();
            mf.g.b(parcel2, aVarZzd);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f12507f);
        return true;
    }

    public abstract byte[] k2();

    @Override
    public final ye.a zzd() {
        return new ye.b(k2());
    }

    @Override
    public final int zze() {
        return this.f12507f;
    }
}
