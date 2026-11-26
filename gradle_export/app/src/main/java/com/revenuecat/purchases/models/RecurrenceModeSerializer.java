package com.revenuecat.purchases.models;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.b;
import o40.c;
import o40.d;
import ri.t1;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/revenuecat/purchases/models/RecurrenceModeSerializer;", "Ll40/a;", "Lcom/revenuecat/purchases/models/RecurrenceMode;", "<init>", "()V", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/models/RecurrenceMode;)V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/models/RecurrenceMode;", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RecurrenceModeSerializer implements a {
    public static final RecurrenceModeSerializer INSTANCE = new RecurrenceModeSerializer();
    private static final e descriptor = t1.k("RecurrenceMode", new e[0], RecurrenceModeSerializer$descriptor$1.INSTANCE);

    private RecurrenceModeSerializer() {
    }

    @Override
    public RecurrenceMode deserialize(c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        String strT = "";
        while (true) {
            RecurrenceModeSerializer recurrenceModeSerializer = INSTANCE;
            int iL = aVarC.l(recurrenceModeSerializer.getDescriptor());
            if (iL == -1) {
                RecurrenceMode recurrenceModeValueOf = RecurrenceMode.valueOf(strT);
                aVarC.a(descriptor2);
                return recurrenceModeValueOf;
            }
            if (iL != 0) {
                throw new IllegalStateException(("Unexpected index: " + iL).toString());
            }
            strT = aVarC.t(recurrenceModeSerializer.getDescriptor(), 0);
        }
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, RecurrenceMode value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        bVarC.i(INSTANCE.getDescriptor(), 0, value.name());
        bVarC.a(descriptor2);
    }
}
