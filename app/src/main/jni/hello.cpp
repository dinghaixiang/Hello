//
// Created by beck on 2016/10/25.
//

#include"com_example_beck_hello_Hello.h"

JNIEXPORT jstring JNICALL Java_com_example_beck_hello_Hello_getString(JNIEnv *env, jobject) {
    return env->NewStringUTF("hello");
}




