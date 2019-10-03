package calendar.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import calendar.dto.ScheduleDto;
import calendar.service.CalendarService;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class CalendarController {
	
	@Autowired
	CalendarService service;

	@RequestMapping("/calendar.do")
	public String showCalendar() throws Exception{
		return "/calendar";
	}	
	
	@RequestMapping("/addSchedule.do")
	public String addSchedule( ScheduleDto schedule) throws Exception{
		service.addSchedule(schedule);
		return "redirect:/calendar.do";
	}
	
	@RequestMapping(value="/getSchedules.do/{date}",produces=MediaType.APPLICATION_JSON_UTF8_VALUE) 
	@ResponseBody
	public List<ScheduleDto> getSchedules(@PathVariable("date")Date date) throws Exception{
		log.info(date.toString());
		return service.getSchedules(date);
	}
	
	@RequestMapping(value="/getDailySchedules.do/{date}",produces=MediaType.APPLICATION_JSON_UTF8_VALUE) 
	@ResponseBody
	public List<ScheduleDto> getDailySchedules(@PathVariable("date")Date date) throws Exception{
		log.info(date.toString());
		return service.getDailySchedules(date);
	}
}
