package fr.viduc.sct.toolWindow

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.ToolWindow
import com.intellij.openapi.wm.ToolWindowFactory
import com.intellij.ui.content.ContentFactory


class SctToolWindowFactory : ToolWindowFactory
{
    override fun createToolWindowContent(project: Project, toolWindow: ToolWindow) {
        val sctToolWindow = SctToolWindow(toolWindow)
        val content = ContentFactory.getInstance().createContent(sctToolWindow.getContent(), "test1", false)
        //val content2 = ContentFactory.getInstance().createContent(sctToolWindow.getContent(), "test2", false)
        toolWindow.contentManager.addContent(content)
        //toolWindow.contentManager.addContent(content2)
    }


    override fun shouldBeAvailable(project: Project) = true


}
