package com.aziis98.ktodo

import com.aziis98.control.Control
import com.aziis98.kappa.KappaApplication
import java.awt.Graphics2D
import java.nio.file.Paths

/**
 * Created by aziis98 on 22/09/2016.
 */
object KTodo : KappaApplication() {
    val control = Control("test")

    override fun setup() {
        control.style["width"] = 500
        control.style["height"] = 750
    }

    override fun draw(g: Graphics2D) {
        control.render(g)
    }
}