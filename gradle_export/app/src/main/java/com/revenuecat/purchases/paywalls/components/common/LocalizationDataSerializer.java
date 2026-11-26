package com.revenuecat.purchases.paywalls.components.common;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.SerializationException;
import l40.a;
import n40.b;
import n40.e;
import o40.c;
import o40.d;
import ri.t1;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/paywalls/components/common/LocalizationDataSerializer;", "Ll40/a;", "Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "<init>", "()V", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;)V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/common/LocalizationData;", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "getDescriptor$annotations", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class LocalizationDataSerializer implements a {
    public static final LocalizationDataSerializer INSTANCE = new LocalizationDataSerializer();
    private static final e descriptor = t1.m("LocalizationData", b.c, new e[0]);

    private LocalizationDataSerializer() {
    }

    public static void getDescriptor$annotations() {
    }

    @Override
    public LocalizationData deserialize(c decoder) {
        m.e(decoder, "decoder");
        try {
            return (LocalizationData) decoder.j(LocalizationData.Text.INSTANCE.serializer());
        } catch (SerializationException unused) {
            return (LocalizationData) decoder.j(LocalizationData.Image.INSTANCE.serializer());
        }
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, LocalizationData value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        throw new IllegalStateException("Serialization is not implemented as it is not (yet) needed.");
    }
}
