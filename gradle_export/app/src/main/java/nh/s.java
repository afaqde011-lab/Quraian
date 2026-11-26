package nh;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class s extends b {
    public static s a(j jVar, me.i iVar, Integer num) throws GeneralSecurityException {
        ai.a aVar = (ai.a) iVar.B;
        j jVar2 = j.f11329n;
        if (jVar != jVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + jVar + " the value of idRequirement must be non-null");
        }
        if (jVar == jVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (aVar.f486a.length != 32) {
            throw new GeneralSecurityException("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aVar.f486a.length);
        }
        if (jVar == jVar2) {
            ai.a.a(new byte[0]);
        } else if (jVar == j.m) {
            ai.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (jVar != j.l) {
                throw new IllegalStateException("Unknown Variant: " + jVar);
            }
            ai.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new s();
    }
}
