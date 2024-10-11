package com.github.seregamorph.gradle;

import org.gradle.api.Plugin;
import org.gradle.api.initialization.Settings;

public class SimpleSettingsPlugin implements Plugin<Settings> {

    @Override
    public void apply(Settings target) {
        System.out.println("Applied to " + target);
    }
}
