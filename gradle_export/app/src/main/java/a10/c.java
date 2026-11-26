package a10;

import java.util.List;
import java.util.Map;

public interface c extends b {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    x getReturnType();

    List getTypeParameters();

    b0 getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
