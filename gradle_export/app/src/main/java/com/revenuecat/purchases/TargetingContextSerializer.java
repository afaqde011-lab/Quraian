package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import ri.t1;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/revenuecat/purchases/TargetingContextSerializer;", "Ll40/a;", "Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "<init>", "()V", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;)V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/PresentedOfferingContext$TargetingContext;", "", "REVISION_INDEX", "I", "RULE_ID_INDEX", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TargetingContextSerializer implements l40.a {
    private static final int REVISION_INDEX = 0;
    private static final int RULE_ID_INDEX = 1;
    public static final TargetingContextSerializer INSTANCE = new TargetingContextSerializer();
    private static final n40.e descriptor = t1.k("TargetingContext", new n40.e[0], TargetingContextSerializer$descriptor$1.INSTANCE);

    private TargetingContextSerializer() {
    }

    @Override
    public PresentedOfferingContext.TargetingContext deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        n40.e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        String strT = "";
        int iQ = 0;
        while (true) {
            TargetingContextSerializer targetingContextSerializer = INSTANCE;
            int iL = aVarC.l(targetingContextSerializer.getDescriptor());
            if (iL == -1) {
                PresentedOfferingContext.TargetingContext targetingContext = new PresentedOfferingContext.TargetingContext(iQ, strT);
                aVarC.a(descriptor2);
                return targetingContext;
            }
            if (iL == 0) {
                iQ = aVarC.q(targetingContextSerializer.getDescriptor(), 0);
            } else {
                if (iL != 1) {
                    throw new IllegalStateException(("Unexpected index: " + iL).toString());
                }
                strT = aVarC.t(targetingContextSerializer.getDescriptor(), 1);
            }
        }
    }

    @Override
    public n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(o40.d encoder, PresentedOfferingContext.TargetingContext value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        n40.e descriptor2 = getDescriptor();
        o40.b bVarC = encoder.c(descriptor2);
        TargetingContextSerializer targetingContextSerializer = INSTANCE;
        bVarC.w(0, value.getRevision(), targetingContextSerializer.getDescriptor());
        bVarC.i(targetingContextSerializer.getDescriptor(), 1, value.getRuleId());
        bVarC.a(descriptor2);
    }
}
