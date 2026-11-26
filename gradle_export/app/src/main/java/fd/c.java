package fd;

public final class c {
    LAST_EVENT_ID("last_event_id"),
    PREVIOUS_SESSION_ID("previous_session_id"),
    LAST_EVENT_TIME("last_event_time"),
    OPT_OUT("opt_out"),
    Events("events"),
    APP_VERSION("app_version"),
    APP_BUILD("app_build"),
    REMOTE_CONFIG("remote_config"),
    REMOTE_CONFIG_TIMESTAMP("remote_config_timestamp");

    public final String A;

    static {
        f50.c.v(cVarArr);
    }

    public c(String str) {
        super(str, i);
        this.A = str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) I.clone();
    }
}
