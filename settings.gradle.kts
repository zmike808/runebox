plugins {
    id("de.fayard.refreshVersions") version "0.51.0"
}

rootProject.name = "runebox"

include(":logger")
include(":gamepack")
include(":client")
include(":mixin")
include(":mixin:mixin-annotation")