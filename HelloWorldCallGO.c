#include <jni.h>

#include "HelloWorld.h"
#include <stdio.h>
#include "libHelloWorldCallGO.h"

JNIEXPORT void JNICALL Java_HelloWorld_heavyWork(JNIEnv *env, jobject obj,
                                                 jint num)
{
    HeavyWorkFromGo(num);
}
