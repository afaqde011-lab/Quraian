package ms;

import g00.b0;
import hs.c0;
import hs.d;
import hs.e;
import hs.l;
import hs.m;
import hs.n;
import hs.p;
import hs.r;
import hs.s;
import k00.c;
import kotlin.Metadata;
import n60.f;
import n60.i;
import n60.o;
import n60.t;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J0\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ&\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u0005H§@¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001c\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010\u001f\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u001eH§@¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010\"\u001a\u0004\u0018\u00010!2\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\"\u0010#J$\u0010&\u001a\u00020%2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020$H§@¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020%H§@¢\u0006\u0004\b(\u0010)¨\u0006*À\u0006\u0003"}, d2 = {"Lms/b;", "", "", "timezone", "deviceId", "", "historyDays", "Lhs/t;", "d", "(Ljava/lang/String;Ljava/lang/String;ILk00/c;)Ljava/lang/Object;", "year", "Lhs/c0;", "h", "(Ljava/lang/String;ILk00/c;)Ljava/lang/Object;", "Lhs/e;", "body", "Lhs/d;", "c", "(Lhs/e;Lk00/c;)Ljava/lang/Object;", "Lhs/s;", "Lhs/r;", "j", "(Ljava/lang/String;Lhs/s;Lk00/c;)Ljava/lang/Object;", "Lhs/m;", "Lhs/n;", "g", "(Ljava/lang/String;Lhs/m;Lk00/c;)Ljava/lang/Object;", "Lhs/l;", "e", "(Ljava/lang/String;Lhs/l;Lk00/c;)Ljava/lang/Object;", "Lhs/o;", "a", "(Ljava/lang/String;Lhs/o;Lk00/c;)Ljava/lang/Object;", "Lhs/p;", "b", "(Ljava/lang/String;Lk00/c;)Ljava/lang/Object;", "Lhs/f;", "Lg00/b0;", "i", "(Ljava/lang/String;Lhs/f;Lk00/c;)Ljava/lang/Object;", "f", "(Lk00/c;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface b {
    @o("listening/import")
    Object a(@i("X-Device-Id") String str, @n60.a hs.o oVar, c<Object> cVar);

    @f("listening/import")
    Object b(@i("X-Device-Id") String str, c<? super p> cVar);

    @o("listening/events")
    Object c(@n60.a e eVar, c<? super d> cVar);

    @f("listening/me")
    Object d(@i("X-Timezone") String str, @i("X-Device-Id") String str2, @t("history_days") int i, c<? super hs.t> cVar);

    @o("listening/import/uploads/parts")
    Object e(@i("X-Device-Id") String str, @n60.a l lVar, c<Object> cVar);

    @n60.b("listening/me")
    Object f(c<? super b0> cVar);

    @o("listening/import/uploads/part")
    Object g(@i("X-Device-Id") String str, @n60.a m mVar, c<? super n> cVar);

    @f("listening/year")
    Object h(@i("X-Timezone") String str, @t("year") int i, c<? super c0> cVar);

    @n60.n("listening/goal")
    Object i(@i("X-Timezone") String str, @n60.a hs.f fVar, c<? super b0> cVar);

    @o("listening/import/uploads")
    Object j(@i("X-Device-Id") String str, @n60.a s sVar, c<? super r> cVar);
}
