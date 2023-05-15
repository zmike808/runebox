package io.runebox.asm

import com.mxgraph.layout.hierarchical.mxHierarchicalLayout
import com.mxgraph.layout.mxCircleLayout
import com.mxgraph.layout.mxCompactTreeLayout
import com.mxgraph.swing.mxGraphComponent
import com.mxgraph.view.mxGraph
import io.runebox.asm.cfg.Block
import io.runebox.asm.cfg.ControlFlowGraph
import io.runebox.asm.tree.ClassGroup
import io.runebox.asm.tree.getMethod
import me.nov.threadtear.graph.Converter
import org.jgrapht.graph.DefaultEdge
import java.awt.Dimension
import java.io.File
import javax.swing.JFrame

fun main() {
    println("Loading jar.")

    val group = ClassGroup()
    group.readJar(File("gamepack.jar"))

    println()

    val cls = group.findClass("client")!!
    val method = cls.getMethod("init", "()V")!!

    val cfg = ControlFlowGraph(method)
    println()
}