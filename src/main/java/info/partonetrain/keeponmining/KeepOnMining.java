package info.partonetrain.keeponmining;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;

@Mod(KeepOnMining.MODID)
public class KeepOnMining {
    public static final String MODID = "keeponmining";
    public static final Logger LOGGER = LogUtils.getLogger();

    public KeepOnMining(IEventBus modEventBus, ModContainer modContainer) {
    }
}
