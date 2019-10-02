package calendar.dto;

import java.sql.Date;
import java.sql.Time;

import lombok.Data;

@Data
public class ScheduleDto {
	
	private String title;
	private String contents;
	private Date dateStart;
	private Date dateEnd;
	private Time timeStart;
	private Time timeEnd;
	private String repeatMonthly;
	private String allDay;
	
}
