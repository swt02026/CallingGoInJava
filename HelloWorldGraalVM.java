import java.io.*;
import org.graalvm.polyglot.*;
import org.graalvm.nativeimage.*;
import java.util.*;

import org.graalvm.nativeimage.c.CContext;
import org.graalvm.nativeimage.c.function.CLibrary;
import org.graalvm.nativeimage.c.function.CFunction;
import org.graalvm.nativeimage.c.function.CFunction.Transition;

@CContext(Headers.class)
@CLibrary("HelloWorldCallGO")
public class HelloWorldGraalVM {

    @CFunction(transition = Transition.NO_TRANSITION)
    private static native void HeavyWorkFromGo(int num);

    public static void main(String[] args) {
        final int num = Integer.valueOf(args[0]);
        HeavyWorkFromGo(num);

    }
}
