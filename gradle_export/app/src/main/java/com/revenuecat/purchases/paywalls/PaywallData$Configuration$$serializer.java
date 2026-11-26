package com.revenuecat.purchases.paywalls;

import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.utils.serializers.OptionalURLSerializer;
import g00.c;
import java.net.URL;
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
import p40.f;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/PaywallData.Configuration.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/PaywallData$Configuration;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class PaywallData$Configuration$$serializer implements z {
    public static final PaywallData$Configuration$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        PaywallData$Configuration$$serializer paywallData$Configuration$$serializer = new PaywallData$Configuration$$serializer();
        INSTANCE = paywallData$Configuration$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.PaywallData.Configuration", paywallData$Configuration$$serializer, 13);
        q0Var.j("packages", true);
        q0Var.j("default_package", true);
        q0Var.j("images_webp", true);
        q0Var.j("images", true);
        q0Var.j("images_by_tier", true);
        q0Var.j("blurred_background_image", true);
        q0Var.j("display_restore_purchases", true);
        q0Var.j("tos_url", true);
        q0Var.j("privacy_url", true);
        q0Var.j("colors", false);
        q0Var.j("colors_by_tier", true);
        q0Var.j("tiers", true);
        q0Var.j("default_tier", true);
        descriptor = q0Var;
    }

    private PaywallData$Configuration$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a[] aVarArr = PaywallData.Configuration.$childSerializers;
        a aVar = aVarArr[0];
        b1 b1Var = b1.a;
        a aVarG = c0.G(b1Var);
        PaywallData$Configuration$Images$$serializer paywallData$Configuration$Images$$serializer = PaywallData$Configuration$Images$$serializer.INSTANCE;
        a aVarG2 = c0.G(paywallData$Configuration$Images$$serializer);
        a aVarG3 = c0.G(paywallData$Configuration$Images$$serializer);
        a aVarG4 = c0.G(aVarArr[4]);
        OptionalURLSerializer optionalURLSerializer = OptionalURLSerializer.INSTANCE;
        a aVarG5 = c0.G(optionalURLSerializer);
        a aVarG6 = c0.G(optionalURLSerializer);
        a aVarG7 = c0.G(aVarArr[10]);
        a aVarG8 = c0.G(aVarArr[11]);
        a aVarG9 = c0.G(b1Var);
        f fVar = f.a;
        return new a[]{aVar, aVarG, aVarG2, aVarG3, aVarG4, fVar, fVar, aVarG5, aVarG6, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, aVarG7, aVarG8, aVarG9};
    }

    @Override
    public PaywallData.Configuration deserialize(o40.c decoder) {
        a[] aVarArr;
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr2 = PaywallData.Configuration.$childSerializers;
        URL url = null;
        PaywallData.Configuration.ColorInformation colorInformation = null;
        Map map = null;
        List list = null;
        String str = null;
        PaywallData.Configuration.Images images = null;
        PaywallData.Configuration.Images images2 = null;
        Map map2 = null;
        List list2 = null;
        String str2 = null;
        URL url2 = null;
        int i = 0;
        boolean z = true;
        boolean zR = false;
        boolean zR2 = false;
        while (z) {
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    z = false;
                    continue;
                case 0:
                    aVarArr = aVarArr2;
                    list = (List) aVarC.s(descriptor2, 0, aVarArr[0], list);
                    i |= 1;
                    break;
                case 1:
                    aVarArr = aVarArr2;
                    str = (String) aVarC.v(descriptor2, 1, b1.a, str);
                    i |= 2;
                    break;
                case 2:
                    aVarArr = aVarArr2;
                    images = (PaywallData.Configuration.Images) aVarC.v(descriptor2, 2, PaywallData$Configuration$Images$$serializer.INSTANCE, images);
                    i |= 4;
                    break;
                case 3:
                    aVarArr = aVarArr2;
                    images2 = (PaywallData.Configuration.Images) aVarC.v(descriptor2, 3, PaywallData$Configuration$Images$$serializer.INSTANCE, images2);
                    i |= 8;
                    break;
                case 4:
                    aVarArr = aVarArr2;
                    map2 = (Map) aVarC.v(descriptor2, 4, aVarArr[4], map2);
                    i |= 16;
                    break;
                case 5:
                    aVarArr = aVarArr2;
                    zR = aVarC.r(descriptor2, 5);
                    i |= 32;
                    break;
                case 6:
                    aVarArr = aVarArr2;
                    zR2 = aVarC.r(descriptor2, 6);
                    i |= 64;
                    break;
                case 7:
                    aVarArr = aVarArr2;
                    url2 = (URL) aVarC.v(descriptor2, 7, OptionalURLSerializer.INSTANCE, url2);
                    i |= 128;
                    break;
                case 8:
                    aVarArr = aVarArr2;
                    url = (URL) aVarC.v(descriptor2, 8, OptionalURLSerializer.INSTANCE, url);
                    i |= 256;
                    break;
                case 9:
                    aVarArr = aVarArr2;
                    colorInformation = (PaywallData.Configuration.ColorInformation) aVarC.s(descriptor2, 9, PaywallData$Configuration$ColorInformation$$serializer.INSTANCE, colorInformation);
                    i |= 512;
                    break;
                case 10:
                    aVarArr = aVarArr2;
                    map = (Map) aVarC.v(descriptor2, 10, aVarArr[10], map);
                    i |= 1024;
                    break;
                case 11:
                    aVarArr = aVarArr2;
                    list2 = (List) aVarC.v(descriptor2, 11, aVarArr[11], list2);
                    i |= 2048;
                    break;
                case 12:
                    aVarArr = aVarArr2;
                    str2 = (String) aVarC.v(descriptor2, 12, b1.a, str2);
                    i |= 4096;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
            aVarArr2 = aVarArr;
        }
        aVarC.a(descriptor2);
        String str3 = str2;
        return new PaywallData.Configuration(i, list, str, images, images2, map2, zR, zR2, url2, url, colorInformation, map, list2, str3, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, PaywallData.Configuration value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PaywallData.Configuration.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
