package fr.viduc.sct.toolWindow

import com.intellij.openapi.wm.ToolWindow
import fr.viduc.sct.components.dashboard.SctDashboard

class SctToolWindow(val toolWindow: ToolWindow) {

    fun getContent() = SctDashboard(toolWindow).apply{}

}
