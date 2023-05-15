package pojo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Tags {
    private List<Integer> tags;
}
