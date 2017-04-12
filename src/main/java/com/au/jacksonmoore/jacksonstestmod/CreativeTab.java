package com.au.jacksonmoore.jacksonstestmod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by MOO0021 on 4/12/2017.
 */
public class CreativeTab extends CreativeTabs {
    public CreativeTab(int index, String label){
        super(index, label);
    }


    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Items.ARROW);
    }
}
