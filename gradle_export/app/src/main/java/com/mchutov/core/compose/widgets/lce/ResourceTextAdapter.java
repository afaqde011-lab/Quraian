package com.mchutov.core.compose.widgets.lce;

import bk.o;
import bk.p;
import bk.q;
import bk.s;
import bk.t;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/mchutov/core/compose/widgets/lce/ResourceTextAdapter;", "Lbk/p;", "Lcom/mchutov/core/compose/widgets/lce/ResourceText;", "<init>", "()V", "Lbk/q;", "json", "Ljava/lang/reflect/Type;", "typeOfT", "Lbk/o;", "context", "deserialize", "(Lbk/q;Ljava/lang/reflect/Type;Lbk/o;)Lcom/mchutov/core/compose/widgets/lce/ResourceText;", "core_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ResourceTextAdapter implements p {
    public static final int $stable = 0;

    public ResourceText m0deserialize(q json, Type typeOfT, o context) {
        q qVar;
        m.e(json, "json");
        m.e(typeOfT, "typeOfT");
        m.e(context, "context");
        if ((json instanceof s) && (qVar = (q) json.b().A.get("value")) != null) {
            boolean z = qVar instanceof t;
            if (!z || !(qVar.c().A instanceof String)) {
                return (z && (qVar.c().A instanceof Number)) ? new ResourceText.Res(qVar.a(), null, 2, null) : new ResourceText.String("", null, 2, null);
            }
            String strE = qVar.e();
            m.d(strE, "getAsString(...)");
            return new ResourceText.String(strE, null, 2, null);
        }
        return new ResourceText.String("", null, 2, null);
    }
}
