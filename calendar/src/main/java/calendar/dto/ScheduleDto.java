package calendar.dto;

import java.sql.Time;

import lombok.Data;

@Data
public class ScheduleDto {
	
	private String title;
	private String contents;
	private String dateStart;
	private String dateEnd;
	private Time timeStart;
	private Time timeEnd;
	private String repeatMonthly;
	private String allDay;
	
}
