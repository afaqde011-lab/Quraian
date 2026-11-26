package a5;

import android.view.accessibility.AccessibilityNodeInfo;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import g00.b0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import ri.t1;

public final class f implements Serializer, zd.b {
    public Object A;

    public f(Object obj) {
        this.A = obj;
    }

    public static f a(boolean z10, int i10, int i11, int i12, int i13) {
        return new f(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, false, z10));
    }

    public Object get() {
        return this.A;
    }

    @Override
    public Object getDefaultValue() {
        return this.A;
    }

    @Override
    public Object readFrom(InputStream inputStream, k00.c cVar) throws CorruptionException {
        try {
            return yw.c.A.readFrom(new ByteArrayInputStream(wm.a.a(w50.c.a0(inputStream))), cVar);
        } catch (IllegalArgumentException e3) {
            throw new CorruptionException("Cannot decrypt proto.", e3);
        } catch (GeneralSecurityException e10) {
            throw new CorruptionException("Cannot decrypt proto.", e10);
        }
    }

    @Override
    public Object writeTo(Object obj, OutputStream outputStream, k00.c cVar) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, IOException {
        yw.a aVar;
        ByteArrayOutputStream byteArrayOutputStream;
        if (cVar instanceof yw.a) {
            aVar = (yw.a) cVar;
            int i10 = aVar.E;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.E = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new yw.a(this, cVar);
            }
        } else {
            aVar = new yw.a(this, cVar);
        }
        Object obj2 = aVar.C;
        b0 b0Var = l00.a.A;
        int i11 = aVar.E;
        b0 b0Var2 = b0.a;
        if (i11 == 0) {
            t1.O(obj2);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            yw.c cVar2 = yw.c.A;
            aVar.A = outputStream;
            aVar.B = byteArrayOutputStream2;
            aVar.E = 1;
            cVar2.writeTo(obj, byteArrayOutputStream2, aVar);
            if (b0Var2 == b0Var) {
                return b0Var;
            }
            byteArrayOutputStream = byteArrayOutputStream2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            byteArrayOutputStream = aVar.B;
            outputStream = aVar.A;
            t1.O(obj2);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kotlin.jvm.internal.m.d(byteArray, "toByteArray(...)");
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(1, wm.a.b());
        byte[] iv = cipher.getIV();
        byte[] bArrDoFinal = cipher.doFinal(byteArray);
        byte[] bArrP0 = h00.n.P0(wm.a.a, new byte[]{1});
        kotlin.jvm.internal.m.b(iv);
        byte[] bArrP1 = h00.n.P0(bArrP0, iv);
        kotlin.jvm.internal.m.b(bArrDoFinal);
        outputStream.write(h00.n.P0(bArrP1, bArrDoFinal));
        return b0Var2;
    }
}
