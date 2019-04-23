import java.io.*;
import org.graalvm.polyglot.*;
import org.graalvm.nativeimage.*;
import java.util.*;

import org.graalvm.nativeimage.c.CContext;

public class Headers implements CContext.Directives {

    @Override
    public List<String> getHeaderFiles() {
        return Collections.singletonList("\"/content/go_java/libHelloWorldCallGO.h\"");
    }

}
