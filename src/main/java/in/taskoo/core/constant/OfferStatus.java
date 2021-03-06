package in.taskoo.core.constant;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum OfferStatus {
	CREATED(1),
	OPEN(2),
	PENDING(3),
	ACCEPTED(4),
	STARTED(5),
	COMPLETED(6),
	CLOSED(7);

	private Integer id;

	@JsonCreator
	public OfferStatus toEnum(Integer id) {
		return Arrays.stream(OfferStatus.values()).filter(status -> status.getId().equals(id)).findFirst().orElse(null);
	}

	@JsonValue
	public String getOfferStatus() {
		return this.toString();
	}
}
