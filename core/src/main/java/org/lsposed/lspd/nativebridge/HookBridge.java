package org.lsposed.lspd.nativebridge;

import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;

public class HookBridge {
    public static native boolean hookMethod(Executable hookMethod, Class<?> hooker, int priority, Object callback);
    public static native boolean unhookMethod(Executable hookMethod, Object callback);

    public static native boolean deoptimizeMethod(Executable method);

    public static native Object invokeOriginalMethod(Executable method, Object thisObject, Object[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException;
}
