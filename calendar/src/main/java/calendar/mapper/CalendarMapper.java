package calendar.mapper;

import org.apache.ibatis.annotations.Mapper;

import calendar.dto.ScheduleDto;

@Mapper
public interface CalendarMapper {

	void addSchedule(ScheduleDto schedule) throws Exception;

}
