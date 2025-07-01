package org.wentix.dungeongenerator.core;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class DimensionRegistry {
    public static final ResourceKey<Level> DUNGEON_DIMENSION = ResourceKey.create(Registry.DIMENSION_REGISTRY,
            new ResourceLocation(DungeonMod.MODID, "dungeon"));

    public static void register(IEventBus modEventBus) {
        // Регистрация измерения через JSON, дополнительных действий не требуется
    }
}