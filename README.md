sdm-sinatra
=======

Ruby Sinatra like micro framework for Simple Dynamic Modules for Groovy.
The SDM module is based on the [Ratpack][] project.
[Ratpack]: https://github.com/bleedingwolf/Ratpack

Requirements
------------

Simple Dynamic Modules for Groovy is required in version 0.5+.

http://code.google.com/p/simple-dm/

Getting Started
---------------

	package org.sdm.examples.sinatra
	
	require 'org.sdm:sdm-sinatra:0.1-SNAPSHOT'

 // By default a webapp is created on the root context path.
 // Use the webappConfig.path variable to change the default context path
 //webappConfig.path = '/sinatra'
	
	get '/hi', {
	    "Hello World!"
	}
	
        // Use scope 'sinatra' in case you want, for example, mix multiple DSLs
	sinatra {
		get '/hu', {
			"Hello World!!!!"
		}	
	}
	  
	'org.sdm.sinatra' {
	    get '/buse', {
	        "Hello Buzard!!!!"
	    }
	}