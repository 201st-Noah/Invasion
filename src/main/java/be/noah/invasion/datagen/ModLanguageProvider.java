package be.noah.invasion.datagen;

import be.noah.invasion.Invasion;
import be.noah.invasion.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output) {
        super(output, Invasion.MODID, "en_us");
    }{

    }

    @Override
    protected void addTranslations() {
        blocks();
        blockEntities();
        creativeTabs();
        items();
    }

    private void items() {
    }
    private void blocks() {
        addBlock(ModBlocks.SCORCHED_DIRT, "Scorched Dirt");
    }

    private void creativeTabs() {
    }

    private void blockEntities() {
    }

}
