package zh;

import c3.s0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class b implements mh.a {

    public static final s0 f17457e = new s0(13);

    public static final s0 f17458f = new s0(14);

    public final byte[] f17459a;

    public final byte[] f17460b;

    public final SecretKeySpec f17461c;

    public final int f17462d;

    public b(int i10, byte[] bArr) throws GeneralSecurityException {
        if (!oi.k.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i10 != 12 && i10 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f17462d = i10;
        u.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f17461c = secretKeySpec;
        Cipher cipher = (Cipher) f17457e.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrC = c(cipher.doFinal(new byte[16]));
        this.f17459a = bArrC;
        this.f17460b = c(bArrC);
    }

    public static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i10 = 0;
        while (i10 < 15) {
            int i11 = i10 + 1;
            bArr2[i10] = (byte) (((bArr[i10] << 1) ^ ((bArr[i11] & 255) >>> 7)) & 255);
            i10 = i11;
        }
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (bArr[15] << 1));
        return bArr2;
    }

    public static byte[] e(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10]);
        }
        return bArr3;
    }

    @Override
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f17462d;
        if (length > 2147483631 - i10) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[bArr.length + i10 + 16];
        byte[] bArrA = t.a(i10);
        System.arraycopy(bArrA, 0, bArr3, 0, i10);
        Cipher cipher = (Cipher) f17457e.get();
        SecretKeySpec secretKeySpec = this.f17461c;
        cipher.init(1, secretKeySpec);
        byte[] bArrD = d(cipher, 0, bArrA, 0, bArrA.length);
        byte[] bArr4 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrD2 = d(cipher, 1, bArr4, 0, bArr4.length);
        Cipher cipher2 = (Cipher) f17458f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrD));
        cipher2.doFinal(bArr, 0, bArr.length, bArr3, this.f17462d);
        byte[] bArrD3 = d(cipher, 2, bArr3, this.f17462d, bArr.length);
        int length2 = bArr.length + i10;
        for (int i11 = 0; i11 < 16; i11++) {
            bArr3[length2 + i11] = (byte) ((bArrD2[i11] ^ bArrD[i11]) ^ bArrD3[i11]);
        }
        return bArr3;
    }

    @Override
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i10 = this.f17462d;
        int i11 = (length - i10) - 16;
        if (i11 < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) f17457e.get();
        SecretKeySpec secretKeySpec = this.f17461c;
        cipher.init(1, secretKeySpec);
        byte[] bArrD = d(cipher, 0, bArr, 0, this.f17462d);
        byte[] bArr3 = bArr2 == null ? new byte[0] : bArr2;
        byte[] bArrD2 = d(cipher, 1, bArr3, 0, bArr3.length);
        byte[] bArrD3 = d(cipher, 2, bArr, this.f17462d, i11);
        int length2 = bArr.length - 16;
        byte b7 = 0;
        for (int i12 = 0; i12 < 16; i12++) {
            b7 = (byte) (b7 | (((bArr[length2 + i12] ^ bArrD2[i12]) ^ bArrD[i12]) ^ bArrD3[i12]));
        }
        if (b7 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) f17458f.get();
        cipher2.init(1, secretKeySpec, new IvParameterSpec(bArrD));
        return cipher2.doFinal(bArr, i10, i11);
    }

    public final byte[] d(Cipher cipher, int i10, byte[] bArr, int i11, int i12) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArrCopyOf;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i10;
        byte[] bArr3 = this.f17459a;
        if (i12 == 0) {
            return cipher.doFinal(e(bArr2, bArr3));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i13 = 0;
        while (i12 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                bArrDoFinal[i14] = (byte) (bArrDoFinal[i14] ^ bArr[(i11 + i13) + i14]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i13 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i13 + i11, i11 + i12);
        if (bArrCopyOfRange.length == 16) {
            bArrCopyOf = e(bArrCopyOfRange, bArr3);
        } else {
            bArrCopyOf = Arrays.copyOf(this.f17460b, 16);
            for (int i15 = 0; i15 < bArrCopyOfRange.length; i15++) {
                bArrCopyOf[i15] = (byte) (bArrCopyOf[i15] ^ bArrCopyOfRange[i15]);
            }
            bArrCopyOf[bArrCopyOfRange.length] = (byte) (bArrCopyOf[bArrCopyOfRange.length] ^ 128);
        }
        return cipher.doFinal(e(bArrDoFinal, bArrCopyOf));
    }
}
