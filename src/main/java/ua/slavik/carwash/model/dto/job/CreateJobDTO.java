package ua.slavik.carwash.model.dto.job;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ua.slavik.carwash.model.enums.JobStatus;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateJobDTO {
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private JobStatus status;
    private List<Long> tasksId;
}
