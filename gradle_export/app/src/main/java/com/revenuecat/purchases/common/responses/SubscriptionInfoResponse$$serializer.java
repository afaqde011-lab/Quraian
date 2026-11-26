package com.revenuecat.purchases.common.responses;

import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.StoreSerializer;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.utils.serializers.ISO8601DateSerializer;
import g00.c;
import java.util.Date;
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

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/common/responses/SubscriptionInfoResponse.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/common/responses/SubscriptionInfoResponse;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class SubscriptionInfoResponse$$serializer implements z {
    public static final SubscriptionInfoResponse$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        SubscriptionInfoResponse$$serializer subscriptionInfoResponse$$serializer = new SubscriptionInfoResponse$$serializer();
        INSTANCE = subscriptionInfoResponse$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.common.responses.SubscriptionInfoResponse", subscriptionInfoResponse$$serializer, 17);
        q0Var.j("purchase_date", false);
        q0Var.j("original_purchase_date", true);
        q0Var.j("expires_date", true);
        q0Var.j(ProductResponseJsonKeys.STORE, false);
        q0Var.j(ProductResponseJsonKeys.IS_SANDBOX, false);
        q0Var.j(ProductResponseJsonKeys.UNSUBSCRIBE_DETECTED_AT, true);
        q0Var.j(ProductResponseJsonKeys.BILLING_ISSUES_DETECTED_AT, true);
        q0Var.j("grace_period_expires_date", true);
        q0Var.j(ProductResponseJsonKeys.OWNERSHIP_TYPE, true);
        q0Var.j(ProductResponseJsonKeys.PERIOD_TYPE, false);
        q0Var.j("refunded_at", true);
        q0Var.j("store_transaction_id", true);
        q0Var.j("auto_resume_date", true);
        q0Var.j("display_name", true);
        q0Var.j("price", true);
        q0Var.j("product_plan_identifier", true);
        q0Var.j("management_url", true);
        descriptor = q0Var;
    }

    private SubscriptionInfoResponse$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a[] aVarArr = SubscriptionInfoResponse.$childSerializers;
        ISO8601DateSerializer iSO8601DateSerializer = ISO8601DateSerializer.INSTANCE;
        a aVarG = c0.G(iSO8601DateSerializer);
        a aVarG2 = c0.G(iSO8601DateSerializer);
        a aVarG3 = c0.G(iSO8601DateSerializer);
        a aVarG4 = c0.G(iSO8601DateSerializer);
        a aVarG5 = c0.G(iSO8601DateSerializer);
        a aVar = aVarArr[8];
        a aVar2 = aVarArr[9];
        a aVarG6 = c0.G(iSO8601DateSerializer);
        b1 b1Var = b1.a;
        return new a[]{iSO8601DateSerializer, aVarG, aVarG2, StoreSerializer.INSTANCE, f.a, aVarG3, aVarG4, aVarG5, aVar, aVar2, aVarG6, c0.G(b1Var), c0.G(iSO8601DateSerializer), c0.G(b1Var), c0.G(SubscriptionInfoResponse$PriceResponse$$serializer.INSTANCE), c0.G(b1Var), c0.G(b1Var)};
    }

    @Override
    public SubscriptionInfoResponse deserialize(o40.c decoder) {
        int i;
        Date date;
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        a[] aVarArr = SubscriptionInfoResponse.$childSerializers;
        OwnershipType ownershipType = null;
        SubscriptionInfoResponse.PriceResponse priceResponse = null;
        String str = null;
        Date date2 = null;
        PeriodType periodType = null;
        Date date3 = null;
        String str2 = null;
        String str3 = null;
        Store store = null;
        String str4 = null;
        Date date4 = null;
        Date date5 = null;
        Date date6 = null;
        Date date7 = null;
        Date date8 = null;
        Date date9 = null;
        int i2 = 0;
        boolean z = true;
        boolean zR = false;
        while (z) {
            Store store2 = store;
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    date = date7;
                    z = false;
                    str = str;
                    store = store2;
                    date7 = date;
                    date8 = date8;
                    date4 = date4;
                    priceResponse = priceResponse;
                    break;
                case 0:
                    date = (Date) aVarC.s(descriptor2, 0, ISO8601DateSerializer.INSTANCE, date7);
                    i2 |= 1;
                    str = str;
                    store = store2;
                    date7 = date;
                    date8 = date8;
                    date4 = date4;
                    priceResponse = priceResponse;
                    break;
                case 1:
                    i2 |= 2;
                    date9 = date9;
                    date4 = date4;
                    priceResponse = priceResponse;
                    date8 = (Date) aVarC.v(descriptor2, 1, ISO8601DateSerializer.INSTANCE, date8);
                    store = store2;
                    break;
                case 2:
                    priceResponse = priceResponse;
                    date4 = date4;
                    date9 = (Date) aVarC.v(descriptor2, 2, ISO8601DateSerializer.INSTANCE, date9);
                    i2 |= 4;
                    store = store2;
                    date4 = date4;
                    priceResponse = priceResponse;
                    break;
                case 3:
                    priceResponse = priceResponse;
                    date4 = date4;
                    store = (Store) aVarC.s(descriptor2, 3, StoreSerializer.INSTANCE, store2);
                    i2 |= 8;
                    date4 = date4;
                    priceResponse = priceResponse;
                    break;
                case 4:
                    zR = aVarC.r(descriptor2, 4);
                    i2 |= 16;
                    store = store2;
                    priceResponse = priceResponse;
                    break;
                case 5:
                    date4 = (Date) aVarC.v(descriptor2, 5, ISO8601DateSerializer.INSTANCE, date4);
                    i2 |= 32;
                    store = store2;
                    priceResponse = priceResponse;
                    break;
                case 6:
                    date4 = date4;
                    date5 = (Date) aVarC.v(descriptor2, 6, ISO8601DateSerializer.INSTANCE, date5);
                    i2 |= 64;
                    store = store2;
                    date4 = date4;
                    break;
                case 7:
                    date4 = date4;
                    date6 = (Date) aVarC.v(descriptor2, 7, ISO8601DateSerializer.INSTANCE, date6);
                    i2 |= 128;
                    store = store2;
                    date4 = date4;
                    break;
                case 8:
                    date4 = date4;
                    ownershipType = (OwnershipType) aVarC.s(descriptor2, 8, aVarArr[8], ownershipType);
                    i2 |= 256;
                    store = store2;
                    date4 = date4;
                    break;
                case 9:
                    date4 = date4;
                    periodType = (PeriodType) aVarC.s(descriptor2, 9, aVarArr[9], periodType);
                    i2 |= 512;
                    store = store2;
                    date4 = date4;
                    break;
                case 10:
                    date4 = date4;
                    date3 = (Date) aVarC.v(descriptor2, 10, ISO8601DateSerializer.INSTANCE, date3);
                    i2 |= 1024;
                    store = store2;
                    date4 = date4;
                    break;
                case 11:
                    date4 = date4;
                    str4 = (String) aVarC.v(descriptor2, 11, b1.a, str4);
                    i2 |= 2048;
                    store = store2;
                    date4 = date4;
                    break;
                case 12:
                    date4 = date4;
                    date2 = (Date) aVarC.v(descriptor2, 12, ISO8601DateSerializer.INSTANCE, date2);
                    i2 |= 4096;
                    store = store2;
                    date4 = date4;
                    break;
                case 13:
                    date4 = date4;
                    str = (String) aVarC.v(descriptor2, 13, b1.a, str);
                    i2 |= 8192;
                    store = store2;
                    date4 = date4;
                    break;
                case 14:
                    date4 = date4;
                    priceResponse = (SubscriptionInfoResponse.PriceResponse) aVarC.v(descriptor2, 14, SubscriptionInfoResponse$PriceResponse$$serializer.INSTANCE, priceResponse);
                    i2 |= 16384;
                    store = store2;
                    date4 = date4;
                    break;
                case 15:
                    str2 = (String) aVarC.v(descriptor2, 15, b1.a, str2);
                    i = 32768;
                    i2 |= i;
                    store = store2;
                    date4 = date4;
                    break;
                case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                    str3 = (String) aVarC.v(descriptor2, 16, b1.a, str3);
                    i = 65536;
                    i2 |= i;
                    store = store2;
                    date4 = date4;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        SubscriptionInfoResponse.PriceResponse priceResponse2 = priceResponse;
        Date date10 = date4;
        Date date11 = date7;
        Date date12 = date8;
        Date date13 = date9;
        aVarC.a(descriptor2);
        return new SubscriptionInfoResponse(i2, date11, date12, date13, store, zR, date10, date5, date6, ownershipType, periodType, date3, str4, date2, str, priceResponse2, str2, str3, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, SubscriptionInfoResponse value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        SubscriptionInfoResponse.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
