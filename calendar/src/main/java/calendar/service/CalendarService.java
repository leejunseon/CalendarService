package calendar.service;

import calendar.dto.ScheduleDto;

public interface CalendarService {

	public void addSchedule(ScheduleDto schedule) throws Exception;
}
