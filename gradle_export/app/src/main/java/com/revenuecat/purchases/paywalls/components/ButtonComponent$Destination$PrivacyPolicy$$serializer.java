package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.paywalls.components.common.LocalizationKey;
import com.revenuecat.purchases.paywalls.components.common.LocalizationKey$$serializer;
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
import p40.z;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/ButtonComponent.Destination.PrivacyPolicy.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/ButtonComponent$Destination$PrivacyPolicy;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class ButtonComponent$Destination$PrivacyPolicy$$serializer implements z {
    public static final ButtonComponent$Destination$PrivacyPolicy$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        ButtonComponent$Destination$PrivacyPolicy$$serializer buttonComponent$Destination$PrivacyPolicy$$serializer = new ButtonComponent$Destination$PrivacyPolicy$$serializer();
        INSTANCE = buttonComponent$Destination$PrivacyPolicy$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.components.ButtonComponent.Destination.PrivacyPolicy", buttonComponent$Destination$PrivacyPolicy$$serializer, 2);
        q0Var.j("urlLid", false);
        q0Var.j("method", false);
        descriptor = q0Var;
    }

    private ButtonComponent$Destination$PrivacyPolicy$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        return new a[]{LocalizationKey$$serializer.INSTANCE, UrlMethodDeserializer.INSTANCE};
    }

    @Override
    public ButtonComponent.Destination.PrivacyPolicy deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        boolean z = true;
        int i = 0;
        String strM237unboximpl = null;
        ButtonComponent.UrlMethod urlMethod = null;
        while (z) {
            int iL = aVarC.l(descriptor2);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                LocalizationKey localizationKey = (LocalizationKey) aVarC.s(descriptor2, 0, LocalizationKey$$serializer.INSTANCE, strM237unboximpl != null ? LocalizationKey.m231boximpl(strM237unboximpl) : null);
                strM237unboximpl = localizationKey != null ? localizationKey.m237unboximpl() : null;
                i |= 1;
            } else {
                if (iL != 1) {
                    throw new UnknownFieldException(iL);
                }
                urlMethod = (ButtonComponent.UrlMethod) aVarC.s(descriptor2, 1, UrlMethodDeserializer.INSTANCE, urlMethod);
                i |= 2;
            }
        }
        aVarC.a(descriptor2);
        return new ButtonComponent.Destination.PrivacyPolicy(i, strM237unboximpl, urlMethod, null, null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, ButtonComponent.Destination.PrivacyPolicy value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        ButtonComponent.Destination.PrivacyPolicy.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
