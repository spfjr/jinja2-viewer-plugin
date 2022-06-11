package com.github.spfjr.jinja2viewerplugin.services

import com.intellij.openapi.project.Project
import com.github.spfjr.jinja2viewerplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
