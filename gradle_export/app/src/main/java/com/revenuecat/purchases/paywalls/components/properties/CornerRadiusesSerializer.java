package com.revenuecat.purchases.paywalls.components.properties;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.c;
import o40.d;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiusesSerializer;", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "<init>", "()V", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;)V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses;", "Lcom/revenuecat/purchases/paywalls/components/properties/CornerRadiuses$Dp;", "serializer", "Ll40/a;", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CornerRadiusesSerializer implements a {
    public static final CornerRadiusesSerializer INSTANCE = new CornerRadiusesSerializer();
    private static final e descriptor;
    private static final a serializer;

    static {
        a aVarSerializer = CornerRadiuses.Dp.INSTANCE.serializer();
        serializer = aVarSerializer;
        descriptor = aVarSerializer.getDescriptor();
    }

    private CornerRadiusesSerializer() {
    }

    @Override
    public CornerRadiuses deserialize(c decoder) {
        m.e(decoder, "decoder");
        return (CornerRadiuses) decoder.j(serializer);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, CornerRadiuses value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
    }
}
