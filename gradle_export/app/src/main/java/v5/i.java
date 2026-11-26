package v5;

import java.util.concurrent.ThreadPoolExecutor;

public final class i extends w00.a {

    public final w00.a f15472b;

    public final ThreadPoolExecutor f15473c;

    public i(w00.a aVar, ThreadPoolExecutor threadPoolExecutor) {
        super(24);
        this.f15472b = aVar;
        this.f15473c = threadPoolExecutor;
    }

    public final void C(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f15473c;
        try {
            this.f15472b.C(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public final void D(p10.a aVar) {
        ThreadPoolExecutor threadPoolExecutor = this.f15473c;
        try {
            this.f15472b.D(aVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
