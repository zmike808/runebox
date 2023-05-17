pluginManagement {
    repositories {
        mavenLocal()
        mavenCentral()
        gradlePluginPortal()
        maven(url = "https://jitpack.io")
    }
}

plugins {
    id("de.fayard.refreshVersions") version "0.51.0"
}

rootProject.name = "runebox"

/**
 * === RUNEBOX MODULES ===
 */
module(":client")
module(":common")
module(":util")
module(":api")
module(":logger")
module(":launcher")
module(":plugin")
module(":cache")
module(":injector")
module(":mixin")
module("internal:asm")
module("internal:deobfuscator")
module("internal:deobfuscator:deobfuscator-annotation")
module("internal:updater")
module("internal:gamepack")

fun module(path: String) {
    val moduleName = path.split(":").lastOrNull() ?: path
    include(moduleName)
    if(path.split(":").size > 1) {
        val projectPath = path.replace(":", "/")
        project(":$moduleName").projectDir = file(projectPath)
    }
    project(":$moduleName").name = "runebox-$moduleName"
}

fun gradleModule(path: String) {
    includeBuild(path.replace(":", "/"))
}
