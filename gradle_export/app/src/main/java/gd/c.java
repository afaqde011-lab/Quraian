package gd;

public final class c {
    SET("$set"),
    SET_ONCE("$setOnce"),
    ADD("$add"),
    APPEND("$append"),
    CLEAR_ALL("$clearAll"),
    PREPEND("$prepend"),
    UNSET("$unset"),
    PRE_INSERT("$preInsert"),
    POST_INSERT("$postInsert"),
    REMOVE("$remove");

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
        return (c[]) D.clone();
    }
}
