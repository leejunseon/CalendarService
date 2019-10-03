package calendar.mapper;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import calendar.dto.ScheduleDto;

@Mapper
public interface CalendarMapper {

	void addSchedule(ScheduleDto schedule) throws Exception;

	List<ScheduleDto> getSchedules(Date date) throws Exception;

	List<ScheduleDto> getDailySchedules(Date date) throws Exception;

}
