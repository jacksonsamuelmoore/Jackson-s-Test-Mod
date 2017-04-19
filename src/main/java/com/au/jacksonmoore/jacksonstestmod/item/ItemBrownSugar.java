package com.au.jacksonmoore.jacksonstestmod.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

/**
 * Created by MOO0021 on 4/16/2017.
 */
public class ItemBrownSugar extends ItemFood {
    public PotionEffect[] listEffects;
    public ItemBrownSugar(int amount, float saturation, boolean isWolfFood, PotionEffect... effects) {
        super(amount, saturation, isWolfFood);
        listEffects = effects;
        this.setAlwaysEdible();
    }

    @Override
    protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(9), 20, 5));
        player.addPotionEffect(new PotionEffect(Potion.getPotionById(10), 100, 5));
    }
}
