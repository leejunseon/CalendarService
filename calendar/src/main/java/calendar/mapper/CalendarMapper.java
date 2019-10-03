package calendar.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import calendar.dto.ScheduleDto;

@Mapper
public interface CalendarMapper {

	void addSchedule(ScheduleDto schedule) throws Exception;

	List<ScheduleDto> getSchedules(String date) throws Exception;

	List<ScheduleDto> getDailySchedules(String date) throws Exception;

}
