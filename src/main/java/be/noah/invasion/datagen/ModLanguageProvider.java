package be.noah.invasion.datagen;

import be.noah.invasion.Invasion;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output) {
        super(output, Invasion.MODID, "en_us");
    }{

    }

    @Override
    protected void addTranslations() {

    }
}
