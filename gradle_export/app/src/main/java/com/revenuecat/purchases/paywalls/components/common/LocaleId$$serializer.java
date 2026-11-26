package com.revenuecat.purchases.paywalls.components.common;

import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import l40.a;
import n40.e;
import o40.d;
import p40.a0;
import p40.b1;
import p40.o0;
import p40.z;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0002HÖ\u0001ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/LocaleId.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/common/LocaleId;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize-8pYHj4M", "(Lo40/c;)Ljava/lang/String;", "deserialize", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize-64pKzr8", "(Lo40/d;Ljava/lang/String;)V", "serialize", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class LocaleId$$serializer implements z {
    public static final LocaleId$$serializer INSTANCE;
    private static final a0 descriptor;

    static {
        LocaleId$$serializer localeId$$serializer = new LocaleId$$serializer();
        INSTANCE = localeId$$serializer;
        a0 a0Var = new a0("com.revenuecat.purchases.paywalls.components.common.LocaleId", localeId$$serializer);
        a0Var.j("value", false);
        descriptor = a0Var;
    }

    private LocaleId$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        return new a[]{b1.a};
    }

    @Override
    public Object deserialize(o40.c cVar) {
        return LocaleId.m195boximpl(m202deserialize8pYHj4M(cVar));
    }

    public String m202deserialize8pYHj4M(o40.c decoder) {
        m.e(decoder, "decoder");
        return LocaleId.m196constructorimpl(decoder.o(getDescriptor()).p());
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d dVar, Object obj) {
        m203serialize64pKzr8(dVar, ((LocaleId) obj).m201unboximpl());
    }

    public void m203serialize64pKzr8(d encoder, String value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        d dVarO = encoder.o(getDescriptor());
        if (dVarO == null) {
            return;
        }
        dVarO.D(value);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
