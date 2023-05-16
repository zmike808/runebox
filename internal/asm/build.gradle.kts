repositories {
    maven(url = "https://jitpack.io")
}

dependencies {
    api(project(":runebox-util"))
    api("org.ow2.asm:asm:_")
    api("org.ow2.asm:asm-tree:_")
    api("org.ow2.asm:asm-commons:_")
    api("org.ow2.asm:asm-util:_")
}