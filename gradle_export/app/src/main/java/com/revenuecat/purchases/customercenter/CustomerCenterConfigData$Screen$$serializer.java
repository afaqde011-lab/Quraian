package com.revenuecat.purchases.customercenter;

import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
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
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.Screen.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class CustomerCenterConfigData$Screen$$serializer implements z {
    public static final CustomerCenterConfigData$Screen$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        CustomerCenterConfigData$Screen$$serializer customerCenterConfigData$Screen$$serializer = new CustomerCenterConfigData$Screen$$serializer();
        INSTANCE = customerCenterConfigData$Screen$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Screen", customerCenterConfigData$Screen$$serializer, 5);
        q0Var.j("type", false);
        q0Var.j("title", false);
        q0Var.j("subtitle", true);
        q0Var.j("paths", false);
        q0Var.j("offering", true);
        descriptor = q0Var;
    }

    private CustomerCenterConfigData$Screen$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        return new a[]{CustomerCenterConfigData.Screen.$childSerializers[0], b1.a, c0.G(EmptyStringToNullSerializer.INSTANCE), HelpPathsSerializer.INSTANCE, c0.G(CustomerCenterConfigData$ScreenOffering$$serializer.INSTANCE)};
    }

    @Override
    public CustomerCenterConfigData.Screen deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = CustomerCenterConfigData.Screen.$childSerializers;
        int i = 0;
        CustomerCenterConfigData.Screen.ScreenType screenType = null;
        String strT = null;
        String str = null;
        List list = null;
        CustomerCenterConfigData.ScreenOffering screenOffering = null;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(descriptor2);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                screenType = (CustomerCenterConfigData.Screen.ScreenType) aVarC.s(descriptor2, 0, aVarArr[0], screenType);
                i |= 1;
            } else if (iL == 1) {
                strT = aVarC.t(descriptor2, 1);
                i |= 2;
            } else if (iL == 2) {
                str = (String) aVarC.v(descriptor2, 2, EmptyStringToNullSerializer.INSTANCE, str);
                i |= 4;
            } else if (iL == 3) {
                list = (List) aVarC.s(descriptor2, 3, HelpPathsSerializer.INSTANCE, list);
                i |= 8;
            } else {
                if (iL != 4) {
                    throw new UnknownFieldException(iL);
                }
                screenOffering = (CustomerCenterConfigData.ScreenOffering) aVarC.v(descriptor2, 4, CustomerCenterConfigData$ScreenOffering$$serializer.INSTANCE, screenOffering);
                i |= 16;
            }
        }
        aVarC.a(descriptor2);
        return new CustomerCenterConfigData.Screen(i, screenType, strT, str, list, screenOffering, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, CustomerCenterConfigData.Screen value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        CustomerCenterConfigData.Screen.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
