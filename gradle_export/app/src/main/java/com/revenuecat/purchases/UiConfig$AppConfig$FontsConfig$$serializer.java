package com.revenuecat.purchases;

import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import p40.o0;
import p40.q0;
import p40.z;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/UiConfig.AppConfig.FontsConfig.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@g00.c
public final class UiConfig$AppConfig$FontsConfig$$serializer implements z {
    public static final UiConfig$AppConfig$FontsConfig$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        UiConfig$AppConfig$FontsConfig$$serializer uiConfig$AppConfig$FontsConfig$$serializer = new UiConfig$AppConfig$FontsConfig$$serializer();
        INSTANCE = uiConfig$AppConfig$FontsConfig$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.UiConfig.AppConfig.FontsConfig", uiConfig$AppConfig$FontsConfig$$serializer, 1);
        q0Var.j("android", false);
        descriptor = q0Var;
    }

    private UiConfig$AppConfig$FontsConfig$$serializer() {
    }

    @Override
    public l40.a[] childSerializers() {
        return new l40.a[]{UiConfig.AppConfig.FontsConfig.$childSerializers[0]};
    }

    @Override
    public UiConfig.AppConfig.FontsConfig deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        n40.e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        l40.a[] aVarArr = UiConfig.AppConfig.FontsConfig.$childSerializers;
        boolean z = true;
        int i = 0;
        UiConfig.AppConfig.FontsConfig.FontInfo fontInfo = null;
        while (z) {
            int iL = aVarC.l(descriptor2);
            if (iL == -1) {
                z = false;
            } else {
                if (iL != 0) {
                    throw new UnknownFieldException(iL);
                }
                fontInfo = (UiConfig.AppConfig.FontsConfig.FontInfo) aVarC.s(descriptor2, 0, aVarArr[0], fontInfo);
                i = 1;
            }
        }
        aVarC.a(descriptor2);
        return new UiConfig.AppConfig.FontsConfig(i, fontInfo, null);
    }

    @Override
    public n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(o40.d encoder, UiConfig.AppConfig.FontsConfig value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        n40.e descriptor2 = getDescriptor();
        o40.b bVarC = encoder.c(descriptor2);
        bVarC.C(descriptor2, 0, UiConfig.AppConfig.FontsConfig.$childSerializers[0], value.android);
        bVarC.a(descriptor2);
    }

    @Override
    public l40.a[] typeParametersSerializers() {
        return o0.b;
    }
}
