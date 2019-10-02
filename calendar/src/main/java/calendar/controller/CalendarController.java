package calendar.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String addSchedule(@Valid ScheduleDto schedule,BindingResult result) throws Exception{
		if(result.hasErrors()) {
			List<ObjectError> list=result.getAllErrors();
			for(ObjectError error:list) {
				log.info(error.toString());
			}
			return "/calendar";
		}
		
		service.addSchedule(schedule);
		return "redirect:/calendar.do";
	}
}
