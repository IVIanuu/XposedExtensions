@file:Suppress("ClassName", "unused")

object Build {
    const val applicationId = "com.ivianuu.xposedktx.sample"
    const val buildToolsVersion = "28.0.3"
    const val compileSdk = 28
    const val minSdk = 14
    const val targetSdk = 28

    const val versionCode = 1
    const val versionName = "0.0.1"
}

object Publishing {
    const val groupId = "com.ivianuu.xposedktx"
    const val vcsUrl = "https://github.com/IVIanuu/xposed-ktx"
    const val version = "${Build.versionName}-dev-2"
}

object Versions {
    const val androidGradlePlugin = "3.3.0"

    const val androidxAppCompat = "1.1.0-alpha04"

    const val bintray = "1.8.4"

    const val kotlin = "1.3.30"
    const val mavenGradlePlugin = "2.1"
    const val xposed = "82"
}

object Deps {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradlePlugin}"

    const val androidxAppCompat = "androidx.appcompat:appcompat:${Versions.androidxAppCompat}"

    const val bintrayGradlePlugin =
        "com.jfrog.bintray.gradle:gradle-bintray-plugin:${Versions.bintray}"

    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    const val mavenGradlePlugin = "com.github.dcendents:android-maven-gradle-plugin:${Versions.mavenGradlePlugin}"

    const val xposed = "de.robv.android.xposed:api:${Versions.xposed}"
}