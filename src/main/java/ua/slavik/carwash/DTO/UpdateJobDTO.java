package ua.slavik.carwash.DTO;

import lombok.Data;
import java.util.List;

@Data

public class UpdateJobDTO
{
    private long id;
    private boolean completed;
    private List<Long> serviceIds;
    private Long carId;
}