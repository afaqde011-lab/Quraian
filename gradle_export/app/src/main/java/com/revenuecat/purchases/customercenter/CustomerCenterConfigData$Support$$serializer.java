package com.revenuecat.purchases.customercenter;

import com.revenuecat.purchases.paywalls.EmptyStringToNullSerializer;
import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import l40.a;
import n40.e;
import o40.b;
import o40.d;
import p40.f;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.Support.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class CustomerCenterConfigData$Support$$serializer implements z {
    public static final CustomerCenterConfigData$Support$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        CustomerCenterConfigData$Support$$serializer customerCenterConfigData$Support$$serializer = new CustomerCenterConfigData$Support$$serializer();
        INSTANCE = customerCenterConfigData$Support$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support", customerCenterConfigData$Support$$serializer, 4);
        q0Var.j("email", true);
        q0Var.j("should_warn_customer_to_update", true);
        q0Var.j("display_virtual_currencies", true);
        q0Var.j("support_tickets", true);
        descriptor = q0Var;
    }

    private CustomerCenterConfigData$Support$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a aVarG = c0.G(EmptyStringToNullSerializer.INSTANCE);
        f fVar = f.a;
        return new a[]{aVarG, c0.G(fVar), c0.G(fVar), CustomerCenterConfigData$Support$SupportTickets$$serializer.INSTANCE};
    }

    @Override
    public CustomerCenterConfigData.Support deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        int i = 0;
        String str = null;
        Boolean bool = null;
        Boolean bool2 = null;
        CustomerCenterConfigData.Support.SupportTickets supportTickets = null;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(descriptor2);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                str = (String) aVarC.v(descriptor2, 0, EmptyStringToNullSerializer.INSTANCE, str);
                i |= 1;
            } else if (iL == 1) {
                bool = (Boolean) aVarC.v(descriptor2, 1, f.a, bool);
                i |= 2;
            } else if (iL == 2) {
                bool2 = (Boolean) aVarC.v(descriptor2, 2, f.a, bool2);
                i |= 4;
            } else {
                if (iL != 3) {
                    throw new UnknownFieldException(iL);
                }
                supportTickets = (CustomerCenterConfigData.Support.SupportTickets) aVarC.s(descriptor2, 3, CustomerCenterConfigData$Support$SupportTickets$$serializer.INSTANCE, supportTickets);
                i |= 8;
            }
        }
        aVarC.a(descriptor2);
        return new CustomerCenterConfigData.Support(i, str, bool, bool2, supportTickets, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, CustomerCenterConfigData.Support value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        CustomerCenterConfigData.Support.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
