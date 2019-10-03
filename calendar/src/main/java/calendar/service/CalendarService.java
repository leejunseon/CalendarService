package calendar.service;

import java.sql.Date;
import java.util.List;

import calendar.dto.ScheduleDto;

public interface CalendarService {

	public void addSchedule(ScheduleDto schedule) throws Exception;

	public List<ScheduleDto> getSchedules(Date date) throws Exception;

	public List<ScheduleDto> getDailySchedules(Date date) throws Exception;
}
