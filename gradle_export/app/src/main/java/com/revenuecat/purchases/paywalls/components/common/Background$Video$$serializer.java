package com.revenuecat.purchases.paywalls.components.common;

import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme;
import com.revenuecat.purchases.paywalls.components.properties.ColorScheme$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.FitMode;
import com.revenuecat.purchases.paywalls.components.properties.FitModeDeserializer;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeImageUrls$$serializer;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls;
import com.revenuecat.purchases.paywalls.components.properties.ThemeVideoUrls$$serializer;
import g00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import l40.a;
import n40.e;
import o40.b;
import o40.d;
import p40.f;
import p40.o0;
import p40.q0;
import p40.x0;
import p40.z;
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/common/Background.Video.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/common/Background$Video;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class Background$Video$$serializer implements z {
    public static final Background$Video$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        Background$Video$$serializer background$Video$$serializer = new Background$Video$$serializer();
        INSTANCE = background$Video$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.components.common.Background.Video", background$Video$$serializer, 6);
        q0Var.j("value", false);
        q0Var.j("fallback_image", false);
        q0Var.j("loop", false);
        q0Var.j("mute_audio", false);
        q0Var.j("fit_mode", true);
        q0Var.j("color_overlay", true);
        descriptor = q0Var;
    }

    private Background$Video$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        a aVarG = c0.G(ColorScheme$$serializer.INSTANCE);
        f fVar = f.a;
        return new a[]{ThemeVideoUrls$$serializer.INSTANCE, ThemeImageUrls$$serializer.INSTANCE, fVar, fVar, FitModeDeserializer.INSTANCE, aVarG};
    }

    @Override
    public Background.Video deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        int i = 0;
        boolean zR = false;
        boolean zR2 = false;
        ThemeVideoUrls themeVideoUrls = null;
        ThemeImageUrls themeImageUrls = null;
        FitMode fitMode = null;
        ColorScheme colorScheme = null;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    z = false;
                    break;
                case 0:
                    themeVideoUrls = (ThemeVideoUrls) aVarC.s(descriptor2, 0, ThemeVideoUrls$$serializer.INSTANCE, themeVideoUrls);
                    i |= 1;
                    break;
                case 1:
                    themeImageUrls = (ThemeImageUrls) aVarC.s(descriptor2, 1, ThemeImageUrls$$serializer.INSTANCE, themeImageUrls);
                    i |= 2;
                    break;
                case 2:
                    zR = aVarC.r(descriptor2, 2);
                    i |= 4;
                    break;
                case 3:
                    zR2 = aVarC.r(descriptor2, 3);
                    i |= 8;
                    break;
                case 4:
                    fitMode = (FitMode) aVarC.s(descriptor2, 4, FitModeDeserializer.INSTANCE, fitMode);
                    i |= 16;
                    break;
                case 5:
                    colorScheme = (ColorScheme) aVarC.v(descriptor2, 5, ColorScheme$$serializer.INSTANCE, colorScheme);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new Background.Video(i, themeVideoUrls, themeImageUrls, zR, zR2, fitMode, colorScheme, (x0) null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, Background.Video value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        Background.Video.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
