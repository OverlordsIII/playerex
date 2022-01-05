package com.github.clevernucleus.playerex.handler;

import com.github.clevernucleus.playerex.PlayerEx;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.screen.ScreenHandler;

public class ExScreenHandler extends ScreenHandler {
	public ExScreenHandler(int syncId, PlayerInventory inv) {
		super(PlayerEx.EX_SCREEN, syncId);
	}
	
	@Override
	public boolean canUse(PlayerEntity player) {
		return true;
	}
}