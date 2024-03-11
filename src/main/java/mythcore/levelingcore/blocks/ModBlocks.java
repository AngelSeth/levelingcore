package mythcore.levelingcore.blocks;

import mythcore.levelingcore.SoloLeveling;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block MANA_CRYSTAL = registerBlock("mana_crystal", new Block(FabricBlockSettings.copyOf(Blocks.AMETHYST_BLOCK)));
    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(SoloLeveling.MOD_ID, name), block);
    }
    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(SoloLeveling.MOD_ID, name),
            new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        SoloLeveling.LOGGER.info("Registering ModBLocks for " + SoloLeveling.MOD_ID);
        //Registry.register(registry, new Identifier("yourmodid", "ant_hill"), ANT_HILL);
    }

}