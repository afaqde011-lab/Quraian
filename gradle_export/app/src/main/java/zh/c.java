package zh;

import c3.s0;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.Cipher;

public final class c implements mh.a {

    public final int f17463a;

    public final Object f17464b;

    public c(int i10, byte[] bArr) throws GeneralSecurityException {
        this.f17463a = i10;
        switch (i10) {
            case 1:
                this.f17464b = new oh.d(0, bArr);
                return;
            case 2:
                this.f17464b = new oh.d(1, bArr);
                return;
            default:
                if (!oi.k.b(2)) {
                    throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
                }
                this.f17464b = new oh.b(bArr);
                return;
        }
    }

    @Override
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f17463a) {
            case 0:
                byte[] bArrA = t.a(12);
                oh.b bVar = (oh.b) this.f17464b;
                boolean z10 = bVar.f11976b;
                if (bArrA.length != 12) {
                    throw new GeneralSecurityException("iv is wrong size");
                }
                if (bArr.length > 2147483619) {
                    throw new GeneralSecurityException("plaintext too long");
                }
                byte[] bArr3 = new byte[z10 ? bArr.length + 28 : bArr.length + 16];
                if (z10) {
                    System.arraycopy(bArrA, 0, bArr3, 0, 12);
                }
                AlgorithmParameterSpec algorithmParameterSpecA = oh.b.a(bArrA);
                s0 s0Var = oh.b.f11974c;
                ((Cipher) s0Var.get()).init(1, bVar.f11975a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) s0Var.get()).updateAAD(bArr2);
                }
                int iDoFinal = ((Cipher) s0Var.get()).doFinal(bArr, 0, bArr.length, bArr3, z10 ? 12 : 0);
                if (iDoFinal == bArr.length + 16) {
                    return bArr3;
                }
                throw new GeneralSecurityException(g4.c.i("encryption failed; GCM tag must be 16 bytes, but got only ", iDoFinal - bArr.length, " bytes"));
            case 1:
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bArr.length + 28);
                byte[] bArrA2 = t.a(12);
                byteBufferAllocate.put(bArrA2);
                ((oh.d) this.f17464b).f(byteBufferAllocate, bArrA2, bArr, bArr2);
                return byteBufferAllocate.array();
            default:
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(bArr.length + 40);
                byte[] bArrA3 = t.a(24);
                byteBufferAllocate2.put(bArrA3);
                ((oh.d) this.f17464b).f(byteBufferAllocate2, bArrA3, bArr, bArr2);
                return byteBufferAllocate2.array();
        }
    }

    @Override
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        switch (this.f17463a) {
            case 0:
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 12);
                oh.b bVar = (oh.b) this.f17464b;
                boolean z10 = bVar.f11976b;
                if (bArrCopyOf.length != 12) {
                    throw new GeneralSecurityException("iv is wrong size");
                }
                if (bArr.length < (z10 ? 28 : 16)) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                if (z10 && !ByteBuffer.wrap(bArrCopyOf).equals(ByteBuffer.wrap(bArr, 0, 12))) {
                    throw new GeneralSecurityException("iv does not match prepended iv");
                }
                AlgorithmParameterSpec algorithmParameterSpecA = oh.b.a(bArrCopyOf);
                s0 s0Var = oh.b.f11974c;
                ((Cipher) s0Var.get()).init(2, bVar.f11975a, algorithmParameterSpecA);
                if (bArr2 != null && bArr2.length != 0) {
                    ((Cipher) s0Var.get()).updateAAD(bArr2);
                }
                int i10 = z10 ? 12 : 0;
                int length = bArr.length;
                if (z10) {
                    length -= 12;
                }
                return ((Cipher) s0Var.get()).doFinal(bArr, i10, length);
            case 1:
                if (bArr.length < 28) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((oh.d) this.f17464b).e(ByteBuffer.wrap(bArr, 12, bArr.length - 12), Arrays.copyOf(bArr, 12), bArr2);
            default:
                if (bArr.length < 40) {
                    throw new GeneralSecurityException("ciphertext too short");
                }
                return ((oh.d) this.f17464b).e(ByteBuffer.wrap(bArr, 24, bArr.length - 24), Arrays.copyOf(bArr, 24), bArr2);
        }
    }
}
