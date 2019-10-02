package calendar.dto;

import java.sql.Date;
import java.sql.Time;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ScheduleDto {
	
	@NotNull
	private String title;
	
	@NotNull
	private String contents;
	
	@NotNull
	private Date dateStart;
	
	@NotNull
	private Date dateEnd;
	
	@NotNull
	private Time timeStart;
	
	@NotNull
	private Time timeEnd;
	
	private String repeatMonthly;
	private String allDay;
	
}
