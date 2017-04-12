package com.au.jacksonmoore.jacksonstestmod;

import com.au.jacksonmoore.jacksonstestmod.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = JacksonsTestMod.MODID, version = JacksonsTestMod.VERSION)
public class JacksonsTestMod
{
    public static final String MODID = "jacksonstestmod";
    public static final String VERSION = "1.0";


    @SidedProxy(clientSide = "com.au.jacksonmoore.jacksonstestmod.proxy.ClientProxy",serverSide = "com.au.jacksonmoore.jacksonstestmod.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static JacksonsTestMod instance;

    public static CreativeTab tab;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event){
        tab = new CreativeTab(CreativeTabs.getNextID(), "jackson");
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
        // some example code
        System.out.println("DIRT BLOCK >> "+Blocks.DIRT.getUnlocalizedName());
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit(event);
    }
}
