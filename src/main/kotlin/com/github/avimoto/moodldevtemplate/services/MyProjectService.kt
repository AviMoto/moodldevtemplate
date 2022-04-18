package com.github.avimoto.moodldevtemplate.services

import com.intellij.openapi.project.Project
import com.github.avimoto.moodldevtemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
