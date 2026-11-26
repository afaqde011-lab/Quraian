package androidx.compose.runtime.tooling;

import a2.a;
import a2.c;
import a2.i;
import a2.o;
import com.google.android.gms.cast.MediaError;
import h00.g0;
import h00.n;
import h00.q;
import h00.v;
import i00.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/tooling/DiagnosticComposeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DiagnosticComposeException extends RuntimeException {
    public final a A;

    public DiagnosticComposeException(a aVar) {
        this.A = aVar;
        if (aVar.f156b) {
            return;
        }
        int[] iArr = {MediaError.DetailedErrorCode.MEDIAKEYS_NETWORK, MediaError.DetailedErrorCode.MEDIAKEYS_UNSUPPORTED, 204, 206, 207, 125, -127, 126665345, MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN};
        List list = aVar.f155a;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            c cVar = (c) list.get(i10);
            if (!n.n0(iArr, cVar.f157a)) {
                if (cVar.f157a == 100) {
                    int i12 = i10 + 2;
                    if (i12 < size && ((c) list.get(i12)).f157a == 1000) {
                        break;
                    } else {
                        v.z0(arrayList);
                    }
                } else {
                    arrayList.add(cVar);
                }
            }
            i10 = i11;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i13 = 0; i13 < size2; i13++) {
            stackTraceElementArr[i13] = new StackTraceElement("$$compose", "m$" + ((c) arrayList.get(i13)).f157a, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override
    public final String getMessage() {
        a aVar = this.A;
        if (!aVar.f156b) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb2 = new StringBuilder("Composition stack when thrown:\n");
        b bVarS = va.a.s();
        g0 g0VarC0 = q.C0(aVar.f155a);
        int iA = g0VarC0.a();
        String str = null;
        String str2 = null;
        for (int i10 = 0; i10 < iA; i10++) {
            c cVar = (c) g0VarC0.get(i10);
            o oVar = cVar.f158b;
            Integer num = cVar.f159c;
            if (oVar != null) {
                boolean z10 = oVar.C;
                String str3 = (String) oVar.A;
                if (str3 == null) {
                    String str4 = z10 ? "<lambda>" : null;
                    if (str4 != null) {
                        str = str4;
                    } else if (str == null) {
                        str = "<unknown function>";
                    }
                } else {
                    str = str3;
                }
                String str5 = (String) oVar.B;
                if (str5 != null) {
                    str2 = str5;
                } else if (str2 == null) {
                    str2 = "<unknown file>";
                }
                ?? r12 = oVar.F;
                String str6 = str + '(' + str2 + ':' + ((num == null || num.intValue() >= r12.size()) ? "<unknown line>" : String.valueOf(((i) r12.get(num.intValue())).f162a)) + ')';
                if (!z10) {
                }
                if (!m.a(str3, "rememberCompositionContext") || !m.a((String) oVar.D, "9igjgp")) {
                    bVarS.add(str6);
                }
            }
        }
        g0 g0VarC1 = q.C0(va.a.k(bVarS));
        int iA2 = g0VarC1.a();
        for (int i11 = 0; i11 < iA2; i11++) {
            String str7 = (String) g0VarC1.get(i11);
            sb2.append("\tat ");
            sb2.append(str7);
            sb2.append('\n');
        }
        return sb2.toString();
    }
}
