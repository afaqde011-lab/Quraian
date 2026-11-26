package l1;

import androidx.compose.runtime.internal.PlatformOptimizedCancellationException;

public final class b0 extends PlatformOptimizedCancellationException {
    public b0(int i10) {
        super("rememberCoroutineScope left the composition");
        switch (i10) {
            case 1:
                super("The coroutine scope left the composition");
                break;
            default:
                break;
        }
    }
}
