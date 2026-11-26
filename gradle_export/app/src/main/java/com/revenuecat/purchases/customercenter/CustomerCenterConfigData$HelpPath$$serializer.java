package com.revenuecat.purchases.customercenter;

import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import g00.c;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/customercenter/CustomerCenterConfigData.HelpPath.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class CustomerCenterConfigData$HelpPath$$serializer implements z {
    public static final CustomerCenterConfigData$HelpPath$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        CustomerCenterConfigData$HelpPath$$serializer customerCenterConfigData$HelpPath$$serializer = new CustomerCenterConfigData$HelpPath$$serializer();
        INSTANCE = customerCenterConfigData$HelpPath$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.customercenter.CustomerCenterConfigData.HelpPath", customerCenterConfigData$HelpPath$$serializer, 8);
        q0Var.j(DiagnosticsEntry.ID_KEY, false);
        q0Var.j("title", false);
        q0Var.j("type", false);
        q0Var.j("promotional_offer", true);
        q0Var.j("feedback_survey", true);
        q0Var.j("url", true);
        q0Var.j("open_method", true);
        q0Var.j("action_identifier", true);
        descriptor = q0Var;
    }

    private CustomerCenterConfigData$HelpPath$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a[] aVarArr = CustomerCenterConfigData.HelpPath.$childSerializers;
        b1 b1Var = b1.a;
        return new a[]{b1Var, b1Var, aVarArr[2], c0.G(CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE), c0.G(CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE), c0.G(b1Var), c0.G(aVarArr[6]), c0.G(b1Var)};
    }

    @Override
    public CustomerCenterConfigData.HelpPath deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = CustomerCenterConfigData.HelpPath.$childSerializers;
        String strT = null;
        String strT2 = null;
        CustomerCenterConfigData.HelpPath.PathType pathType = null;
        CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer promotionalOffer = null;
        CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey feedbackSurvey = null;
        String str = null;
        CustomerCenterConfigData.HelpPath.OpenMethod openMethod = null;
        String str2 = null;
        int i = 0;
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
                    strT2 = aVarC.t(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    pathType = (CustomerCenterConfigData.HelpPath.PathType) aVarC.s(descriptor2, 2, aVarArr[2], pathType);
                    i |= 4;
                    break;
                case 3:
                    promotionalOffer = (CustomerCenterConfigData.HelpPath.PathDetail.PromotionalOffer) aVarC.v(descriptor2, 3, CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$$serializer.INSTANCE, promotionalOffer);
                    i |= 8;
                    break;
                case 4:
                    feedbackSurvey = (CustomerCenterConfigData.HelpPath.PathDetail.FeedbackSurvey) aVarC.v(descriptor2, 4, CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$$serializer.INSTANCE, feedbackSurvey);
                    i |= 16;
                    break;
                case 5:
                    str = (String) aVarC.v(descriptor2, 5, b1.a, str);
                    i |= 32;
                    break;
                case 6:
                    openMethod = (CustomerCenterConfigData.HelpPath.OpenMethod) aVarC.v(descriptor2, 6, aVarArr[6], openMethod);
                    i |= 64;
                    break;
                case 7:
                    str2 = (String) aVarC.v(descriptor2, 7, b1.a, str2);
                    i |= 128;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new CustomerCenterConfigData.HelpPath(i, strT, strT2, pathType, promotionalOffer, feedbackSurvey, str, openMethod, str2, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, CustomerCenterConfigData.HelpPath value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        CustomerCenterConfigData.HelpPath.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
