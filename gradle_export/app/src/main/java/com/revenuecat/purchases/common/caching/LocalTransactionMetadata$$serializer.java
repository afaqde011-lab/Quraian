package com.revenuecat.purchases.common.caching;

import com.revenuecat.purchases.PurchasesAreCompletedBy;
import com.revenuecat.purchases.common.ReceiptInfo;
import com.revenuecat.purchases.common.ReceiptInfo$$serializer;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData;
import com.revenuecat.purchases.paywalls.events.PaywallPostReceiptData$$serializer;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/caching/LocalTransactionMetadata.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/common/caching/LocalTransactionMetadata;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class LocalTransactionMetadata$$serializer implements z {
    public static final LocalTransactionMetadata$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        LocalTransactionMetadata$$serializer localTransactionMetadata$$serializer = new LocalTransactionMetadata$$serializer();
        INSTANCE = localTransactionMetadata$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.common.caching.LocalTransactionMetadata", localTransactionMetadata$$serializer, 4);
        q0Var.j("token", false);
        q0Var.j("receipt_info", false);
        q0Var.j("paywall_data", true);
        q0Var.j("purchases_are_completed_by", false);
        descriptor = q0Var;
    }

    private LocalTransactionMetadata$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        return new a[]{b1.a, ReceiptInfo$$serializer.INSTANCE, c0.G(PaywallPostReceiptData$$serializer.INSTANCE), LocalTransactionMetadata.$childSerializers[3]};
    }

    @Override
    public LocalTransactionMetadata deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = LocalTransactionMetadata.$childSerializers;
        int i = 0;
        String strT = null;
        ReceiptInfo receiptInfo = null;
        PaywallPostReceiptData paywallPostReceiptData = null;
        PurchasesAreCompletedBy purchasesAreCompletedBy = null;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(descriptor2);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                strT = aVarC.t(descriptor2, 0);
                i |= 1;
            } else if (iL == 1) {
                receiptInfo = (ReceiptInfo) aVarC.s(descriptor2, 1, ReceiptInfo$$serializer.INSTANCE, receiptInfo);
                i |= 2;
            } else if (iL == 2) {
                paywallPostReceiptData = (PaywallPostReceiptData) aVarC.v(descriptor2, 2, PaywallPostReceiptData$$serializer.INSTANCE, paywallPostReceiptData);
                i |= 4;
            } else {
                if (iL != 3) {
                    throw new UnknownFieldException(iL);
                }
                purchasesAreCompletedBy = (PurchasesAreCompletedBy) aVarC.s(descriptor2, 3, aVarArr[3], purchasesAreCompletedBy);
                i |= 8;
            }
        }
        aVarC.a(descriptor2);
        return new LocalTransactionMetadata(i, strT, receiptInfo, paywallPostReceiptData, purchasesAreCompletedBy, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, LocalTransactionMetadata value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        LocalTransactionMetadata.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
