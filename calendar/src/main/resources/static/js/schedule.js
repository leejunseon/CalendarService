console.log("Schedule Module");

var scheduleService=(function(){
	
	function getSchedules(date,callback){
		console.log("getSchedules");
		$.ajax({
			type:'get',
			url:'/getSchedules.do/'+date,
			dataType:"json",
			success:function(result){
				if(callback)
					callback(result);
			},
			error:function(xhr,status,er){
				alert('error!!');
			}
		});
	}
	
	return {
		getSchedules:getSchedules
	};
})();