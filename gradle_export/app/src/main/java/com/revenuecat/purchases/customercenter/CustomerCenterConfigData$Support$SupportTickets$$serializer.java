package com.revenuecat.purchases.customercenter;

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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.Support.SupportTickets.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class CustomerCenterConfigData$Support$SupportTickets$$serializer implements z {
    public static final CustomerCenterConfigData$Support$SupportTickets$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        CustomerCenterConfigData$Support$SupportTickets$$serializer customerCenterConfigData$Support$SupportTickets$$serializer = new CustomerCenterConfigData$Support$SupportTickets$$serializer();
        INSTANCE = customerCenterConfigData$Support$SupportTickets$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support.SupportTickets", customerCenterConfigData$Support$SupportTickets$$serializer, 3);
        q0Var.j("allow_creation", true);
        q0Var.j("customer_details", true);
        q0Var.j("customer_type", true);
        descriptor = q0Var;
    }

    private CustomerCenterConfigData$Support$SupportTickets$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        return new a[]{f.a, CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer.INSTANCE, CustomerCenterConfigData.Support.SupportTickets.$childSerializers[2]};
    }

    @Override
    public CustomerCenterConfigData.Support.SupportTickets deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = CustomerCenterConfigData.Support.SupportTickets.$childSerializers;
        int i = 0;
        boolean zR = false;
        CustomerCenterConfigData.Support.SupportTickets.CustomerDetails customerDetails = null;
        CustomerCenterConfigData.Support.SupportTickets.CustomerType customerType = null;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(descriptor2);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                zR = aVarC.r(descriptor2, 0);
                i |= 1;
            } else if (iL == 1) {
                customerDetails = (CustomerCenterConfigData.Support.SupportTickets.CustomerDetails) aVarC.s(descriptor2, 1, CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer.INSTANCE, customerDetails);
                i |= 2;
            } else {
                if (iL != 2) {
                    throw new UnknownFieldException(iL);
                }
                customerType = (CustomerCenterConfigData.Support.SupportTickets.CustomerType) aVarC.s(descriptor2, 2, aVarArr[2], customerType);
                i |= 4;
            }
        }
        aVarC.a(descriptor2);
        return new CustomerCenterConfigData.Support.SupportTickets(i, zR, customerDetails, customerType, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, CustomerCenterConfigData.Support.SupportTickets value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        CustomerCenterConfigData.Support.SupportTickets.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
