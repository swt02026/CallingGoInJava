#include <jni.h>

#include "HelloWorld.h"
#include <stdio.h>

JNIEXPORT void JNICALL Java_HelloWorld_heavyWork(JNIEnv *env, jobject obj,
                                                 jint num) {

  printf("heavy work in c %d\n", num);
}
