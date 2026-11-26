package c40;

public abstract class j {
    public static final p a = new p(-1, null, null, 0);
    public static final int b = f40.a.l(32, "kotlinx.coroutines.bufferedChannel.segmentSize", 12);
    public static final int c = f40.a.l(10000, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 12);
    public static final eh.l d = new eh.l("BUFFERED", 2);
    public static final eh.l e = new eh.l("SHOULD_BUFFER", 2);
    public static final eh.l f = new eh.l("S_RESUMING_BY_RCV", 2);
    public static final eh.l g = new eh.l("RESUMING_BY_EB", 2);
    public static final eh.l h = new eh.l("POISONED", 2);
    public static final eh.l i = new eh.l("DONE_RCV", 2);
    public static final eh.l j = new eh.l("INTERRUPTED_SEND", 2);
    public static final eh.l k = new eh.l("INTERRUPTED_RCV", 2);
    public static final eh.l l = new eh.l("CHANNEL_CLOSED", 2);
    public static final eh.l m = new eh.l("SUSPEND", 2);
    public static final eh.l n = new eh.l("SUSPEND_NO_WAITER", 2);
    public static final eh.l o = new eh.l("FAILED", 2);
    public static final eh.l p = new eh.l("NO_RECEIVE_RESULT", 2);
    public static final eh.l q = new eh.l("CLOSE_HANDLER_CLOSED", 2);
    public static final eh.l r = new eh.l("CLOSE_HANDLER_INVOKED", 2);
    public static final eh.l s = new eh.l("NO_CLOSE_CAUSE", 2);

    public static final boolean a(a40.j jVar, Object obj, u00.o oVar) {
        eh.l lVarG = jVar.g(obj, oVar);
        if (lVarG == null) {
            return false;
        }
        jVar.s(lVarG);
        return true;
    }
}
