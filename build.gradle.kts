import org.jetbrains.kotlin.gradle.plugin.kotlinToolingVersion

plugins {
    kotlin("jvm") version "1.8.21"
}

tasks.wrapper {
    gradleVersion = "7.4"
}

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = "io.runebox"
    version = "1.0.0"

    repositories {
        mavenLocal()
        mavenCentral()
        maven(url = "https://jitpack.io")
    }

    dependencies {
        implementation(kotlin("stdlib"))
        implementation(kotlin("reflect"))
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}
