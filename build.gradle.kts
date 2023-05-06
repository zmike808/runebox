import org.jetbrains.kotlin.gradle.plugin.kotlinToolingVersion

plugins {
    kotlin("jvm")
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
        testImplementation(kotlin("test-junit5"))
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:_")
    }

    tasks.test {
        useJUnitPlatform()
    }
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(11))
    }
}
