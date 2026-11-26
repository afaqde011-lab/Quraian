package oh;

import androidx.datastore.preferences.protobuf.j;
import java.security.InvalidKeyException;
import java.util.Arrays;

public final class c extends j {

    public final int f11977c;

    public c(byte[] bArr, int i10, int i11) throws InvalidKeyException {
        this.f11977c = i11;
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f632b = a.c(bArr);
        this.f631a = i10;
    }

    @Override
    public final int[] c(int[] iArr, int i10) {
        switch (this.f11977c) {
            case 0:
                if (iArr.length != 3) {
                    throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr2 = new int[16];
                int[] iArr3 = (int[]) this.f632b;
                int[] iArr4 = a.f11973a;
                System.arraycopy(iArr4, 0, iArr2, 0, iArr4.length);
                System.arraycopy(iArr3, 0, iArr2, iArr4.length, 8);
                iArr2[12] = i10;
                System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
                return iArr2;
            default:
                if (iArr.length != 6) {
                    throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
                }
                int[] iArr5 = new int[16];
                int[] iArr6 = (int[]) this.f632b;
                int[] iArr7 = new int[16];
                int[] iArr8 = a.f11973a;
                System.arraycopy(iArr8, 0, iArr7, 0, iArr8.length);
                System.arraycopy(iArr6, 0, iArr7, iArr8.length, 8);
                iArr7[12] = iArr[0];
                iArr7[13] = iArr[1];
                iArr7[14] = iArr[2];
                iArr7[15] = iArr[3];
                a.b(iArr7);
                iArr7[4] = iArr7[12];
                iArr7[5] = iArr7[13];
                iArr7[6] = iArr7[14];
                iArr7[7] = iArr7[15];
                int[] iArrCopyOf = Arrays.copyOf(iArr7, 8);
                System.arraycopy(iArr8, 0, iArr5, 0, iArr8.length);
                System.arraycopy(iArrCopyOf, 0, iArr5, iArr8.length, 8);
                iArr5[12] = i10;
                iArr5[13] = 0;
                iArr5[14] = iArr[4];
                iArr5[15] = iArr[5];
                return iArr5;
        }
    }

    @Override
    public final int k() {
        switch (this.f11977c) {
            case 0:
                return 12;
            default:
                return 24;
        }
    }
}
