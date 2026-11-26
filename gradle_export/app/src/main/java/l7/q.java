package l7;

import android.os.Handler;
import android.os.Message;
import e7.i0;
import java.util.TreeMap;

public final class q implements Handler.Callback {
    public final a1.i A;
    public final f B;
    public m7.c F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final TreeMap E = new TreeMap();
    public final Handler D = i0.l(this);
    public final k8.b C = new k8.b(1);

    public q(m7.c cVar, f fVar, a1.i iVar) {
        this.F = cVar;
        this.B = fVar;
        this.A = iVar;
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (!this.I) {
            if (message.what != 1) {
                return false;
            }
            o oVar = (o) message.obj;
            long j9 = oVar.f10106a;
            long j10 = oVar.f10107b;
            Long lValueOf = Long.valueOf(j10);
            TreeMap treeMap = this.E;
            Long l = (Long) treeMap.get(lValueOf);
            if (l == null) {
                treeMap.put(Long.valueOf(j10), Long.valueOf(j9));
                return true;
            }
            if (l.longValue() > j9) {
                treeMap.put(Long.valueOf(j10), Long.valueOf(j9));
            }
        }
        return true;
    }
}
