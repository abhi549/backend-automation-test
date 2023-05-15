package pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class campaignRequest {
    private int segmentId;
    private int step_number;
    private String name;
    private String channel;
    private String campaignType;
    private String segmentType;
    private boolean isRecurring;
    private int gapInDays;
    private String recurringType;
    private List<Campaign> campaigns;
    private String user_type;
    private boolean anonymous;
    private String userType;
    private boolean isSortedActionTrigger;
    private String email_id;
    private String extendedName;
    private List<TagList> tagList;
    private Tags tags;
}
