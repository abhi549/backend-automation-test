package pojo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class campaignRequestBuilder {

    public static campaignRequest campaignrequestPayload() {
        List<Campaign> camplist = Arrays.asList(
                Campaign.builder().deviceType("email").build()
        );

        List<Integer> al = new ArrayList<Integer>();
        al.add(0, 5647);
        al.add(1, 5438);
        Tags tgs = Tags.builder().tags(al)
                .build();

        List<TagList> tagList = Arrays.asList(
                TagList.builder()
                        .tagId(0)
                        .tagName("AUTOMATION BE")
                        .build(),
                TagList.builder()
                        .tagId(1)
                        .tagName("TEST")
                        .build()
        );

        campaignRequest campaignrequest = campaignRequest.builder().segmentId(0).step_number(1).name("Test_BE_Automation_Email_E2E_Non_Recurring_Scenario1")
                .channel("email").campaignType("BROADCAST").segmentType("SEGMENTED").isRecurring(false)
                .campaigns(camplist).user_type("user").anonymous(false).userType("buyers")
                .isSortedActionTrigger(false).email_id("michael.paramon@tokopedia.com")
                .extendedName("[AUTOMATION BE] [TEST] Test_BE_Automation_Email_E2E_Non_Recurring_Scenario1")
                .tagList(tagList).tags(tgs).build();
        System.out.println("campaignrequest " + campaignrequest.toString());
        return campaignrequest;

//        return campaignRequest.builder().segmentId(0).step_number(1).name("Test_BE_Automation_Email_E2E_Non_Recurring_Scenario1")
//                .channel("email").campaignType("BROADCAST").segmentType("SEGMENTED").isRecurring(false)
//                .campaigns(camplist).user_type("user").anonymous(false).userType("buyers")
//                .isSortedActionTrigger(false).email_id("michael.paramon@tokopedia.com")
//                .extendedName("[AUTOMATION BE] [TEST] Test_BE_Automation_Email_E2E_Non_Recurring_Scenario1")
//                .tagList(tagList).tags(tgs).build();
    }

}