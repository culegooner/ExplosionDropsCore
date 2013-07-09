package mod.culegooner.ExplosionDropsCore;

import java.util.Map;

import cpw.mods.fml.relauncher.IFMLLoadingPlugin.MCVersion;

@MCVersion(value = "1.6.2")
public class EDFMLLoadingPlugin implements cpw.mods.fml.relauncher.IFMLLoadingPlugin {

	@Override
	public String[] getLibraryRequestClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getASMTransformerClass() {
		//This will return the name of the class "mod.culegooner.ExplosionDropsCore.EDClassTransformer"
		return new String[]{EDClassTransformer.class.getName()};
	}

	@Override
	public String getModContainerClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSetupClass() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {
		
	}

}
