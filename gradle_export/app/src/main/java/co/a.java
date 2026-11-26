package co;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import k00.c;
import kotlin.Metadata;
import l60.o0;
import n60.f;
import n60.o;
import n60.s;
import n60.t;
import n60.w;
import n60.y;
import un.e;
import un.g;
import un.j;
import un.l;
import un.m;
import un.n;
import un.p;
import x40.d0;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000b2\b\b\u0001\u0010\n\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u000b2\b\b\u0001\u0010\u0016\u001a\u00020\u0007H§@¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000b2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u001b\u0010\u0019J\u001a\u0010\u001e\u001a\u00020\u001d2\b\b\u0001\u0010\u001c\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001e\u0010\u0006¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lco/a;", "", "", "language", "Lun/j;", "c", "(Ljava/lang/String;Lk00/c;)Ljava/lang/Object;", "", "episodeId", "Lun/n;", "body", "Ll60/o0;", "Lun/o;", "g", "(ILun/n;Lk00/c;)Ljava/lang/Object;", "Lun/l;", "Lun/m;", "b", "(Lun/l;Lk00/c;)Ljava/lang/Object;", "Lun/g;", "d", "(Lun/g;Lk00/c;)Ljava/lang/Object;", "storyId", "Lun/p;", "e", "(ILk00/c;)Ljava/lang/Object;", "Lun/e;", "f", "url", "Lx40/d0;", "a", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @w
    @f
    Object a(@y String str, c<? super d0> cVar);

    @o("audio-stories/import")
    Object b(@n60.a l lVar, c<? super o0<m>> cVar);

    @f("audio-stories")
    Object c(@t("language") String str, c<? super j> cVar);

    @o("audio-stories/events")
    Object d(@n60.a g gVar, c<? super o0<Object>> cVar);

    @f("audio-stories/{id}/download")
    Object e(@s(DiagnosticsEntry.ID_KEY) int i, c<? super o0<p>> cVar);

    @f("audio-stories/episodes/{id}/download")
    Object f(@s(DiagnosticsEntry.ID_KEY) int i, c<? super o0<e>> cVar);

    @n60.p("audio-stories/episodes/{id}/progress")
    Object g(@s(DiagnosticsEntry.ID_KEY) int i, @n60.a n nVar, c<? super o0<un.o>> cVar);
}
