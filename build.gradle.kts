buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.6.1")
        classpath("com.lagradost:cloudstream-gradle:1.0.0")
    }
}

plugins {
    id("org.jetbrains.kotlin.android") version "2.0.21" apply false
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}
