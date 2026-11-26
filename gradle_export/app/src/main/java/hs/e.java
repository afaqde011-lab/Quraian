package hs;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lhs/e;", "", "", "a", "Ljava/lang/String;", "getSentAt", "()Ljava/lang/String;", "sentAt", "b", "getPlatform", "platform", "c", "getAppVersion", "appVersion", "", "Lkh/n;", "d", "Ljava/util/List;", "getEvents", "()Ljava/util/List;", "events", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    @ck.b("sent_at")
    private final String sentAt;

    @ck.b("platform")
    private final String platform = "android";

    @ck.b("app_version")
    private final String appVersion = "2.4.1";

    @ck.b("events")
    private final List<kh.n> events;

    public e(String str, ArrayList arrayList) {
        this.sentAt = str;
        this.events = arrayList;
    }
}
