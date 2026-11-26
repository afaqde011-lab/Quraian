package ji;

import java.util.concurrent.ExecutorService;

public final class e implements Runnable {
    public final int A;
    public final f B;
    public final Runnable C;
    public final gi.c D;

    public e(f fVar, Runnable runnable, gi.c cVar, int i10) {
        this.A = i10;
        this.B = fVar;
        this.C = runnable;
        this.D = cVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                ExecutorService executorService = this.B.A;
                final int i10 = 0;
                final Runnable runnable = this.C;
                final gi.c cVar = this.D;
                executorService.execute(new Runnable() {
                    @Override
                    public final void run() throws Exception {
                        switch (i10) {
                            case 0:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e3) {
                                    ((h) cVar.B).l(e3);
                                    throw e3;
                                }
                            case 1:
                                try {
                                    runnable.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) cVar.B).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable2 = runnable;
                                h hVar = (h) cVar.B;
                                try {
                                    runnable2.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    hVar.l(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            case 1:
                ExecutorService executorService2 = this.B.A;
                final int i11 = 2;
                final Runnable runnable2 = this.C;
                final gi.c cVar2 = this.D;
                executorService2.execute(new Runnable() {
                    @Override
                    public final void run() throws Exception {
                        switch (i11) {
                            case 0:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e3) {
                                    ((h) cVar2.B).l(e3);
                                    throw e3;
                                }
                            case 1:
                                try {
                                    runnable2.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) cVar2.B).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable3 = runnable2;
                                h hVar = (h) cVar2.B;
                                try {
                                    runnable3.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    hVar.l(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
            default:
                ExecutorService executorService3 = this.B.A;
                final int i12 = 1;
                final Runnable runnable3 = this.C;
                final gi.c cVar3 = this.D;
                executorService3.execute(new Runnable() {
                    @Override
                    public final void run() throws Exception {
                        switch (i12) {
                            case 0:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e3) {
                                    ((h) cVar3.B).l(e3);
                                    throw e3;
                                }
                            case 1:
                                try {
                                    runnable3.run();
                                    return;
                                } catch (Exception e10) {
                                    ((h) cVar3.B).l(e10);
                                    return;
                                }
                            default:
                                Runnable runnable4 = runnable3;
                                h hVar = (h) cVar3.B;
                                try {
                                    runnable4.run();
                                    hVar.k(null);
                                    return;
                                } catch (Exception e11) {
                                    hVar.l(e11);
                                    return;
                                }
                        }
                    }
                });
                break;
        }
    }
}
