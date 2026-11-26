package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import p40.b1;
import ri.t1;
import ta.c0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/PresentedOfferingContextSerializer;", "Ll40/a;", "Lcom/revenuecat/purchases/PresentedOfferingContext;", "<init>", "()V", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/PresentedOfferingContext;)V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/PresentedOfferingContext;", "", "OFFERING_IDENTIFIER_INDEX", "I", "PLACEMENT_IDENTIFIER_INDEX", "TARGETING_CONTEXT_INDEX", "", "nullableStringSerializer", "Ll40/a;", "Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "nullableTargetingContextSerializer", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PresentedOfferingContextSerializer implements l40.a {
    private static final int OFFERING_IDENTIFIER_INDEX = 0;
    private static final int PLACEMENT_IDENTIFIER_INDEX = 1;
    private static final int TARGETING_CONTEXT_INDEX = 2;
    public static final PresentedOfferingContextSerializer INSTANCE = new PresentedOfferingContextSerializer();
    private static final l40.a nullableStringSerializer = c0.G(b1.a);
    private static final l40.a nullableTargetingContextSerializer = c0.G(TargetingContextSerializer.INSTANCE);
    private static final n40.e descriptor = t1.k("PresentedOfferingContext", new n40.e[0], PresentedOfferingContextSerializer$descriptor$1.INSTANCE);

    private PresentedOfferingContextSerializer() {
    }

    @Override
    public PresentedOfferingContext deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        n40.e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        String strT = "";
        String str = null;
        PresentedOfferingContext.TargetingContext targetingContext = null;
        while (true) {
            PresentedOfferingContextSerializer presentedOfferingContextSerializer = INSTANCE;
            int iL = aVarC.l(presentedOfferingContextSerializer.getDescriptor());
            if (iL == -1) {
                PresentedOfferingContext presentedOfferingContext = new PresentedOfferingContext(strT, str, targetingContext);
                aVarC.a(descriptor2);
                return presentedOfferingContext;
            }
            if (iL == 0) {
                strT = aVarC.t(presentedOfferingContextSerializer.getDescriptor(), 0);
            } else if (iL == 1) {
                str = (String) aVarC.s(presentedOfferingContextSerializer.getDescriptor(), 1, nullableStringSerializer, null);
            } else {
                if (iL != 2) {
                    throw new IllegalStateException(("Unexpected index: " + iL).toString());
                }
                targetingContext = (PresentedOfferingContext.TargetingContext) aVarC.s(presentedOfferingContextSerializer.getDescriptor(), 2, nullableTargetingContextSerializer, null);
            }
        }
    }

    @Override
    public n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(o40.d encoder, PresentedOfferingContext value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        n40.e descriptor2 = getDescriptor();
        o40.b bVarC = encoder.c(descriptor2);
        PresentedOfferingContextSerializer presentedOfferingContextSerializer = INSTANCE;
        bVarC.i(presentedOfferingContextSerializer.getDescriptor(), 0, value.getOfferingIdentifier());
        bVarC.C(presentedOfferingContextSerializer.getDescriptor(), 1, nullableStringSerializer, value.getPlacementIdentifier());
        bVarC.C(presentedOfferingContextSerializer.getDescriptor(), 2, nullableTargetingContextSerializer, value.getTargetingContext());
        bVarC.a(descriptor2);
    }
}
