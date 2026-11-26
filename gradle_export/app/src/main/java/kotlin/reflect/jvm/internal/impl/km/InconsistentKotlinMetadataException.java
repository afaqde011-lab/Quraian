package kotlin.reflect.jvm.internal.impl.km;

import kotlin.jvm.internal.m;

public final class InconsistentKotlinMetadataException extends IllegalArgumentException {
    public InconsistentKotlinMetadataException(String message, int i) {
        super(message, null);
        m.e(message, "message");
    }
}
