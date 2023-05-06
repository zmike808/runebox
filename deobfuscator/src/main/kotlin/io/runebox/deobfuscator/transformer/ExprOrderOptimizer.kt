package io.runebox.deobfuscator.transformer

import io.disassemble.asm.ClassFactory
import io.disassemble.asm.visitor.expr.node.*
import io.runebox.asm.tree.ClassGroup
import io.runebox.deobfuscator.Transformer
import org.objectweb.asm.Opcodes
import org.tinylog.kotlin.Logger

class ExprOrderNormalizer : Transformer {

    private var count = 0

    override fun run(group: ClassGroup) {
        group.classes.forEach { cls ->
            ClassFactory(cls).methods.forEach { method ->
                method.tree().get().forEach exprLoop@ { expr ->
                    if(expr is MathExpr) {
                        if(expr.opcode() !in Opcodes.IADD..Opcodes.DADD && expr.opcode() !in Opcodes.IMUL..Opcodes.DMUL) return@exprLoop
                        if(expr.expr1() is ConstExpr && (expr.expr2() is FieldExpr || expr.expr2() is VarLoadExpr)) {
                            val origLeft = expr.left()
                            val origRight = expr.right()
                            expr.setLeft(origRight)
                            expr.setRight(origLeft)
                            count++
                        }
                    }
                    else if(expr is CompBranchExpr) {
                        if(expr.opcode() !in Opcodes.IF_ICMPEQ..Opcodes.IF_ICMPNE && expr.opcode() !in Opcodes.IF_ACMPEQ..Opcodes.IF_ACMPNE) return@exprLoop
                        if(expr.left() is ConstExpr && (expr.right() is FieldExpr || expr.right() is VarLoadExpr)) {
                            val origLeft = expr.left()
                            val origRight = expr.right()
                            expr.setLeft(origRight)
                            expr.setRight(origLeft)
                            count++
                        }
                    }
                }
            }
        }

        Logger.info("Reordered $count method expressions.")
    }
}