package calendar.service;

import java.sql.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
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
		if(schedule.getTimeEnd()==null||schedule.getTimeStart()==null) {
			schedule.setTimeEnd(new Time(0));
			schedule.setTimeStart(new Time(0));
		}
		mapper.addSchedule(schedule);
	}

	@Override
	public List<ScheduleDto> getSchedules(Date date) throws Exception {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return mapper.getSchedules(format.format(date));
	}

	@Override
	public List<ScheduleDto> getDailySchedules(Date date) throws Exception {
		// TODO Auto-generated method stub
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		return mapper.getDailySchedules(format.format(date));
	}

}
