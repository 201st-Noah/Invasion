package be.noah.invasion.datagen;

import be.noah.invasion.Invasion;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Invasion.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

    }
}
