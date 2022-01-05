package com.github.clevernucleus.playerex.api;

import java.util.function.BiFunction;

import dev.onyxstudios.cca.api.v3.component.Component;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;


public interface PlayerData extends Component {
	
	
	double get(final EntityAttribute attributeIn);
	
	
	void set(final EntityAttribute attributeIn, final double valueIn);
	
	
	void add(final EntityAttribute attributeIn, final double valueIn);
	
	
	void remove(final EntityAttribute attributeIn);
	
	
	void reset();
	
	
	void addSkillPoints(final int pointsIn);
	
	
	int addRefundPoints(final int pointsIn);
	
	
	int skillPoints();
	
	
	int refundPoints();
	
	
	public static void registerRefundCondition(final BiFunction<PlayerData, LivingEntity, Double> condition) {
		com.github.clevernucleus.playerex.impl.PlayerDataManager.addRefundCondition(condition);
	}
}