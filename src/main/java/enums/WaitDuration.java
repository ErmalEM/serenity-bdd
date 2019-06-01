package enums;

import lombok.Getter;

/**
 * Created by Ardit Podrimaj
 */

@Getter
public enum WaitDuration {

	INSTANT(1),
	DEFAULT(30),
	MAXIMUM(60),
	BASE_POLLING_INTERVAL_MS(100);

	private int duration;

	WaitDuration(final int duration){
		this.duration = duration;
	}
}