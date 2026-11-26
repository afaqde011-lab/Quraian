package com.revenuecat.purchases.common.networking;

import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import l40.a;
import n40.e;
import o40.b;
import o40.d;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/networking/WebBillingPurchaseOption.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/common/networking/WebBillingPurchaseOption;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/common/networking/WebBillingPurchaseOption;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/common/networking/WebBillingPurchaseOption;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class WebBillingPurchaseOption$$serializer implements z {
    public static final WebBillingPurchaseOption$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        WebBillingPurchaseOption$$serializer webBillingPurchaseOption$$serializer = new WebBillingPurchaseOption$$serializer();
        INSTANCE = webBillingPurchaseOption$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.common.networking.WebBillingPurchaseOption", webBillingPurchaseOption$$serializer, 4);
        q0Var.j("base_price", true);
        q0Var.j("base", true);
        q0Var.j("trial", true);
        q0Var.j("intro_price", true);
        descriptor = q0Var;
    }

    private WebBillingPurchaseOption$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a aVarG = c0.G(WebBillingPrice$$serializer.INSTANCE);
        WebBillingPhase$$serializer webBillingPhase$$serializer = WebBillingPhase$$serializer.INSTANCE;
        return new a[]{aVarG, c0.G(webBillingPhase$$serializer), c0.G(webBillingPhase$$serializer), c0.G(webBillingPhase$$serializer)};
    }

    @Override
    public WebBillingPurchaseOption deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        int i = 0;
        WebBillingPrice webBillingPrice = null;
        WebBillingPhase webBillingPhase = null;
        WebBillingPhase webBillingPhase2 = null;
        WebBillingPhase webBillingPhase3 = null;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(descriptor2);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                webBillingPrice = (WebBillingPrice) aVarC.v(descriptor2, 0, WebBillingPrice$$serializer.INSTANCE, webBillingPrice);
                i |= 1;
            } else if (iL == 1) {
                webBillingPhase = (WebBillingPhase) aVarC.v(descriptor2, 1, WebBillingPhase$$serializer.INSTANCE, webBillingPhase);
                i |= 2;
            } else if (iL == 2) {
                webBillingPhase2 = (WebBillingPhase) aVarC.v(descriptor2, 2, WebBillingPhase$$serializer.INSTANCE, webBillingPhase2);
                i |= 4;
            } else {
                if (iL != 3) {
                    throw new UnknownFieldException(iL);
                }
                webBillingPhase3 = (WebBillingPhase) aVarC.v(descriptor2, 3, WebBillingPhase$$serializer.INSTANCE, webBillingPhase3);
                i |= 8;
            }
        }
        aVarC.a(descriptor2);
        return new WebBillingPurchaseOption(i, webBillingPrice, webBillingPhase, webBillingPhase2, webBillingPhase3, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, WebBillingPurchaseOption value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        WebBillingPurchaseOption.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
