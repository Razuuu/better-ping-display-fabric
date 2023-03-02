package de.razuuu.betterpingdisplay;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import de.razuuu.betterpingdisplay.gui.ConfigScreenBuilder;

public class ModMenuIntegration implements ModMenuApi {

    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        return ConfigScreenBuilder::build;
    }
}