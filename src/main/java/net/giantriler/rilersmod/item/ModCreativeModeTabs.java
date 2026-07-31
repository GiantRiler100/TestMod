package net.giantriler.rilersmod.item;

import net.giantriler.rilersmod.RilerMod;
import net.giantriler.rilersmod.block.ModBlocks;
import net.giantriler.rilersmod.item.custom.TestBall;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RilerMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> RILER_TAB = CREATIVE_MODE_TABS.register("riler_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.riler_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.SAPPHIRE_PICKAXE.get());
                        pOutput.accept(ModItems.WALLPAPER.get());
                        pOutput.accept(ModItems.RAW_SAPPHIRE.get());
                        pOutput.accept(ModItems.STRAWBERRY.get());
                        pOutput.accept(ModItems.TEST_BALL.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        //blocks
                        pOutput.accept(ModBlocks.WALLPAPER_BLOCK.get());
                        pOutput.accept(ModBlocks.B_CARPET.get());
                        pOutput.accept(ModBlocks.ROOF_TILING.get());
                        pOutput.accept(ModBlocks.B_LIGHT.get());

                        pOutput.accept(ModBlocks.SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_STAIRS.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_DOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_WALL.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_BUTTON.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_SLAB.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_PRESSURE_PLATE.get());

                        pOutput.accept(ModBlocks.RAW_SAPPHIRE_BLOCK.get());
                        pOutput.accept(ModBlocks.SAPPHIRE_ORE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
