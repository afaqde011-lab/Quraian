package zh;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import sd.p1;

public final class d implements mh.c {

    public static final List f17465c = Arrays.asList(64);

    public static final byte[] f17466d = new byte[16];

    public static final byte[] f17467e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};

    public final p1 f17468a;

    public final byte[] f17469b;

    public d(byte[] bArr) throws GeneralSecurityException {
        if (!oi.k.a(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        if (!f17465c.contains(Integer.valueOf(bArr.length))) {
            throw new InvalidKeyException(g4.c.g(bArr.length, " bytes; key must have 64 bytes", new StringBuilder("invalid key size: ")));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
        this.f17469b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
        this.f17468a = new p1(bArrCopyOfRange);
    }

    @Override
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipher = (Cipher) o.f17495b.f17498a.d("AES/CTR/NoPadding");
        byte[] bArrC = c(bArr2, bArr);
        byte[] bArr3 = (byte[]) bArrC.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(1, new SecretKeySpec(this.f17469b, "AES"), new IvParameterSpec(bArr3));
        return i.c(bArrC, cipher.doFinal(bArr));
    }

    @Override
    public final byte[] b(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) o.f17495b.f17498a.d("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(2, new SecretKeySpec(this.f17469b, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && "The Android Project".equals(System.getProperty("java.vendor"))) {
            bArrDoFinal = new byte[0];
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, c(bArr2, bArrDoFinal))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }

    public final byte[] c(byte[]... bArr) throws GeneralSecurityException {
        byte[] bArrT;
        int length = bArr.length;
        p1 p1Var = this.f17468a;
        if (length == 0) {
            return p1Var.c(16, f17467e);
        }
        byte[] bArrC = p1Var.c(16, f17466d);
        for (int i10 = 0; i10 < bArr.length - 1; i10++) {
            byte[] bArr2 = bArr[i10];
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            bArrC = i.t(bi.b.y(bArrC), p1Var.c(16, bArr2));
        }
        byte[] bArr3 = bArr[bArr.length - 1];
        if (bArr3.length >= 16) {
            if (bArr3.length < bArrC.length) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int length2 = bArr3.length - bArrC.length;
            bArrT = Arrays.copyOf(bArr3, bArr3.length);
            for (int i11 = 0; i11 < bArrC.length; i11++) {
                int i12 = length2 + i11;
                bArrT[i12] = (byte) (bArrT[i12] ^ bArrC[i11]);
            }
        } else {
            if (bArr3.length >= 16) {
                throw new IllegalArgumentException("x must be smaller than a block.");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr3, 16);
            bArrCopyOf[bArr3.length] = -128;
            bArrT = i.t(bArrCopyOf, bi.b.y(bArrC));
        }
        return p1Var.c(16, bArrT);
    }
}
