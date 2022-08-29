package com.dephoegon.delbridgebop;

import com.dephoegon.delbridgebop.aid.util.RegList;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static com.dephoegon.delbridgebop.DelBridgeBOP.Mod_ID;

@Mod(Mod_ID)
public class DelBridgeBOP {
    public static final String Mod_ID = "delbridgebop";
    public DelBridgeBOP() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        RegList.ListOrder(eventBus);
        MinecraftForge.EVENT_BUS.register(this);
    }
}
