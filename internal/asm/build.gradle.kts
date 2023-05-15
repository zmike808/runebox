repositories {
    maven(url = "https://jitpack.io")
}

dependencies {
    implementation(project(":runebox-util"))
    api("org.ow2.asm:asm:_")
    api("org.ow2.asm:asm-tree:_")
    api("org.ow2.asm:asm-commons:_")
    api("org.ow2.asm:asm-util:_")
    implementation("org.jgrapht:jgrapht-core:_")
    implementation("com.google.guava:guava:_")
    implementation(files("lib/threadtear.jar"))
}