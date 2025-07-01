package org.wentix.dungeongenerator.core;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@Mod(DungeonMod.MODID)
public class DungeonMod {
    public static final String MODID = "dungeongenerator";

    private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    // DeferredRegister для измерения добавляется в отдельном классе (см. шаг 2)

    public DungeonMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Регистрация блоков, предметов и других компонентов
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);

        // Подписка на события сервера
        MinecraftForge.EVENT_BUS.addListener(this::onServerStarting);
    }

    private void onServerStarting(ServerStartingEvent event) {
        // Инициализация конфигураций (будет реализовано в шаге 3)
        // DungeonConfigManager.loadConfigs(event.getServer());
        DimensionRegistry.register();
    }
}