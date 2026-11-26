package nh;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

public final class w extends b {
    public static w a(j jVar, me.i iVar, Integer num) throws GeneralSecurityException {
        ai.a aVar = (ai.a) iVar.B;
        j jVar2 = j.f11332q;
        if (jVar != jVar2 && num == null) {
            throw new GeneralSecurityException("For given Variant " + jVar + " the value of idRequirement must be non-null");
        }
        if (jVar == jVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (aVar.f486a.length != 32) {
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + aVar.f486a.length);
        }
        if (jVar == jVar2) {
            ai.a.a(new byte[0]);
        } else if (jVar == j.f11331p) {
            ai.a.a(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (jVar != j.f11330o) {
                throw new IllegalStateException("Unknown Variant: " + jVar);
            }
            ai.a.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
        }
        return new w();
    }
}
