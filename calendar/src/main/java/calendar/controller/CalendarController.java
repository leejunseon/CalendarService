package calendar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import calendar.dto.ScheduleDto;
import calendar.service.CalendarService;

@Controller
public class CalendarController {
	
	@Autowired
	CalendarService service;

	@RequestMapping("/calendar.do")
	public String showCalendar() throws Exception{
		return "/calendar";
	}
	
	@RequestMapping("/addSchedule.do")
	public String addSchedule(ScheduleDto schedule) throws Exception{
		service.addSchedule(schedule);
		return "redirect:/calendar.do";
	}
}
