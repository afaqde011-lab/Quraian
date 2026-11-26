package uw;

import java.time.Instant;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

public final class d implements TemporalQuery {
    @Override
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return Instant.from(temporalAccessor);
    }
}
