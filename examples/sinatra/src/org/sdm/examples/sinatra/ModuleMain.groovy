package org.sdm.examples.sinatra;

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

println 'started.....' 



