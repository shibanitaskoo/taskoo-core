package in.taskoo.core.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import in.taskoo.core.constant.EstimateType;
import in.taskoo.core.constant.TaskStatus;
import in.taskoo.core.constant.TaskType;
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
	
	@Column(name="description",columnDefinition="TEXT")
	private String description;
	
	@Column(name="task_type")
	private TaskType taskType;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "category_id", referencedColumnName = "category_id")
	private Category category;
	
	@Column(name="location")
	private String location;
	
	@OneToMany(mappedBy="task",fetch=FetchType.LAZY)
	private List<Offer> offers;
	
	@Column(name="task_due_date_time")
	private LocalDateTime taskDueDateTime;
	
	@Column(name="task_date_time")
	private LocalDateTime taskDateTime;
	
	@Column(name="seeker_id")
	private Long seekerId;
	
	@Column(name="estimate_amount",columnDefinition="INT")
	private Long estimateAmount;
	
	@Column(name="estimate_type")
	@Enumerated(EnumType.ORDINAL)
	private EstimateType estimateType;
	
	@Column(name="task_status")
	private TaskStatus taskStatus = TaskStatus.CREATED;

}
