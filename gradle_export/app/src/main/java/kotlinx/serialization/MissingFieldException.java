package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/serialization/MissingFieldException;", "Lkotlinx/serialization/SerializationException;", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MissingFieldException extends SerializationException {
    public final List A;

    public MissingFieldException(List missingFields, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        m.e(missingFields, "missingFields");
        this.A = missingFields;
    }
}
