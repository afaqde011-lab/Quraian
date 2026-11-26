package com.revenuecat.purchases;

import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.paywalls.components.properties.FontStyle;
import com.revenuecat.purchases.paywalls.components.properties.FontStyleDeserializer;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import p40.b1;
import p40.e0;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/UiConfig.AppConfig.FontsConfig.FontInfo.Name.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@g00.c
public final class UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer implements z {
    public static final UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer uiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer = new UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer();
        INSTANCE = uiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer;
        q0 q0Var = new q0(DiagnosticsEntry.NAME_KEY, uiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer, 6);
        q0Var.j("value", false);
        q0Var.j("url", true);
        q0Var.j("hash", true);
        q0Var.j("family", true);
        q0Var.j("weight", true);
        q0Var.j("style", true);
        descriptor = q0Var;
    }

    private UiConfig$AppConfig$FontsConfig$FontInfo$Name$$serializer() {
    }

    @Override
    public l40.a[] childSerializers() {
        b1 b1Var = b1.a;
        return new l40.a[]{b1Var, c0.G(b1Var), c0.G(b1Var), c0.G(b1Var), c0.G(e0.a), c0.G(FontStyleDeserializer.INSTANCE)};
    }

    @Override
    public UiConfig.AppConfig.FontsConfig.FontInfo.Name deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        n40.e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        int i = 0;
        String strT = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        Integer num = null;
        FontStyle fontStyle = null;
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
                    str = (String) aVarC.v(descriptor2, 1, b1.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = (String) aVarC.v(descriptor2, 2, b1.a, str2);
                    i |= 4;
                    break;
                case 3:
                    str3 = (String) aVarC.v(descriptor2, 3, b1.a, str3);
                    i |= 8;
                    break;
                case 4:
                    num = (Integer) aVarC.v(descriptor2, 4, e0.a, num);
                    i |= 16;
                    break;
                case 5:
                    fontStyle = (FontStyle) aVarC.v(descriptor2, 5, FontStyleDeserializer.INSTANCE, fontStyle);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new UiConfig.AppConfig.FontsConfig.FontInfo.Name(i, strT, str, str2, str3, num, fontStyle, (x0) null);
    }

    @Override
    public n40.e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(o40.d encoder, UiConfig.AppConfig.FontsConfig.FontInfo.Name value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        n40.e descriptor2 = getDescriptor();
        o40.b bVarC = encoder.c(descriptor2);
        UiConfig.AppConfig.FontsConfig.FontInfo.Name.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public l40.a[] typeParametersSerializers() {
        return o0.b;
    }
}
