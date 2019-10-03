package calendar.service;

import java.sql.Date;
import java.util.List;

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

	@Override
	public List<ScheduleDto> getSchedules(Date date) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getSchedules(date);
	}

	@Override
	public List<ScheduleDto> getDailySchedules(Date date) throws Exception {
		// TODO Auto-generated method stub
		return mapper.getDailySchedules(date);
	}

}
