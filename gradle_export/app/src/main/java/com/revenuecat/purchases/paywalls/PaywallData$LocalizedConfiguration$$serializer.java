package com.revenuecat.purchases.paywalls;

import com.revenuecat.purchases.common.HTTPClient;
import g00.c;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import l40.a;
import n40.e;
import o40.b;
import o40.d;
import p40.b1;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.LocalizedConfiguration.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/PaywallData$LocalizedConfiguration;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class PaywallData$LocalizedConfiguration$$serializer implements z {
    public static final PaywallData$LocalizedConfiguration$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        PaywallData$LocalizedConfiguration$$serializer paywallData$LocalizedConfiguration$$serializer = new PaywallData$LocalizedConfiguration$$serializer();
        INSTANCE = paywallData$LocalizedConfiguration$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.PaywallData.LocalizedConfiguration", paywallData$LocalizedConfiguration$$serializer, 12);
        q0Var.j("title", false);
        q0Var.j("subtitle", true);
        q0Var.j("call_to_action", false);
        q0Var.j("call_to_action_with_intro_offer", true);
        q0Var.j("call_to_action_with_multiple_intro_offers", true);
        q0Var.j("offer_details", true);
        q0Var.j("offer_details_with_intro_offer", true);
        q0Var.j("offer_details_with_multiple_intro_offers", true);
        q0Var.j("offer_name", true);
        q0Var.j("features", true);
        q0Var.j("tier_name", true);
        q0Var.j("offer_overrides", true);
        descriptor = q0Var;
    }

    private PaywallData$LocalizedConfiguration$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a[] aVarArr = PaywallData.LocalizedConfiguration.$childSerializers;
        EmptyStringToNullSerializer emptyStringToNullSerializer = EmptyStringToNullSerializer.INSTANCE;
        a aVarG = c0.G(emptyStringToNullSerializer);
        a aVarG2 = c0.G(emptyStringToNullSerializer);
        a aVarG3 = c0.G(emptyStringToNullSerializer);
        a aVarG4 = c0.G(emptyStringToNullSerializer);
        a aVarG5 = c0.G(emptyStringToNullSerializer);
        a aVarG6 = c0.G(emptyStringToNullSerializer);
        a aVarG7 = c0.G(emptyStringToNullSerializer);
        a aVar = aVarArr[9];
        a aVarG8 = c0.G(emptyStringToNullSerializer);
        a aVar2 = aVarArr[11];
        b1 b1Var = b1.a;
        return new a[]{b1Var, aVarG, b1Var, aVarG2, aVarG3, aVarG4, aVarG5, aVarG6, aVarG7, aVar, aVarG8, aVar2};
    }

    @Override
    public PaywallData.LocalizedConfiguration deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = PaywallData.LocalizedConfiguration.$childSerializers;
        String str = null;
        Map map = null;
        List list = null;
        String str2 = null;
        String strT = null;
        String str3 = null;
        String strT2 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        int i = 0;
        boolean z = true;
        while (z) {
            aVarArr = aVarArr;
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    z = false;
                    break;
                case 0:
                    i |= 1;
                    strT = aVarC.t(descriptor2, 0);
                    break;
                case 1:
                    str3 = (String) aVarC.v(descriptor2, 1, EmptyStringToNullSerializer.INSTANCE, str3);
                    i |= 2;
                    strT = strT;
                    break;
                case 2:
                    strT2 = aVarC.t(descriptor2, 2);
                    i |= 4;
                    break;
                case 3:
                    str4 = (String) aVarC.v(descriptor2, 3, EmptyStringToNullSerializer.INSTANCE, str4);
                    i |= 8;
                    strT = strT;
                    break;
                case 4:
                    str5 = (String) aVarC.v(descriptor2, 4, EmptyStringToNullSerializer.INSTANCE, str5);
                    i |= 16;
                    strT = strT;
                    break;
                case 5:
                    str6 = (String) aVarC.v(descriptor2, 5, EmptyStringToNullSerializer.INSTANCE, str6);
                    i |= 32;
                    strT = strT;
                    break;
                case 6:
                    str7 = (String) aVarC.v(descriptor2, 6, EmptyStringToNullSerializer.INSTANCE, str7);
                    i |= 64;
                    strT = strT;
                    break;
                case 7:
                    str8 = (String) aVarC.v(descriptor2, 7, EmptyStringToNullSerializer.INSTANCE, str8);
                    i |= 128;
                    strT = strT;
                    break;
                case 8:
                    str = (String) aVarC.v(descriptor2, 8, EmptyStringToNullSerializer.INSTANCE, str);
                    i |= 256;
                    strT = strT;
                    break;
                case 9:
                    list = (List) aVarC.s(descriptor2, 9, aVarArr[9], list);
                    i |= 512;
                    strT = strT;
                    break;
                case 10:
                    str2 = (String) aVarC.v(descriptor2, 10, EmptyStringToNullSerializer.INSTANCE, str2);
                    i |= 1024;
                    strT = strT;
                    break;
                case 11:
                    map = (Map) aVarC.s(descriptor2, 11, aVarArr[11], map);
                    i |= 2048;
                    strT = strT;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new PaywallData.LocalizedConfiguration(i, strT, str3, strT2, str4, str5, str6, str7, str8, str, list, str2, map, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, PaywallData.LocalizedConfiguration value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PaywallData.LocalizedConfiguration.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
