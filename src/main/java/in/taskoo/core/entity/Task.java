package in.taskoo.core.entity;

import java.time.LocalDateTime;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import in.taskoo.core.constant.EstimateType;
import in.taskoo.core.constant.TaskMode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "t_task")
@AttributeOverride(column = @Column(name = "task_id"), name = "id")
@Getter
@Setter
public class Task extends GeneratedIdEntity{
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="mode")
	private TaskMode mode;
	
	@Column(name="address")
	private String address;
	
	@Column(name="date_time")
	private LocalDateTime dateTime;
	
	@Column(name="user_id")
	private Long userId;
	
	@Column(name="estimate")
	private Long estimate;
	
	@Column(name="estimate_type")
	@Enumerated(EnumType.ORDINAL)
	private EstimateType estimateType;

}
