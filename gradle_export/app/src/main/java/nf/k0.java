package nf;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class k0 extends b implements Serializable {
    public final MessageDigest E;
    public final int F;
    public final boolean G;
    public final String H;

    public k0() {
        boolean z10;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.E = messageDigest;
            this.F = messageDigest.getDigestLength();
            this.H = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z10 = true;
            } catch (CloneNotSupportedException unused) {
                z10 = false;
            }
            this.G = z10;
        } catch (NoSuchAlgorithmException e3) {
            throw new AssertionError(e3);
        }
    }

    public final String toString() {
        return this.H;
    }
}
