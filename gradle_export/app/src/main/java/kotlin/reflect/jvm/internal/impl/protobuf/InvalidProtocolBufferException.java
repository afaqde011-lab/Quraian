package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import o20.b;
import o20.l;

public class InvalidProtocolBufferException extends IOException {
    public b A;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.A = null;
    }

    public static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public final void a(l lVar) {
        this.A = lVar;
    }
}
