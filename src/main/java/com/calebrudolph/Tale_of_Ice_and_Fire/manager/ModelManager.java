package com.calebrudolph.Tale_of_Ice_and_Fire.manager;

import java.util.HashMap;
import java.util.Map;
import com.calebrudolph.Tale_of_Ice_and_Fire.bossmodels.ModelIceGod;

import net.minecraft.client.model.ModelBase;

public class ModelManager {
	public static Map<String, ModelBase> models = new HashMap<String, ModelBase>();
	public static void init(){
		models.put("ancientGolem",new ModelIceGod());

	}

}
