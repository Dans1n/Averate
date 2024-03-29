
buildscript {
    dependencies{
        classpath("app.cash.sqldelight:gradle-plugin:2.0.1")
    }
}

plugins {
    //trick: for the same plugin versions in all sub-modules
    id("com.android.application").apply(false)
    id("com.android.library").apply(false)
    id("org.jetbrains.compose").apply(false)
    kotlin("multiplatform").apply(false)
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}
