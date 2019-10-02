package calendar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import calendar.dto.ScheduleDto;
import calendar.mapper.CalendarMapper;

@Service
public class CalendarServiceImpl implements CalendarService{
	
	@Autowired
	private CalendarMapper mapper;

	@Override
	public void addSchedule(ScheduleDto schedule) throws Exception {
		// TODO Auto-generated method stub
		mapper.addSchedule(schedule);
	}

}
