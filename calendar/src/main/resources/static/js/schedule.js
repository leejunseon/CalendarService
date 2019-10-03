console.log("Schedule Module");

var scheduleService=(function(){
	
	function getSchedules(date,callback){
		console.log("getSchedules");
		$.ajax({
			type:'get',
			url:'/getSchedules.do/'+date,
			dataType:"json",
			success:function(result){
				callback(result);
			},
			error:function(xhr,status,er){
				alert('error!!'+status);
			}
		});
	}
	
	function getDailySchedules(date,callback){
		console.log("getDailySchedules");
		$.ajax({
			type:'get',
			url:'/getDailySchedules.do/'+date,
			dataType:"json",
			success:function(result){
				callback(result);
			},
			error:function(xhr,status,er){
				alert('error!!'+status);
			}
		});
	}
	
	return {
		getSchedules:getSchedules,
		getDailySchedules:getDailySchedules
	};
})();