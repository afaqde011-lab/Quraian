package ap;

import k00.c;
import kotlin.Metadata;
import n60.f;
import n60.i;
import n60.n;
import n60.o;
import vo.a0;
import vo.b;
import vo.b0;
import vo.c0;
import vo.d;
import vo.e;
import vo.g;
import vo.h;
import vo.j;
import vo.k;
import vo.l;
import vo.m;
import vo.p;
import vo.q;
import vo.r;
import vo.s;
import vo.t;
import vo.u;
import vo.v;
import vo.w;
import vo.x;
import vo.y;
import vo.z;

@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0003\u001a\u00020\u0007H§@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\f\u001a\u0004\u0018\u00010\b2\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00162\b\b\u0001\u0010\u0003\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0019\u0010\u0018J\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u001aH§@¢\u0006\u0004\b\u001d\u0010\u001cJ\u001c\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0001\u0010\u0003\u001a\u00020\u001eH§@¢\u0006\u0004\b \u0010!J\u001c\u0010#\u001a\u0004\u0018\u00010\u001f2\b\b\u0001\u0010\u0003\u001a\u00020\"H§@¢\u0006\u0004\b#\u0010$J\u001c\u0010'\u001a\u0004\u0018\u00010&2\b\b\u0001\u0010\u0003\u001a\u00020%H§@¢\u0006\u0004\b'\u0010(J\u001c\u0010*\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0003\u001a\u00020)H§@¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020-2\b\b\u0001\u0010\u0003\u001a\u00020,H§@¢\u0006\u0004\b.\u0010/J\u001c\u00101\u001a\u0004\u0018\u00010\u000f2\b\b\u0001\u0010\u0003\u001a\u000200H§@¢\u0006\u0004\b1\u00102J\u0012\u00104\u001a\u0004\u0018\u000103H§@¢\u0006\u0004\b4\u00105J\u001c\u00109\u001a\u0004\u0018\u0001082\b\b\u0001\u00107\u001a\u000206H§@¢\u0006\u0004\b9\u0010:J$\u0010<\u001a\u00020-2\b\b\u0001\u00107\u001a\u0002062\b\b\u0001\u0010;\u001a\u000206H§@¢\u0006\u0004\b<\u0010=J$\u0010?\u001a\u00020-2\b\b\u0001\u0010;\u001a\u0002062\b\b\u0001\u0010\u0003\u001a\u00020>H§@¢\u0006\u0004\b?\u0010@J\u001c\u0010B\u001a\u0004\u0018\u0001032\b\b\u0001\u0010\u0003\u001a\u00020AH§@¢\u0006\u0004\bB\u0010CJ\u001a\u0010E\u001a\u00020-2\b\b\u0001\u0010\u0003\u001a\u00020DH§@¢\u0006\u0004\bE\u0010FJ\u0012\u0010H\u001a\u0004\u0018\u00010GH§@¢\u0006\u0004\bH\u00105J\u001a\u0010J\u001a\u00020-2\b\b\u0001\u0010\u0003\u001a\u00020IH§@¢\u0006\u0004\bJ\u0010KJ\u001c\u0010N\u001a\u0004\u0018\u00010M2\b\b\u0001\u0010\u0003\u001a\u00020LH§@¢\u0006\u0004\bN\u0010O¨\u0006PÀ\u0006\u0003"}, d2 = {"Lap/a;", "", "Lvo/x;", "body", "Lvo/d;", "i", "(Lvo/x;Lk00/c;)Ljava/lang/Object;", "Lvo/a0;", "Lvo/z;", "s", "(Lvo/a0;Lk00/c;)Ljava/lang/Object;", "Lvo/u;", "f", "(Lvo/u;Lk00/c;)Ljava/lang/Object;", "Lvo/s;", "Lvo/r;", "c", "(Lvo/s;Lk00/c;)Ljava/lang/Object;", "Lvo/k;", "b", "(Lvo/k;Lk00/c;)Ljava/lang/Object;", "Lvo/n;", "Lvo/m;", "w", "(Lvo/n;Lk00/c;)Ljava/lang/Object;", "v", "Lvo/j;", "n", "(Lvo/j;Lk00/c;)Ljava/lang/Object;", "g", "Lvo/h;", "Lvo/g;", "a", "(Lvo/h;Lk00/c;)Ljava/lang/Object;", "Lvo/i;", "m", "(Lvo/i;Lk00/c;)Ljava/lang/Object;", "Lvo/c0;", "Lvo/b0;", "e", "(Lvo/c0;Lk00/c;)Ljava/lang/Object;", "Lvo/v;", "d", "(Lvo/v;Lk00/c;)Ljava/lang/Object;", "Lvo/l;", "Lg00/b0;", "q", "(Lvo/l;Lk00/c;)Ljava/lang/Object;", "Lvo/q;", "u", "(Lvo/q;Lk00/c;)Ljava/lang/Object;", "Lvo/t;", "k", "(Lk00/c;)Ljava/lang/Object;", "", "deviceId", "Lvo/b;", "h", "(Ljava/lang/String;Lk00/c;)Ljava/lang/Object;", "currentDeviceId", "o", "(Ljava/lang/String;Ljava/lang/String;Lk00/c;)Ljava/lang/Object;", "Lvo/w;", "r", "(Ljava/lang/String;Lvo/w;Lk00/c;)Ljava/lang/Object;", "Lvo/y;", "p", "(Lvo/y;Lk00/c;)Ljava/lang/Object;", "Lvo/f;", "x", "(Lvo/f;Lk00/c;)Ljava/lang/Object;", "Lvo/e;", "j", "Lvo/c;", "l", "(Lvo/c;Lk00/c;)Ljava/lang/Object;", "Lvo/o;", "Lvo/p;", "t", "(Lvo/o;Lk00/c;)Ljava/lang/Object;", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface a {
    @o("auth/forgot-password")
    Object a(@n60.a h hVar, c<? super g> cVar);

    @o("auth/login")
    Object b(@n60.a k kVar, c<? super r> cVar);

    @o("auth/register/complete")
    Object c(@n60.a s sVar, c<? super r> cVar);

    @o("auth/reset-password")
    Object d(@n60.a v vVar, c<? super r> cVar);

    @o("auth/forgot-password/verify-code")
    Object e(@n60.a c0 c0Var, c<? super b0> cVar);

    @o("auth/register/resend")
    Object f(@n60.a u uVar, c<? super z> cVar);

    @o("auth/oauth/apple")
    Object g(@n60.a j jVar, c<? super r> cVar);

    @f("auth/devices")
    Object h(@i("X-Device-Id") String str, c<? super b> cVar);

    @o("auth/start")
    Object i(@n60.a x xVar, c<? super d> cVar);

    @o("v2/auth/me/delete-code")
    Object j(c<? super e> cVar);

    @f("auth/me")
    Object k(c<? super t> cVar);

    @o("auth/change-password")
    Object l(@n60.a vo.c cVar, c<? super g00.b0> cVar2);

    @o("auth/forgot-password/resend")
    Object m(@n60.a vo.i iVar, c<? super g> cVar);

    @o("auth/oauth/google")
    Object n(@n60.a j jVar, c<? super r> cVar);

    @n60.b("auth/devices/{device_id}")
    Object o(@n60.s("device_id") String str, @i("X-Device-Id") String str2, c<? super g00.b0> cVar);

    @n("auth/me")
    Object p(@n60.a y yVar, c<? super t> cVar);

    @o("auth/logout")
    Object q(@n60.a l lVar, c<? super g00.b0> cVar);

    @n60.h(hasBody = true, method = "DELETE", path = "auth/devices")
    Object r(@i("X-Device-Id") String str, @n60.a w wVar, c<? super g00.b0> cVar);

    @o("auth/register/verify-code")
    Object s(@n60.a a0 a0Var, c<? super z> cVar);

    @o("v1/subscription/purchase-device")
    Object t(@n60.a vo.o oVar, c<? super p> cVar);

    @o("auth/refresh")
    Object u(@n60.a q qVar, c<? super r> cVar);

    @o("auth/oauth/apple/lookup")
    Object v(@n60.a vo.n nVar, c<? super m> cVar);

    @o("auth/oauth/google/lookup")
    Object w(@n60.a vo.n nVar, c<? super m> cVar);

    @n60.h(hasBody = true, method = "DELETE", path = "v2/auth/me")
    Object x(@n60.a vo.f fVar, c<? super g00.b0> cVar);
}
