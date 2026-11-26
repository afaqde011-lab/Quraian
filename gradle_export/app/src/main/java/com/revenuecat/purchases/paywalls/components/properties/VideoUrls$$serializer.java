package com.revenuecat.purchases.paywalls.components.properties;

import com.revenuecat.purchases.common.HTTPClient;
import com.revenuecat.purchases.models.Checksum;
import com.revenuecat.purchases.models.Checksum$$serializer;
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
import ta.c0;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"com/revenuecat/purchases/paywalls/components/properties/VideoUrls.$serializer", "Lp40/z;", "Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;", "<init>", "()V", "", "Ll40/a;", "childSerializers", "()[Ll40/a;", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Lcom/revenuecat/purchases/paywalls/components/properties/VideoUrls;)V", "Ln40/e;", "getDescriptor", "()Ln40/e;", "descriptor", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@c
public final class VideoUrls$$serializer implements z {
    public static final VideoUrls$$serializer INSTANCE;
    private static final q0 descriptor;

    static {
        VideoUrls$$serializer videoUrls$$serializer = new VideoUrls$$serializer();
        INSTANCE = videoUrls$$serializer;
        q0 q0Var = new q0("com.revenuecat.purchases.paywalls.components.properties.VideoUrls", videoUrls$$serializer, 6);
        q0Var.j("width", false);
        q0Var.j("height", false);
        q0Var.j("url", false);
        q0Var.j("checksum", true);
        q0Var.j("url_low_res", true);
        q0Var.j("checksum_low_res", true);
        descriptor = q0Var;
    }

    private VideoUrls$$serializer() {
    }

    @Override
    public a[] childSerializers() {
        URLSerializer uRLSerializer = URLSerializer.INSTANCE;
        Checksum$$serializer checksum$$serializer = Checksum$$serializer.INSTANCE;
        a aVarG = c0.G(checksum$$serializer);
        a aVarG2 = c0.G(uRLSerializer);
        a aVarG3 = c0.G(checksum$$serializer);
        h1 h1Var = h1.a;
        return new a[]{h1Var, h1Var, uRLSerializer, aVarG, aVarG2, aVarG3};
    }

    @Override
    public VideoUrls deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        e descriptor2 = getDescriptor();
        o40.a aVarC = decoder.c(descriptor2);
        int i = 0;
        u uVar = null;
        u uVar2 = null;
        URL url = null;
        Checksum checksum = null;
        URL url2 = null;
        Checksum checksum2 = null;
        boolean z = true;
        while (z) {
            int iL = aVarC.l(descriptor2);
            switch (iL) {
                case HTTPClient.NO_STATUS_CODE:
                    z = false;
                    break;
                case 0:
                    uVar = (u) aVarC.s(descriptor2, 0, h1.a, uVar);
                    i |= 1;
                    break;
                case 1:
                    uVar2 = (u) aVarC.s(descriptor2, 1, h1.a, uVar2);
                    i |= 2;
                    break;
                case 2:
                    url = (URL) aVarC.s(descriptor2, 2, URLSerializer.INSTANCE, url);
                    i |= 4;
                    break;
                case 3:
                    checksum = (Checksum) aVarC.v(descriptor2, 3, Checksum$$serializer.INSTANCE, checksum);
                    i |= 8;
                    break;
                case 4:
                    url2 = (URL) aVarC.v(descriptor2, 4, URLSerializer.INSTANCE, url2);
                    i |= 16;
                    break;
                case 5:
                    checksum2 = (Checksum) aVarC.v(descriptor2, 5, Checksum$$serializer.INSTANCE, checksum2);
                    i |= 32;
                    break;
                default:
                    throw new UnknownFieldException(iL);
            }
        }
        aVarC.a(descriptor2);
        return new VideoUrls(i, uVar, uVar2, url, checksum, url2, checksum2, null, null);
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, VideoUrls value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        e descriptor2 = getDescriptor();
        b bVarC = encoder.c(descriptor2);
        VideoUrls.write$Self$purchases_defaultsBc8Release(value, bVarC, descriptor2);
        bVarC.a(descriptor2);
    }

    @Override
    public a[] typeParametersSerializers() {
        return o0.b;
    }
}
