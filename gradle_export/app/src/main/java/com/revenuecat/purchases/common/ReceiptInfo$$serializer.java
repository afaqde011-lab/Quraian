package com.revenuecat.purchases.common;

import com.revenuecat.purchases.PresentedOfferingContext;
import com.revenuecat.purchases.PresentedOfferingContextSerializer;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.ReplacementModeSerializer;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.PeriodSerializer;
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
import p40.k0;
import p40.o0;
import p40.q;
import p40.q0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/ReceiptInfo.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/common/ReceiptInfo;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/common/ReceiptInfo;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/common/ReceiptInfo;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class ReceiptInfo$$serializer implements z {
    public static final ReceiptInfo$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        ReceiptInfo$$serializer receiptInfo$$serializer = new ReceiptInfo$$serializer();
        INSTANCE = receiptInfo$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.common.ReceiptInfo", receiptInfo$$serializer, 14);
        q0Var.j("productIDs", false);
        q0Var.j("purchaseTime", true);
        q0Var.j("presentedOfferingContext", true);
        q0Var.j("price", true);
        q0Var.j("formattedPrice", true);
        q0Var.j("currency", true);
        q0Var.j("period", true);
        q0Var.j("pricingPhases", true);
        q0Var.j("replacementMode", true);
        q0Var.j("platformProductIds", true);
        q0Var.j("sdkOriginated", true);
        q0Var.j("storeUserID", true);
        q0Var.j("marketplace", true);
        q0Var.j("duration", true);
        descriptor = q0Var;
    }

    private ReceiptInfo$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a[] aVarArr = ReceiptInfo.$childSerializers;
        a aVar = aVarArr[0];
        a aVarG = c0.G(k0.a);
        a aVarG2 = c0.G(PresentedOfferingContextSerializer.INSTANCE);
        a aVarG3 = c0.G(q.a);
        b1 b1Var = b1.a;
        return new a[]{aVar, aVarG, aVarG2, aVarG3, c0.G(b1Var), c0.G(b1Var), c0.G(PeriodSerializer.INSTANCE), c0.G(aVarArr[7]), c0.G(ReplacementModeSerializer.INSTANCE), aVarArr[9], f.a, c0.G(b1Var), c0.G(b1Var), c0.G(b1Var)};
    }

    @Override
    public ReceiptInfo deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = ReceiptInfo.$childSerializers;
        ReplacementMode replacementMode = null;
        String str = null;
        String str2 = null;
        List list = null;
        String str3 = null;
        List list2 = null;
        Long l = null;
        PresentedOfferingContext presentedOfferingContext = null;
        Double d = null;
        String str4 = null;
        String str5 = null;
        Period period = null;
        List list3 = null;
        int i = 0;
        boolean z = true;
        boolean zR = false;
        while (z) {
            List list4 = list2;
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    list2 = list4;
                    z = false;
                    i = i;
                    str = str;
                    break;
                case 0:
                    list2 = (List) aVarC.s(descriptor2, 0, aVarArr[0], list4);
                    i |= 1;
                    str = str;
                    break;
                case 1:
                    l = (Long) aVarC.v(descriptor2, 1, k0.a, l);
                    i |= 2;
                    list2 = list4;
                    break;
                case 2:
                    presentedOfferingContext = (PresentedOfferingContext) aVarC.v(descriptor2, 2, PresentedOfferingContextSerializer.INSTANCE, presentedOfferingContext);
                    i |= 4;
                    list2 = list4;
                    l = l;
                    break;
                case 3:
                    d = (Double) aVarC.v(descriptor2, 3, q.a, d);
                    i |= 8;
                    list2 = list4;
                    l = l;
                    break;
                case 4:
                    str4 = (String) aVarC.v(descriptor2, 4, b1.a, str4);
                    i |= 16;
                    list2 = list4;
                    l = l;
                    break;
                case 5:
                    str5 = (String) aVarC.v(descriptor2, 5, b1.a, str5);
                    i |= 32;
                    list2 = list4;
                    l = l;
                    break;
                case 6:
                    period = (Period) aVarC.v(descriptor2, 6, PeriodSerializer.INSTANCE, period);
                    i |= 64;
                    list2 = list4;
                    l = l;
                    break;
                case 7:
                    list3 = (List) aVarC.v(descriptor2, 7, aVarArr[7], list3);
                    i |= 128;
                    list2 = list4;
                    l = l;
                    break;
                case 8:
                    replacementMode = (ReplacementMode) aVarC.v(descriptor2, 8, ReplacementModeSerializer.INSTANCE, replacementMode);
                    i |= 256;
                    list2 = list4;
                    l = l;
                    break;
                case 9:
                    list = (List) aVarC.s(descriptor2, 9, aVarArr[9], list);
                    i |= 512;
                    list2 = list4;
                    l = l;
                    break;
                case 10:
                    zR = aVarC.r(descriptor2, 10);
                    i |= 1024;
                    list2 = list4;
                    break;
                case 11:
                    str3 = (String) aVarC.v(descriptor2, 11, b1.a, str3);
                    i |= 2048;
                    list2 = list4;
                    l = l;
                    break;
                case 12:
                    str2 = (String) aVarC.v(descriptor2, 12, b1.a, str2);
                    i |= 4096;
                    list2 = list4;
                    l = l;
                    break;
                case 13:
                    str = (String) aVarC.v(descriptor2, 13, b1.a, str);
                    i |= 8192;
                    list2 = list4;
                    l = l;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new ReceiptInfo(i, list2, l, presentedOfferingContext, d, str4, str5, period, list3, replacementMode, list, zR, str3, str2, str, null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, ReceiptInfo value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        ReceiptInfo.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
