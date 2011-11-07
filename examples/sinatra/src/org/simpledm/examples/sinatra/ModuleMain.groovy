package org.simpledm.examples.sinatra;

require 'org.simpledm:sdm-sinatra:0.1-SNAPSHOT'

// By default a webapp is created on the root context path.
// Use the webappConfig.path variable to change the default context path
//webappConfig.path = '/sinatra'

get '/hi', {
    "Hello World!"
}

sinatra {
	get '/hu', {
		"Hello World!!!!"
	}	
}
  
'org.simpledm.sinatra' {
    get '/buse', {
        "Hello Buzard!!!!"
    }
}

println 'started.....' 



