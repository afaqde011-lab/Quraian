package com.revenuecat.purchases.paywalls;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import l40.a;
import n40.c;
import n40.e;
import o40.d;
import p40.b1;
import r30.k;
import ri.t1;
import ta.c0;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0012\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/revenuecat/purchases/paywalls/EmptyStringToNullSerializer;", "Ll40/a;", "", "<init>", "()V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Ljava/lang/String;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Ljava/lang/String;)V", "delegate", "Ll40/a;", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class EmptyStringToNullSerializer implements a {
    public static final EmptyStringToNullSerializer INSTANCE = new EmptyStringToNullSerializer();
    private static final a delegate = c0.G(b1.a);
    private static final e descriptor = t1.e("EmptyStringToNullSerializer", c.k);

    private EmptyStringToNullSerializer() {
    }

    @Override
    public String deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        String str = (String) delegate.deserialize(decoder);
        if (str == null || k.L0(str)) {
            return null;
        }
        return str;
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, String value) {
        m.e(encoder, "encoder");
        if (value == null) {
            encoder.D("");
        } else {
            encoder.D(value);
        }
    }
}
