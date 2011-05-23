sdm-sinatra
=======

Ruby Sinatra like micro framework for Simple Dynamic Modules for Groovy.
The SDM module is based on the [Ratpack][] project.
[Ratpack]: https://github.com/bleedingwolf/Ratpack

Requirements
------------

Simple Dynamic Modules is required in version 0.5+.

http://code.google.com/p/simple-dm/

Getting Started
---------------

	package org.sdm.examples.sinatra
	
	require 'org.sdm:sdm-sinatra:0.1-SNAPSHOT'
	
	get '/hi', {
	    "Hello World!"
	}
	
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