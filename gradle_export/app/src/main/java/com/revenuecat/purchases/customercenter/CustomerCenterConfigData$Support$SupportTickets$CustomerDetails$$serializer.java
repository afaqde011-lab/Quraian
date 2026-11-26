package com.revenuecat.purchases.customercenter;

import com.revenuecat.purchases.common.HTTPClient;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.Support.SupportTickets.CustomerDetails.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support$SupportTickets$CustomerDetails;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer implements z {
    public static final CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer customerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer = new CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer();
        INSTANCE = customerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.Support.SupportTickets.CustomerDetails", customerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer, 14);
        q0Var.j("active_entitlements", true);
        q0Var.j("app_user_id", true);
        q0Var.j("att_consent", true);
        q0Var.j("country", true);
        q0Var.j("device_version", true);
        q0Var.j("email", true);
        q0Var.j("facebook_anon_id", true);
        q0Var.j("idfa", true);
        q0Var.j("idfv", true);
        q0Var.j("ip", true);
        q0Var.j("last_opened", true);
        q0Var.j("last_seen_app_version", true);
        q0Var.j("total_spent", true);
        q0Var.j("user_since", true);
        descriptor = q0Var;
    }

    private CustomerCenterConfigData$Support$SupportTickets$CustomerDetails$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        f fVar = f.a;
        return new a[]{fVar, fVar, fVar, fVar, fVar, fVar, fVar, fVar, fVar, fVar, fVar, fVar, fVar, fVar};
    }

    @Override
    public CustomerCenterConfigData.Support.SupportTickets.CustomerDetails deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        boolean z = true;
        int i = 0;
        boolean zR = false;
        boolean zR2 = false;
        boolean zR3 = false;
        boolean zR4 = false;
        boolean zR5 = false;
        boolean zR6 = false;
        boolean zR7 = false;
        boolean zR8 = false;
        boolean zR9 = false;
        boolean zR10 = false;
        boolean zR11 = false;
        boolean zR12 = false;
        boolean zR13 = false;
        boolean zR14 = false;
        while (z) {
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    z = false;
                    break;
                case 0:
                    zR = aVarC.r(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    zR2 = aVarC.r(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    zR3 = aVarC.r(descriptor2, 2);
                    i |= 4;
                    break;
                case 3:
                    zR4 = aVarC.r(descriptor2, 3);
                    i |= 8;
                    break;
                case 4:
                    zR5 = aVarC.r(descriptor2, 4);
                    i |= 16;
                    break;
                case 5:
                    zR6 = aVarC.r(descriptor2, 5);
                    i |= 32;
                    break;
                case 6:
                    zR7 = aVarC.r(descriptor2, 6);
                    i |= 64;
                    break;
                case 7:
                    zR8 = aVarC.r(descriptor2, 7);
                    i |= 128;
                    break;
                case 8:
                    zR9 = aVarC.r(descriptor2, 8);
                    i |= 256;
                    break;
                case 9:
                    zR10 = aVarC.r(descriptor2, 9);
                    i |= 512;
                    break;
                case 10:
                    zR11 = aVarC.r(descriptor2, 10);
                    i |= 1024;
                    break;
                case 11:
                    zR12 = aVarC.r(descriptor2, 11);
                    i |= 2048;
                    break;
                case 12:
                    zR13 = aVarC.r(descriptor2, 12);
                    i |= 4096;
                    break;
                case 13:
                    zR14 = aVarC.r(descriptor2, 13);
                    i |= 8192;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new CustomerCenterConfigData.Support.SupportTickets.CustomerDetails(i, zR, zR2, zR3, zR4, zR5, zR6, zR7, zR8, zR9, zR10, zR11, zR12, zR13, zR14, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, CustomerCenterConfigData.Support.SupportTickets.CustomerDetails value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        CustomerCenterConfigData.Support.SupportTickets.CustomerDetails.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
