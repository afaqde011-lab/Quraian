package c3;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import javax.crypto.AEADBadTagException;

public abstract class b {

    public Object f2624a;

    public Object f2625b;

    public b() {
        this.f2625b = new int[2];
    }

    public b(Context context) {
        this.f2624a = context;
    }

    public b(k.b0 b0Var) {
        this.f2625b = b0Var;
    }

    public static byte[] l(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining % 16;
        int i11 = (i10 == 0 ? iRemaining : (iRemaining + 16) - i10) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i11 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i11);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public void c() {
        androidx.mediarouter.app.g gVar = (androidx.mediarouter.app.g) this.f2624a;
        if (gVar != null) {
            try {
                ((k.b0) this.f2625b).I.unregisterReceiver(gVar);
            } catch (IllegalArgumentException unused) {
            }
            this.f2624a = null;
        }
    }

    public abstract IntentFilter d();

    public byte[] e(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            byte[] bArr4 = new byte[32];
            ((androidx.datastore.preferences.protobuf.j) this.f2625b).a(0, bArr).get(bArr4);
            if (!MessageDigest.isEqual(a.a.o(bArr4, l(bArr2, byteBuffer)), bArr3)) {
                throw new GeneralSecurityException("invalid MAC");
            }
            byteBuffer.position(iPosition);
            androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f2624a;
            jVar.getClass();
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
            jVar.m(bArr, byteBufferAllocate, byteBuffer);
            return byteBufferAllocate.array();
        } catch (GeneralSecurityException e3) {
            throw new AEADBadTagException(e3.toString());
        }
    }

    public void f(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        if (byteBuffer.remaining() < bArr2.length + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBuffer.position();
        androidx.datastore.preferences.protobuf.j jVar = (androidx.datastore.preferences.protobuf.j) this.f2624a;
        jVar.getClass();
        if (byteBuffer.remaining() < bArr2.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        jVar.m(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr3 == null) {
            bArr3 = new byte[0];
        }
        ByteBuffer byteBufferA = ((androidx.datastore.preferences.protobuf.j) this.f2625b).a(0, bArr);
        byte[] bArr4 = new byte[32];
        byteBufferA.get(bArr4);
        byte[] bArrO = a.a.o(bArr4, l(bArr3, byteBuffer));
        byteBuffer.limit(byteBuffer.limit() + 16);
        byteBuffer.put(bArrO);
    }

    public abstract int[] g(int i10);

    public abstract int h();

    public MenuItem i(MenuItem menuItem) {
        if (!(menuItem instanceof s4.a)) {
            return menuItem;
        }
        s4.a aVar = (s4.a) menuItem;
        if (((u.s0) this.f2625b) == null) {
            this.f2625b = new u.s0(0);
        }
        MenuItem menuItem2 = (MenuItem) ((u.s0) this.f2625b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        o.s sVar = new o.s((Context) this.f2624a, aVar);
        ((u.s0) this.f2625b).put(aVar, sVar);
        return sVar;
    }

    public int[] j(int i10, int i11) {
        if (i10 < 0 || i11 < 0 || i10 == i11) {
            return null;
        }
        int[] iArr = (int[]) this.f2625b;
        iArr[0] = i10;
        iArr[1] = i11;
        return iArr;
    }

    public String k() {
        String str = (String) this.f2624a;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.m.k("text");
        throw null;
    }

    public abstract androidx.datastore.preferences.protobuf.j m(int i10, byte[] bArr);

    public abstract void n();

    public abstract int[] o(int i10);

    public abstract void p();

    public abstract void q(androidx.media3.common.q2 q2Var);

    public void r() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        if (((androidx.mediarouter.app.g) this.f2624a) == null) {
            this.f2624a = new androidx.mediarouter.app.g(this, 5);
        }
        ((k.b0) this.f2625b).I.registerReceiver((androidx.mediarouter.app.g) this.f2624a, intentFilterD);
    }
}
