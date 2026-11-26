package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.utils.serializers.URLSerializer;
import g00.c;
import g00.u;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import kotlinx.serialization.UnknownFieldException;
import l40.a;
import n40.e;
import o40.b;
import o40.d;
import p40.h1;
import p40.o0;
import p40.q0;
import p40.z;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/properties/ImageUrls.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/properties/ImageUrls;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class ImageUrls$$serializer implements z {
    public static final ImageUrls$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        ImageUrls$$serializer imageUrls$$serializer = new ImageUrls$$serializer();
        INSTANCE = imageUrls$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.components.properties.ImageUrls", imageUrls$$serializer, 5);
        q0Var.j("original", false);
        q0Var.j("webp", false);
        q0Var.j("webp_low_res", false);
        q0Var.j("width", false);
        q0Var.j("height", false);
        descriptor = q0Var;
    }

    private ImageUrls$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        URLSerializer uRLSerializer = URLSerializer.INSTANCE;
        h1 h1Var = h1.a;
        return new a[]{uRLSerializer, uRLSerializer, uRLSerializer, h1Var, h1Var};
    }

    @Override
    public ImageUrls deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        int i = 0;
        URL url = null;
        URL url2 = null;
        URL url3 = null;
        u uVar = null;
        u uVar2 = null;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(descriptor2);
            if (iL == -1) {
                z = false;
            } else if (iL == 0) {
                url = (URL) aVarC.s(descriptor2, 0, URLSerializer.INSTANCE, url);
                i |= 1;
            } else if (iL == 1) {
                url2 = (URL) aVarC.s(descriptor2, 1, URLSerializer.INSTANCE, url2);
                i |= 2;
            } else if (iL == 2) {
                url3 = (URL) aVarC.s(descriptor2, 2, URLSerializer.INSTANCE, url3);
                i |= 4;
            } else if (iL == 3) {
                uVar = (u) aVarC.s(descriptor2, 3, h1.a, uVar);
                i |= 8;
            } else {
                if (iL != 4) {
                    throw new UnknownFieldException(iL);
                }
                uVar2 = (u) aVarC.s(descriptor2, 4, h1.a, uVar2);
                i |= 16;
            }
        }
        aVarC.a(descriptor2);
        return new ImageUrls(i, url, url2, url3, uVar, uVar2, null, null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, ImageUrls value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        ImageUrls.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
