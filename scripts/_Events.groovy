eventAssetPrecompileStart = { assetConfig ->
	if(!config.grails.assets.plugin.'lesshat'.excludes || config.grails.assets.plugin.'lesshat'.excludes.size() == 0) {
		config.grails.assets.plugin.'lesshat'.excludes = ['*.less']
	}
}
