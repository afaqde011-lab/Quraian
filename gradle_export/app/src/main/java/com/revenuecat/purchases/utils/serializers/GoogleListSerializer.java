package com.revenuecat.purchases.utils.serializers;

import com.mchutov.quranify.auth.presentation.analytics.AuthAnalyticsProvider;
import h00.r;
import h00.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import l40.a;
import n40.c;
import n40.e;
import o40.d;
import q40.j;
import q40.l;
import ri.t1;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/revenuecat/purchases/utils/serializers/GoogleListSerializer;", "Ll40/a;", "", "", "<init>", "()V", "Lo40/d;", "encoder", "value", "Lg00/b0;", "serialize", "(Lo40/d;Ljava/util/List;)V", "Lo40/c;", "decoder", "deserialize", "(Lo40/c;)Ljava/util/List;", "Ln40/e;", "descriptor", "Ln40/e;", "getDescriptor", "()Ln40/e;", "purchases_defaultsBc8Release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class GoogleListSerializer implements a {
    public static final GoogleListSerializer INSTANCE = new GoogleListSerializer();
    private static final e descriptor = t1.e("GoogleList", c.k);

    private GoogleListSerializer() {
    }

    @Override
    public List<String> deserialize(o40.c decoder) {
        m.e(decoder, "decoder");
        j jVar = decoder instanceof j ? (j) decoder : null;
        if (jVar == null) {
            throw new IllegalStateException("This serializer can be used only with JSON format");
        }
        l lVar = (l) q40.m.g(jVar.m()).get(AuthAnalyticsProvider.GOOGLE);
        q40.e eVarF = lVar != null ? q40.m.f(lVar) : null;
        if (eVarF == null) {
            return x.A;
        }
        ArrayList arrayList = new ArrayList(r.q0(eVarF, 10));
        Iterator it = eVarF.A.iterator();
        while (it.hasNext()) {
            arrayList.add(q40.m.h((l) it.next()).a());
        }
        return arrayList;
    }

    @Override
    public e getDescriptor() {
        return descriptor;
    }

    @Override
    public void serialize(d encoder, List<String> value) {
        m.e(encoder, "encoder");
        m.e(value, "value");
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
