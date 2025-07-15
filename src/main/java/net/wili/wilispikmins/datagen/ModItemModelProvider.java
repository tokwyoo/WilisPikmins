package net.wili.wilispikmins.datagen;

import net.wili.wilispikmins.WilisPikmins;
import net.wili.wilispikmins.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, WilisPikmins.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent(ModItems.RED_PIKMIN_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
    }
}
