package com.aziis98.ktodo

import com.aziis98.control.ChildControl
import com.aziis98.control.appendReflective
import com.aziis98.control.dynamic
import com.aziis98.kappa.KappaApplication
import com.aziis98.utils.choose
import java.awt.Color
import java.awt.Cursor
import java.awt.Graphics2D

/**
 * Created by aziis98 on 22/09/2016.
 */
object KTodo : KappaApplication() {

    override fun setup() {
        window.apply {
            rootContainer.appendReflective<ChildControl>("test1").apply {
                dynamic {
                    x = 100
                    y = 100
                    width = 150
                    height = 300

                    backgroundColor =
                            hover.choose(Color.RED, Color.WHITE)
                    borderRadius =
                            hover.choose(5, 0)

                    if (hover) handle.mouse.cursor = Cursor.HAND_CURSOR
                }
            }

        }
    }

    override fun draw(g: Graphics2D) {
        window.render(g)
    }
}