package com.github.seregamorph.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class SimpleProjectPlugin implements Plugin<Project> {

    @Override
    public void apply(Project target) {
        System.out.println("Applied to " + target);
    }
}
