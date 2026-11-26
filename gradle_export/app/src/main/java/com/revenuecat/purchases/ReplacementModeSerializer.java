package com.revenuecat.purchases;

import com.revenuecat.purchases.models.GoogleReplacementMode;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import kotlinx.serialization.SerializationException;
import ri.t1;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/ReplacementModeSerializer;", "Ll40/a;", "Lcom/revenuecat/purchases/ReplacementMode;", "<init>", "()V", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/ReplacementMode;)V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/ReplacementMode;", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ReplacementModeSerializer implements l40.a {
    public static final ReplacementModeSerializer INSTANCE = new ReplacementModeSerializer();
    private static final n40.e descriptor = t1.k("ReplacementMode", new n40.e[0], ReplacementModeSerializer$descriptor$1.INSTANCE);

    private ReplacementModeSerializer() {
    }

    @Override
    public ReplacementMode deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        n40.e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        String strT = "";
        String strT2 = "";
        while (true) {
            ReplacementModeSerializer replacementModeSerializer = INSTANCE;
            int iL = aVarC.l(replacementModeSerializer.getDescriptor());
            if (iL == -1) {
                if (!m.a(strT, "GoogleReplacementMode")) {
                    throw new SerializationException(a1.b.o("Unknown ReplacementMode type: ", strT));
                }
                try {
                    GoogleReplacementMode googleReplacementModeValueOf = GoogleReplacementMode.valueOf(strT2);
                    aVarC.a(descriptor2);
                    return googleReplacementModeValueOf;
                } catch (IllegalArgumentException e) {
                    throw new SerializationException(a1.b.o("Invalid GoogleReplacementMode name: ", strT2), e);
                }
            }
            if (iL == 0) {
                strT = aVarC.t(replacementModeSerializer.getDescriptor(), 0);
            } else {
                if (iL != 1) {
                    throw new SerializationException(g4.c.f(iL, "Unexpected index: "));
                }
                strT2 = aVarC.t(replacementModeSerializer.getDescriptor(), 1);
            }
        }
    }

    @Override
    public n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(o40.d encoder, ReplacementMode value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        n40.e descriptor2 = getDescriptor();
        o40.b bVarC = encoder.c(descriptor2);
        if (!(value instanceof GoogleReplacementMode)) {
            throw new SerializationException("Unknown ReplacementMode type: " + a0.a.b(value.getClass()).n());
        }
        ReplacementModeSerializer replacementModeSerializer = INSTANCE;
        bVarC.i(replacementModeSerializer.getDescriptor(), 0, "GoogleReplacementMode");
        bVarC.i(replacementModeSerializer.getDescriptor(), 1, value.getName());
        bVarC.a(descriptor2);
    }
}
