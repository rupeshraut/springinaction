function app() {
}

app.prototype.init = function() {

	YUI().use('node', 'event', 'datatable', 'datatable-paginator','json-parse'
			,'paginator', 'datatype-number','model-sync-rest','paginator-url', function(Y) {
		
		
		 //
	    //  Define a custom Model and ModelList for my music data ...
	    //
	    Y.User = Y.Base.create('user', Y.Model, [],{
	    	ATTRS: {user: {}}
	    });

	    Y.Users = Y.Base.create('users', Y.ModelList,[Y.ModelSync.REST],{
	        url: '/spring-mvc-ex/testctrl/list?page={page}&itemsPerPage={itemsPerPage}&sortBy={sortBy}',
	        model: Y.User,
	        parse: function(resp) {
	            var parsed = Y.JSON.parse(resp),
	                results = [],
	                metaflds = {};

	            if ( parsed.data ) {
	                metaflds.itemsPerPage = parsed.itemsPerPage;
	                metaflds.totalItems   = parsed.totalItems;
	                results = parsed.data;
	            }
	            
	            alert('metaflds.itemsPerPage ' +Y.JSON.stringify(parsed));

	        // REQUIRED:  Define a "response" event that the DT-Paginator listens for ...
	        this.fire('response',{resp:resp, parsed:parsed, results:results, meta:metaflds});

	            // return the results to the ModelList ...
	            return results;
	        }

	    });


	//
	//  Instantiate a new ModelList and define some columns for our DataTable
	//
	    var myUser = new Y.Users();		
		
	    myUser.load(function(){
	    	
	    	alert(myUser.item(0).get('user'));
	    	
	    });
	    
		var dt = new Y.DataTable({
	        columns: [{ key: "\"user\"", label: "Name" }],
	        //data   : myUser,
	        summary: "Price sheet for inventory parts",
	        caption: "Example table with simple columns"
	    });
	    
	    dt.render("#dtable");
	    dt.set("rowsPerPage","2");
	    
	    //dt.data.load();
//	    dt.data.load({
//	        page:         dt.get('page'),
//	        itemsPerPage: dt.get('rowsPerPage'),
//	        sortBy:       Y.JSON.stringify( dt.get('sortBy') || {} ) || null
//	    });

	    alert('myUser'+Y.JSON.stringify(myUser));
		
	});
};

var app = new app();
app.init();