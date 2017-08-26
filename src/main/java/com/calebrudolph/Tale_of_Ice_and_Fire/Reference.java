package com.calebrudolph.Tale_of_Ice_and_Fire;

public class Reference {
	
	public static final String MOD_ID = "ctoiafm";
	public static final String NAME = "Tale_of_Ice_and_Fire";
	public static final String VERSION = "1.0";
	public static final String ACCEPTED_VERSIONS = "[1.12,1.13)";
	public static final int BOSSFIGHT1 = 22;
	
	public static final String CLIENT_PROXY_CLASS ="com.calebrudolph.Tale_of_Ice_and_Fire.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS ="com.calebrudolph.Tale_of_Ice_and_Fire.proxy.ServerProxy";
	
	public static enum Tale_of_Ice_and_FireItems {
		OBSIDIANINGOT("obsidianingot", "ItemObsidianingot");
		
		private String unlocalizedName;
		private String registryName;
		
		Tale_of_Ice_and_FireItems(String unlocalizedName,String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		public String getRegistryName() {
			return registryName;
		}
	}
	
	public static enum Tale_of_Ice_and_FireBlocks {
		RUBYBLOCK("rubyblock","BlockRuby");
		
		private String unlocalizedName;
		private String registryName;
		
		Tale_of_Ice_and_FireBlocks(String unlocalizedName,String registryName){
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		public String getRegistryName() {
			return registryName;
		}
	}
	
	
}
