package org.sdm.sinatra;

import org.sdm.core.SdmMixin; 

require "org.sdm:sdm-http:$SDM_VERSION"

SinatraMixin.mixin SdmMixin

def onModuleStarting(ctx) {
	println "Module org.sdm:sinatra received onModuleStarting event for module: ${ctx.dep}"
}

def onRequire(ctx) {
	def object = ctx.requiringObject
	
	object.require "org.sdm:sdm-http:$SDM_VERSION"
    object.metaClass.mixin SinatraMixin
	object.orgSdmSinatraConfigure()
}

def onModuleStarted(ctx) {
    println "Module org.sdm:sinatra received onModuleStarted event for module: ${ctx.dep}"    
	try {
        ctx.object.orgSdmSinatraServe()
	} catch(MissingMethodException e) {}
}

println 'started.'
