package o20;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

public abstract class c implements v {
    static {
        int i = h.b;
    }

    public final b b(ByteArrayInputStream byteArrayInputStream, h hVar) throws InvalidProtocolBufferException {
        b bVar;
        try {
            int i = byteArrayInputStream.read();
            if (i == -1) {
                bVar = null;
            } else {
                if ((i & 128) != 0) {
                    i &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 < 32) {
                            int i3 = byteArrayInputStream.read();
                            if (i3 == -1) {
                                throw InvalidProtocolBufferException.b();
                            }
                            i |= (i3 & 127) << i2;
                            if ((i3 & 128) == 0) {
                                break;
                            }
                            i2 += 7;
                        } else {
                            while (true) {
                                if (i2 >= 64) {
                                    throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
                                }
                                int i4 = byteArrayInputStream.read();
                                if (i4 == -1) {
                                    throw InvalidProtocolBufferException.b();
                                }
                                if ((i4 & 128) == 0) {
                                    break;
                                }
                                i2 += 7;
                            }
                        }
                    }
                }
                f fVar = new f(new a(byteArrayInputStream, i));
                bVar = (b) a(fVar, hVar);
                try {
                    fVar.a(0);
                } catch (InvalidProtocolBufferException e) {
                    e.A = bVar;
                    throw e;
                }
            }
            if (bVar == null || bVar.isInitialized()) {
                return bVar;
            }
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
            invalidProtocolBufferException.A = bVar;
            throw invalidProtocolBufferException;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }
}
