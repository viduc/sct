package fr.viduc.sct.components.dashboard

import com.intellij.ui.components.JBScrollPane
import com.intellij.openapi.wm.ToolWindow
import com.intellij.ui.components.JBLabel
import com.intellij.ui.components.JBPanel
import java.awt.GridBagConstraints
import java.awt.GridBagLayout

class SctDashboard(val toolWindow: ToolWindow): JBPanel<JBPanel<*>>()
{
    init {
        layout = GridBagLayout()
        display()
    }

    fun display()
    {
        removeAll()
        info()
        validate()
        repaint()
    }

    private fun info()
    {
         add(JBLabel("Test"))
    }
}
