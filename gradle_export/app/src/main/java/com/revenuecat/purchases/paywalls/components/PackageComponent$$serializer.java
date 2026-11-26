package com.revenuecat.purchases.paywalls.components;

import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.paywalls.components.common.PromoOfferConfig;
import com.revenuecat.purchases.paywalls.components.common.ResilientPromoOfferConfigSerializer;
import g00.c;
import java.util.List;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/PackageComponent.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/PackageComponent;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/PackageComponent;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/PackageComponent;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class PackageComponent$$serializer implements z {
    public static final PackageComponent$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        PackageComponent$$serializer packageComponent$$serializer = new PackageComponent$$serializer();
        INSTANCE = packageComponent$$serializer;
        q0 q0Var = new q0("package", packageComponent$$serializer, 6);
        q0Var.j("package_id", false);
        q0Var.j("is_selected_by_default", false);
        q0Var.j("stack", false);
        q0Var.j("play_store_offer", true);
        q0Var.j("visible", true);
        q0Var.j("overrides", true);
        descriptor = q0Var;
    }

    private PackageComponent$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a[] aVarArr = PackageComponent.$childSerializers;
        f fVar = f.a;
        return new a[]{b1.a, fVar, StackComponent$$serializer.INSTANCE, c0.G(ResilientPromoOfferConfigSerializer.INSTANCE), c0.G(fVar), aVarArr[5]};
    }

    @Override
    public PackageComponent deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = PackageComponent.$childSerializers;
        int i = 0;
        boolean zR = false;
        String strT = null;
        StackComponent stackComponent = null;
        PromoOfferConfig promoOfferConfig = null;
        Boolean bool = null;
        List list = null;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    z = false;
                    break;
                case 0:
                    strT = aVarC.t(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    zR = aVarC.r(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    stackComponent = (StackComponent) aVarC.s(descriptor2, 2, StackComponent$$serializer.INSTANCE, stackComponent);
                    i |= 4;
                    break;
                case 3:
                    promoOfferConfig = (PromoOfferConfig) aVarC.v(descriptor2, 3, ResilientPromoOfferConfigSerializer.INSTANCE, promoOfferConfig);
                    i |= 8;
                    break;
                case 4:
                    bool = (Boolean) aVarC.v(descriptor2, 4, f.a, bool);
                    i |= 16;
                    break;
                case 5:
                    list = (List) aVarC.s(descriptor2, 5, aVarArr[5], list);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new PackageComponent(i, strT, zR, stackComponent, promoOfferConfig, bool, list, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, PackageComponent value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PackageComponent.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
