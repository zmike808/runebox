dependencies {
    implementation(project(":logger"))
    implementation(project(":mixin:mixin-annotation"))
    api("org.ow2.asm:asm:_")
    api("org.ow2.asm:asm-commons:_")
    api("org.ow2.asm:asm-util:_")
    api("org.ow2.asm:asm-tree:_")
    implementation("com.google.guava:guava:_")
}