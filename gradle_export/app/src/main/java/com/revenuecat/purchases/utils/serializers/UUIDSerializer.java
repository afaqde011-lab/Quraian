package com.revenuecat.purchases.utils.serializers;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import l40.a;
import n40.c;
import n40.e;
import o40.d;
import ri.t1;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/UUIDSerializer;", "Ll40/a;", "Ljava/util/UUID;", "<init>", "()V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Ljava/util/UUID;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Ljava/util/UUID;)V", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UUIDSerializer implements a {
    public static final UUIDSerializer INSTANCE = new UUIDSerializer();
    private static final e descriptor = t1.e("UUID", c.k);

    private UUIDSerializer() {
    }

    @Override
    public UUID deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        UUID uuidFromString = UUID.fromString(decoder.p());
        m.d(uuidFromString, "fromString(decoder.decodeString())");
        return uuidFromString;
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, UUID value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        String string = value.toString();
        m.d(string, "value.toString()");
        encoder.D(string);
    }
}
