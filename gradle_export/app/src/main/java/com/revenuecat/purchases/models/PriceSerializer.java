package com.revenuecat.purchases.models;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import o40.c;
import o40.d;
import ri.t1;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/models/PriceSerializer;", "Ll40/a;", "Lcom/revenuecat/purchases/models/Price;", "<init>", "()V", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/models/Price;)V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/models/Price;", "", "FORMATTED_INDEX", "I", "AMOUNT_MICROS_INDEX", "CURRENCY_CODE_INDEX", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PriceSerializer implements a {
    private static final int AMOUNT_MICROS_INDEX = 1;
    private static final int CURRENCY_CODE_INDEX = 2;
    private static final int FORMATTED_INDEX = 0;
    public static final PriceSerializer INSTANCE = new PriceSerializer();
    private static final e descriptor = t1.k("Price", new e[0], PriceSerializer$descriptor$1.INSTANCE);

    private PriceSerializer() {
    }

    @Override
    public Price deserialize(c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        String strT = "";
        long jG = 0;
        String strT2 = "";
        while (true) {
            PriceSerializer priceSerializer = INSTANCE;
            int iL = aVarC.l(priceSerializer.getDescriptor());
            if (iL == -1) {
                Price price = new Price(strT, jG, strT2);
                aVarC.a(descriptor2);
                return price;
            }
            if (iL == 0) {
                strT = aVarC.t(priceSerializer.getDescriptor(), 0);
            } else if (iL == 1) {
                jG = aVarC.g(priceSerializer.getDescriptor(), 1);
            } else {
                if (iL != 2) {
                    throw new IllegalStateException(("Unexpected index: " + iL).toString());
                }
                strT2 = aVarC.t(priceSerializer.getDescriptor(), 2);
            }
        }
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, Price value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        PriceSerializer priceSerializer = INSTANCE;
        bVarC.i(priceSerializer.getDescriptor(), 0, value.getFormatted());
        bVarC.t(priceSerializer.getDescriptor(), 1, value.getAmountMicros());
        bVarC.i(priceSerializer.getDescriptor(), 2, value.getCurrencyCode());
        bVarC.a(descriptor2);
    }
}
