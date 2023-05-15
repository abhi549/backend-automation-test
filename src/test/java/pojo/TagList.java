package pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TagList {
    private int tagId;
    private String tagName;
}
