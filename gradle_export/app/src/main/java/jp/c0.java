package jp;

import com.mchutov.core.domain.error.ApiException;
import com.mchutov.core.domain.exception.AuthException;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalyticsProviderKt;
import ri.t1;

public final class c0 extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final e0 C;

    public c0(e0 e0Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = e0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                c0 c0Var = new c0(this.C, cVar, 0);
                c0Var.B = obj;
                return c0Var;
            case 1:
                c0 c0Var2 = new c0(this.C, cVar, 1);
                c0Var2.B = obj;
                return c0Var2;
            case 2:
                c0 c0Var3 = new c0(this.C, cVar, 2);
                c0Var3.B = obj;
                return c0Var3;
            case 3:
                c0 c0Var4 = new c0(this.C, cVar, 3);
                c0Var4.B = obj;
                return c0Var4;
            case 4:
                c0 c0Var5 = new c0(this.C, cVar, 4);
                c0Var5.B = obj;
                return c0Var5;
            case 5:
                c0 c0Var6 = new c0(this.C, cVar, 5);
                c0Var6.B = obj;
                return c0Var6;
            default:
                c0 c0Var7 = new c0(this.C, cVar, 6);
                c0Var7.B = obj;
                return c0Var7;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        Throwable th = (Throwable) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                c0 c0Var = (c0) create(th, cVar);
                g00.b0 b0Var = g00.b0.a;
                c0Var.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                c0 c0Var2 = (c0) create(th, cVar);
                g00.b0 b0Var2 = g00.b0.a;
                c0Var2.invokeSuspend(b0Var2);
                return b0Var2;
            case 2:
                c0 c0Var3 = (c0) create(th, cVar);
                g00.b0 b0Var3 = g00.b0.a;
                c0Var3.invokeSuspend(b0Var3);
                return b0Var3;
            case 3:
                c0 c0Var4 = (c0) create(th, cVar);
                g00.b0 b0Var4 = g00.b0.a;
                c0Var4.invokeSuspend(b0Var4);
                return b0Var4;
            case 4:
                c0 c0Var5 = (c0) create(th, cVar);
                g00.b0 b0Var5 = g00.b0.a;
                c0Var5.invokeSuspend(b0Var5);
                return b0Var5;
            case 5:
                c0 c0Var6 = (c0) create(th, cVar);
                g00.b0 b0Var6 = g00.b0.a;
                c0Var6.invokeSuspend(b0Var6);
                return b0Var6;
            default:
                c0 c0Var7 = (c0) create(th, cVar);
                g00.b0 b0Var7 = g00.b0.a;
                c0Var7.invokeSuspend(b0Var7);
                return b0Var7;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        String message;
        String strAnalyticsProvider;
        String strA;
        String str;
        String str2;
        String strA2;
        String strA3;
        String str3;
        int i = this.A;
        String str4 = "email";
        String strA4 = null;
        g00.b0 b0Var = g00.b0.a;
        e0 e0Var = this.C;
        Throwable th = (Throwable) this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                AuthAnalytics authAnalytics = e0Var.f;
                pm.b bVar = e0Var.c;
                ep.e eVar = ((x) bVar.d.getValue()).B;
                if (eVar != null && (strAnalyticsProvider = AuthAnalyticsProviderKt.analyticsProvider(eVar)) != null) {
                    str4 = strAnalyticsProvider;
                }
                authAnalytics.signUpFailed(str4, th);
                ep.e eVar2 = ((x) bVar.d.getValue()).B;
                int i2 = eVar2 == null ? -1 : b0.a[eVar2.ordinal()];
                int i3 = i2 != 1 ? i2 != 2 ? 2131886214 : 2131886156 : 2131886174;
                if (((th instanceof ApiException) || (th instanceof AuthException)) && (message = th.getMessage()) != null && !r30.k.L0(message)) {
                    strA4 = message;
                }
                x xVar = (x) bVar.d.getValue();
                if (strA4 == null) {
                    strA4 = e0Var.d.a(i3, new Object[0]);
                }
                e0Var.i(x.b(xVar, false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, strA4, ((x) bVar.d.getValue()).x + 1, null, null, false, 1061158911));
                break;
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                if (th instanceof AuthException) {
                    String str5 = ((AuthException) th).A;
                    if (str5 == null) {
                        strA = e0Var.d.a(2131886164, new Object[0]);
                    } else {
                        int iHashCode = str5.hashCode();
                        if (iHashCode != -664629797) {
                            if (iHashCode != -312202594) {
                                if (iHashCode == 899078987 && str5.equals("otp_resend_limit")) {
                                    strA = e0Var.d.a(2131886203, new Object[0]);
                                } else {
                                    strA = e0Var.d.a(2131886164, new Object[0]);
                                }
                            } else if (str5.equals("otp_locked")) {
                                strA = e0Var.d.a(2131886200, new Object[0]);
                            } else {
                                strA = e0Var.d.a(2131886164, new Object[0]);
                            }
                        } else if (str5.equals("otp_resend_cooldown")) {
                            strA = e0Var.d.a(2131886201, new Object[0]);
                        } else {
                            strA = e0Var.d.a(2131886164, new Object[0]);
                        }
                    }
                } else {
                    strA = e0Var.d.a(2131886164, new Object[0]);
                }
                e0Var.i(x.b((x) e0Var.c.d.getValue(), false, null, null, null, strA, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073741807));
                break;
            case 2:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                AuthAnalytics authAnalytics2 = e0Var.f;
                pm.c cVar = e0Var.d;
                authAnalytics2.passwordResetFailed(th);
                if (th instanceof AuthException) {
                    AuthException authException = (AuthException) th;
                    String str6 = authException.A;
                    if (str6 != null) {
                        switch (str6) {
                            case "otp_resend_cooldown":
                                strA4 = cVar.a(2131886201, new Object[0]);
                            case "otp_locked":
                                strA4 = cVar.a(2131886200, new Object[0]);
                            case "otp_invalid":
                                strA4 = cVar.a(2131886199, new Object[0]);
                            case "otp_resend_limit":
                                strA4 = cVar.a(2131886203, new Object[0]);
                            default:
                                str = authException.B;
                                if (str != null && !r30.k.L0(str)) {
                                    str2 = str;
                                    break;
                                }
                        }
                    } else {
                        str = authException.B;
                        if (str != null) {
                        }
                    }
                    e0Var.i(x.b((x) e0Var.c.d.getValue(), false, null, null, null, null, null, str2, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073741759));
                }
                break;
            case 3:
                l00.a aVar4 = l00.a.A;
                t1.O(obj);
                AuthAnalytics authAnalytics3 = e0Var.f;
                pm.c cVar2 = e0Var.d;
                authAnalytics3.signInFailed("email", th);
                boolean z = th instanceof AuthException;
                if (z && kotlin.jvm.internal.m.a(((AuthException) th).A, "oauth_account_google")) {
                    strA2 = cVar2.a(2131886177, new Object[0]);
                } else if (z && kotlin.jvm.internal.m.a(((AuthException) th).A, "oauth_account_apple")) {
                    strA2 = cVar2.a(2131886176, new Object[0]);
                } else if (z) {
                    AuthException authException2 = (AuthException) th;
                    if (kotlin.jvm.internal.m.a(authException2.A, "password_locked")) {
                        Integer num = authException2.C;
                        if (num == null || num.intValue() <= 0) {
                            strA2 = cVar2.a(2131886207, new Object[0]);
                        } else {
                            int iIntValue = (num.intValue() + 59) / 60;
                            strA2 = cVar2.a(2131886208, Integer.valueOf(iIntValue >= 1 ? iIntValue : 1));
                        }
                    } else {
                        strA2 = cVar2.a(2131886175, new Object[0]);
                    }
                } else {
                    strA2 = cVar2.a(2131886175, new Object[0]);
                }
                e0Var.i(x.b((x) e0Var.c.d.getValue(), false, null, null, null, null, null, strA2, null, null, null, false, 0, 0, false, false, false, null, null, null, null, null, null, null, 0, null, null, false, 1073741759));
                break;
            case 4:
                l00.a aVar5 = l00.a.A;
                t1.O(obj);
                e0Var.o(th);
                x xVar2 = (x) e0Var.c.d.getValue();
                pm.c cVar3 = e0Var.d;
                if (th instanceof AuthException) {
                    String str7 = ((AuthException) th).A;
                    if (str7 != null) {
                        switch (str7) {
                            case "otp_resend_cooldown":
                                strA3 = cVar3.a(2131886201, new Object[0]);
                                break;
                            case "otp_locked":
                                strA3 = cVar3.a(2131886200, new Object[0]);
                                break;
                            case "otp_invalid":
                                strA3 = cVar3.a(2131886199, new Object[0]);
                                break;
                            case "otp_resend_limit":
                                strA3 = cVar3.a(2131886203, new Object[0]);
                                break;
                            default:
                                strA3 = cVar3.a(2131886202, new Object[0]);
                                break;
                        }
                    } else {
                        strA3 = cVar3.a(2131886202, new Object[0]);
                    }
                } else {
                    strA3 = cVar3.a(2131886202, new Object[0]);
                }
                e0Var.i(x.b(xVar2, false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, strA3, null, null, null, null, null, null, 0, null, null, false, 1073676287));
                break;
            case 5:
                l00.a aVar6 = l00.a.A;
                t1.O(obj);
                e0Var.f.passwordResetFailed(th);
                if (th instanceof AuthException) {
                    String str8 = ((AuthException) th).B;
                    if (str8 != null && !r30.k.L0(str8)) {
                        str3 = str8;
                    }
                    e0Var.i(x.b((x) e0Var.c.d.getValue(), false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, str3, null, null, null, 0, null, null, false, 1073217535));
                } else {
                    strA4 = e0Var.d.a(2131886197, new Object[0]);
                }
                str3 = strA4;
                e0Var.i(x.b((x) e0Var.c.d.getValue(), false, null, null, null, null, null, null, null, null, null, false, 0, 0, false, false, false, null, null, null, str3, null, null, null, 0, null, null, false, 1073217535));
                break;
            default:
                l00.a aVar7 = l00.a.A;
                t1.O(obj);
                e0Var.n(th);
                break;
        }
        return b0Var;
    }
}
