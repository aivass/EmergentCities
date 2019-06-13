package deanteegarden.emergentcities;

import deanteegarden.emergentcities.fastfurnace.BlockFastFurnace;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("emergentcities:fast_furnace")
    public static BlockFastFurnace blockFastFurnace;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        blockFastFurnace.initModel();
    }
}