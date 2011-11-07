package org.simpledm.sinatra;

import org.simpledm.core.SdmMixin; 

require "org.simpledm:sdm-http:$SDM_VERSION"

SinatraMixin.mixin SdmMixin

def onModuleStarting(ctx) {
	println "Module org.simpledm:sinatra received onModuleStarting event for module: ${ctx.dep}"
}

def onRequire(ctx) {
	def object = ctx.requiringObject
	
	object.require "org.simpledm:sdm-http:$SDM_VERSION"
    object.metaClass.mixin SinatraMixin
	object.orgSdmSinatraConfigure()
}

def onModuleStarted(ctx) {
    println "Module org.simpledm:sinatra received onModuleStarted event for module: ${ctx.dep}"    
	try {
        ctx.object.orgSdmSinatraServe()
	} catch(MissingMethodException e) {}
}

println 'started.'
