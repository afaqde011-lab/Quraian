package com.revenuecat.purchases.paywalls;

import com.revenuecat.purchases.common.HTTPClient;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.Configuration.Colors.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration$Colors;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class PaywallData$Configuration$Colors$$serializer implements z {
    public static final PaywallData$Configuration$Colors$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        PaywallData$Configuration$Colors$$serializer paywallData$Configuration$Colors$$serializer = new PaywallData$Configuration$Colors$$serializer();
        INSTANCE = paywallData$Configuration$Colors$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.PaywallData.Configuration.Colors", paywallData$Configuration$Colors$$serializer, 15);
        q0Var.j("background", false);
        q0Var.j("text_1", false);
        q0Var.j("text_2", true);
        q0Var.j("text_3", true);
        q0Var.j("call_to_action_background", false);
        q0Var.j("call_to_action_foreground", false);
        q0Var.j("call_to_action_secondary_background", true);
        q0Var.j("accent_1", true);
        q0Var.j("accent_2", true);
        q0Var.j("accent_3", true);
        q0Var.j("close_button", true);
        q0Var.j("tier_control_background", true);
        q0Var.j("tier_control_foreground", true);
        q0Var.j("tier_control_selected_background", true);
        q0Var.j("tier_control_selected_foreground", true);
        descriptor = q0Var;
    }

    private PaywallData$Configuration$Colors$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        PaywallColor.Serializer serializer = PaywallColor.Serializer.INSTANCE;
        return new a[]{serializer, serializer, c0.G(serializer), c0.G(serializer), serializer, serializer, c0.G(serializer), c0.G(serializer), c0.G(serializer), c0.G(serializer), c0.G(serializer), c0.G(serializer), c0.G(serializer), c0.G(serializer), c0.G(serializer)};
    }

    @Override
    public PaywallData.Configuration.Colors deserialize(o40.c decoder) {
        PaywallColor paywallColor;
        PaywallColor paywallColor2;
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        PaywallColor paywallColor3 = null;
        PaywallColor paywallColor4 = null;
        PaywallColor paywallColor5 = null;
        PaywallColor paywallColor6 = null;
        PaywallColor paywallColor7 = null;
        PaywallColor paywallColor8 = null;
        PaywallColor paywallColor9 = null;
        PaywallColor paywallColor10 = null;
        PaywallColor paywallColor11 = null;
        PaywallColor paywallColor12 = null;
        PaywallColor paywallColor13 = null;
        PaywallColor paywallColor14 = null;
        PaywallColor paywallColor15 = null;
        PaywallColor paywallColor16 = null;
        PaywallColor paywallColor17 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            PaywallColor paywallColor18 = paywallColor9;
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    paywallColor = paywallColor16;
                    z = false;
                    paywallColor5 = paywallColor5;
                    paywallColor9 = paywallColor18;
                    paywallColor10 = paywallColor10;
                    paywallColor16 = paywallColor;
                    paywallColor4 = paywallColor4;
                    break;
                case 0:
                    paywallColor = (PaywallColor) aVarC.s(descriptor2, 0, PaywallColor.Serializer.INSTANCE, paywallColor16);
                    i |= 1;
                    paywallColor5 = paywallColor5;
                    paywallColor9 = paywallColor18;
                    paywallColor10 = paywallColor10;
                    paywallColor16 = paywallColor;
                    paywallColor4 = paywallColor4;
                    break;
                case 1:
                    paywallColor2 = paywallColor10;
                    paywallColor17 = (PaywallColor) aVarC.s(descriptor2, 1, PaywallColor.Serializer.INSTANCE, paywallColor17);
                    i |= 2;
                    paywallColor9 = paywallColor18;
                    paywallColor10 = paywallColor2;
                    paywallColor4 = paywallColor4;
                    break;
                case 2:
                    paywallColor2 = paywallColor10;
                    paywallColor9 = (PaywallColor) aVarC.v(descriptor2, 2, PaywallColor.Serializer.INSTANCE, paywallColor18);
                    i |= 4;
                    paywallColor10 = paywallColor2;
                    paywallColor4 = paywallColor4;
                    break;
                case 3:
                    paywallColor4 = paywallColor4;
                    paywallColor10 = (PaywallColor) aVarC.v(descriptor2, 3, PaywallColor.Serializer.INSTANCE, paywallColor10);
                    i |= 8;
                    paywallColor9 = paywallColor18;
                    paywallColor4 = paywallColor4;
                    break;
                case 4:
                    paywallColor11 = (PaywallColor) aVarC.s(descriptor2, 4, PaywallColor.Serializer.INSTANCE, paywallColor11);
                    i |= 16;
                    paywallColor9 = paywallColor18;
                    paywallColor10 = paywallColor10;
                    break;
                case 5:
                    paywallColor12 = (PaywallColor) aVarC.s(descriptor2, 5, PaywallColor.Serializer.INSTANCE, paywallColor12);
                    i |= 32;
                    paywallColor9 = paywallColor18;
                    paywallColor10 = paywallColor10;
                    break;
                case 6:
                    paywallColor13 = (PaywallColor) aVarC.v(descriptor2, 6, PaywallColor.Serializer.INSTANCE, paywallColor13);
                    i |= 64;
                    paywallColor9 = paywallColor18;
                    paywallColor10 = paywallColor10;
                    break;
                case 7:
                    paywallColor14 = (PaywallColor) aVarC.v(descriptor2, 7, PaywallColor.Serializer.INSTANCE, paywallColor14);
                    i |= 128;
                    paywallColor9 = paywallColor18;
                    paywallColor10 = paywallColor10;
                    break;
                case 8:
                    paywallColor15 = (PaywallColor) aVarC.v(descriptor2, 8, PaywallColor.Serializer.INSTANCE, paywallColor15);
                    i |= 256;
                    paywallColor9 = paywallColor18;
                    paywallColor10 = paywallColor10;
                    break;
                case 9:
                    paywallColor3 = (PaywallColor) aVarC.v(descriptor2, 9, PaywallColor.Serializer.INSTANCE, paywallColor3);
                    i |= 512;
                    paywallColor9 = paywallColor18;
                    paywallColor10 = paywallColor10;
                    break;
                case 10:
                    paywallColor6 = (PaywallColor) aVarC.v(descriptor2, 10, PaywallColor.Serializer.INSTANCE, paywallColor6);
                    i |= 1024;
                    paywallColor9 = paywallColor18;
                    paywallColor10 = paywallColor10;
                    break;
                case 11:
                    paywallColor7 = (PaywallColor) aVarC.v(descriptor2, 11, PaywallColor.Serializer.INSTANCE, paywallColor7);
                    i |= 2048;
                    paywallColor9 = paywallColor18;
                    paywallColor10 = paywallColor10;
                    break;
                case 12:
                    paywallColor5 = (PaywallColor) aVarC.v(descriptor2, 12, PaywallColor.Serializer.INSTANCE, paywallColor5);
                    i |= 4096;
                    paywallColor9 = paywallColor18;
                    paywallColor10 = paywallColor10;
                    break;
                case 13:
                    paywallColor4 = (PaywallColor) aVarC.v(descriptor2, 13, PaywallColor.Serializer.INSTANCE, paywallColor4);
                    i |= 8192;
                    paywallColor9 = paywallColor18;
                    paywallColor10 = paywallColor10;
                    break;
                case 14:
                    paywallColor8 = (PaywallColor) aVarC.v(descriptor2, 14, PaywallColor.Serializer.INSTANCE, paywallColor8);
                    i |= 16384;
                    paywallColor9 = paywallColor18;
                    paywallColor10 = paywallColor10;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        PaywallColor paywallColor19 = paywallColor4;
        PaywallColor paywallColor20 = paywallColor10;
        aVarC.a(descriptor2);
        return new PaywallData.Configuration.Colors(i, paywallColor16, paywallColor17, paywallColor9, paywallColor20, paywallColor11, paywallColor12, paywallColor13, paywallColor14, paywallColor15, paywallColor3, paywallColor6, paywallColor7, paywallColor5, paywallColor19, paywallColor8, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, PaywallData.Configuration.Colors value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PaywallData.Configuration.Colors.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
