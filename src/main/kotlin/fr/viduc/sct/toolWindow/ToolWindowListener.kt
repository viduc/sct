package fr.viduc.sct.toolWindow

import com.intellij.openapi.wm.ex.ToolWindowManagerListener
import org.jetbrains.annotations.NotNull;
import com.intellij.openapi.wm.ToolWindow;
import fr.viduc.sct.components.dashboard.SctDashboard

class ToolWindowListener: ToolWindowManagerListener
{
    override fun toolWindowShown(@NotNull toolWindow: ToolWindow) {
        val content = toolWindow.contentManager.getContent(0)
        if (content != null && content.displayName === "Docker" && content.component is SctDashboard) {
            (content.component as SctDashboard).display()
        }
    }
}
