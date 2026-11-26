package nh;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import yh.a1;

public final class v implements mh.a {

    public static final byte[] f11361c = new byte[0];

    public final a1 f11362a;

    public final sh.b f11363b;

    public v(a1 a1Var, sh.b bVar) {
        this.f11362a = a1Var;
        this.f11363b = bVar;
    }

    @Override
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        com.google.crypto.tink.shaded.protobuf.a aVarD0;
        a1 a1Var = this.f11362a;
        AtomicReference atomicReference = mh.m.f10922a;
        synchronized (mh.m.class) {
            try {
                a30.x xVar = ((mh.e) mh.m.f10922a.get()).a(a1Var.A()).f10904a;
                Class cls = (Class) xVar.D;
                if (!((Map) xVar.C).keySet().contains(cls) && !Void.class.equals(cls)) {
                    throw new IllegalArgumentException("Given internalKeyMananger " + xVar.toString() + " does not support primitive class " + cls.getName());
                }
                if (!((Boolean) mh.m.f10924c.get(a1Var.A())).booleanValue()) {
                    throw new GeneralSecurityException("newKey-operation not permitted for key type " + a1Var.A());
                }
                com.google.crypto.tink.shaded.protobuf.i iVarB = a1Var.B();
                try {
                    f5.c cVarM = xVar.m();
                    com.google.crypto.tink.shaded.protobuf.a aVarO0 = cVarM.O0(iVarB);
                    cVarM.U0(aVarO0);
                    aVarD0 = cVarM.D0(aVarO0);
                } catch (InvalidProtocolBufferException e3) {
                    throw new GeneralSecurityException("Failures parsing proto of type ".concat(((Class) xVar.m().B).getName()), e3);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        byte[] bArrD = aVarD0.d();
        byte[] bArrA = this.f11363b.a(bArrD, f11361c);
        byte[] bArrA2 = ((mh.a) mh.m.d(this.f11362a.A(), bArrD)).a(bArr, bArr2);
        return ByteBuffer.allocate(bArrA.length + 4 + bArrA2.length).putInt(bArrA.length).put(bArrA).put(bArrA2).array();
    }

    @Override
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            int i10 = byteBufferWrap.getInt();
            if (i10 <= 0 || i10 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i10];
            byteBufferWrap.get(bArr3, 0, i10);
            byte[] bArr4 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr4, 0, byteBufferWrap.remaining());
            return ((mh.a) mh.m.d(this.f11362a.A(), this.f11363b.b(bArr3, f11361c))).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e3) {
            throw new GeneralSecurityException("invalid ciphertext", e3);
        }
    }
}
