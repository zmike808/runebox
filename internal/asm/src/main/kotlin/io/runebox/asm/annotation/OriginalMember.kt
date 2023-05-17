package io.runebox.asm.annotation

@Target(AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.CONSTRUCTOR)
annotation class OriginalMember(
    val owner: String,
    val name: String,
    val descriptor: String
)
