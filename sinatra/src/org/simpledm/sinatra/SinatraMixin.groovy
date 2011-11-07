package org.simpledm.sinatra;

import java.util.List;

import groovy.lang.Closure;
import groovy.lang.Delegate;

import com.bleedingwolf.ratpack.RatpackApp;

class SinatraMixin {
	
	def ratpackApp = new RatpackApp()
	
	def orgSdmSinatra = { Closure clos ->
            clos.delegate = delegate.ratpackApp
            clos.resolveStrategy = Closure.DELEGATE_FIRST
            clos()
        }

    def orgSdmSinatraConfigure() {
		metaClass.sinatra = orgSdmSinatra
		metaClass.'org.simpledm.sinatra' = orgSdmSinatra	
    }

    def orgSdmSinatraServe() {
        web {
            servlet(name:'RatpackServlet', className:'com.bleedingwolf.ratpack.RatpackServlet') { 
				app = ratpackApp
			}
        }
    }	

    public void delete(Object path, Object handler) {
        ratpackApp.delete(path, handler);
    }

    public void get(String path, Closure handler) {
        ratpackApp.get(path, handler);
    }

    public Closure getHandler(Object method, Object subject) {
        return ratpackApp.getHandler(method, subject);
    }

    public void set(Object setting, Object value) {
        ratpackApp.set(setting, value);
    }

    public void register(List methods, Object path, Object handler) {
        ratpackApp.register(methods, path, handler);
    }

    public void register(Object method, Object path, Object handler) {
        ratpackApp.register(method, path, handler);
    }

    public void post(Object path, Object handler) {
        ratpackApp.post(path, handler);
    }

    public void put(Object path, Object handler) {
        ratpackApp.put(path, handler);
    }
}
