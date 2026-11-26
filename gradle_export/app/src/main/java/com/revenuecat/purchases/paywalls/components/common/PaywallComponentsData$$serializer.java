package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.utils.serializers.GoogleListSerializer;
import com.revenuecat.purchases.utils.serializers.URLSerializer;
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
import p40.e0;
import p40.o0;
import p40.q0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/PaywallComponentsData.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/common/PaywallComponentsData;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class PaywallComponentsData$$serializer implements z {
    public static final PaywallComponentsData$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        PaywallComponentsData$$serializer paywallComponentsData$$serializer = new PaywallComponentsData$$serializer();
        INSTANCE = paywallComponentsData$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.components.common.PaywallComponentsData", paywallComponentsData$$serializer, 10);
        q0Var.j(DiagnosticsEntry.ID_KEY, true);
        q0Var.j("template_name", false);
        q0Var.j("asset_base_url", false);
        q0Var.j("components_config", false);
        q0Var.j("components_localizations", false);
        q0Var.j("default_locale", false);
        q0Var.j("revision", true);
        q0Var.j("zero_decimal_place_countries", true);
        q0Var.j("exit_offers", true);
        q0Var.j("play_store_product_change_mode", true);
        descriptor = q0Var;
    }

    private PaywallComponentsData$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a[] aVarArr = PaywallComponentsData.$childSerializers;
        b1 b1Var = b1.a;
        return new a[]{c0.G(b1Var), b1Var, URLSerializer.INSTANCE, ComponentsConfig$$serializer.INSTANCE, aVarArr[4], LocaleId$$serializer.INSTANCE, e0.a, GoogleListSerializer.INSTANCE, c0.G(ExitOffers$$serializer.INSTANCE), c0.G(ProductChangeConfigSerializer.INSTANCE)};
    }

    @Override
    public PaywallComponentsData deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = PaywallComponentsData.$childSerializers;
        boolean z = true;
        List list = null;
        int i = 0;
        String str = null;
        ExitOffers exitOffers = null;
        URL url = null;
        ComponentsConfig componentsConfig = null;
        Map map = null;
        String strM201unboximpl = null;
        ProductChangeConfig productChangeConfig = null;
        String strT = null;
        int iQ = 0;
        while (z) {
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    z = false;
                    break;
                case 0:
                    str = (String) aVarC.v(descriptor2, 0, b1.a, str);
                    i |= 1;
                    break;
                case 1:
                    strT = aVarC.t(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    url = (URL) aVarC.s(descriptor2, 2, URLSerializer.INSTANCE, url);
                    i |= 4;
                    break;
                case 3:
                    componentsConfig = (ComponentsConfig) aVarC.s(descriptor2, 3, ComponentsConfig$$serializer.INSTANCE, componentsConfig);
                    i |= 8;
                    break;
                case 4:
                    map = (Map) aVarC.s(descriptor2, 4, aVarArr[4], map);
                    i |= 16;
                    break;
                case 5:
                    LocaleId localeId = (LocaleId) aVarC.s(descriptor2, 5, LocaleId$$serializer.INSTANCE, strM201unboximpl != null ? LocaleId.m195boximpl(strM201unboximpl) : null);
                    strM201unboximpl = localeId != null ? localeId.m201unboximpl() : null;
                    i |= 32;
                    break;
                case 6:
                    iQ = aVarC.q(descriptor2, 6);
                    i |= 64;
                    break;
                case 7:
                    list = (List) aVarC.s(descriptor2, 7, GoogleListSerializer.INSTANCE, list);
                    i |= 128;
                    break;
                case 8:
                    exitOffers = (ExitOffers) aVarC.v(descriptor2, 8, ExitOffers$$serializer.INSTANCE, exitOffers);
                    i |= 256;
                    break;
                case 9:
                    productChangeConfig = (ProductChangeConfig) aVarC.v(descriptor2, 9, ProductChangeConfigSerializer.INSTANCE, productChangeConfig);
                    i |= 512;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new PaywallComponentsData(i, str, strT, url, componentsConfig, map, strM201unboximpl, iQ, list, exitOffers, productChangeConfig, null, null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, PaywallComponentsData value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PaywallComponentsData.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
