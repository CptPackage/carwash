package ua.slavik.carwash.model.dto.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.slavik.carwash.exception.validators.StringField;
import ua.slavik.carwash.model.enums.JobStatus;

import javax.validation.constraints.PositiveOrZero;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTaskDTO {
    private Long id;
    @PositiveOrZero(message = "Invalid price.")
    private int price;
    @PositiveOrZero(message = "Invalid priority.")
    private int priority;
    @PositiveOrZero(message = "Invalid duration.")
    private int duration;
    @StringField(message = "Invalid description.")
    private String description;
    @StringField(message = "Invalid Name.")
    private String name;
    private boolean repeatable;
    private JobStatus status;
}
